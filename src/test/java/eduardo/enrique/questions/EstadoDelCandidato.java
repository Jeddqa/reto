package eduardo.enrique.questions;

import eduardo.enrique.ui.RecruitmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class EstadoDelCandidato {

    public static Question<String> es() {
        return new Question<>() {
            @Override
            public String answeredBy(Actor actor) {
                return Text.of(RecruitmentPage.ESTADO_HIRED).answeredBy(actor);
            }
        };
    }
}