public class Garage extends Fastighet {

    public int förvaringsSectioner;

    Garage(int planYta, int antalRum, float försäljningsPris, float tomtPris, int tomtYta, int förvaringsSectioner, float byggnadsKostnader){
        this.planYta = planYta;
        this.antalRum = antalRum;
        this.försäljningsPris = försäljningsPris; // ska använda konstruktorn av fastigheter !!
        this.tomtPris = tomtPris;                  // har glömt måste fixa
        this.tomtYta = tomtYta;
        this.förvaringsSectioner = förvaringsSectioner;
        this.byggnadsKostndader = byggnadsKostnader;

    }
}
