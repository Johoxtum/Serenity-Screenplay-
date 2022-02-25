package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Map;

import static userinterfaces.Registrar.FILE;

@AllArgsConstructor
public class CheckAdjuntar implements Interaction {

    private final Map<String, String> dato;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(FILE),
                Click.on(FILE)
        );

        try {
            setClipboardData("E:\\Inteliij\\CargarArchivoScreenplay\\src\\test\\resources\\Data\\Prueba.txt");
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(2000);

        } catch (AWTException e) {
            e.printStackTrace();
        }

    }
    public static void setClipboardData(String hola) {
        StringSelection stringSelection = new StringSelection(hola);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }
    public static CheckAdjuntar archivo(Map<String, String> dato){
        return Tasks.instrumented(CheckAdjuntar.class,dato);
    }
}
