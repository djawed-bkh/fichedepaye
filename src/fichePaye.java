public class fichePaye extends salaire {
    public fichePaye(String post, int experience, int heuressup, int jabsences, int jconge, int weekend) {
        super(post, experience, heuressup, jabsences, jconge, weekend);
    }

    public void fiche(){
        employeur e=new employeur("Mr bekhoucha","ORAN","22-bvg-56");
        employe k=new employe("cadre",5,20,1,10,3);
        System.out.println("                    entremprise MON ENTREPRISE   ");
        System.out.println("employeur : "+e.getNom());
        System.out.println("adresse de l'entreprise  "+e.getAdresse());
        System.out.println("immatriculation de l'entreprise"+e.getImmatriculation());
        System.out.println("INFORMATIONS DE L'EMPLOYE :");
        System.out.println("   Nom : "+k.nom);
        System.out.println("   Post occupé : "+k.post);
        System.out.println("   années d'experience : "+k.experience);
        System.out.println("Bilan salarial : ");
        System.out.println("    jours absences : "+k.jabsences+"reduit de "+k.jabsences*1000+" da le salaire");
        System.out.println("    heures sup : "+k.heuressup+" augmente de "+k.heuressup*200+" da le salaire");
        System.out.println("    nombre service en week-end : "+k.weekend);
        System.out.println("    jours de congé pris"+k.jcongé+ " jours de congé restants : ");
        System.out.println("Salaire brut :");
        System.out.println();


    }
}
