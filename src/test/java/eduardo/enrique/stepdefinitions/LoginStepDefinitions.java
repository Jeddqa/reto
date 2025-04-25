package eduardo.enrique.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import eduardo.enrique.tasks.IngresarCredenciales;
import eduardo.enrique.tasks.AgregarCandidato;
import eduardo.enrique.questions.ElDashboard;
import eduardo.enrique.questions.EstadoDelCandidato;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.with;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import net.serenitybdd.screenplay.actions.Open;

public class LoginStepDefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(new Cast());
    }

    @Dado("que Juan abre la aplicación OrangeHRM")
    public void queJuanAbreLaAplicacion() {
        theActorCalled("Juan").can(with(driver));
        theActorInTheSpotlight().attemptsTo(Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
    }

    @Cuando("ingresa sus credenciales válidas")
    public void ingresaSusCredenciales() {
        theActorInTheSpotlight().attemptsTo(
            IngresarCredenciales.conUsuario("Admin").yConContrasena("admin123")
        );
    }

    @Cuando("registra a Eduardo Enrique como nuevo candidato")
    public void registrarCandidato() {
        theActorInTheSpotlight().attemptsTo(
            AgregarCandidato.conDatos("Eduardo", "Enrique", "eduardo.enrique@example.com")
        );
    }

    @Entonces("debería ver el panel principal")
    public void deberiaVerElDashboard() {
        theActorInTheSpotlight().should(seeThat(ElDashboard.esVisible()));
    }

    @Entonces("el estado del candidato debe ser contratado")
    public void validarEstadoCandidato() {
        theActorInTheSpotlight().should(
            seeThat("El estado del candidato", EstadoDelCandidato.es(), equalTo("Hired"))
        );
    }
}