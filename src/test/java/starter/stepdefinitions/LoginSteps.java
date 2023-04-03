package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage login;

    @Given("user on login page")
    public void userOnLoginPage() {
        login.onLoginPage();
    }

    @When("user input valid username")
    public void userInputValidUsername(){
        login.inputUserName("standard_user");
    }

    @And("user input valid password")
    public void userInputValidPassword() {
        login.inputPassword("secret_sauce");
    }

    @And("user click login button")
    public void userClickLoginButton()  {
        login.clickLoginButton();
    }

    @Then("user on products page")
    public void userOnProductsPage() {
        login.onProductsPage();
    }

    @When("user input invalid username")
    public void userInputInvalidUsername() {
        login.inputInvalidUsername("awan");
    }

    @Then("user see error message")
    public void userSeeErrorMessage() {
        login.errorMessageIsDispalyed();
    }
}
