public class fichetp extends empolyetp{
    public fichetp(String nom, String post, int salaire, int experience, int heuressup,int nbrheures, int jabsences, int jcongé, int weekend, boolean employefort) {
        super(nom, post, salaire,nbrheures, experience, heuressup, jabsences, jcongé, weekend, employefort);
    }
public void fpaye(){
    employeur e = new employeur("Mr bekhoucha", "ORAN", "22-bvg-56");
empolyetp j=new empolyetp("mohamed","secretaire",50,0,0,20,0,0,0,false);
    System.out.println("                    entremprise MON ENTREPRISE   ");
    System.out.println("employeur : " + e.getNom());
    System.out.println("adresse de l'entreprise  " + e.getAdresse());
    System.out.println("immatriculation de l'entreprise" + e.getImmatriculation());
    System.out.println("INFORMATIONS DE L'EMPLOYE :");
    System.out.println("   Nom : " + j.nom);
    System.out.println("   Post occupé : " + j.post);
    System.out.println("type : ");
    System.out.println(" temps partiel");
    System.out.println("   années d'experience : " + j.experience);
    System.out.println("Bilan salarial : ");
    System.out.println("Salaire :");
    System.out.println("    Salaire brut/heure :" + j.salaire);
    System.out.println("salaire mentuel cummulé :  "+j.calcsalire());

}
}
