public class salaire extends employe{
    protected static int sup=0;
    protected static int inf=0;
    public salaire(String post,int experience,int heuressup,int jabsences,int jconge,int weekend) {
        super(post,experience,heuressup,jabsences,jconge, weekend);
    }

    public void augmentations(){
        int mony=200*heuressup;
        sup=sup+mony;
        mony=experience*100;
        sup=sup+mony;
        mony=weekend*50;
    }
    public void sanctions(){
        int mony=1000*jabsences;
        inf=inf+mony;
    }

}
