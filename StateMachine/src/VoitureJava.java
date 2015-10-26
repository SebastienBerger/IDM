import com.pauware.pauware_engine._Core.*;
import com.pauware.pauware_engine._Exception.*;
import com.pauware.pauware_engine._Java_EE.*;
import java.util.Scanner;

public class VoitureJava {
    AbstractStatechart_monitor _VoitureMonitor;
    private int vitesse;
    private boolean maxAtteint;
    AbstractStatechart _Arret;
    AbstractStatechart _Marche;
    AbstractStatechart _MoinsVite;
    AbstractStatechart _PlusVite;
    AbstractStatechart _Maximum;

    public  int getvitesse(){
        return vitesse;
    }

    public void setvitesse(int v){
        vitesse = v;
    }

    public  boolean getmaxAtteint(){
        return maxAtteint;
    }

    public void setmaxAtteint(boolean v){
        maxAtteint = v;
    }

    private void init_behavior() throws Statechart_exception {

        _Arret = new Statechart("Arret");
        _Arret.doActivity(this, "ArretActivity");

        _MoinsVite = new Statechart("MoinsVite");
        _MoinsVite.doActivity(this, "MoinsViteActivity");

        _PlusVite = new Statechart("PlusVite");
        _PlusVite.doActivity(this, "PlusViteActivity");

        _Maximum = new Statechart("Maximum");
        _Maximum.doActivity(this, "MaximumActivity");

        _Marche = (_MoinsVite.xor(_PlusVite.xor(_Maximum))).name("Marche");
        _PlusVite.inputState();

        _Arret.inputState();

        _VoitureMonitor = new Statechart_monitor(_Arret.xor(_Marche), "Voiture", AbstractStatechart_monitor.Show_on_system_out, null);
    }

    public void start() throws Statechart_transition_based_exception, Statechart_exception{
        _VoitureMonitor.fires("accelerer", _Arret , _Marche);
        _VoitureMonitor.fires("ralentir", _Marche , _Arret, this, "vitesse_eq_10");
        _VoitureMonitor.fires("accelerer", _Marche , _PlusVite, this, "vitesse_gte_10_and_vitesse_lt_90");
        _VoitureMonitor.fires("accelerer", _Marche , _Maximum, this, "vitesse_eq_90");
        _VoitureMonitor.fires("ralentir", _Marche , _MoinsVite, this, "vitesse_neq_10");
        _VoitureMonitor.start();
    }

    public void stop() throws Statechart_exception {
        _VoitureMonitor.stop();
    }

    public VoitureJava() throws Statechart_exception {
        init_behavior();
    }

    public void ArretActivity(){
        vitesse = 0;
    }

    public void MoinsViteActivity(){
        vitesse = vitesse - 10;
    }

    public void PlusViteActivity(){
        vitesse = vitesse + 10;
    }

    public void MaximumActivity(){
        vitesse = 100;
        maxAtteint = true;
    }

    public boolean vitesse_eq_10(){
        return vitesse == 10;
    }

    public boolean vitesse_gte_10_and_vitesse_lt_90(){
        return vitesse >= 10 && vitesse < 90;
    }

    public boolean vitesse_eq_90(){
        return vitesse == 90;
    }

    public boolean vitesse_neq_10(){
        return vitesse != 10;
    }

    public void evt_ralentir() throws Statechart_exception {
        _VoitureMonitor.run_to_completion("ralentir");
    }

    public void evt_accelerer() throws Statechart_exception {
        _VoitureMonitor.run_to_completion("accelerer");
    }

    public static void main(String[] args){
        try{
            VoitureJava st = new VoitureJava();
            st.start();
            Scanner sc = new Scanner(System.in);
            String choice="";
            do{
            System.out.println("Enter 'ralentir' 'accelerer'  or 'end': ");
            System.out.println("vitesse : "+st.getvitesse());
            System.out.println("maxAtteint : "+st.getmaxAtteint());
            choice = sc.nextLine();

            if(choice.equals("ralentir")){
                st.evt_ralentir();
            }

            if(choice.equals("accelerer")){
                st.evt_accelerer();
            }
        }while(! choice.equals("end"));

        st.stop();
        System.exit(0);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}