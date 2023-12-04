package starter.pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class loginPageActions extends UIInteractionSteps {

    @Step("Search for term {0}")
    public void enterUsernameAndPassword(String username , String password) {
        $(loginPageElements.USERNAME_TXT).type(username);
        $(loginPageElements.PASSWORD_TEXT).type(password);

    }

    @Step("Search for term {0}")
    public void clickLoginButton() {
        $(loginPageElements.LOGIN_BTN).click();
    }

    @Step("Search for term {0}")
    public boolean isErrorShown()
    {
        return $(loginPageElements.ERROR_TEXT).isDisplayed();
    }

}
