public class employeur {
    private  String nom;
    private  String adresse;
    private  String immatriculation;

    public employeur(String nom, String adresse, String immatriculation) {
        this.nom = nom;
        this.adresse = adresse;
        this.immatriculation = immatriculation;
    }

    public  String getNom() {
        return nom;
    }

    public  String getAdresse() {
        return adresse;
    }

    public  String getImmatriculation() {
        return immatriculation;
    }
}
