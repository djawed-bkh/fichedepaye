public class employe {
    protected String nom;
    protected String post;
    protected int salaire;
    protected int experience;
    protected int heuressup;
    protected int jabsences;
    protected int jcongé;
    protected int weekend;
    protected  int sup=0;
    protected  int inf=0;
    public employe( String nom,String post,int salaire, int experience, int heuressup, int jabsences, int jcongé, int weekend) {
        this.nom=nom;
        this.post=post;
        this.salaire=salaire;
        this.experience = experience;
        this.heuressup = heuressup;
        this.jabsences = jabsences;
        this.jcongé = jcongé;
        this.weekend = weekend;

    }
    public int augmentations(){
        int mony=200*heuressup;
        sup=sup+mony;
        mony=experience*100;
        sup=sup+mony;
        mony=weekend*50;
        return sup;
    }
    public int sanctions(){
        int mony=1000*jabsences;
        inf=inf+mony;
        return inf;
    }
    public int calcsalaire(){
       sup=augmentations();
       inf=sanctions();
        return salaire+sup-inf;
    }




}
