package PrincipalClasses;

import Interfaces.IReserva;

/**
 *
 * @author mblan
 */
public class Consultar {
    
    IReserva res = null;
    Factory f = new Factory();
    
    public void ConsultarReserves(){

        f.inv = new Invoker();
        f.inv.AfegirInstruccio(res);
        f.inv.execute();
        
    }
    
}
