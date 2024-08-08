package io.cucumber.skeleton;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class ConduitSteps {

    @Before("@login")
    public void before_login_configuration(Scenario scenario){
        System.out.println("before scenario:"+scenario.getName());
    }

    @Given("open the home page")
    public void open_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        return;
    }
    @When("click Sign in")
    public void click_sign_in() {
        // Write code here that turns the phrase above into concrete actions
        return;
    }
    @Then("open the login page successful")
    public void open_the_login_page_successful() {
        // Write code here that turns the phrase above into concrete actions
        return;
    }

    @Given("open the login page")
    public void open_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        return;
    }
    @When("login with username {string} and password {string}")
    public void login_with_username_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        return;
    }

    @When("login with users {string} and {string}")
    public void login_with_users_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        return;
    }


    @Then("login failed")
    public void login_failed() {
        // Write code here that turns the phrase above into concrete actions
        return;
    }

    @Then("login successful")
    public void login_successful() {
        // Write code here that turns the phrase above into concrete actions
        return;
    }

    @When("login with users:")
    public void login_with_users(Map<String, String> users) {
        // Write code here that turns the phrase above into concrete actions
        return;
    }

}
