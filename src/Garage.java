public class Garage extends Fastighet {

    public int förvaringsSectioner;

    Garage(int planYta, int antalRum, float försäljningsPris, float tomtPris, int tomtYta, int förvaringsSectioner){
        this.planYta = planYta;
        this.antalRum = antalRum;
        this.försäljningsPris = försäljningsPris;
        this.tomtPris = tomtPris;
        this.tomtYta = tomtYta;
        this.förvaringsSectioner = förvaringsSectioner;
    }
}
