package com.fictional;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class StepDefinitions {
    private String apiUrl = "https://api.agify.io";
    private RequestSpecification request;
    private Response response;

    @Given("I want to get age predictions based on name from api endpoint")
    public void setEndpoint() {
        RestAssured.baseURI = apiUrl;
        request = given();
    }

    @When("I request prediction for {int}")
    public void request(String name) {

    }

}
