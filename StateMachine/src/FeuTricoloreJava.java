import com.pauware.pauware_engine._Core.*;
import com.pauware.pauware_engine._Exception.*;
import com.pauware.pauware_engine._Java_EE.*;
import java.util.Scanner;

public class FeuTricoloreJava {
    AbstractStatechart_monitor _FeuTricoloreMonitor;
    AbstractStatechart _Rouge;
    AbstractStatechart _Vert;
    AbstractStatechart _Jaune;

    private void init_behavior() throws Statechart_exception {

        _Rouge = new Statechart("Rouge");

        _Vert = new Statechart("Vert");

        _Jaune = new Statechart("Jaune");

        _Rouge.inputState();

        _FeuTricoloreMonitor = new Statechart_monitor(_Rouge.xor(_Vert.xor(_Jaune)), "FeuTricolore", AbstractStatechart_monitor.Show_on_system_out, null);
    }

    public void start() throws Statechart_transition_based_exception, Statechart_exception{
        _FeuTricoloreMonitor.fires("passeRouge", _Jaune , _Rouge);
        _FeuTricoloreMonitor.fires("passeVert", _Rouge , _Vert);
        _FeuTricoloreMonitor.fires("passeJaune", _Vert , _Jaune);
        _FeuTricoloreMonitor.start();
    }

    public void stop() throws Statechart_exception {
        _FeuTricoloreMonitor.stop();
    }

    public FeuTricoloreJava() throws Statechart_exception {
        init_behavior();
    }

    public void evt_passeRouge() throws Statechart_exception {
        _FeuTricoloreMonitor.run_to_completion("passeRouge");
    }

    public void evt_passeVert() throws Statechart_exception {
        _FeuTricoloreMonitor.run_to_completion("passeVert");
    }

    public void evt_passeJaune() throws Statechart_exception {
        _FeuTricoloreMonitor.run_to_completion("passeJaune");
    }

    public static void main(String[] args){
        try{
            FeuTricoloreJava st = new FeuTricoloreJava();
            st.start();
            Scanner sc = new Scanner(System.in);
            String choice="";
            do{
            System.out.println("Enter 'passeRouge' 'passeVert' 'passeJaune'  or 'end': ");
            choice = sc.nextLine();

            if(choice.equals("passeRouge")){
                st.evt_passeRouge();
            }

            if(choice.equals("passeVert")){
                st.evt_passeVert();
            }

            if(choice.equals("passeJaune")){
                st.evt_passeJaune();
            }
        }while(! choice.equals("end"));

        st.stop();
        System.exit(0);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}