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
    public void userOnLoginPage() throws InterruptedException {
        login.onLoginPage();
    }

    @When("user input valid username")
    public void userInputValidUsername() throws InterruptedException {
        login.inputUserName("standard_user");
    }

    @And("user input valid password")
    public void userInputValidPassword() throws InterruptedException {
        login.inputPassword("secret_sauce");
    }

    @And("user click login button")
    public void userClickLoginButton() throws InterruptedException {
        login.clickLoginButton();
    }

    @Then("user on products page")
    public void userOnProductsPage() throws InterruptedException {
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
