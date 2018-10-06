package CarTypes;

import BaseClass.Car;
import BaseClass.ICar;

/**
 *
 * @author mblan
 */
public class Electric implements ICar {

    public Car c;

    protected String brand;
    
    public Electric(String brand){
    
        this.brand = brand;
    
    }
    
    @Override
    public void lookForCars(int wheels, String end, String size) {

        String type = this.getClass().getName();
        
        c = new Car(wheels, end, size, type, brand);

        cr = 3;

    }

}
