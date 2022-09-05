import java.text.MessageFormat;

public class Spieler extends Gladiator{
    //Eigenschaften/Attribute
    private int coins;
    private String gladiator;
    private String waffe;

    public Spieler(){
        coins = 1000;
        gladiator = "kein Gladiator";
        waffe = "keine Waffe";
        setHelm("kein Helm");
        setBrustplatte("keine Brustplatte");
        setHose("keine Hose");
        setSchuhe("keine Schuhe");
        setKraft(0);
        setLeben(0);
    }

    public void info(){
        System.out.print(MessageFormat.format("Spielerinfo:\n " +
                "Aktueller Kontostand: {0} Währung\n " +
                "Dein momentaner Gladiator ist: {1}\n " +
                "Accessoires: \n " +
                "   Waffe: {2}\n " +
                "   Helm: {3}\n " +
                "   Brustplatte: {4}\n " +
                "   Hose: {5}\n " +
                "   Schuhe: {6}\n " +
                "{7} hat folgende Werte:\n " +
                "   {8} Angriffskraft\n " +
                "   {9} Leben\n", coins, gladiator, waffe, getHelm(), getBrustplatte(), getHose(), getSchuhe(),
                gladiator ,getKraft(), getLeben()));
    }

}
