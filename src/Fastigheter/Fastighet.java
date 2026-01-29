package Fastigheter;

/** Abstract Klass: Fastighet, Implementeras av alla fastighets typer som kan läggas till i ordern. Innehåller variabler och metoder som dellas av alla implemnterande klasser.*/
public abstract class Fastighet {
    /**priset på marken där fastigheten ska stå.*/
    private float tomtPris;
    /**ytan på marken där fastigheten ska stå.*/
    private int tomtYta;
    /**den totala ytan i fastigheten. */
    private int planYta; 
    /** priset som fastigheten kommer säljas för när det är färdigbyggt. */
    private float försäljningsPris;
    /**Vad det kommer att kosta för att bygga fastigheten. */
    private float byggnadsKostnader; 

    /**
     * Skappar ett nyt Fastighet's obejekt med angivna värden.
     * @param tomtPris priset som marken där fastigheten kommer byggas kostar.
     * @param tomtYta storleken på ytan där fastigheten byggs.
     * @param planYta den totala ytan i fastigheten.
     * @param försäljningsPris priset som det kommer kosta att sälja fastigheten.
     * @param byggnadsKostnader priset av vad det kommer kosta att bygga fastigheten.
     */
    public Fastighet(float tomtPris, int tomtYta, int planYta, float försäljningsPris, float byggnadsKostnader){
        this.tomtPris = tomtPris;
        this.tomtYta = tomtYta;
        this.planYta = planYta;
        this.försäljningsPris = försäljningsPris;
        this.byggnadsKostnader = byggnadsKostnader;
    }

    /**
     * get_tomtPris är en metod som hämtar tomt priset på en fastighet
     * @return tomtPris
     */
    public float get_tomtPris(){
        return tomtPris;
    }

    /**
     * get_försäljningsPris hämtar försäljningspriset för en fastighet.
     * @return float, försäljningsPris.
     */
    public float get_försäljningsPris(){
        return försäljningsPris;
    }

    /**
     * get_byggnadsKostnader hämtar kostnaderna för att bygga en fastighet
     * @return float, byggnadsKostnader
     */
    public float get_byggnadsKostnader(){
        return byggnadsKostnader;
    }

    /**toString retunerar all informationen för en fastighet.*/
    @Override
    public String toString() {
        return "\nTomt pris: "+ tomtPris+ "\nTomt yta: "+ tomtYta+"\nPlan yta: "+planYta+"\nFörsäljnings Pris: "+försäljningsPris+"\nByggnadskostnader: "+byggnadsKostnader;
    }



    
}
