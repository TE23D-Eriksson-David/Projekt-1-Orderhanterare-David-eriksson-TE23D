public abstract class Fastighet {
    private float tomtPris;
    private int tomtYta;
    private int planYta; 
    private int antalRum;
    private float försäljningsPris;
    private float byggnadsKostndader; 

    Fastighet(float tomtPris, int tomtYta, int planYta, int antalRum, float försäljningsPris, float byggnadsKostndader){
        this.tomtPris = tomtPris;
        this.tomtYta = tomtYta;
        this.planYta = planYta;
        this.antalRum = antalRum;
        this.försäljningsPris = försäljningsPris;
        this.byggnadsKostndader = byggnadsKostndader;
    }

    public float get_tomtPris(){
        return tomtPris;
    }

    public float get_försäljningsPris(){
        return försäljningsPris;
    }

    public float get_byggnadsKostnader(){
        return byggnadsKostndader;
    }

    public int get_tomtYta() {
        return tomtYta;
    }

    public int get_planYta() {
        return planYta;
    }

    public int get_antalRum() {
        return antalRum;
    }

    @Override
    public String toString() {
        return "\nTomt pris: "+ tomtPris+ "\nTomt yta: "+ tomtYta+"\nPlan yta: "+planYta+"\nAntal rum: "+antalRum+"\nFörsäljnings Pris: "+försäljningsPris+"\n Byggnadskostnader: "+byggnadsKostndader;
    }



    
}
