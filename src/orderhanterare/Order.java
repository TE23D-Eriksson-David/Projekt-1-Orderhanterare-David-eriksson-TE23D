package orderhanterare;
import java.util.ArrayList;
import Fastigheter.*;
import java.time.LocalDate;

/** Klass: Order, är ett obeject vilket skappas och laggrar fastigheter som användaren har valt. */
public class Order {
    /** Datumet då ordern skappades. */
    private LocalDate orderDatum;
    /** Ett order id som används för att identifigera ordrarna. */
    private int orderID;
    /** Lagrar kundens fulla namn, förnamn+effternamn. */
    private String kundNamn;  
    /** Lagrar kundens email. */
    private String kundEmail;
    /** Lagrar kundens skappade fastighetter. */
    private ArrayList<Fastighet> efftersöktaFastigheter;

    /**
     * Skappar ett nyt Order obejekt med angivna värden.
     * @param orderDatum Datumet då ordern skappades.
     * @param orderID Ett order id som används för att identifigera ordrarna.
     * @param kundNamn Lagrar kundens fulla namn, förnamn+effternamn.
     * @param kundEmail Lagrar kundens email.
     */
    Order(LocalDate orderDatum, int orderID, String kundNamn, String kundEmail){
        this.orderDatum = orderDatum;
        this.orderID = orderID;
        this.kundNamn = kundNamn;
        this.kundEmail = kundEmail;
        efftersöktaFastigheter = new ArrayList<Fastighet>();
    }

/**
 * get_OrderID hämtar ID av Order
 * @return returner orderID, t.ex 3894
 */
    public int get_orderID() {
        return orderID;
    }

    /**
     * get_EfftersöktaFastigheter hämtar listan med skappade fastigheter i Order.
     * @return @return ArrayList&lt;Fastighet&gt;, retunerar efftersöktaFastigheter. 
     */
    public ArrayList<Fastighet> get_efftersöktaFastigheter() {
        return efftersöktaFastigheter;
    }

    /**
     * addEfftersöktaFastigheter lägger till en Fastighet's instans i efftersöktaFastigheter's listan. 
     * @param F instans av en fastighets typ.
     */
    public void addEfftersöktaFastigheter(Fastighet F){
        efftersöktaFastigheter.add(F);
    }

    /** toString skriver utt all information inom en Order */
    @Override
    public String toString() {
        String fastighetsinformation = "";
        for (Fastighet fastighet : efftersöktaFastigheter) {
            if (fastighet instanceof Planhus) {
                fastighetsinformation += "Fastighets typ: Planhus";
                fastighetsinformation +=  ((Planhus)fastighet).toString();
            } 
            if (fastighet instanceof Garage) {
                fastighetsinformation += "Fastighets typ: Garage";
                fastighetsinformation +=  ((Garage)fastighet).toString();
            }
            if (fastighet instanceof FlervaningsHus) {
                fastighetsinformation += "Fastighets typ: Flervåningshus";
                fastighetsinformation +=  ((FlervaningsHus)fastighet).toString();
            }
            fastighetsinformation += "\n------------------------\n";
        }      

        return "Order datum: " +orderDatum+ "\nOrder ID: "+orderID+"\nKund namn: "+kundNamn+"\nKund email: "+kundEmail+"\n------------------------- \n"+fastighetsinformation+"" ; // måste fixa metod för att visa fastigheter
    }

}
