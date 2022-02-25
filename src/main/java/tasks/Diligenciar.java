package tasks;

import interactions.CheckAdjuntar;
import interactions.CheckGender;
import interactions.CheckHobbies;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.Registrar.*;

@AllArgsConstructor // me permite inicializar los constructures
public class Diligenciar implements Task {

    private final Map<String, String> dato; // me permite una relacion de elemento 1 a 1


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BUTTON_FORM),
                Click.on(BUTTON_FORMS),
                Enter.keyValues(dato.get("FirstName")).into(FIRSTNAME),
                Enter.keyValues(dato.get("LastName")).into(LASTNAME),
                Enter.keyValues(dato.get("Email")).into(EMAIL),
                CheckGender.informacion(dato),
                Enter.keyValues(dato.get("Mobile")).into(NUMBER),
                Click.on(DATE),
                Enter.keyValues(dato.get("Month")).into(DATE1),
                Enter.keyValues(dato.get("Year")).into(YEAR),
                Enter.keyValues(dato.get("Day")).into(DAY),
                Click.on(SUBJECTS),
                Enter.keyValues(dato.get("Subjects")).into(SUBJECTS1),
                Hit.the(Keys.ENTER).into(SUBJECTS1),
                CheckHobbies.hobbies(dato),
                CheckAdjuntar.archivo(dato),
                Enter.keyValues(dato.get("Current")).into(ADDRESS),
                Click.on(STATE),
                Enter.keyValues(dato.get("State")).into(STATE1).thenHit(Keys.ENTER),
                Click.on(CITY),
                Enter.keyValues(dato.get("City")).into(CITY2).thenHit(Keys.ENTER),
                Click.on(SUBMIT)
        );


    }
    public static Diligenciar informacion(Map<String, String> dato) {
        return instrumented(Diligenciar.class, dato);
    }


}
