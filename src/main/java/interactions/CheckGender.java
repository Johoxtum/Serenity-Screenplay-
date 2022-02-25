package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Map;

import static userinterfaces.Registrar.*;

@AllArgsConstructor
public class CheckGender implements Interaction {

    private final Map<String, String> dato;

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (dato.get("Gender").contains("Male")){
           actor.attemptsTo(Click.on(MALE));
        }
        else if (dato.get("Gender").contains("Female")){
            actor.attemptsTo(Click.on(FEMALE));
        }
        else if (dato.get("Gender").contains("Other")){

            actor.attemptsTo(Click.on(OTHER));
        }


    }

    public static CheckGender informacion(Map<String, String> dato){

        return Tasks.instrumented(CheckGender.class,dato);
    }
}
