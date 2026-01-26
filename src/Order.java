import java.util.ArrayList;
import java.time.LocalDate;

public class Order {

    private LocalDate orderDatum;
    private int orderID;
    private String kundNamn;  
    private String kundEmail;

    private ArrayList<Fastighet> efftersöktaFastigheter;

    Order(LocalDate orderDatum, int orderID, String kundNamn, String kundEmail){
        this.orderDatum = orderDatum;
        this.orderID = orderID;
        this.kundNamn = kundNamn;
        this.kundEmail = kundEmail;

        efftersöktaFastigheter = new ArrayList<Fastighet>();
    }

    public LocalDate getOrderDatum() {
        return orderDatum;
    }

    public int getOrderID() {
        return orderID;
    }

    public ArrayList<Fastighet> getEfftersöktaFastigheter() {
        return efftersöktaFastigheter;
    }

    public void setKundNamn(String kundNamn) {
        this.kundNamn = kundNamn;
    }

    public void setKundEmail(String kundEmail) {
        this.kundEmail = kundEmail;
    }

    public void addEfftersöktaFastigheter(Fastighet F){
        efftersöktaFastigheter.add(F);
    }

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
