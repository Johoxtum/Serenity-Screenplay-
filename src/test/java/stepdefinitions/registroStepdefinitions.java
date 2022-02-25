package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.ValidarFormulario;
import tasks.Diligenciar;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class registroStepdefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Juan");
    }



    @Given("^El usuario ingresa a la plataforma para registrarse$")
    public void juanIngresaALaPlataformaParaRegistrarse() {

        theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/"));


    }

    @When("^ingresa los siguientes datos$")
    public void ingresaLosSiguientesDatos(Map<String, String> dato) {

        theActorInTheSpotlight().attemptsTo(Diligenciar.informacion(dato));

    }

    @Then("^Se valida el mensaje de registro exitoso (.*)$")
    public void seValidaElMensajeDeRegistroExitosoThanksForSubmittingTheForm(String Palabra) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarFormulario.exitoso(), Matchers.is(Matchers.equalTo(Palabra))));

    }

}

