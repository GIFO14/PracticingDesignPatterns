package libraries;

import java.util.ArrayList;

/**
 *
 * @author mblan
 */
public class CareTaker {
    
    private ArrayList<Memedo> mementoList = new ArrayList<>();
    Memedo m;
    
    public void addMemento(Memedo m){
        
        mementoList.add(m);
        
    }
    
    public Memedo getMemento(int index){

        return mementoList.get(index);
    }
    
    public int getArrayListPosition(){
        
        int lastPosition = mementoList.lastIndexOf(m);
        
        return lastPosition;
    }
    
}
