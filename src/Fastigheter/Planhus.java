package Fastigheter;

/** Klass: Planhus, Detta är en fastighets typ som kan skappas och läggas till i order.*/
public class Planhus extends Fastighet {
    /**antal rum i fastighetn */
    private int antalRum;

    /**
     * Skappar ett nyt Planhus obejekt med angivna värden.
     * @param planYta anger hur story yta det finns i fastigheten.
     * @param antalRum anger hur många rum det fins i fastigheten.
     * @param försäljningsPris anger hur mycket fastigheten kommer säljas för.
     * @param tomtPris anger hur mycket tomten som fastigheten byggs på kostar.
     * @param tomtYta anger hur stor yta som fastigheten byggs på.
     * @param byggnadsKostnader anger hur mycket det kommer kosta att bygga fastigheten.
     */
    public Planhus(int planYta, int antalRum, float försäljningsPris, float tomtPris, int tomtYta, float byggnadsKostnader){
        super(tomtPris, tomtYta, planYta, försäljningsPris, byggnadsKostnader); 
    }
    
    /**toString retunerar information om fastigheten. */
    @Override
    public String toString() {
        return super.toString()+"\nAntal rum: "+ antalRum+"";
    }
}
