package CarTypes;

import BaseClass.Car;
import BaseClass.ICar;
import Factory.FactoryGetterCar;

/**
 *
 * @author mblan
 */
public class Gasoline implements ICar {

    public Car c;
    private Hybrid h = new Hybrid(brand);

    protected String brand;
    
    public Gasoline(String brand){
    
        this.brand = brand;
    
    }

    @Override
    public void lookForCars(int wheels, String end, String size) {

        String type = this.getClass().getName();
        
        c = new Car(wheels, end, size, type, brand);

        h.cr = 4;

    }

}
