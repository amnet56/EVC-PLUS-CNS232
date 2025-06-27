import java.util.Scanner;

public class EVC {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String pinCODE = "*770#";
        int haraaga = 100;
        String pincode_Entering = input.next();

        if (pinCODE.equals(pincode_Entering)) {
            System.out.println("-EVCPLUS-");
            System.out.println("Please inter ur pin (Enter PIN)");

        }


        int pinentering1 = 1235;              // Correct PIN
        int pinentering2 = input.nextInt();   // User enters PIN

        if (pinentering1 == pinentering2) {
            // === Main Menu ===
            System.out.println("-EVCPLUS-");
            System.out.println("Show your balance");
            System.out.println("2. Airtime");
            System.out.println("3. Transfer EVCPLUS");
            System.out.println("4. warbixin kooban");
            System.out.println("5. salaam Bank");
            System.out.println("6. Bixi bill");
            System.out.println("7. Iibso Data internet");
            System.out.println("8. Maareynta");
            System.out.println("9. ka noqo");

            int choosingPhase2 = input.nextInt(); // User selects option


            if (choosingPhase2 == 1) {
                System.out.println("Haraagaaga waa $" + haraaga);
            }


            else if (choosingPhase2 == 2) {
                System.out.println("-Kaarka hadalka-");
                System.out.println("1. ku shubo Airtime");
                System.out.println("2. Ugu shub Airtime");
                System.out.println("3. ku shub Internet");
                System.out.println("4. Kanoqo");
                int kaarkaHadalka = input.nextInt();


                if (kaarkaHadalka == 1) {
                    System.out.println("-Ku shubo Airtime-");
                    System.out.println("fadlan gali lacagta");
                    int GaliLacgta = input.nextInt();

                    if (GaliLacgta > haraaga) {
                        System.out.println("Haraagaaga kugu ma filna!");
                    } else {
                        System.out.println("Ma hubtaa inaad $" + GaliLacgta + " ku shubatid?");
                        System.out.println("1. Haa");
                        System.out.println("2. Maya");
                        int GoaanHAAmaya = input.nextInt();

                        if (GoaanHAAmaya == 1) {
                            System.out.println("waxaa ku shubatay ku hadal dhan $" + GaliLacgta);
                            System.out.println("Mahadsanid");
                        } else if (GoaanHAAmaya == 2) {
                            System.out.println("waa ku mahaadsantahay isticmaalkaaga");
                        } else {
                            System.out.println("waxa aad dooratay lanbar ka baxsan xadka");
                        }
                    }
                }


                else if (kaarkaHadalka == 2) {
                    System.out.println("Ugu shub qof kale kaarka hadalka");
                    System.out.println("Gali lacagta");
                    int lacgaugushubqofkale = input.nextInt();
                    System.out.println("Fadlan gali lanbarka");
                    int GalilacgataQofkaKale = input.nextInt();
                    System.out.println("Ma hubtaa inaad ugu shubaysid $ " + lacgaugushubqofkale + " lanbarkaan " + GalilacgataQofkaKale);
                    System.out.println("1. Haa");
                    System.out.println("2. Maya");
                    int Goaan2 = input.nextInt();

                    if (Goaan2 == 1) {
                        System.out.println("waxaad $" + lacgaugushubqofkale + " ugu shubtay " + GalilacgataQofkaKale);
                    } else if (Goaan2 == 2) {
                        System.out.println("waa laga noqday codsigaaga");
                        System.out.println("MAHADSANID");
                    }
                }


                else if (kaarkaHadalka == 3) {
                    System.out.println("-ku shubo Internet-");
                    System.out.println("1. maalinle");
                    System.out.println("2. isbuucle");
                    System.out.println("3. bille");
                    System.out.println("4. ka noqo");
                    int chooseinrenet = input.nextInt();

                    System.out.println("Fadlan gali lacagta ");
                    int lacagtaInternetka = input.nextInt();

                    if (chooseinrenet == 1) {
                        System.out.println("waxaa ku shubatay xirmo maalinle ah $" + lacagtaInternetka);
                    } else if (chooseinrenet == 2) {
                        System.out.println("waxaa ku shubatay xirmo isbuucle ah $" + lacagtaInternetka);
                    } else if (chooseinrenet == 3) {
                        System.out.println("waxaa ku shubatay xirmo bille ah $" + lacagtaInternetka);
                    } else if (chooseinrenet == 4) {
                        System.out.println("waa laga noqday codsigaga");
                        System.out.println("MAHADSANID");
                    } else {
                        System.out.println("Doorasho khaldan");
                    }
                }


                else if (kaarkaHadalka == 4) {
                    System.out.println("Waa laga noqday codsigaga. Mahadsanid.");
                } else {
                    System.out.println("Xadka waa ka baxday 1---4");
                }
            }


            else if (choosingPhase2 == 3) {
                System.out.println("fadlan gali mobile ka");
                int wareejinlacag = input.nextInt();
                System.out.println("fadlan gali lacagta");
                int Uwareejinlacag = input.nextInt();
                int haraagaa = haraaga - Uwareejinlacag;

                System.out.println("mahubtaa inaad u wareejiso " + wareejinlacag + " lacag dhan $ " + Uwareejinlacag);
                System.out.println("1. haa");
                System.out.println("2. maya");
                int goaanwareejin = input.nextInt();

                if (goaanwareejin == 1) {
                    System.out.println("mahadsanid");
                    System.out.println("$" + Uwareejinlacag + " wareejisay " + wareejinlacag);
                    System.out.println("haraagaaga waa $" + haraagaa);
                } else {
                    System.out.println("waalaga noqday codsigaaga. Mahadsanid.");
                }
            }


            else if (choosingPhase2 == 4) {
                System.out.println("-warbixin kooban-");
                System.out.println("1. last action");
                System.out.println("2. wareejintii ugu danbeesay");
                System.out.println("3. last 3 action");

                int warbixinkoobanChoice = input.nextInt();

                if (warbixinkoobanChoice == 1) {
                    System.out.println("gali lanbarka");
                    int galilanbarkaaga = input.nextInt();
                    System.out.println("Gali lacagta aad u dirtay");
                    int Uwareejinlacag = input.nextInt();
                    System.out.println("$" + Uwareejinlacag + " ayaad u wareejisay " + galilanbarkaaga);
                    System.out.println("Taariikh: 27/4/2025  09:15am");
                }
            }

            // === Option 5: Salaam Bank Section ===
            else if (choosingPhase2 == 5) {
                System.out.println("-salaam Bank-");
                System.out.println("1. itus haraagaaga");
                System.out.println("2. Lacag dhigasho");
                System.out.println("3. Lacag qaadasho");
                System.out.println("3. account to account");
                System.out.println("4. ka bax");
                System.out.print("Fadlan dooro adeeg (1-5): ");
                int choice = input.nextInt();
                if (choice == 1) {
                    System.out.println("Haraagaaga waa: 2500$");
                }
                else if (choice == 2) {
                    System.out.print("Geli lacagta aad dhigeyso: ");
                    int deposit = input.nextInt();
                    System.out.println("Waad dhigatay: " + deposit + " $");
                }
                else if (choice == 3) {
                    System.out.print("Geli lacagta aad rabto inaad qaadato: ");
                    int withdraw = input.nextInt();
                    System.out.println("Waad qaaday: " + withdraw + " $");
                }
                else if (choice == 4) {
                    System.out.print("Geli account-ka aad u wareejinayso: ");
                    String account = input.next();
                    System.out.print("Geli lacagta la wareejinayo: ");
                    int amount = input.nextInt();
                    System.out.println("Waad u wareejisay " + amount + " $ account-ka ");
                }
                else if (choice == 5) {
                    System.out.println("Waad ka baxday Salaam Bank. Mahadsanid.");
                }
             else {
                System.out.println("Doorasho khaldan. Fadlan dooro tiro u dhaxaysa 1 ilaa 5.");
            }

            }

            // === Option 6: Bixi Biil (Pay Bill) ===
            else if (choosingPhase2 == 6) {
                System.out.println("-Bixi Biil-");
                input.nextLine(); // Clear buffer
                System.out.println("Fadlan gali magaca schoolka:");
                String shirkada = input.nextLine();
                System.out.println("Fadlan gali lacagta:");
                int lacag = input.nextInt();
                System.out.println("Waxaad si guul leh ugu bixisay $" + lacag + " shirkada " + shirkada + ".");
            }

            // === Option 7: Iibso Data internet ===
            else if (choosingPhase2 == 7) {
                System.out.println("-Iibso Data internet-");
                System.out.println("1. 5GB Maalinle - $3");
                System.out.println("2. 15GB Todobaadle - $13");
                System.out.println("3. 30GB Bille - $20");
                System.out.print("Dooro xirmo: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Waxaad iibsatay 5GB Maalinle. Mahadsanid!");
                        break;
                    case 2:
                        System.out.println("Waxaad iibsatay 15GB Todobaadle. Mahadsanid!");
                        break;
                    case 3:
                        System.out.println("Waxaad iibsatay 30GB Bille. Mahadsanid!");
                        break;
                    default:
                        System.out.println("Doorasho aan sax aheyn. Fadlan isku day mar kale!");
                }
            }

