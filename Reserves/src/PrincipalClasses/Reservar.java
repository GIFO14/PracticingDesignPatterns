package PrincipalClasses;

import Interfaces.IReserva;

/**
 *
 * @author mblan
 */
public class Reservar implements IReserva{

    private Reserva reserva;
    private String name, date;
    
    public Reservar(Reserva reserva, String nom_i_cogoms, String data_de_la_reserva){
        
        this.reserva = reserva;
        name = nom_i_cogoms;
        date = data_de_la_reserva;
        
    }
    
    @Override
    public void execute(){
        
        reserva.CrearReserva(name, date);
        
    }
    
    
    
}
