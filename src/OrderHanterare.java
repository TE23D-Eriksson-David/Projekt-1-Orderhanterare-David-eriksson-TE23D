import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.time.LocalDate;
import java.math.*; // Måste fixas !! ska barra implementera random 
import java.util.Scanner;

public class OrderHanterare {

    private ArrayList<Order> ordrar;

    OrderHanterare() {
        ordrar = new ArrayList<Order>();
    }

    public void läggTillOrder(Kund A) {

        Scanner SC = new Scanner(System.in);
        int val = 0;
        boolean CreatingAnOrder = true;
        LocalDate orderDatum = LocalDate.now();
        int orderID = (int) (Math.random() * 9999);

        Order O = new Order(orderDatum, orderID, A.get_namn() + "_" + A.get_effternamn(), A.get_email());

        while (CreatingAnOrder) {
            System.out.println("-----------------------------");
            System.out
                    .println("Skappa fastighet: \n 1. Planhus \n 2. Garagae \n 3. Flervåningshus \n 4. Avsluta order");
            boolean V = true;
            while (V == true) {
                try {
                    val = SC.nextInt();
                    V = false;
                } catch (Exception e) {
                    V = true;
                    throw new IllegalArgumentException("Dena metod förväntar sig en int");
                }
                if (val > 4 || val < 1) {
                    V = true;
                    System.out.println("Ange ett val mellan 1-4");
                }
            }
            V = true;

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

                    List<Object> lp = ValMetod("Plan yta (m2)", "int", SC);
                    planYta = (int) lp.get(0);
                    lp.clear();

                    lp = ValMetod("Antal rum", "int", SC);
                    antalRum = (int) lp.get(0);
                    lp.clear();

                    lp = ValMetod("Försäljnings pris", "float", SC);
                    försäljningsPris = (float) lp.get(0);
                    lp.clear();

                    lp = ValMetod("Tomt pris", "float", SC);
                    tomtPris = (float) lp.get(0);
                    lp.clear();

                    lp = ValMetod("Tomt yta (m2)", "int", SC);
                    tomtYta = (int) lp.get(0);
                    lp.clear();

                    lp = ValMetod("Byggnads Kostnader", "float", SC);
                    byggnadsKostndader = (float) lp.get(0);
                    lp.clear();

                    Planhus P = new Planhus(planYta, antalRum, försäljningsPris, tomtPris, tomtYta, byggnadsKostndader);
                    O.addEfftersöktaFastigheter(P);
                    System.out.println("-----------------------");
                    System.out.println("Villa skappad");
                    break;

                case 2:

                    int förvaringsSectioner = 0;
                    System.out.println("--------------------");
                    System.out.println(
                            " Du har valt att skappa ett: Garage \n Planyta: odefinerat \n Antal rum: odefinerat \n Försäljningspris: odefinerat \n Tomt pris: odefinerat \n Tomt yta: odefinerat \n Förvarings sectioner \n");

                    List<Object> lg = ValMetod("Plan yta (m2)", "int", SC);
                    planYta = (int) lg.get(0);
                    lg.clear();

                    lg = ValMetod("Antal rum", "int", SC);
                    antalRum = (int) lg.get(0);
                    lg.clear();

                    lg = ValMetod("Förvarings sectioner", "int", SC);
                    förvaringsSectioner = (int) lg.get(0);
                    lg.clear();

                    lg = ValMetod("Försäljnings pris", "float", SC);
                    försäljningsPris = (float) lg.get(0);
                    lg.clear();

                    lg = ValMetod("Tomt pris", "float", SC);
                    tomtPris = (float) lg.get(0);
                    lg.clear();

                    lg = ValMetod("Tomt yta (m2)", "int", SC);
                    tomtYta = (int) lg.get(0);
                    lg.clear();

                    lg = ValMetod("Byggnads kostnader", "float", SC);
                    byggnadsKostndader = (float) lg.get(0);
                    lg.clear();

                    Garage G = new Garage(tomtPris, tomtYta, planYta, antalRum, försäljningsPris, byggnadsKostndader,
                            förvaringsSectioner);
                    O.addEfftersöktaFastigheter(G);
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

                    List<Object> lf = ValMetod("Tomt yta", "int", SC);
                    tomtYta = (int) lf.get(0);
                    lf.clear();

                    lf = ValMetod("Tomt pris", "float", SC);
                    tomtPris = (float) lf.get(0);
                    lf.clear();

                    lf = ValMetod("Antal våningsplan", "int", SC);
                    antalVåningsplan = (int) lf.get(0);
                    lf.clear();

                    lf = ValMetod("Lägenheter pär plan", "int", SC);
                    lägenheterPärPlan = (int) lf.get(0);
                    lf.clear();

                    lf = ValMetod("Antal föråd", "int", SC);
                    antalFöråd = (int) lf.get(0);
                    lf.clear();

                    lf = ValMetod("Föråds yta (m2)", "int", SC);
                    förådsYta = (int) lf.get(0);
                    lf.clear();

                    lf = ValMetod("Hiss", "boolean", SC);
                    Hiss = (boolean) lf.get(0);
                    lf.clear();

                    lf = ValMetod("Trapphus", "boolean", SC);
                    Trapphus = (boolean) lf.get(0);
                    lf.clear();

                    System.out.println("- - - - - - - - - - - -");
                    System.out.println("Ange dimentionerna för lägenhetterna.");
                    lf = ValMetod("Plan yta (m2)", "int", SC);
                    planYta = (int) lf.get(0);
                    lf.clear();

                    lf = ValMetod("Antal rum", "int", SC);
                    antalRum = (int) lf.get(0);
                    lf.clear();

                    lf = ValMetod("Byggnads kostnader", "float", SC);
                    byggnadsKostndader = (float) lf.get(0);
                    lf.clear();

                    FlervaningsHus F = new FlervaningsHus(antalVåningsplan, lägenheterPärPlan, antalFöråd, förådsYta,
                            Trapphus, Hiss, tomtPris, tomtYta, planYta, antalRum, försäljningsPris,
                            byggnadsKostndader);
                    for (int i = 0; i < antalVåningsplan * antalRum; i++) {
                        Lagnehet L = new Lagnehet(planYta, antalRum);
                        F.Lägenheter.add(L);
                    }
                    O.addEfftersöktaFastigheter(F);
                    System.out.println("--------------------");
                    System.out.println("Flervåningshus skappat");
                    break;

                case 4:
                    if (O.getEfftersöktaFastigheter().isEmpty()) {
                        O = null;
                    } else {
                        ordrar.add(O);
                    }

                    System.out.println("----------------------");
                    System.out.println("förslutter order");
                    System.out.println("----------------------");
                    CreatingAnOrder = false;
                    break;
            }
        }
    }

    public void taBortOrder(Kund A) {

        Scanner SC2 = new Scanner(System.in);
        boolean loop = true;
        boolean inerloop = true;
        int användarID = 0;

        if (visaOrdrar(A)) {
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
                    if (användarID == order.getOrderID()) {
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

    public boolean visaOrdrar(Kund A) {
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

    public void visaProspecteradVist(Kund A) {
        double summa = 0;
        for (Order order : ordrar) {
            ArrayList<Fastighet> efftersöktaFastigheter = order.getEfftersöktaFastigheter();
            for (Fastighet fastighet : efftersöktaFastigheter) {
                summa = fastighet.get_försäljningsPris();
            }
            System.out.println(
                    "--------------------------------------------------------------------------------");
            System.out.println("Totalla vinsten från order med id: " + order.getOrderID()
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

    public void visaPreliminäraKostnader(Kund A) {
        double summa = 0;
        for (Order order : ordrar) {
            ArrayList<Fastighet> efftersöktaFastigheter = order.getEfftersöktaFastigheter();
            for (Fastighet fastighet : efftersöktaFastigheter) {
                float Tpris = fastighet.get_tomtPris();
                float Bpris = fastighet.get_byggnadsKostnader();
                summa = +Tpris + Bpris;
            }
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("De preliminära kostnaderna samanlagt för ordern med id: " + order.getOrderID()
                    + ", blir: " + summa + "kr");
            System.out.println("---------------------------------------------------------------------------------");
        }
        if (ordrar.isEmpty()) {
            System.out.println("---------------------------------------------");
            System.out.println("Det finns för nuvarandet inga ordrar tillagda");
            System.out.println("---------------------------------------------");
        }
    }

    public List<Object> ValMetod(String Varibelnamn, String datatyp, Scanner SC) {
        List<Object> ReturnLista = new ArrayList<>();
        boolean V = true;
        System.out.println("---------------------");
        System.out.println("Ange: " + Varibelnamn);
        while (V == true) {
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
                        V = false;

                        break;

                    case "String":
                        String sträng = SC.nextLine();
                        ReturnLista.add(sträng);
                        V = false;
                        break;

                    case "long":
                        Long talLong = SC.nextLong();
                        ReturnLista.add(talLong);
                        SC.nextLine();
                        V = false;
                        break;

                    case "boolean":
                        System.out.println("\"true\" eller \"false\"");
                        boolean talboolean = SC.nextBoolean();
                        ReturnLista.add(talboolean);
                        SC.nextLine();
                        V = false;
                        break;

                    case "float":
                        float talFloat = SC.nextFloat();
                        ReturnLista.add(talFloat);
                        SC.nextLine();
                        V = false;
                        break;
                }
            } catch (Exception e) {
                V = true;
                throw new IllegalArgumentException("Dena metod förväntar sig en " + datatyp + "");
            }

        }

        return ReturnLista;
    }

}
