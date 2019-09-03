package gitHubTest;

import gitHubTest.pages.*;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BasicTest extends FunctionalTest {

    LoginPage loginPage = new LoginPage(driver);
    MainPage mainPage;
    CreateRepoPage createPage;
    SettingsPage settings = new SettingsPage(driver);
    RepoListPage repoListPage = new RepoListPage(driver);

    String user = "JanKelsch";
    String password = "caesardracula82";
    //    String invalidUser = "user";
    //    String invalidPass = "";
    String baseURL = "https://github.com/login";
    String repoListURL = "https://github.com/JanKelsch?tab=repositories";
    String repoName = "test";
    String repoDescr = "Some valid description";

    @Before
    public void init() {
        driver.manage().deleteAllCookies();
        driver.get(baseURL);
        mainPage = loginPage.login(user, password);
    }

    @Test
    public void test1_createRepo() {
        createPage = mainPage.createRepo(repoName, repoDescr);
        assertFalse(createPage.createBtnEnabled());

        createPage.fillRequiredProperties(repoName, repoDescr);
        assertTrue(createPage.createBtnEnabled());

        createPage.create();
        assertTrue(createPage.getRepoLabel().equals(repoName));
        assertTrue(createPage.getUserLabel().equals(user));

        driver.get(repoListURL);
        assertTrue(repoListPage.searchRepo(repoName).contains(repoName));
        System.out.println("Test 1: passed!");
    }

    @Test
    public void test2_repoWithExistingName() {
        createPage = mainPage.createRepo(repoName, repoDescr);
        assertFalse(createPage.createBtnEnabled());

        createPage.fillRequiredProperties(repoName, repoDescr);
        assertFalse(createPage.createBtnEnabled());
        System.out.println("Test 2: passed!");
    }

    @Test
    public void test3_deleteRepo() {
        driver.get("https://github.com/" + user + "/" + repoName + "/settings");
        settings.deleteRepo(repoName);
        driver.get(repoListURL);
        assertTrue(repoListPage.searchRepo(repoName).contains(repoName));
        System.out.println("Test 3: passed!");
    }

//    @Test
//    public void invalidLoginPass(){
//        driver.get(baseURL);
//        mainPage = loginPage.login(user, password);
//        assertEquals(loginPage.login(user, password).equals());
//    }
}
