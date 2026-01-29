package Fastigheter;

/** Klass: Lagnehet, Deta är ett insatns obejekt som tillhör FlervaningHus och lagras där. */
public class Lagnehet {
    /**anger planytan i lägenhetn  */
    public int planYta; 
    /** anger hur många rum det kommer finnas i lägenheten */
    public int antalRum;

    /**
     * Skappar ett nyt Lagnehet's obejekt med angivna värden.
     * @param planYta anger hur stor yta det finns i lägenheten.
     * @param antalRum anger hur många rum det finns i lägenheten. 
     */
    public Lagnehet(int planYta, int antalRum){
        this.planYta = planYta;
        this.antalRum = antalRum;
    }

    /**toString retunerar infromation om lägenheten */
    @Override
    public String toString() {
        return "\nPlan yta: "+planYta+"\nAntal rum: "+antalRum;
    }
}
