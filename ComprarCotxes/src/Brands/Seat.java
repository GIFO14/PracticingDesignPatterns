package Brands;

import Factory.IBrands;
import CarTypes.Diesel;

/**
 *
 * @author mblan
 */
public class Seat implements IBrands {

    @Override
    public void saveBrand() {
        
        String temp = this.getClass().getName();
        Diesel d = new Diesel(temp);
        
    }

}
