public class Lagnehet {
    public int planYta; 
    public int antalRum;

    Lagnehet(int planYta, int antalRum){
        this.planYta = planYta;
        this.antalRum = antalRum;
    }

    @Override
    public String toString() {
        return "\nPlan yta: "+planYta+"\nAntal rum: "+antalRum;
    }
}
