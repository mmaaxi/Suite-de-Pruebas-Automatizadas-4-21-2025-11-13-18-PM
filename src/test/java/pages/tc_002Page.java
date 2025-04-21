package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By submitButton = By.id("login");
    By usernameError = By.id("username-error");
    By passwordError = By.id("password-error");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage() {
        driver.get("https://example.com/login");
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void submit() {
        driver.findElement(submitButton).click();
    }

    public void verifyUsernameErrorMessage() {
        if (!driver.findElement(usernameError).isDisplayed()) {
            throw new AssertionError("El mensaje de error de usuario no se muestra.");
        }
    }

    public void verifyPasswordErrorMessage() {
        if (!driver.findElement(passwordError).isDisplayed()) {
            throw new AssertionError("El mensaje de error de contraseña no se muestra.");
        }
    }
}