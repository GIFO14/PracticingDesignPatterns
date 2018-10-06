package Main;

import PrincipalClasses.Factory;
import PrincipalClasses.Reserva;
import java.util.Scanner;

/**
 *
 * @author mblan
 */
public class main {

    public static void main(String[] args) {

        ext();

    }
    
    public static void ext(){
        
        Scanner sc = new Scanner (System.in);
        Factory f = new Factory();
        Reserva reserva = new Reserva();
        
        System.out.println("Escrigui 'Reservar' per a reservar una taula."
            + "\nEscrigui 'Consultar' per a veure totes les reserves."
            + "\nEscrigui 'Borrar' per a borrar totes les reserves.");
        String opcio = sc.nextLine();
        
        /*if (opcio.equalsIgnoreCase("consultar") || opcio.equalsIgnoreCase("borrar") && f.inv.getReservaList() == null) {
            
            System.out.println("No es pot fer ja que no existeix cap reserva en aquest moment, torna-ho a intentar.");
            ext();
            
        }*/
        
        f.Opcions(opcio, reserva);
        
    }

}
