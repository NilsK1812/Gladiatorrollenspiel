public class Gladiator extends Accessoires{
    //Eigenschaften/Attribute
    private String helm;
    private String brustplatte;
    private String hose;
    private String schuhe;

    public Gladiator(){}

    public Gladiator(String name, int preis, int leben, int kraft){
        setName(name);
        setPreis(preis);
        setLeben(leben);
        setKraft(kraft);
    }

}
