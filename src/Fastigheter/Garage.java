package Fastigheter;

/*
* Klass: Garage
* Detta är en fastighets typ som kan skappas och läggas till i order.
*/
public class Garage extends Fastighet {
    /**är hur många utrymen det finns i fastigheten där man kan förvara saker. */
    private int förvaringsSectioner;
    /** Hur många rum det finns i fastigheten. */
    private int antalRum;

    /**
     * Skappar ett nyt Garage obejekt med angivna värden.
     * @param tomtPris anger hur mycket marken kommer kosta som fastigheten byggs på.
     * @param tomtYta anger hur stor yta fastigheten kan byggas på.
     * @param planYta anger hur stor yta det kommer finnas i fastigheten.
     * @param antalRum anger hur mpnga rum det är i fastigheten. 
     * @param försäljningsPris anger hur mycket fastigheten kommer säljas för.
     * @param byggnadsKostndader anger hur mycket det kommer kosta attt bygga fastigheten. 
     * @param förvaringsSectioner anger hur många förvarings sectioner det kommer finnas i fastigheten. 
     */
    public Garage(float tomtPris, int tomtYta, int planYta, int antalRum, float försäljningsPris, float byggnadsKostndader, int förvaringsSectioner){
        super(tomtPris, tomtYta, planYta, försäljningsPris, byggnadsKostndader);   
        this.antalRum = antalRum;
        this.förvaringsSectioner = förvaringsSectioner;
    }

    /**toString retunerar infromation kring fastighetstypen. */
    @Override
    public String toString() {
        return super.toString()+ "\nFörvarings sectioner: "+ förvaringsSectioner+ "\n Antal rum: "+antalRum+ "";
    }
}
