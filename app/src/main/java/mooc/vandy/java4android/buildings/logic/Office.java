package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office 
       extends Building {
    private String mBusinessName;
    private int mParkingSpaces;
    static private int sTotalOffices=0;
    public Office(int l,int w,int lotlength,int lotwidth){

        super(l,w,lotlength,lotwidth);
        ++sTotalOffices;
    }
    public Office(int l,int w,int lotlength,int lotwidth,String bname){

        super(l,w,lotlength,lotwidth);
        mBusinessName=bname;
        ++sTotalOffices;
    }
    public Office(int l,int w,int lotlength,int lotwidth,String bname,int pspaces){

        super(l,w,lotlength,lotwidth);
        mBusinessName=bname;
        mParkingSpaces=pspaces;
        ++sTotalOffices;
    }
    public String getBusinessName(){
        return mBusinessName;
    }
    public int getParkingSpaces(){
        return mParkingSpaces;
    }
    public void setBusinessName(String s){
        mBusinessName=s;
    }
    public void setParkingSpaces(int p){
        mParkingSpaces=p;
    }
    public String toString(){
        String str="Business: unoccupied";
        if(getBusinessName()!="")
            str="Business:"+mBusinessName;
        if(mParkingSpaces>0)
            str+="; has "+mParkingSpaces+" parking spaces; (total offices:"+sTotalOffices+")";
        else
            str+="(total offices:"+sTotalOffices+")";
        return str;

    }
       
    // TODO - Put your code here.
    
}
