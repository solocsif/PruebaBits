package pasos_prueba;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import selenium.selenium;
public class pasos_prueba {
	selenium login= new selenium();
	@Given("^abrir el navegador$")
	public void abrir_el_navegador() throws Throwable {
		login.abrir();
	}

	@When("^ingresar a la url$")
	public void ingresar_a_la_url() throws Throwable {
		login.abrirpagina();
	}

	@Then("^ingresar usuario y contrasena$")
	public void ingresar_usuario_y_contrasena() throws Throwable {
		login.ingresarusuarioycontrasena();
	}

	@Then("^pulsar boton save$")
	public void pulsar_boton_save() throws Throwable {
		login.pulsarbotonsave();
	}
}
