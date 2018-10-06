
package BaseClass;

/**
 *
 * @author Martí Blanes González
 */

public class Car {
    
    private int wheels;
    private String end, size, type, brand;
    
    public Car(int wheels, String end, String size, String type, String brand){
        
        this.end = end;
        this.size = size;
        this.wheels = wheels;
        this.size = size;
        this.brand = brand;
        
    }

    public int getWheels() {
        return wheels;
    }

    public String getEnd() {
        return end;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }
    
    
    
}
