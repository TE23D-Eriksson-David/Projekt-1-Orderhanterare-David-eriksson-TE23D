public class Lagnehet {
    public int planYta; 
    public int antalRum;
    public float försäljningsPris;

    Lagnehet(int planYta, int antalRum, float försäljningsPris){
        this.planYta = planYta;
        this.antalRum = antalRum;
        this.försäljningsPris = försäljningsPris;
    }

    @Override
    public String toString() {
        return "\nPlan yta: "+planYta+"\nAntal rum: "+antalRum+"\nFörsäljnings pris: "+försäljningsPris;
    }
}
