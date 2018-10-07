package libraries;

/**
 *
 * @author mblan
 */
public class Originator {
    
    public SString text;
    
    public Memedo Guardar(){
        
        return new Memedo(text);
    }
    
    public void Restablir(Memedo m){
        
        text = m.text;
        
    }
    
}
