
package PrincipalClasses;

import Interfaces.IReserva;

/**
 *
 * @author mblan
 */
public class VeureReserves implements IReserva{
    
    private Consultar consultadora;
   
    @Override
    public void execute(){
        
        consultadora.ConsultarReserves();
        
    }
    
}
