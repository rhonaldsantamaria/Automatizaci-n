package Booking.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.beust.jcommander.Strings;

import net.thucydides.core.annotations.Step;

public class AmazonRegistroPagina {

		private WebDriver driver;
		// Este es el elemento que se encuentra en la pagina html
		@FindBy(how = How.ID, using = "createAccountSubmit")
		// Es la variable que se va a utilizar dentro de los metodos correspondientes
		private WebElement btnCrear;
		// texto es constructor
		@FindBy(how = How.XPATH, using ="//input[@name = 'customerName']")
		private WebElement textoNombre;
		public AmazonRegistroPagina(WebDriver driver) {
			// Llamado a Libreria de pageFactoi donde vamos a utilizar la sentencia de localizadores
			PageFactory.initElements(driver, this);
		}
		// el step es para identificar los pasos que va hacer
		@Step
		// este es un metodo que vamos a utilizar en la clase definitionsStep
		public void RegitroAmazon() {
			btnCrear.click();
		}

		@Step
		public void diligenciarCampo(String nombres) {
			textoNombre.sendKeys(nombres);
		}

}
