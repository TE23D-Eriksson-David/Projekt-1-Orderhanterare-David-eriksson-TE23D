import java.util.ArrayList;

public class FlervaningsHus extends Fastighet { // SKA INTE IMPLEMENTERA VARIABLER I FASTIGHET
    public int antalVåningsplan;     // MÅSTE LÖSAS
    public int lägenheterPärPlan; 
    public int antalFöråd;
    public int förådsYta;
    public float byggnadsKostnader;
    public boolean Trapphus; 
    public boolean Hiss;
    public ArrayList<Lagnehet> Lägenheter = new ArrayList<Lagnehet>();   

    FlervaningsHus(int antalVåningsplan, int lägenheterPärPlan, int antalFöråd, int förådsYta, float byggnadsKostnader, boolean Trapphus, boolean Hiss){
        this.antalVåningsplan = antalVåningsplan;
        this.lägenheterPärPlan = lägenheterPärPlan;
        this.antalFöråd = antalFöråd;
        this.förådsYta = förådsYta;
        this.byggnadsKostnader = byggnadsKostnader;
        this.Trapphus = Trapphus;
        this.Hiss = Hiss;
    }
}
