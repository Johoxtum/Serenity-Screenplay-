package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Registrar {

    public static final Target BUTTON_FORM = Target.the("Boton para ingresar a practica").located(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5"));
    public static final Target BUTTON_FORMS = Target.the("Boton formulario").located(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div/ul"));
    public static final Target FIRSTNAME = Target.the("Primer nombre").located(By.id("firstName"));
    public static final Target  LASTNAME = Target.the("Apellidos").located(By.id("lastName"));
    public static final Target  EMAIL = Target.the("Correo electronico").located(By.id("userEmail"));
    public static final Target  MALE = Target.the("Genero").located(By.xpath("//label[@class='custom-control-label' and @for='gender-radio-1']"));
    public static final Target  FEMALE = Target.the("Genero").located(By.xpath("//label[@class='custom-control-label' and @for='gender-radio-2']"));
    public static final Target  OTHER = Target.the("Genero").located(By.xpath("//label[@class='custom-control-label' and @for='gender-radio-3']"));
    public static final Target  NUMBER = Target.the("Numero").located(By.id("userNumber"));
    public static final Target  DATE = Target.the("Fecha de nacimiento").located(By.id("dateOfBirthInput"));
    public static final Target  DATE1 = Target.the("Mes").located(By.xpath("//select[@class='react-datepicker__month-select']"));
    public static final Target  YEAR = Target.the("AÑO").located(By.xpath("//select[@class='react-datepicker__year-select']"));
    public static final Target  DAY = Target.the("Dia").located(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]"));
    public static final Target  SUBJECTS = Target.the("Materias").located(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--002']"));
    public static final Target  SUBJECTS1 = Target.the("Materias").located(By.id("subjectsInput"));
    public static final Target  HOBBIES = Target.the("Hobbies").located(By.xpath("//label[@class='custom-control-label' and @for='hobbies-checkbox-1' ]"));
    public static final Target  HOBBIES2 = Target.the("Hobbies").located(By.xpath("//label[@class='custom-control-label' and @for='hobbies-checkbox-2' ]"));
    public static final Target  HOBBIES3 = Target.the("Hobbies2").located(By.xpath("//label[@class='custom-control-label' and @for='hobbies-checkbox-3']"));
    public static final Target  ADDRESS = Target.the("Direccion").located(By.id("currentAddress"));
    public static final Target  STATE = Target.the("Estado").located(By.id("state"));
    public static final Target  STATE1 = Target.the("Estado2").located(By.xpath("//input[@id='react-select-3-input']"));
    public static final Target  CITY = Target.the("Ciudad").located(By.id("city"));
    public static final Target  CITY2 = Target.the("Ciudad2").located(By.xpath("//input[@id='react-select-4-input']"));
    public static final Target  SUBMIT = Target.the("Enviar").located(By.id("submit"));
    public static final Target RES = Target.the("Resultado").located(By.id("example-modal-sizes-title-lg"));
    public static final Target  FILE = Target.the("Archivo").located(By.xpath("//label[@for='uploadPicture']"));
}
