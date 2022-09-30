package starter.stepdefinitions.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import starter.Users.PostToken;

public class PostTokenStep {
    @Given("^I set url$")
    public void setUrl(){
        PostToken.setUrl();
    }

    @And("^valid username and password$")
    public void validUsernameAndPassword(){
        PostToken.validUserNameAndPassword();
    }
    @When("^I request post$")
    public void requestPost(){
PostToken.requestPost();
    }

    @And("^get information of the token$")
    public void getInformationOfTheToken(){
PostToken.validationOfToken();
    }

    @Given("valid username and invalid password")
    public void validUsernameAndInvalidPassword() {
        PostToken.validUserNameAndInvalidPassword();
    }

    @And("get status failed")
    public void getStatusFailed() {
        PostToken.validationOfFailed();
    }

    @When("I request post token")
    public void iRequestPostToken() {
        PostToken.requestPostToken();
    }

    @Given("invalid username and password")
    public void invalidUsernameAndPassword() {
        PostToken.invalidUserNameAndPassword();
    }

    @When("I request post that")
    public void iRequestPostThat() {
        PostToken.requestPostThat();
    }

    @And("get message falied")
    public void getMessageFalied() {
        PostToken.validationOfAllFailed();
    }
}
