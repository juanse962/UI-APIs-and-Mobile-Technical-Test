package co.com.choucair.certification.stepdefinitions;


import co.com.choucair.certification.question.ValidateProduct;
import co.com.choucair.certification.tasks.Home;
import co.com.choucair.certification.tasks.Products;
import io.cucumber.java.Before;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class AddItemStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The user into the app without credentials")
    public void theUserIntoTheAppWithoutCredentials() {
        theActorCalled("Sebastian").attemptsTo(Home.loginWithAccount());
    }

    @When("The user enters the following data in the application")
    public void theUserEntersTheFollowingSataInTheApplication(@Transpose Map<String, String> dataTable) {
        theActorInTheSpotlight().attemptsTo(Products.inForm(dataTable));
    }

    @Then("The user views the product in the shopping cart")
    public void theUserViewsTheProductInTheShoppingCart() {
        theActorInTheSpotlight().should(seeThat(ValidateProduct.isCorrect()));
    }
}