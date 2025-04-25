package eduardo.enrique.questions;

import eduardo.enrique.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ElDashboard {

    public static Question<Boolean> esVisible() {
        return new Question<>() {
            @Override
            public Boolean answeredBy(Actor actor) {
                return Visibility.of(LoginPage.DASHBOARD).answeredBy(actor);
            }
        };
    }
}