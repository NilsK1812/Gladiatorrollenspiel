import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Objekte erzeugen
        Spieler spieler = new Spieler();
        Gladiator gladiator1 = new Gladiator("Jens", 1000, 500, 100);
        Menus start_menu = new Menus(new String[]{"Spiel starten","Spiel laden","Spiel beenden"});
        Menus main_menu = new Menus(new String[] {"Markt","Arena betreten","Lazarett","Spiel speichern","Spiel beenden"});
        Scanner input = new Scanner(System.in);

        //Globale variablen
        int auswahl;
        boolean shouldbreak = false;

        while (true){
            start_menu.show_menu();
            auswahl = input.nextInt();
            switch (auswahl){
                case 1:
                    System.out.println("Willkommen zum Gladiatorrollenspiel!");
                    System.out.print("Sobald die Enter-Taste betätigt wurde geht es los!");
                    input.nextLine();
                    abstand();
                    System.out.print("Wie lautet ihr Name: ");
                    spieler.setName(input.nextLine());
                    shouldbreak = true;
                    break;

                case 2:
                    System.out.println("Kommt in einer spaeteren Version...");
                    break;

                case 3:
                    System.exit(0);
                    break;
            }
            if(shouldbreak == true) {
                shouldbreak = false;
                break;
            }
        }

        abstand();

        main_menu.show_menu();

    }

    private static void abstand(){
        for(int i = 0; i <= 25; i++) {
            System.out.print("\n");
        }
    }
}