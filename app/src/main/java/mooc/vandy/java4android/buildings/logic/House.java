package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {
    private String mOwner;
    private boolean mPool;
    public House(int l,int w,int lotlength,int lotwidth){
        super(l,w,lotlength,lotwidth);
    }
    public House(int l,int w,int lotlength,int lotwidth,String Owner){
        super(l,w,lotlength,lotwidth);
        mOwner=Owner;
    }
    public House(int l,int w,int lotlength,int lotwidth,String Owner,boolean pool){
        super(l,w,lotlength,lotwidth);
        mOwner=Owner;
        mPool=pool;
    }
    public String getOwner(){
        return mOwner;
    }
    public boolean hasPool(){
        return mPool;
    }
    public void setOwner(String s){
        mOwner=s;
    }
    public void setPool(boolean p){
        mPool=p;
    }
    public String toString(){
        String str="Owner: "+mOwner;
        if(mPool)
            str+="; has a pool";
        if(calcBuildingArea()<calcLotArea())
            str+="; has big open space\n";
        else
            str+="\n";
        return str;
    }
    public boolean equals(Object obj){
        if(obj instanceof House){
            House h=(House)obj;
            return(this.calcBuildingArea()==h.calcBuildingArea()&&this.mPool==h.mPool);
        }
        return false;
    }
       
    // TODO - Put your code here.
    
}
