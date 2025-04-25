package eduardo.enrique.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import eduardo.enrique.ui.DashboardPage;

public class ElDashboard {
    public static Question<Boolean> esVisible() {
        return actor -> Visibility.of(DashboardPage.MENU).viewedBy(actor).asBoolean();
    }
}