public class empolyetp extends employe{
    protected int nbrheures;
    protected int salaire=1;
    public empolyetp(String nom,String post, int salaire, int experience, int heuressup, int jabsences, int jcongé, int weekend) {
        super( nom,post, salaire, experience, heuressup, jabsences, jcongé, weekend);
        this.nbrheures=nbrheures;

    }
    public int calcsalire(){
        salaire=salaire*nbrheures;
        return salaire;
    }
}
