package Fastigheter;
import java.util.ArrayList;

/** Klass: FlervaningsHus, Detta är en fastighets typ som kan skappas och läggas till i order. Detta obeject innehåller / skappar och laggrar Lagenhet's instanser i sig.*/
public class FlervaningsHus extends Fastighet { 
    /**Inehåller hur många våningsplan det finns i fastigheten. */
    private int antalVåningsplan;
    /**Hur många lägenheter det finns pär plan. */     
    private int lägenheterPärPlan; 
    /**Antal föråd det finns i fastigheten. */
    private int antalFöråd;
    /**Hur stor ytan är i fråden */
    private int förådsYta;
    /**Om det finns ett trapphus eller inte. */
    private boolean Trapphus; 
    /**Om det finns en hiss eller inte. */
    private boolean Hiss;
    /**Är en lista vilket inehåller instanser av skappade Lagenhet */
    private ArrayList<Lagnehet> lägenheter = new ArrayList<Lagnehet>();   

    /**
     * Skappar ett nyt FlervaningsHus's obejekt med angivna värden.
     * @param antalVåningsplan Hur många våningsplan fastigheten har.
     * @param lägenheterPärPlan Hur många lägenheter varage våningsplan ska ha.
     * @param antalFöråd Hur många fråd det ska finnas i fastighetten. 
     * @param förådsYta Hur stor ytan ska vara i varge fråd.
     * @param Trapphus Om det ska finnas ett trapphus i fastigheten eller inte.
     * @param Hiss Om det ska finnas en hiss i fastigheten eller inte.
     * @param tomtPris Hur mycket tomten kommer kosta som fastigheten ska byggas på.
     * @param tomtYta Hur stor ytan är där fastigheten kommer byggas på.
     * @param totalPlanYta Den totala ytan i alla Lagenhet'er i fastigheten.
     * @param försäljningsPris Priset som fastigheten kommer säljas för. 
     * @param byggnadsKostndader Vad det kommer kosta att bygga fastigheten. 
     */
    public FlervaningsHus(int antalVåningsplan, int lägenheterPärPlan, int antalFöråd, int förådsYta, boolean Trapphus, boolean Hiss, float tomtPris, int tomtYta, int totalPlanYta, float försäljningsPris, float byggnadsKostndader){
        super(tomtPris, tomtYta, totalPlanYta, försäljningsPris, byggnadsKostndader);
        this.antalVåningsplan = antalVåningsplan; 
        this.lägenheterPärPlan = lägenheterPärPlan;
        this.antalFöråd = antalFöråd;
        this.förådsYta = förådsYta;
        this.Trapphus = Trapphus;
        this.Hiss = Hiss;
    }

    /** toString är en metod som kallar till föräldrar klassen och lägger till sin egen information som skrivs ut. */
    @Override
    public String toString() {
        return super.toString() + "\nAntal våningsplan: "+antalVåningsplan+"\nLägenheter pär plan: "+lägenheterPärPlan+"\nAntal föråd: "+antalFöråd+"\nFöråds yta: "+förådsYta+"\nTrapphus: "+ Trapphus+ "\nHiss: "+Hiss+ "\n----------------\nLägenhets specifikationer"+ lägenheter.getFirst().toString(); 
    }

    /**
     * get_lägenheter hämtar listan med alla skappade lägenheter i fastigheten.
     * @return ArrayList&lt;Lagnehet&gt; lägenheter.
     */
    public ArrayList<Lagnehet> get_lägenheter() {
        return lägenheter;
    }

}
