package starter.pages;

import org.openqa.selenium.By;

class loginPageElements {
    static By USERNAME_TXT= By.name("username");
    static By PASSWORD_TEXT = By.name("password");
    static By LOGIN_BTN = By.tagName("button");
    static By ERROR_TEXT = By.className("orangehrm-login-error");
}
