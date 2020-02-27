package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    public Building(int l,int w,int lotlength,int lotwidth){
        mLength=l;
        mWidth=w;
        mLotLength=lotlength;
        mLotWidth=lotwidth;
    }
    public int getLength(){
        return mLength;
    }
    public int getWidth(){
        return mWidth;
    }
    public int getLotLength(){
        return mLotLength;
    }
    public int getLotWidth(){
        return mLotWidth;
    }
    public void setLength(int l){
        mLength=l;
    }
    public void setWidth(int w){
        mWidth=w;
    }
    public void setLotLength(int lotlength){
        mLotLength=lotlength;
    }
    public void setLotWidth(int lotwidth){
        mLotWidth=lotwidth;
    }
    public int calcBuildingArea(){
        return mLength*mWidth;
    }
    public int calcLotArea(){
        return mLotWidth*mLotLength;
    }
    public String toString(){
        return("Building Length:"+mLength+" Building Width:"+mWidth+" Lot Length:"+mLotLength+" Lot Width:"+mLotWidth);
    }
    
    // TODO - Put your code here.
    
}
