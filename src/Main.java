import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Willkommen zum Gladiatorrollenspiel!\n Sobald die Enter-Taste betätigt wurde geht es los!");

        input.nextLine();

        abstand();

        System.out.println("Ok");
    }

    private static void abstand(){
        for(int i = 0; i <= 25; i++) {
            System.out.println("\n");
        }
    }
}