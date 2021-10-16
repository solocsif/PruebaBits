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

	@Then("^hacer scroll hasta el formulario de contacto$")
	public void ingresar_producto() throws Throwable {
		login.ingresarproductoabuscar();
	}

	@Then("^rellenar los datos obligatorios$")
	public void seleccionar_producto() throws Throwable {
		login.seleccionarmenorprecio();
	}
	@Then("^dar click en validar el capcha$")
	public void agregar_producto() throws Throwable {
		login.agregaralcarrito();
	}
	@Then("^dar click en el boton enviar")
	public void finalizar_compra() throws Throwable {
		login.finalizarcompra();
	}
}
