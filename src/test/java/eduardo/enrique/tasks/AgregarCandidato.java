package eduardo.enrique.tasks;

import eduardo.enrique.ui.RecruitmentPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.Actor;

import java.nio.file.Paths;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarCandidato implements Task {

    private final String nombre;
    private final String apellido;
    private final String correo;

    public AgregarCandidato(String nombre, String apellido, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public static AgregarCandidato conDatos(String nombre, String apellido, String correo) {
        return instrumented(AgregarCandidato.class, nombre, apellido, correo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(RecruitmentPage.MENU_RECRUITMENT),
            Click.on(RecruitmentPage.BOTON_ADD),
            Enter.theValue(nombre).into(RecruitmentPage.FIRST_NAME),
            Enter.theValue(apellido).into(RecruitmentPage.LAST_NAME),
            Enter.theValue(correo).into(RecruitmentPage.EMAIL),
            Upload.theFile(Paths.get("src/test/resources/Eduardo_Juarez_CV.pdf")).to(RecruitmentPage.INPUT_RESUME),
            Click.on(RecruitmentPage.BOTON_SAVE)
        );
    }
}