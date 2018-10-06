package Factory;

import BaseClass.Car;
import CarTypes.Diesel;
import CarTypes.Electric;
import CarTypes.Gasoline;
import CarTypes.Hybrid;

/**
 *
 * @author mblan
 */
public class FactoryGetterCar {
    
    private int reciver;
    
    private Gasoline g = new Gasoline("Huindai");
    private Electric e = new Electric("Tesla");
    private Diesel d = new Diesel("Seat");
    private Hybrid h = new Hybrid("Lexus");
    
    Car cLocal;
    
    public Car GetterCar(){
        
        switch (reciver){
            
            case 1: cLocal = h.c;
                break;
                
            case 2: cLocal = d.c;
                break;
                
            case 3: cLocal = e.c;
                break;
                
            case 4: cLocal = g.c;
                break;
                
            default: System.out.println("Tipus de combustible no específicada. Torna-ho a provar.");
                break;
        }
        
        return cLocal;
        
    }

    public void setReciver(int reciver) {
        this.reciver = reciver;
    }
    
}

