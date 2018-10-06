package Brands;

import Factory.IBrands;

/**
 *
 * @author mblan
 */
public class NonSpicifiedBrand implements IBrands {

    @Override
    public void saveBrand(){
        
        System.out.println("Marca no específicada. Torna-ho a provar.");
        
    }
    
}
