public class employe {
    protected String nom;
    protected String post;
    protected int salaire;
    protected int experience;
    protected int heuressup;
    protected int jabsences;
    protected int jcongé;
    protected int weekend;
    boolean empolyefort;
    public employe( String nom,String post,int salaire, int experience, int heuressup, int jabsences, int jcongé, int weekend ,boolean employefort) {
        this.nom=nom;
        this.post=post;
        this.salaire=salaire;
        this.experience = experience;
        this.heuressup = heuressup;
        this.jabsences = jabsences;
        this.jcongé = jcongé;
        this.weekend = weekend;
        this.empolyefort=employefort;

    }
    public int augmentations(){
        int sup=0;
        int mony=200*heuressup;
         sup=sup+mony;
        mony=experience*100;
        sup=sup+mony;
        mony=weekend*50;
        if(empolyefort==true){
            mony=mony+500;
            sup=sup+mony;
        }

        return sup;
    }
    public int sanctions(){
        int inf=0;
        int mony=1000*jabsences;
        inf=inf+mony;
        return inf;
    }
    public int calcsalaire(){
       int sup=augmentations();
        int inf=sanctions();
        return salaire+sup-inf;
    }




}
