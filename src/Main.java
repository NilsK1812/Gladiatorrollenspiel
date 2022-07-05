import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Objekte erzeugen
        Spieler spieler = new Spieler();
        Gladiator gladiator1 = new Gladiator("Jens", 1000, 500, 100);

        Scanner input = new Scanner(System.in);

        System.out.println("Willkommen zum Gladiatorrollenspiel!\n Sobald die Enter-Taste betätigt wurde geht es los!");

        input.nextLine();

        abstand();

        System.out.println("Wie lautet ihr Name: ");
        spieler.setName(input.nextLine());

        spieler.informationen();
    }

    private static void abstand(){
        for(int i = 0; i <= 25; i++) {
            System.out.println("\n");
        }
    }
}