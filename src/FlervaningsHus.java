import java.util.ArrayList;

public class FlervaningsHus extends Fastighet { // SKA INTE IMPLEMENTERA VARIABLER I FASTIGHET
    public int antalVåningsplan;     // MÅSTE LÖSAS
    public int lägenheterPärPlan; 
    public int antalFöråd;
    public int förådsYta;
    public boolean Trapphus; 
    public boolean Hiss;
    public ArrayList<Lagnehet> Lägenheter = new ArrayList<Lagnehet>();   

    FlervaningsHus(int antalVåningsplan, int lägenheterPärPlan, int antalFöråd, int förådsYta, boolean Trapphus, boolean Hiss){
        this.antalVåningsplan = antalVåningsplan;
        this.lägenheterPärPlan = lägenheterPärPlan;
        this.antalFöråd = antalFöråd;
        this.förådsYta = förådsYta;
        this.Trapphus = Trapphus;
        this.Hiss = Hiss;
    }
}
