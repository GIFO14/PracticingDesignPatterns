package PrincipalClasses;

import Interfaces.IReserva;
import Main.main;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mblan
 */
public class Invoker {

    private List<IReserva> reservaList = new ArrayList<>();

    public void AfegirInstruccio(IReserva reserva) {

        if(reserva != null){
            
            reservaList.add(reserva);
            
        }

    }

    public void execute() {

        try{
            
            getReservaList().forEach(x -> x.execute());
            
        }catch(Exception e){
            
            System.out.println("No es pot fer ja que no existeix cap reserva en aquest moment, torna-ho a intentar.");

            
        }
        
        main.ext();
        
    }
    
    public void Erase(){
        
        getReservaList().clear();
        
    }

    public List<IReserva> getReservaList() {
        
        return reservaList;
    }

}
