package libraries;

import java.util.concurrent.TimeUnit;
import main.main;

/**
 *
 * @author mblan
 */
public class Control {

    main m = new main();
    Originator originator = new Originator();
    CareTaker caretaker = new CareTaker();

    private SString text;

    public void Saver() {

        while (0 == 0) {

            text = new SString();
            text.textTemp = m.jta.getText();
            
            if (originator.text == null || !originator.text.equals(text)) {

                originator.text = text;

                caretaker.addMemento(originator.Guardar());

                try {

                    TimeUnit.MILLISECONDS.sleep(500);

                } catch (InterruptedException e) {

                    System.out.println("Ha ocorregut el següent error: " + e);

                }
                
            }

        }

    }

    public SString ControlZ() {

        originator.Restablir(caretaker.getMemento(caretaker.getArrayListPosition() - 1));
        text = originator.text;

        return text;
    }
    
    public SString ControlY() {

        originator.Restablir(caretaker.getMemento(caretaker.getArrayListPosition()));
        text = originator.text;

        return text;
    }

}
