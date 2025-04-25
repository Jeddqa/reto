package eduardo.enrique.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Text;
import eduardo.enrique.ui.RecruitmentPage;

public class EstadoDelCandidato {

    public static Question<String> es() {
        return actor -> Text.of(RecruitmentPage.ESTADO_HIRED).viewedBy(actor).asString();
    }
}