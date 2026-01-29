import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.time.LocalDate;
import java.util.Scanner;
import Fastigheter.*;

/*
* Klass: OrderHanterare
* Dena klass är vad som utför användarens förfrågningar kring vad som ska hända med ordrarna.
* Dena klass styr & lagrar ordrarna.
* Skappar ordrarna och fastigheterna som lagras i dem.
*/

public class OrderHanterare {
/**Lagrar skappade ordrar */
    private ArrayList<Order> ordrar;
/*
*Skappar ett nytt OrderHanterare med tomma värden. 
*/
    OrderHanterare() {
        ordrar = new ArrayList<Order>();
    }

    /**
     * läggTillOrder skappar en order där användaren kan lägga skappa och lägga till fastigheter till.
     * @param K är en instans av ett kundobejekt. 
     */
    public void läggTillOrder(Kund K) {

        Scanner SC = new Scanner(System.in);
        int val = 0;
        boolean skapparOrder = true;
        LocalDate orderDatum = LocalDate.now();
        int orderID = (int) (Math.random() * 9999);

        Order Order = new Order(orderDatum, orderID, K.get_namn() + "_" + K.get_effternamn(), K.get_email());

        while (skapparOrder) {
            System.out.println("-----------------------------");
            System.out
                    .println("Skappa fastighet: \n 1. Planhus \n 2. Garagae \n 3. Flervåningshus \n 4. Avsluta order");
            boolean väljer = true;
            while (väljer == true) {
                try {
                    val = SC.nextInt();
                    väljer = false;
                } catch (Exception e) {
                    väljer = true;
                    throw new IllegalArgumentException("Dena metod förväntar sig en int");
                }
                if (val > 4 || val < 1) {
                    väljer = true;
                    System.out.println("Ange ett val mellan 1-4");
                }
            }
            väljer = true;

            int planYta = 0;
            float tomtPris = 0f;
            int tomtYta = 0;
            int antalRum = 0;
            float försäljningsPris = 0f;
            float byggnadsKostndader = 0f;

            switch (val) {
                case 1:

                    System.out.println("--------------------");
                    System.out.println(
                            "Du har valt att skappa en: Villa \n Planyta: odefinerat \n Antal rum: odefinerat \n Försäljningspris: odefinerat \n Tomt pris: odefinerat \n Tomt yta: odefinerat \n Byggnads kostnader: odefinerat");

                    List<Object> listaPlanhusVal = ValMetod("Plan yta (m2)", "int", SC);
                    planYta = (int) listaPlanhusVal.get(0);
                    listaPlanhusVal.clear();

                    listaPlanhusVal = ValMetod("Antal rum", "int", SC);
                    antalRum = (int) listaPlanhusVal.get(0);
                    listaPlanhusVal.clear();

                    listaPlanhusVal = ValMetod("Försäljnings pris", "float", SC);
                    försäljningsPris = (float) listaPlanhusVal.get(0);
                    listaPlanhusVal.clear();

                    listaPlanhusVal = ValMetod("Tomt pris", "float", SC);
                    tomtPris = (float) listaPlanhusVal.get(0);
                    listaPlanhusVal.clear();

                    listaPlanhusVal = ValMetod("Tomt yta (m2)", "int", SC);
                    tomtYta = (int) listaPlanhusVal.get(0);
                    listaPlanhusVal.clear();

                    listaPlanhusVal = ValMetod("Byggnads Kostnader", "float", SC);
                    byggnadsKostndader = (float) listaPlanhusVal.get(0);
                    listaPlanhusVal.clear();

                    Planhus P = new Planhus(planYta, antalRum, försäljningsPris, tomtPris, tomtYta, byggnadsKostndader);
                    Order.addEfftersöktaFastigheter(P);
                    System.out.println("-----------------------");
                    System.out.println("Villa skappad");
                    break;

                case 2:

                    int förvaringsSectioner = 0;
                    System.out.println("--------------------");
                    System.out.println(
                            " Du har valt att skappa ett: Garage \n Planyta: odefinerat \n Antal rum: odefinerat \n Försäljningspris: odefinerat \n Tomt pris: odefinerat \n Tomt yta: odefinerat \n Förvarings sectioner \n");

                    List<Object> listaGarageVal = ValMetod("Plan yta (m2)", "int", SC);
                    planYta = (int) listaGarageVal.get(0);
                    listaGarageVal.clear();

                    listaGarageVal = ValMetod("Antal rum", "int", SC);
                    antalRum = (int) listaGarageVal.get(0);
                    listaGarageVal.clear();

                    listaGarageVal = ValMetod("Förvarings sectioner", "int", SC);
                    förvaringsSectioner = (int) listaGarageVal.get(0);
                    listaGarageVal.clear();

                    listaGarageVal = ValMetod("Försäljnings pris", "float", SC);
                    försäljningsPris = (float) listaGarageVal.get(0);
                    listaGarageVal.clear();

                    listaGarageVal = ValMetod("Tomt pris", "float", SC);
                    tomtPris = (float) listaGarageVal.get(0);
                    listaGarageVal.clear();

                    listaGarageVal = ValMetod("Tomt yta (m2)", "int", SC);
                    tomtYta = (int) listaGarageVal.get(0);
                    listaGarageVal.clear();

                    listaGarageVal = ValMetod("Byggnads kostnader", "float", SC);
                    byggnadsKostndader = (float) listaGarageVal.get(0);
                    listaGarageVal.clear();

                    Garage G = new Garage(tomtPris, tomtYta, planYta, antalRum, försäljningsPris, byggnadsKostndader,
                            förvaringsSectioner);
                    Order.addEfftersöktaFastigheter(G);
                    System.out.println("--------------------");
                    System.out.println("Garage skappat");
                    break;

                case 3:

                    int antalVåningsplan = 0;
                    int lägenheterPärPlan = 0;
                    int antalFöråd = 0;
                    int förådsYta = 0;
                    boolean Trapphus = true;
                    boolean Hiss = false;

                    System.out.println("--------------------");
                    System.out.println(
                            " Du har valt att skappa ett: Flervånings hus \n Tomt yta: odefinerat \n Tomt pris: odefinerat \n Antal våningsplan: odefinerat \n Lägenheter pär plan: odefinerat \n Antal föråd: odefinerat \n Föråds yta: odefinerat \n Trapphus: odefinerat \n Hiss: odefinerat");

                    List<Object> listaFlervåningsHusVal = ValMetod("Tomt yta", "int", SC);
                    tomtYta = (int) listaFlervåningsHusVal.get(0);
                    listaFlervåningsHusVal.clear();

                    listaFlervåningsHusVal = ValMetod("Tomt pris", "float", SC);
                    tomtPris = (float) listaFlervåningsHusVal.get(0);
                    listaFlervåningsHusVal.clear();

                    listaFlervåningsHusVal = ValMetod("Antal våningsplan", "int", SC);
                    antalVåningsplan = (int) listaFlervåningsHusVal.get(0);
                    listaFlervåningsHusVal.clear();

                    listaFlervåningsHusVal = ValMetod("Lägenheter pär plan", "int", SC);
                    lägenheterPärPlan = (int) listaFlervåningsHusVal.get(0);
                    listaFlervåningsHusVal.clear();

                    listaFlervåningsHusVal = ValMetod("Antal föråd", "int", SC);
                    antalFöråd = (int) listaFlervåningsHusVal.get(0);
                    listaFlervåningsHusVal.clear();

                    listaFlervåningsHusVal = ValMetod("Föråds yta (m2)", "int", SC);
                    förådsYta = (int) listaFlervåningsHusVal.get(0);
                    listaFlervåningsHusVal.clear();

                    listaFlervåningsHusVal = ValMetod("Hiss", "boolean", SC);
                    Hiss = (boolean) listaFlervåningsHusVal.get(0);
                    listaFlervåningsHusVal.clear();

                    listaFlervåningsHusVal = ValMetod("Trapphus", "boolean", SC);
                    Trapphus = (boolean) listaFlervåningsHusVal.get(0);
                    listaFlervåningsHusVal.clear();

                    System.out.println("- - - - - - - - - - - -");
                    System.out.println("Ange dimentionerna för lägenhetterna.");
                    listaFlervåningsHusVal = ValMetod("Plan yta (m2)", "int", SC);
                    planYta = (int) listaFlervåningsHusVal.get(0);
                    listaFlervåningsHusVal.clear();

                    listaFlervåningsHusVal = ValMetod("Antal rum", "int", SC);
                    antalRum = (int) listaFlervåningsHusVal.get(0);
                    listaFlervåningsHusVal.clear();

                    listaFlervåningsHusVal = ValMetod("Byggnads kostnader", "float", SC);
                    byggnadsKostndader = (float) listaFlervåningsHusVal.get(0);
                    listaFlervåningsHusVal.clear();

                    FlervaningsHus F = new FlervaningsHus(antalVåningsplan, lägenheterPärPlan, antalFöråd, förådsYta,
                            Trapphus, Hiss, tomtPris, tomtYta, planYta, försäljningsPris,
                            byggnadsKostndader);
                    for (int i = 0; i < antalVåningsplan * antalRum; i++) {
                        Lagnehet L = new Lagnehet(planYta, antalRum);
                        F.get_Lägenheter().add(L);
                    }
                    Order.addEfftersöktaFastigheter(F);
                    System.out.println("--------------------");
                    System.out.println("Flervåningshus skappat");
                    break;

                case 4:
                    if (Order.get_efftersöktaFastigheter().isEmpty()) {
                        Order = null;
                    } else {
                        ordrar.add(Order);
                    }

                    System.out.println("----------------------");
                    System.out.println("förslutter order");
                    System.out.println("----------------------");
                    skapparOrder = false;
                    break;
            }
        }
    }

