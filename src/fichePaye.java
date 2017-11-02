public class fichePaye {


    public void fiche() {

        employeur e = new employeur("Mr bekhoucha", "ORAN", "22-bvg-56");
        employe k = new employe("emp1", "cadre", 5000, 2, 9, 2, 3, 4, true);

        System.out.println("                    entremprise MON ENTREPRISE   ");
        System.out.println("employeur : " + e.getNom());
        System.out.println("adresse de l'entreprise  " + e.getAdresse());
        System.out.println("immatriculation de l'entreprise" + e.getImmatriculation());
        System.out.println("INFORMATIONS DE L'EMPLOYE :");
        System.out.println("   Nom : " + k.nom);
        System.out.println("   Post occupé : " + k.post);
        System.out.println( "temps plein ");
        System.out.println("   années d'experience : " + k.experience);
        System.out.println("Bilan salarial : ");
        System.out.println("    jours de congé pris : " + k.jcongé + " jours de congé restants : " + (30 - k.jcongé) + " jours");
        System.out.println("Salaire :");
        System.out.println("    Salaire brut :" + k.salaire);
        System.out.println("PRIMES ET SANCTIONS:");
        int var = k.augmentations();
        if (var > 0) {
            System.out.println("  PRIMES :");
            System.out.println("service de week-end : " + k.weekend + " (+" + (50) * k.weekend + ")  DA");
            System.out.println("heures sup : " + k.heuressup + " (+" + (200) * k.heuressup + ")  DA");
            System.out.println("année d'experience : " + k.experience + " (+" + (100) * k.experience + ")  DA");
            System.out.println("la somme des augmentation est de " + k.augmentations());
            if (k.empolyefort == true) {
                System.out.println("felicitation vous etes l'employé du mois continuez comme ca ");
            }
        }
        var = k.sanctions();
        if (k.sanctions() > 0) {
            System.out.println("   SANCTIONS :");
            System.out.println("absences : " + k.jabsences + " (-" + (1000) * k.jabsences + ")  DA");
            System.out.println("la somme des sanctions est de " + k.sanctions());
        }
        System.out.println("Salaire total : " + (k.salaire - k.sanctions() + k.augmentations()) + "DA");
        if (k.jabsences > 16) {
            System.out.println("avertissement vous contabilisez trop d'absences ");
        }
        if (k.jabsences >= 25) {
            System.out.println("vous etes renvoyé pour absences excessives");

        }



    }

}
