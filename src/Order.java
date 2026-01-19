import java.util.ArrayList;
import java.time.LocalDate;

public class Order {

    private LocalDate orderDatum;
    private long orderID;
    private String kundNamn;  
    private String kundEmail;

    private ArrayList<Fastighet> efftersöktaFastigheter;

    Order(LocalDate orderDatum, long orderID, String kundNamn, String kundEmail){
        this.orderDatum = orderDatum;
        this.orderID = orderID;
        this.kundNamn = kundNamn;
        this.kundEmail = kundEmail;

        efftersöktaFastigheter = new ArrayList<Fastighet>();
    }

    public LocalDate getOrderDatum() {
        return orderDatum;
    }

    public long getOrderID() {
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

    

}
