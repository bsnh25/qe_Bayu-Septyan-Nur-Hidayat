package starter.stepdefinitions.Users;

import io.cucumber.java.en.When;
import starter.Users.GetAccount;

public class GetAccountStep {

@When("^I request get account$")
public void iRequestGetAccount() {
    GetAccount.requestGetAccount();
}

}
