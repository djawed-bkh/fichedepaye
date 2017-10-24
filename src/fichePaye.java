public class fichePaye extends salaire {
    public fichePaye(String post,int salaire, int experience, int heuressup, int jabsences, int jconge, int weekend,char temps) {
        super(post,salaire, experience, heuressup, jabsences, jconge, weekend,temps);
    }

    public void fiche(){
        employeur e=new employeur("Mr bekhoucha","ORAN","22-bvg-56");
        employe k=new employe("cadre",100000,5,20,1,10,3,'p');
        System.out.println("                    entremprise MON ENTREPRISE   ");
        System.out.println("employeur : "+e.getNom());
        System.out.println("adresse de l'entreprise  "+e.getAdresse());
        System.out.println("immatriculation de l'entreprise"+e.getImmatriculation());
        System.out.println("INFORMATIONS DE L'EMPLOYE :");
        System.out.println("   Nom : "+k.nom);
        System.out.println("   Post occupé : "+k.post);
        System.out.println("   années d'experience : "+k.experience);
        System.out.println("Bilan salarial : ");
        System.out.println("    jours de congé pris : "+k.jcongé+ " jours de congé restants : "+(30-k.jcongé)+" jours");
        System.out.println("Salaire :");
        System.out.println("    Salaire brut :"+k.salaire);
         System.out.println("PRIMES ET SANCTIONS:");
       if (augmentations()>0){
            System.out.println("  PRIMES :");
            System.out.println(         "service de week-end : "+k.weekend+" (+"+(50)*k.weekend+")  DA"  );
            System.out.println(         "heures sup : "+k.heuressup+" (+"+(200)*k.heuressup+")  DA"  );
            System.out.println(         "année d'experience : "+k.experience+" (+"+(100)*k.experience+")  DA"  );
            System.out.println("la somme des augmentation est de "+augmentations());
        }
        if (sanctions()>0){
            System.out.println("   SANCTIONS :");
            System.out.println(         "absences : "+jabsences+" (-"+(1000)*jabsences+")  DA"  );
            System.out.println("la somme des sanctions est de "+sanctions());
        }

        System.out.println("Salaire total : "+(k.salaire-sanctions()+augmentations()) +"DA" );



    }
}
