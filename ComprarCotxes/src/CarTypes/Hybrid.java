package CarTypes;

import BaseClass.Car;
import BaseClass.ICar;

/**
 *
 * @author mblan
 */
public class Hybrid implements ICar {

    public Car c;
    public int cr;

    protected String brand;
    
    public Hybrid(String brand){
    
        this.brand = brand;
    
    }
    
    @Override
    public void lookForCars(int wheels, String end, String size) {

        String type = this.getClass().getName();
        
        c = new Car(wheels, end, size, type, brand);

        cr = 1;
                
    }
    
}
