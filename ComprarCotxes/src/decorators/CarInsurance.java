package decorators;

import BaseClass.ICar;

/**
 *
 * @author mblan
 */
public class CarInsurance extends CarTypeDecorator{

    public CarInsurance(ICar decoratedCar){
        
        super(decoratedCar);
                
    }
    
    @Override
    public void lookForCars(int wheels, String end, String size){
        
        this.decoratedCar.lookForCars(wheels, end, size);
        System.out.println("Assegurança contractada amb èxit!");
        
    }
    
}
