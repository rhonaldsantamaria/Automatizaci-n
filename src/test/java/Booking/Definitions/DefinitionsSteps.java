package Booking.Definitions;

import org.openqa.selenium.WebDriver;

import Booking.Paginas.AmazonRegistroPagina;
import Booking.Steps.Conexion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DefinitionsSteps {

	private static final String nombres = null;
	private WebDriver driver;
	private Conexion conexion = new Conexion();
	// Hacemos el llamado de paquete y la Clase donde vamos acceder a los metodos
	private AmazonRegistroPagina amazonRegistroPagina = new AmazonRegistroPagina (driver);
	

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}
	// palabras claves
	@When("^haga clic en el boton Crear$")
	//metodo de la interpretacion de java
	public void diligenciarFormulario() {
		//instanciando la clase con el driver del metodo
	this.amazonRegistroPagina = new AmazonRegistroPagina(driver);
	//se hace el llamado al metodo a utilizar
	this.amazonRegistroPagina.RegitroAmazon();		
	}
	
	@Then("^diligenciar campo nombre(.*)$")
	public void diligenciarName() {
		this.amazonRegistroPagina = new AmazonRegistroPagina(driver);
		this.amazonRegistroPagina.diligenciarCampo(nombres);
	}
}