package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage 
       extends House {
    private boolean mSecondFloor;
    public Cottage(int dimension,int lotlength,int lotwidth){
        super(dimension,dimension,lotlength,lotwidth);
    }
    public Cottage(int dimension,int lotlength,int lotwidth,String Owner,boolean secondfloor){
        super(dimension,dimension,lotlength,lotwidth,Owner);
        mSecondFloor=secondfloor;
    }
    public boolean hasSecondFloor(){
        return mSecondFloor;
    }
    public String toString(){
        if(mSecondFloor){
            return(super.toString()+"; has second floor\n");
        }
        return "";
    }

       
    // TODO - Put your code here.
    
}

