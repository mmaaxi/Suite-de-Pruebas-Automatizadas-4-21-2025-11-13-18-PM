package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_001Page;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page loginPage;

    public tc_001Steps(WebDriver driver) {
        this.driver = driver;
        loginPage = PageFactory.initElements(driver, tc_001Page.class);
    }

    @Given("the user is on the Login Page")
    public void userIsOnLoginPage() {
        driver.get("http://example.com/login");
    }

    @When("the user enters a valid username and password")
    public void enterValidCredentials() {
        loginPage.enterUsername("validUser");
        loginPage.enterPassword("validPassword");
    }

    @When("the user clicks the login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("the user should be redirected to the main page")
    public void verifyRedirectionToMainPage() {
        // Verification logic for redirection can be added here
    }
}