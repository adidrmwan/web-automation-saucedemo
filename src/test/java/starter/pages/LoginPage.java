package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    // =============================== Locator ===============================
    private By usernameField() {
        return By.name("user-name");
    }

    private By passwordField() {
        return By.name("password");
    }

    private By loginBtn() {
        return By.xpath("//input[@id='login-button']");
    }

    private By titleProducts() {
        return By.xpath("//span[text()='Products']");
    }

    private By errorMessage() {
        return By.xpath("//h3[@data-test='error']");
    }


//=============================================== Functional ======================================================
    @Step
    public void onLoginPage() {
        open();
        $(loginBtn()).shouldBeVisible();
    }

    @Step
    public void inputUserName(String username) {
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginBtn()).click();
    }

    @Step
    public void onProductsPage() {
        $(titleProducts()).shouldBeVisible();
    }

    @Step
    public void inputInvalidUsername(String invalidUser) {
        $(usernameField()).type(invalidUser);
    }

    @Step
    public void errorMessageIsDispalyed() {
        $(errorMessage()).shouldBeVisible();
    }
}
