public abstract class Fastighet {
    private float tomtPris;
    private int tomtYta;
    private int planYta; 
    private int antalRum;
    private float försäljningsPris;
    private float byggnadsKostndader; 

    Fastighet(){
        
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





    
}
