package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.navigation.NavigateTo;
import starter.pages.loginPageActions;


public class OrangeHRMLogin {

    @Steps
    NavigateTo navigateTo;

    @Steps
    loginPageActions login;


    @Given("User is on login page")
    public void user_is_on_login_page() {
        navigateTo.theHomePage();
    }
    @When("the user enters valid username and password credentials")
    public void the_user_enters_valid_username_and_password_credentials() {
        login.enterUsernameAndPassword("Admin", "admin");
    }
    @When("clicks the login button")
    public void clicks_the_login_button() {
        login.clickLoginButton();

    }
    @Then("user should be redirected to the dashboard")
    public void user_should_be_redirected_to_the_dashboard() {

        Assert.assertTrue(login.isErrorShown());

    }

}
