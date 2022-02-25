package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Map;

import static userinterfaces.Registrar.*;


@AllArgsConstructor
public class CheckHobbies implements Interaction {

    private final Map<String, String> dato;

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (dato.get("Hobbies").contains("Sports")){
            actor.attemptsTo(Scroll.to(HOBBIES),
                    Click.on(HOBBIES)

            );
        }
        else if (dato.get("Hobbies").contains("Reading")){
            actor.attemptsTo(
                    Scroll.to(HOBBIES),
                    Click.on(HOBBIES2)
            );
        }
        else if (dato.get("Hobbies").contains("Music")){
            actor.attemptsTo(
                    Scroll.to(HOBBIES),
                    Click.on(HOBBIES3)
            );
        }

    }
    public static CheckHobbies hobbies(Map<String, String> dato){
        return Tasks.instrumented(CheckHobbies.class,dato);
    }
}
