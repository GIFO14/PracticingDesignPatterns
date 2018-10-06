package Brands;

import Factory.IBrands;
import CarTypes.Hybrid;

/**
 *
 * @author mblan
 */
public class Lexus implements IBrands {

    @Override
    public void saveBrand() {
        
        String temp = this.getClass().getName();
        Hybrid h = new Hybrid(temp);
        
    }

}