    /**
     * taBortOrder är en metod där man kan ange ett orderID och ordern tas bort ur order listan.
     */
    public void taBortOrder() {
        Scanner SC2 = new Scanner(System.in);
        boolean loop = true;
        boolean inerloop = true;
        int användarID = 0;

        if (visaOrdrar()) {
            System.out.println("-----------------------------------");
            System.out.println("Vilken order vill du ta bort?   |Om ingen, ange \"0\"|");

            while (loop) {
                if (inerloop == false) {
                    System.out.println("-----------------------------------");
                    System.out.println("det finns ingen order med det ID");
                    inerloop = true;

                }
                while (inerloop) {
                    try {
                        System.out.print("Ange order ID: ");
                        användarID = SC2.nextInt();
                        SC2.nextLine();
                        inerloop = false;
                    } catch (Exception e) {
                        inerloop = true;
                        System.out.println("-----------------------------------");
                        throw new InputMismatchException("Fel input förväntar sig en Int");
                    }
                    if (användarID > 10000) {
                        inerloop = true;
                        System.out.println("-----------------------------------");
                        System.out.println("du kan inte ange ett id störe än 4 sifror");
                    }
                }

                for (Order order : ordrar) {
                    if (användarID == order.get_orderID()) {
                        loop = false;
                        ordrar.remove(order);
                        System.out.println("-----------------------------------");
                        System.out.println("Order bortagen");
                        System.out.println("-----------------------------------");
                        break;
                    }
                }

                if (användarID == 0) {
                    loop = false;
                    System.out.println("-----------------------------------");
                    System.out.println("Stänger bortagning");
                    System.out.println("-----------------------------------");
                }

            }

        }

    }

