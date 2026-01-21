import java.util.InputMismatchException;
import java.util.Scanner;

/*
Programuttveklare: David Eriksson TE23D
Dett program ska vara en simpel variant av ett order system
för att hantera fastighets ordrar av olika slag.
*/

public class App {
    public static void main(String[] args) throws Exception {
        OrderHanterare OH = new OrderHanterare();
        Scanner Input = new Scanner(System.in);
        boolean klar;
        int val;
        // Set information för kund
        Kund A = new Kund("Johan", "Kateby", "@Johan.Kateby.com");

        do {

            System.out.println(
                    "1. Lägg till order. \n2. Ta bort order.\n3. Visa ordrar. \n4. Visa preliminära kostnader. \n5. Visa prospecterad vinst. \n6. Stäng programet \n---------------------\nAnge en sifra som korisponderar med ett av valen");
            klar = false;
            val = 0;
            while (klar == false) {
                try {
                    val = Input.nextInt();
                    klar = true;
                    if (val < 1 || val > 5) {
                        klar = false;
                        System.out.println("Ange en sifra som korispoderar till en av valen!");
                        System.out.print("Ange: ");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Skriv bara in sifror!");
                    System.out.print("Ange: ");
                    klar = false;
                    if (Input.hasNext())
                        Input.next();
                }
            }

            switch (val) {
                case 1:
                    OH.läggTillOrder(A); // vad ska jag använda id till?
                    break;
                case 2:
                     OH.taBortOrder(A);
                    break;
                case 3:
                    OH.visaOrdrar(A);
                    break;
                case 4:
                    OH.visaPreliminäraKostnader(A);
                    break;
                case 5:
                    OH.visaProspecteradVist(A);
                    break;
                case 6:
                    Input.close();
                    System.exit(0);
                    break;

            }

        } while (true);
    }
}
