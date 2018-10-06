package decorators;

import BaseClass.ICar;

/**
 *
 * @author mblan
 */
public class CarTypeDecorator implements ICar{

    protected ICar decoratedCar;
    
    public CarTypeDecorator(ICar decoratedCar){
        
        this.decoratedCar = decoratedCar;
        
    }
    
    @Override
    public void lookForCars(int wheels, String end, String size){
        
        this.decoratedCar.lookForCars(wheels, end, size);
        
    }
    
}
