public class Garage extends Fastighet {

    public int förvaringsSectioner;

    Garage(float tomtPris, int tomtYta, int planYta, int antalRum, float försäljningsPris, float byggnadsKostndader, int förvaringsSectioner){
        super(tomtPris, tomtYta, planYta, antalRum, försäljningsPris, byggnadsKostndader);   

        this.förvaringsSectioner = förvaringsSectioner;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nFörvarings sectioner: "+ förvaringsSectioner+ "";
    }
}
