package com.example.steps;

import com.example.app.pages.MyTaskPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddStepDefinitions {
    MyTaskPage myTaskPage = new MyTaskPage();
    @Given("i on calculator page")
    public void iOnCalculatorPage() {
        myTaskPage.calculatorHeaderDisplayed();
    }
    @When("i click 1")
    public void iClick1() {
        myTaskPage.clickNumber1();
    }

    @And("i click +")
    public void iClickplus() {
        myTaskPage.clickAddButton();
    }
    @And("i click 2")
    public void iClick2() {
        myTaskPage.clickNumber2();
    }
    @And("I click equal")
    public void iClickequal() {
        myTaskPage.clickEqualButton();
    }

    @Then("total is 3")
    public void totalIs3() {
        myTaskPage.theResultAdd();
    }

    @And("i click -")
    public void iClickMin() {
        myTaskPage.clickMinButton();
    }

    @Then("total is -1")
    public void totalIsmin1() {
        myTaskPage.theResultMin();
    }

    @And("i click :")
    public void iClick() {
        myTaskPage.clickDivButton();
    }

    @Then("total is 0.5")
    public void totalIsNolComaLima() {
        myTaskPage.theResultDiv();
    }

    @And("i click x")
    public void iClickX() {
        myTaskPage.clickTimeButton();
    }

    @Then("total is 2")
    public void totalIs() {
        myTaskPage.theResultTime();
    }
}
