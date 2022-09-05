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

    public String getHelm() {
        return helm;
    }

    public void setHelm(String helm) {
        this.helm = helm;
    }

    public String getBrustplatte() {
        return brustplatte;
    }

    public void setBrustplatte(String brustplatte) {
        this.brustplatte = brustplatte;
    }

    public String getHose() {
        return hose;
    }

    public void setHose(String hose) {
        this.hose = hose;
    }

    public String getSchuhe() {
        return schuhe;
    }

    public void setSchuhe(String schuhe) {
        this.schuhe = schuhe;
    }
}
