package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginStep {
    @Steps
    LoginPage loginPage; //kalau Steps ini engga didefine, berarti kita ga bisa pake methodnya login page

    @Given("I click login button on book store")
    public void iClickLoginButtonOnBookStore() {

        loginPage.openUrl();
        loginPage.scrollDown();
    }

    @When("I input invalid userName")
    public void iInputInvalidUsername() {
        loginPage.inputUsername("kodok123");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginPage.inputPassword("Password1_#");
    }
    @And("I input invalid password")
    public void iInputInvalidPassword() {
        loginPage.inputPassword("Password1_");
    }
    @And("I click Login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("I will get error message")
    public void iWillGetErrorMessage() {
        loginPage.errorMessageDisplayed();
    }

    @When("I input valid userName")
    public void iInputValidUserName() {
        loginPage.inputUsername("bayuseptyan");
    }

    @Then("I will see Book Store Button")
    public void iWillSeeBookStoreButton() {
        loginPage.headerDisplayed();
    }
}
