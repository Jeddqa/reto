package eduardo.enrique.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardPage {
    public static final Target MENU = Target.the("menú principal").located(By.cssSelector(".oxd-topbar-header-title"));
}