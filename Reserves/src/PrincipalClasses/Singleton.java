package PrincipalClasses;

/**
 *
 * @author mblan
 */
public class Singleton {
    
    public VeureReserves VeureReserves(VeureReserves vr){
        
        if (vr == null) {
            
            vr = new VeureReserves();
            
        }
        
        return vr;
    }
    
    public Reservar Reservar(Reservar r, Reserva reserva, String nom_i_cogoms, String data_de_la_reserva){
        
        if (r == null) {
            
            r = new Reservar(reserva, nom_i_cogoms, data_de_la_reserva);
            
        }
        
        return r;
    }
    
    public BorrarReserves BorrarReserves(BorrarReserves br){
        
        if (br == null) {
            
            br = new BorrarReserves();
            
        }
        
        return br;
    }
    
}
