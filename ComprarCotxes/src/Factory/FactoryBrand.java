package Factory;

import Brands.Hiundai;
import Brands.Lexus;
import Brands.NonSpicifiedBrand;
import Brands.Seat;
import Brands.Tesla;

/**
 *
 * @author mblan
 */
public class FactoryBrand{
    
    private Lexus l = new Lexus();
    private Hiundai h = new Hiundai();
    private Seat s = new Seat();
    private Tesla t = new Tesla();
    
    public void BrandsChooser(String chooseBrand){
        
        if(chooseBrand.equalsIgnoreCase("")){
            
            System.out.println("Marca no específicada. Torna-ho a provar.");
            
        } else if (chooseBrand.equalsIgnoreCase("lexus")){
        
            l.saveBrand();
        
        }else if (chooseBrand.equalsIgnoreCase("tesla")){
            
            t.saveBrand();
            
        }else if (chooseBrand.equalsIgnoreCase("seat")){
            
            s.saveBrand();
            
        }else if (chooseBrand.equalsIgnoreCase("hiundai")){
            
            h.saveBrand();
            
        }else {
            
            System.out.println("Marca no específicada. Torna-ho a provar.");
            
        }
        
    }
    
}
