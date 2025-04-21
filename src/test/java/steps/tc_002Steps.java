package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page loginPage = PageFactory.initElements(driver, tc_002Page.class);

    @Given("el usuario está en la página de login")
    public void el_usuario_está_en_la_página_de_login() {
        loginPage.openLoginPage();
    }

    @When("ingresa un usuario incorrecto")
    public void ingresa_un_usuario_incorrecto() {
        loginPage.enterUsername("usuario_incorrecto");
    }

    @When("ingresa una contraseña correcta")
    public void ingresa_una_contraseña_correcta() {
        loginPage.enterPassword("contraseña_correcta");
        loginPage.submit();
    }

    @Then("se muestra un mensaje de error de usuario")
    public void se_muestra_un_mensaje_de_error_de_usuario() {
        loginPage.verifyUsernameErrorMessage();
    }

    @When("ingresa un usuario correcto")
    public void ingresa_un_usuario_correcto() {
        loginPage.enterUsername("usuario_correcto");
    }

    @When("ingresa una contraseña incorrecta")
    public void ingresa_una_contraseña_incorrecta() {
        loginPage.enterPassword("contraseña_incorrecta");
        loginPage.submit();
    }

    @Then("se muestra un mensaje de error de contraseña")
    public void se_muestra_un_mensaje_de_error_de_contraseña() {
        loginPage.verifyPasswordErrorMessage();
    }
}