            // === Option 8: Mareenyta ===
            else if (choosingPhase2 == 8) {
                System.out.print("bedel lambarka sirta ah: ");
                int newPin = input.nextInt();
                System.out.println("Bedel luqada:");
                System.out.println("1. English");
                System.out.println("2. Somali");
                System.out.print("Dooro luqad (1-2): ");
                int languageChoice = input.nextInt();
                if (languageChoice == 1) {
                    System.out.println("Language changed to English.");
                } else if (languageChoice == 2) {
                    System.out.println("Luqadda waa la bedelay: Soomaali.");
                } else {
                    System.out.println("Invalid choice. Please select 1, 2, ");
                }


                System.out.println("wargelin lamabar lumay.");
                int lostNumber = input.nextInt();

                System.out.println("lacag xirasho");

                System.out.println("u celi lacag qaldanty.");
                int refundAmount = input.nextInt();
                System.out.println("The incorrect amount has been refunded.");
            }

            // === Option 9: Exit ===
            else if (choosingPhase2 == 9) {
                System.out.println("Waad ka baxday. Mahadsanid!");
            }

            // === Invalid Option ===
            else {
                System.out.println("Doorasho aan sax ahayn. Fadlan isku day mar kale!");
            }

        } else {
            System.out.println("PIN khaldan. Isku day mar kale.");
        }

        input.close(); // Always close scanner
    }
}