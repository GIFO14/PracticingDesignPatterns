
package PrincipalClasses;

/**
 *
 * @author mblan
 */
public class Reserva {
    
    private String name, date;        
    
    public void CrearReserva(String nom_i_cogoms, String data_de_la_reserva){
        
        try{
            
            name = nom_i_cogoms;
            date = data_de_la_reserva;
            System.out.println("S'ha creat la reserva correctament: \nA nom de: " + name + "\nPer el dia: " + date);
            
        }catch(Exception e){
            
            System.out.println("Ha ocorregut el següent error: " + e);
            
        }
        
    }
    
}
