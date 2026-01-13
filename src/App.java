public class App {
    public static void main(String[] args) throws Exception {
        OrderHanterare OH = new OrderHanterare();
        
    // Set information för kund
        Kund A = new Kund("temp", "tempe", "tempm");
    // ge användaren möjligheten att välja metod
        OH.läggTillOrder(A);
        OH.taBortOrder(A);
        OH.visaOrdrar(A);
        OH.visaPreliminäraKostnader(A);
        OH.visaProspecteradVist(A);
    }
}
