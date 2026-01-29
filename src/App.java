import java.util.InputMismatchException;
import java.util.Scanner;


/*
*Programuttveklare: David Eriksson TE23D
*Dett program ska vara en simpel variant av ett order system för att hantera fastighets ordrar av olika slag.
*Man ska kunna 1. skappa ordrar. 2. ta bort dem. 3. vissa skappade ordrar. 4. visa preliminära kostnader 5. visa prospecterad vinst av alla ordrar.
*/

/*
* Klass: App
* Är där användaren gör sinna val för vad som ska hända med ordrarna. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /** Skappar en instans av Orderhanteraren */
        OrderHanterare OrderHanterare = new OrderHanterare();
        /** SC tar in tokens från tangentbordet med hjälp av metoder */
        Scanner SC = new Scanner(System.in);
        /** Ligger i en while-loop och är san så länge programet körs.*/
        boolean mainloop = true;
        /** Ligger i en while-loop och är falsk så länge användaren inte har gjort ett gitigt val. */
        boolean klar;
        /** tar emot användarens val från Scannern. */
        int val;
        /** Tar emot & lagrar, namn,effternamn & email adress av en kund */
        Kund K = new Kund("Johan", "Kateby", "johanerik.kateby@ga.ntig.se");


        do {
            System.out.println(
                    "1. Lägg till order. \n2. Ta bort order.\n3. Visa ordrar. \n4. Visa preliminära kostnader. \n5. Visa prospecterad vinst. \n6. Stäng programet \n---------------------\nAnge en sifra som korisponderar med ett av valen");
            klar = false;
            val = 0;
            while (klar == false) {
                try {
                    val = SC.nextInt();
                    klar = true;
                    if (val < 1 || val > 6) {
                        klar = false;
                        System.out.println("Ange en sifra som korispoderar till en av valen!");
                        System.out.print("Ange: ");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Skriv bara in sifror!");
                    System.out.print("Ange: ");
                    klar = false;
                    if (SC.hasNext())
                        SC.next();
                }
            }


            switch (val) {
                case 1:
                    OrderHanterare.läggTillOrder(K); 
                    break;
                case 2:
                     OrderHanterare.taBortOrder();
                    break;
                case 3:
                    OrderHanterare.visaOrdrar();
                    break;
                case 4:
                    OrderHanterare.visaPreliminäraKostnader();
                    break;
                case 5:
                    OrderHanterare.visaProspecteradVist();
                    break;
                case 6:
                    SC.close();
                    mainloop = false;
                    System.exit(0);
                    break;
            }

        } while (mainloop);
    }
}
