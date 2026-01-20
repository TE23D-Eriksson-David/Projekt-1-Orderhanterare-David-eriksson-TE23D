import java.util.ArrayList;

public class FlervaningsHus extends Fastighet { // SKA INTE IMPLEMENTERA VARIABLER I FASTIGHET
    public int antalVåningsplan;     // MÅSTE LÖSAS
    public int lägenheterPärPlan; 
    public int antalFöråd;
    public int förådsYta;
    public boolean Trapphus; 
    public boolean Hiss;
    public ArrayList<Lagnehet> Lägenheter = new ArrayList<Lagnehet>();   

    FlervaningsHus(int antalVåningsplan, int lägenheterPärPlan, int antalFöråd, int förådsYta, boolean Trapphus, boolean Hiss, float tomtPris, int tomtYta, int totalPlanYta, int antalRum, float försäljningsPris, float byggnadsKostndader){
        super(tomtPris, tomtYta, totalPlanYta, antalRum, försäljningsPris, byggnadsKostndader);
        this.antalVåningsplan = antalVåningsplan; // Antalrum bör inte implementras jag behöver något slags gränsnitt.
        this.lägenheterPärPlan = lägenheterPärPlan;
        this.antalFöråd = antalFöråd;
        this.förådsYta = förådsYta;
        this.Trapphus = Trapphus;
        this.Hiss = Hiss;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAntal våningsplan: "+antalVåningsplan+"\nLägenheter pär plan: "+lägenheterPärPlan+"\nAntal föråd: "+antalFöråd+"\nFöråds yta: "+förådsYta+"\nTrapphus: "+ Trapphus+ "\nHiss: "+Hiss+ "\n"+ Lägenheter.getFirst().toString(); 
    }
}
