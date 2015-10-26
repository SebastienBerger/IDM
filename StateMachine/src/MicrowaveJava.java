import com.pauware.pauware_engine._Core.*;
import com.pauware.pauware_engine._Exception.*;
import com.pauware.pauware_engine._Java_EE.*;
import java.util.Scanner;

public class MicrowaveJava {
    AbstractStatechart_monitor _MicrowaveMonitor;
    AbstractStatechart _Closed;
    AbstractStatechart _Off1;
    AbstractStatechart _Baking;
    AbstractStatechart _Open;
    AbstractStatechart _Paused;
    AbstractStatechart _Off;

    private void init_behavior() throws Statechart_exception {

        _Off1 = new Statechart("Off1");

        _Baking = new Statechart("Baking");

        _Paused = new Statechart("Paused");

        _Off = new Statechart("Off");

        _Closed = (_Off1.xor(_Baking)).name("Closed");
        _Off1.inputState();

        _Open = (_Paused.xor(_Off)).name("Open");
        _Off.inputState();

        _Closed.inputState();

        _MicrowaveMonitor = new Statechart_monitor(_Closed.xor(_Open), "Microwave", AbstractStatechart_monitor.Show_on_system_out, null);
    }

    public void start() throws Statechart_transition_based_exception, Statechart_exception{
        _MicrowaveMonitor.fires("Power", _Off1 , _Baking);
        _MicrowaveMonitor.fires("Power", _Baking , _Off1);
        _MicrowaveMonitor.fires("DoorOpen", _Closed , _Open);
        _MicrowaveMonitor.fires("DoorOpen", _Baking , _Paused);
        _MicrowaveMonitor.fires("DoorClosed", _Open , _Closed);
        _MicrowaveMonitor.fires("DoorClosed", _Paused , _Baking);
        _MicrowaveMonitor.start();
    }

    public void stop() throws Statechart_exception {
        _MicrowaveMonitor.stop();
    }

    public MicrowaveJava() throws Statechart_exception {
        init_behavior();
    }

    public void evt_Power() throws Statechart_exception {
        _MicrowaveMonitor.run_to_completion("Power");
    }

    public void evt_DoorOpen() throws Statechart_exception {
        _MicrowaveMonitor.run_to_completion("DoorOpen");
    }

    public void evt_DoorClosed() throws Statechart_exception {
        _MicrowaveMonitor.run_to_completion("DoorClosed");
    }

    public static void main(String[] args){
        try{
            MicrowaveJava st = new MicrowaveJava();
            st.start();
            Scanner sc = new Scanner(System.in);
            String choice="";
            do{
            System.out.println("Enter 'Power' 'DoorOpen' 'DoorClosed'  or 'end': ");
            choice = sc.nextLine();

            if(choice.equals("Power")){
                st.evt_Power();
            }

            if(choice.equals("DoorOpen")){
                st.evt_DoorOpen();
            }

            if(choice.equals("DoorClosed")){
                st.evt_DoorClosed();
            }
        }while(! choice.equals("end"));

        st.stop();
        System.exit(0);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}