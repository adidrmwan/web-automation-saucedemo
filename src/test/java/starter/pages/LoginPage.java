package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By usernameField() {
        return By.id("user-name");
    }

    private By passwordField() {
        return By.id("password");
    }

    private By loginBtn() {
        return By.id("login-button");
    }

    @Step
    public void onLoginPage() {
        open();
        $(loginBtn()).shouldBeVisible();
    }

    @Step
    public void inputUserName(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginBtn()).click();
    }
}
