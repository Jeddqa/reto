package eduardo.enrique.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USERNAME = Target.the("username field")
        .located(By.name("username"));

    public static final Target PASSWORD = Target.the("password field")
        .located(By.name("password"));

    public static final Target LOGIN_BUTTON = Target.the("login button")
        .located(By.xpath("//button[@type='submit']"));

    public static final Target DASHBOARD = Target.the("dashboard panel")
        .located(By.xpath("//h6[text()='Dashboard']"));
}