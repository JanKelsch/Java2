package gitHubTest.pages;

import gitHubTest.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(id = "login_field")
    private WebElement login;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "/html/body/div[3]/main/div/form/div[3]/input[7]")
    private WebElement loginButton;

    @FindBy(xpath = "/html/body/div[3]/main/div/form/div[2]/div/div")
    private WebElement incorrectContainer;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public MainPage login(String user, String pass) {
        login.sendKeys(user);
        password.sendKeys(pass);

        loginButton.click();
        return new MainPage(driver);
    }
}
