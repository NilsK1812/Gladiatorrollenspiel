import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Objekte erzeugen
        Spieler spieler = new Spieler();
        Gladiator gladiator1 = new Gladiator("Jens", 1000, 500, 100);
        Menus start_menu = new Menus(new String[]{"Gladiatorrollenspiel","Spiel starten","Spiel laden","Spiel beenden"});
        Menus main_menu = new Menus(new String[] {"Hauptmenü","Markt","Arena betreten","Lazarett","Spiel speichern","Spiel beenden"});
        Scanner input = new Scanner(System.in);

        //Globale variablen
        String auswahl;
        boolean shouldbreak = false;

        //Startphase
        while (true){
            start_menu.show_menu();
            auswahl = input.nextLine();
            try{
                Integer.parseInt(auswahl);
                switch (Integer.parseInt(auswahl)){
                    case 1: {
                        abstand();
                        System.out.println("Willkommen zum Gladiatorrollenspiel!");
                        System.out.print("Sobald die Enter-Taste betätigt wurde geht es los!");
                        input.nextLine();
                        abstand();
                        System.out.print("Wie lautet ihr Name: ");
                        spieler.setName(input.nextLine());
                        shouldbreak = true;
                        break;
                    }

                    case 2: {
                        System.out.println("Kommt in einer spaeteren Version...");
                        break;
                    }

                    case 3: {
                        System.exit(0);
                        break;
                    }

                    default: {
                        wrong_input(1, 3);
                        break;
                    }
                }
                if(shouldbreak) {
                    shouldbreak = false;
                    break;
                }
            }
            catch (NumberFormatException e){
                wrong_input(1,3);
            }


        }

        abstand();

        //Maingame
        while (true) {
            main_menu.show_menu();
            auswahl = input.nextLine();
        }

    }

    private static void abstand(){
        for(int i = 0; i <= 25; i++) {
            System.out.print("\n");
        }
    }

    private static void wrong_input(int first_number, int second_number) {
        //try/catch block in case another thread interrupts the sleeping thread
        try {
            System.out.println(MessageFormat.format("Bitte geben Sie eine Zahl zwischen {0} und {1} ein.", first_number, second_number));
            Thread.sleep(2000);
            abstand();
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }
}