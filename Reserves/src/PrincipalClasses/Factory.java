package PrincipalClasses;

import Interfaces.IReserva;
import Main.main;
import java.util.Scanner;

/**
 *
 * @author mblan
 */
public class Factory {
    
    private Singleton singleton = new Singleton();
    
    private VeureReserves vr;
    public Reservar r;
    private IReserva ir;
    private BorrarReserves br;
    public Invoker inv = new Invoker();
    
    private Scanner sc = new Scanner(System.in);
    
    String opcio_temp;
    
    public void Opcions(String opcio_escollida, Reserva reserva) {

        if (opcio_escollida.equalsIgnoreCase("consultar")) {

            vr = singleton.VeureReserves(vr);
            ir = vr;
            
            inv.execute();
            
            
        } else if (opcio_escollida.equalsIgnoreCase("reservar")) {

            System.out.println("Introdueix el dia de reserva: ");
            String date = sc.nextLine();
            
            System.out.println("Introdueix a quin nom es guardarà la reserva: ");
            String name = sc.nextLine();
            
            r = singleton.Reservar(r, reserva, name, date);
            ir = r;
            
            
            
            
        } else if (opcio_escollida.equalsIgnoreCase("borrar")){
            
            System.out.println("Segur que vol esborrar les reserves?");
            String check = sc.nextLine();
            
            switch (check){
                
                case "Si": 
                    br = singleton.BorrarReserves(br);
                    br.EsborrarReserva(inv);
                    break;
                    
                case "No":
                    System.out.println("No s'han suprimit les reserves. Siusplau, introdueixi una opció:");
                    opcio_temp = sc.nextLine();
                    Opcions(opcio_temp, reserva);
                    break;
                    
                default:
                    System.out.println("Instrucció mal introduïda, torna-ho a provar.");
                    Opcions(opcio_escollida, reserva);
                    break;
                
            }
            
        } else {
            
            System.out.println("Instrucció mal introduïda, torna-ho a provar.");
            main.ext();
            
        }
        
        if (ir != null){
            
            inv.AfegirInstruccio(ir);
            inv.execute();
            
        }

    }
    
}
