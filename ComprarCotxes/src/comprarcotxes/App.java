
package comprarcotxes;

import BaseClass.Car;
import Factory.FactoryBrand;
import Factory.FactoryGetterCar;
import Factory.IBrands;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        System.out.print("Escrigui les característiques del cotxe. \n- Quantitat de rodes: ");
        int wheels = sc.nextInt();
        
        System.out.print("\n- Gama: ");
        String end = sc2.nextLine();
        
        System.out.print("\n- Mida: ");
        String size = sc2.nextLine();
        
        System.out.print("\n- Marca (Lexus, Hiundai, Seat, Tesla): ");
        String brand = sc2.nextLine();
        FactoryBrand fb = new  FactoryBrand();
        fb.BrandsChooser(brand);
        
        System.out.println("\nCreant el cotxe. Suisplau, esperi.");
        
        FactoryGetterCar fgc = new FactoryGetterCar();
        Car car = fgc.GetterCar();
        
        try {
                
                TimeUnit.SECONDS.sleep(5);
                
        } catch (InterruptedException e) {
                
                System.out.println("Error");
        
        }
         
        System.out.println("Aquí té, el seu cotxe personalitzat de la marca " + car.getBrand() + ". Amb les següents característíques: "
                + "\nRodes: " + car.getWheels()
                + "\nDe gama: " + car.getEnd()
                + "\nDe mida: " + car.getSize()
                + "\nI funciona amb: " + car.getType() 
                + "\n\nGràcies per la compra. Esperem que disfruti del seu nou vehicle!");
    
    }
    
    
    
}
