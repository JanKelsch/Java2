package gitHubTest.pages;

import gitHubTest.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[4]/div/aside[1]/div[2]/div/div/h2/a")
    private WebElement newRepoButton;

    public CreateRepoPage createRepo(String repoName, String repoDescr) {
        newRepoButton.click();
        return new CreateRepoPage(driver);
    }
}
