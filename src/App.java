public class App {
    public static void main(String[] args) throws Exception {
        OrderHanterare OH = new OrderHanterare();
        
    // Set information för kund
        Kund A = new Kund("temp", "tempe", "tempm");
    // ge användaren möjligheten att välja metod
        long orderID = OH.läggTillOrder(A); // vad ska jag använda id till?
        OH.taBortOrder(A);
        OH.visaOrdrar(A);
        OH.visaPreliminäraKostnader(A);
        OH.visaProspecteradVist(A);
    }
}