    /**
     * visaOrdrar använder toString metoden för att visa infromationen för alla ordrar i ordrar listan.
     * @return retunerar sant eller falkst beorende på om det finns några skappade ordrar.
     */
    public boolean visaOrdrar() {
        for (Order order : ordrar) {
            System.out.println("-----------------------");
            System.out.println(order);
        }
        if (ordrar.isEmpty()) {
            System.out.println("---------------------------------------------");
            System.out.println("Det finns för nuvarandet inga ordrar tillagda");
            System.out.println("---------------------------------------------");
            return false;
        }
        return true;
    }

    /**
     * visaProspecteradVinst beräknar alla ordrars vinst om de skulle säljas. 
     */
    public void visaProspecteradVist() {
        double summa = 0;
        for (Order order : ordrar) {
            ArrayList<Fastighet> efftersöktaFastigheter = order.get_efftersöktaFastigheter();
            for (Fastighet fastighet : efftersöktaFastigheter) {
                summa = fastighet.get_försäljningsPris();
                summa =- fastighet.get_byggnadsKostnader();
            }
            System.out.println(
                    "--------------------------------------------------------------------------------");
            System.out.println("Totalla vinsten från order med id: " + order.get_orderID()
                    + " om alla fastigheterna säljs blir: " + summa + "kr");
            System.out.println(
                    "--------------------------------------------------------------------------------");
        }
        if (ordrar.isEmpty()) {
            System.out.println("---------------------------------------------");
            System.out.println("Det finns för nuvarandet inga ordrar tillagda");
            System.out.println("---------------------------------------------");
        }
    }

