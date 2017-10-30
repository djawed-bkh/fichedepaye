public class main {
    public static void main(String[] args) {
            fichePaye f=new fichePaye();
            employe z=new employe("emp1","cadre",5000,2,9,2,3,4);
        System.out.println(  z.sanctions());
        System.out.println(  z.augmentations());
            f.fiche();

    }
}
