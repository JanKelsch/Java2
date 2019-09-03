package gitHubTest.pages;

import gitHubTest.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RepoListPage extends PageObject {

    @FindBy(id = "your-repos-filter")
    private WebElement searchRepo;

    @FindBy(xpath = "//*[@id='user-repositories-list']/div/div[1]/strong[2]")
    private WebElement searchResult;

    public RepoListPage(WebDriver driver) {
        super(driver);
    }

    public String searchRepo(String name) {
        searchRepo.sendKeys(name);
        searchRepo.submit();
        return searchResult.getText();
    }
}