    /*
     * visaPreliminäraKostnader beräknar vad alla ordrar kommer kosta tillsammans 
     */
    public void visaPreliminäraKostnader() {
        double summa = 0;
        for (Order order : ordrar) {
            ArrayList<Fastighet> efftersöktaFastigheter = order.get_efftersöktaFastigheter();
            for (Fastighet fastighet : efftersöktaFastigheter) {
                float Tpris = fastighet.get_tomtPris();
                float Bpris = fastighet.get_byggnadsKostnader();
                summa = +Tpris + Bpris;
            }
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("De preliminära kostnaderna samanlagt för ordern med id: " + order.get_orderID()
                    + ", blir: " + summa + "kr");
            System.out.println("---------------------------------------------------------------------------------");
        }
        if (ordrar.isEmpty()) {
            System.out.println("---------------------------------------------");
            System.out.println("Det finns för nuvarandet inga ordrar tillagda");
            System.out.println("---------------------------------------------");
        }
    }

    /**
     * ValMetod är en metod för att besvara specifika frågor, där använderaren kan ange olika data typer.
     * @param Varibelnamn vad är det för något som du vill att användaren ska ange  
     * @param datatyp datatypen som du vill att svaret ska vara i.
     * @param SC Scanner för att läsa av användarens input.
     * @return List<Object>, Retunerar ett list obejekt som innehåller ett obejekt men en data typ.
     * Denna metod är riskabel efftersom man måste ha rätt korisponderande datatyp när man kallar på metoden.
     */
    public List<Object> ValMetod(String Varibelnamn, String datatyp, Scanner SC) {
        List<Object> ReturnLista = new ArrayList<>();
        boolean väljer = true;
        System.out.println("---------------------");
        System.out.println("Ange: " + Varibelnamn);
        while (väljer == true) {
            try {

                switch (datatyp) {
                    case "int":
                        boolean klar = false;
                        int talInt = 0;
                        while (klar == false) {
                            talInt = SC.nextInt();
                            if (talInt < 1) {
                                klar = false;
                                System.out.println("Ange ett värde större än 0");
                                System.out.println("Ange: " + Varibelnamn);
                            } else {
                                klar = true;
                            }
                        }
                        ReturnLista.add(talInt);
                        SC.nextLine();
                        väljer = false;

                        break;

                    case "String":
                        String sträng = SC.nextLine();
                        ReturnLista.add(sträng);
                        väljer = false;
                        break;

                    case "long":
                        Long talLong = SC.nextLong();
                        ReturnLista.add(talLong);
                        SC.nextLine();
                        väljer = false;
                        break;

                    case "boolean":
                        System.out.println("\"true\" eller \"false\"");
                        boolean talboolean = SC.nextBoolean();
                        ReturnLista.add(talboolean);
                        SC.nextLine();
                        väljer = false;
                        break;

                    case "float":
                        float talFloat = SC.nextFloat();
                        ReturnLista.add(talFloat);
                        SC.nextLine();
                        väljer = false;
                        break;
                }
            } catch (Exception e) {
                väljer = true;
                throw new IllegalArgumentException("Dena metod förväntar sig en " + datatyp + "");
            }

        }

        return ReturnLista;
    }

}
