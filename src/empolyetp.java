public class empolyetp extends employe{
    protected int nbrheures;
    public empolyetp(String nom,String post, int salaire, int experience, int heuressup,int nbrheures, int jabsences, int jcongé, int weekend,boolean employefort) {
        super( nom,post, salaire, experience, heuressup, jabsences, jcongé, weekend,employefort);
        this.nbrheures=nbrheures;

    }
    public int calcsalire(){
        int prod=1;
        prod=salaire*nbrheures;
        return prod;
    }
}
