package gitHubTest.pages;

import gitHubTest.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateRepoPage extends PageObject {

    public CreateRepoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "repository_name")
    private WebElement name;

    @FindBy(id = "repository_description")
    private WebElement description;

    @FindBy(xpath = "/html/body/div[4]/main/div/form/div[3]/button")
    private WebElement createRepoButton;

    @FindBy(xpath = "//*[@id=\"js-repo-pjax-container\"]/div[1]/div/h1/span[1]/a")
    private WebElement userLabel;

    @FindBy(xpath = "//*[@id=\"js-repo-pjax-container\"]/div[1]/div/h1/strong/a")
    private WebElement repoLabel;

    public void fillAllProperties(String repoName, String desc) {
        name.sendKeys(repoName);
        description.sendKeys(desc);
    }

    public void fillRequiredProperties(String repoName, String desc) {
        name.sendKeys(repoName);
        description.sendKeys(desc);
    }

    public boolean createBtnEnabled() {
        return createRepoButton.isEnabled();
    }

    public Object getUserLabel() {
        return userLabel.getText();
    }

    public Object getRepoLabel() {
        return repoLabel.getText();
    }

    public void create() {
        createRepoButton.click();
    }
}
