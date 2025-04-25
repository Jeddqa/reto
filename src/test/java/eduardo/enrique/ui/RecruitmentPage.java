package eduardo.enrique.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecruitmentPage {

    public static final Target INPUT_RESUME = Target.the("campo para adjuntar CV").located(By.xpath("//input[@type='file']"));

    public static final Target MENU_RECRUITMENT = Target.the("Menú Recruitment")
        .located(By.xpath("//span[text()='Recruitment']/parent::a"));

    public static final Target BOTON_ADD = Target.the("Botón Add")
        .located(By.xpath("//button[normalize-space()='+ Add']"));

    public static final Target FIRST_NAME = Target.the("Nombre")
        .located(By.name("firstName"));

    public static final Target LAST_NAME = Target.the("Apellido")
        .located(By.name("lastName"));

    public static final Target EMAIL = Target.the("Correo")
        .located(By.xpath("//input[@type='email']"));

    public static final Target BOTON_SAVE = Target.the("Botón Save")
        .located(By.xpath("//button[normalize-space()='Save']"));

    public static final Target ESTADO_HIRED = Target.the("Estado del candidato")
        .located(By.xpath("//div[contains(text(),'Hired')]"));
}