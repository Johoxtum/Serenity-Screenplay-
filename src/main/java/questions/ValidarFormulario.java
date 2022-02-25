package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.Registrar.RES;

public class ValidarFormulario implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(RES).viewedBy(actor).asString();
    }
    public static ValidarFormulario exitoso(){

        return new ValidarFormulario();
    }
}
