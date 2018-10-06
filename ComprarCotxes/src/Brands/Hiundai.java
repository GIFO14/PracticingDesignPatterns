package Brands;

import Factory.IBrands;
import CarTypes.Gasoline;

/**
 *
 * @author mblan
 */
public class Hiundai implements IBrands {

    @Override
    public void saveBrand() {
        
        String temp = this.getClass().getName();
        Gasoline g = new Gasoline(temp);
        
    }

}
