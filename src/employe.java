public class employe {
    protected String nom;
    protected String post;
    protected int salaire;
    protected int experience;
    protected int heuressup;
    protected int jabsences;
    protected int jcongé;
    protected int weekend;
    protected char temps;
    public employe(String post,int salaire, int experience, int heuressup, int jabsences, int jcongé, int weekend,char temps) {
        this.post=post;
        this.salaire=salaire;
        this.experience = experience;
        this.heuressup = heuressup;
        this.jabsences = jabsences;
        this.jcongé = jcongé;
        this.weekend = weekend;
        this.temps=temps;
    }




}
