package eduardo.enrique.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Actor;
import eduardo.enrique.ui.LoginPage;

public class IngresarCredenciales implements Task {

    private String usuario;
    private String contrasena;

    public IngresarCredenciales(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public static IngresarCredenciales conUsuario(String usuario) {
        return new IngresarCredenciales(usuario, null);
    }

    public IngresarCredenciales yConContrasena(String contrasena) {
        this.contrasena = contrasena;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(usuario).into(LoginPage.USERNAME),
            Enter.theValue(contrasena).into(LoginPage.PASSWORD),
            Click.on(LoginPage.BOTON_LOGIN)
        );
    }
}