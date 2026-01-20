public class Planhus extends Fastighet {

    Planhus(int planYta, int antalRum, float försäljningsPris, float tomtPris, int tomtYta, float byggnadsKostnader){
        super(tomtPris, tomtYta, planYta, antalRum, försäljningsPris, byggnadsKostnader); 
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
