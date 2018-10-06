package Brands;

import Factory.IBrands;
import CarTypes.Electric;

/**
 *
 * @author mblan
 */
public class Tesla implements IBrands {

    @Override
    public void saveBrand() {
        
        String temp = this.getClass().getName();
        Electric e = new Electric(temp);
        
    }

}
