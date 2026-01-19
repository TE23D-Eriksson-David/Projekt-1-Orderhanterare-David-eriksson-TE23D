import java.util.ArrayList;
import java.time.LocalDate;
import java.math.*; // Måste fixas !!
import java.util.Scanner;

public class OrderHanterare {

    private ArrayList<Order> ordrar;

    OrderHanterare() {
        ordrar = new ArrayList<Order>();
    }

    public long läggTillOrder(Kund A) {
        Scanner SC = new Scanner(System.in);
        int val = 0;
        boolean CreatingAnOrder = true;
        LocalDate orderDatum = LocalDate.now();
        int orderID = (int) (Math.random() * 10000); // !!!
        Order O = new Order(orderDatum, orderID, A.get_namn() + "_" + A.get_effternamn(), A.get_email());

        while (CreatingAnOrder) {
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
                if (val > 3 && val < 1) {
                    V = true;
                    throw new IllegalArgumentException("Ange ett val mellan 1-3");
                }
            }
            V = true;

            int planYta = 0;
            float tomtPris = 0f;
            int tomtYta = 0;
            int antalRum = 0;
            float försäljningsPris = 0f;
            switch (val) {
                case 1:

                    System.out.println(
                            " Du har valt att skappa en: Villa \n Planyta: odefinerat \n Antal rum: odefinerat \n Försäljningspris: odefinerat \n Tomt pris: odefinerat \n Tomt yta: odefinerat \n");
                    System.out.println("Ange: Planyta (m2)");
                    while (V == true) {
                        try {
                            planYta = SC.nextInt();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    System.out.println("Ange: Antal rum");
                    while (V == true) {
                        try {
                            antalRum = SC.nextInt();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    System.out.println("Ange: Försäljnings pris ");
                    while (V == true) {
                        try {
                            försäljningsPris = SC.nextFloat();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    System.out.println("Ange: Tomt pris ");
                    while (V == true) {
                        try {
                            tomtPris = SC.nextFloat();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    System.out.println("Ange: Tomt yta (m2)");
                    while (V == true) {
                        try {
                            tomtYta = SC.nextInt();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    Planhus P = new Planhus(planYta, antalRum, försäljningsPris, tomtPris, tomtYta);
                    O.addEfftersöktaFastigheter(P);
                    System.out.println("Villa skappad");
                    break;

                case 2:
                    int förvaringsSectioner = 0;
                    System.out.println(
                            " Du har valt att skappa ett: Garage \n Planyta: odefinerat \n Antal rum: odefinerat \n Försäljningspris: odefinerat \n Tomt pris: odefinerat \n Tomt yta: odefinerat \n Förvarings sectioner \n");
                    System.out.println("Ange: Planyta (m2)");
                    while (V == true) {
                        try {
                            planYta = SC.nextInt();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    System.out.println("Ange: Antal rum");
                    while (V == true) {
                        try {
                            antalRum = SC.nextInt();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    System.out.println("Ange: Förvarings sectioner");
                    while (V == true) {
                        try {
                            förvaringsSectioner = SC.nextInt();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    System.out.println("Ange: Försäljnings pris ");
                    while (V == true) {
                        try {
                            försäljningsPris = SC.nextFloat();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    System.out.println("Ange: Tomt pris ");
                    while (V == true) {
                        try {
                            tomtPris = SC.nextFloat();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    System.out.println("Ange: Tomt yta (m2)");
                    while (V == true) {
                        try {
                            tomtYta = SC.nextInt();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    Garage G = new Garage(planYta, antalRum, försäljningsPris, tomtPris, tomtYta, förvaringsSectioner);
                    O.addEfftersöktaFastigheter(G);
                    System.out.println("Garage skappat");
                    break;

                case 3:
                    int antalVåningsplan = 0;
                    int lägenheterPärPlan = 0;
                    int antalFöråd = 0;
                    int förådsYta = 0;
                    boolean Trapphus = true;
                    boolean Hiss = false;

                    System.out.println(
                            " Du har valt att skappa ett: Flervånings hus \n Tomt yta: odefinerat \n Tomt pris: odefinerat \n Antal våningsplan: odefinerat \n Lägenheter pär plan: odefinerat \n Antal föråd: odefinerat \n Föråds yta: odefinerat \n Trapphus: odefinerat \n Hiss: odefinerat \n");
                    System.out.println("Ange: Tomt yta (m2)");
                    while (V == true) {
                        try {
                            tomtYta = SC.nextInt();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    System.out.println("Ange: Tomt pris");
                    while (V == true) {
                        try {
                            tomtPris = SC.nextInt();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    System.out.println("Ange: Antal våningsplan ");
                    while (V == true) {
                        try {
                            antalVåningsplan = SC.nextInt();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    System.out.println("Ange: Lägenheter pär plan ");
                    while (V == true) {
                        try {
                            lägenheterPärPlan = SC.nextInt();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    System.out.println("Ange: Antal fråd ");
                    while (V == true) {
                        try {
                            antalFöråd = SC.nextInt();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    System.out.println("Ange: Föråds yta (m2)");
                    while (V == true) {
                        try {
                            förådsYta = SC.nextInt();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    // TRAPPHUS
                    // HISS

                    System.out.println("Ange dimentionerna för lägenhetterna. ");

                    System.out.println("Ange: Plan yta (m2)");
                    while (V == true) {
                        try {
                            planYta = SC.nextInt();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    System.out.println("Ange: Antal rum");
                    while (V == true) {
                        try {
                            antalRum = SC.nextInt();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    System.out.println("Ange: Försäljningspris");
                    while (V == true) {
                        try {
                            försäljningsPris = SC.nextFloat();
                            V = false;
                        } catch (Exception e) {
                            V = true;
                            throw new IllegalArgumentException("Dena metod förväntar sig en int");
                        }
                    }
                    V = true;

                    FlervaningsHus F = new FlervaningsHus(antalVåningsplan, lägenheterPärPlan, antalFöråd, förådsYta,
                            Trapphus, Hiss);
                    for (int i = 0; i < planYta * antalRum; i++) {
                        Lagnehet L = new Lagnehet(planYta, antalRum, försäljningsPris);
                        F.Lägenheter.add(L);
                    }
                    O.addEfftersöktaFastigheter(F);
                    break;
                case 4:
                    System.out.println("förslutter order");
                    CreatingAnOrder = false;
                    break;
            }
        }

        return orderID; // order ID + order Datum
    }

    public void taBortOrder(Kund A) {
    }

    public void visaOrdrar(Kund A) {
    }

    public void visaProspecteradVist(Kund A) {
    }

    public void visaPreliminäraKostnader(Kund A) {
    }

    void ValMetod(String Varibelnamn, String datatyp, Scanner SC) {
        boolean V = true;
        System.out.println("Ange: " + Varibelnamn + " ");
        while (V == true) {
            switch (datatyp) {
                case "int":
                    try {
                int tal = SC.nextInt();
                V = false;
            } catch (Exception e) {
                V = true;
                throw new IllegalArgumentException("Dena metod förväntar sig en int");
            }
                    break;
                case "String":
                    try {
                String mening = SC.nextLine();
                V = false;
            } catch (Exception e) {
                V = true;
                throw new IllegalArgumentException("Dena metod förväntar sig en String");
            }
                    break;
                case "long":
                try {
                Long tal = SC.nextLong();
                V = false;
            } catch (Exception e) {
                V = true;
                throw new IllegalArgumentException("Dena metod förväntar sig en Long");
            }
                    break;
                case "boolean":
                try {
                boolean tal = SC.nextBoolean(); // Förväntar sig T & F tror jag.
                V = false;
            } catch (Exception e) {
                V = true;
                throw new IllegalArgumentException("Dena metod förväntar sig en boolean (T & F)");
            }
                    break;
                case "float":
                    try {
                float tal = SC.nextFloat();
                V = false;
            } catch (Exception e) {
                V = true;
                throw new IllegalArgumentException("Dena metod förväntar sig en float");
            }
                    break;
            }

        }
        V = true;

    } // ska returnera obejekt med rätt datatyp 

}
