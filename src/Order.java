import java.util.ArrayList;

public class Order {

    private String orderDatum;
    private long orderID;
    private String kundNamn;  
    private String kundEmail;

    private ArrayList<Fastighet> efftersöktaFastigheter;

    Order(String orderDatum, long orderID, String kundNamn, String kundEmail){
        this.orderDatum = orderDatum;
        this.orderID = orderID;
        this.kundNamn = kundNamn;
        this.kundEmail = kundEmail;

        efftersöktaFastigheter = new ArrayList<Fastighet>();
    }

    public String getOrderDatum() {
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

    

}
