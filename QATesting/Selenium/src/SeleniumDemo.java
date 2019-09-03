import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumDemo {

    WebDriver driver;
    static String url1 = "https://www.sputnik-57.com/";
    static String url2 = "https://www.google.com.ua/search?rlz=1C2CHZL_enUA717UA717&source=hp&ei=S69jXef3Dv-i1fAPqsivSA&q=meryl+streep&oq=meryl+streep&gs_l=psy-ab.3..0i203l10.4265.11492..11778...0.0..0.112.551.5j1......0....1..gws-wiz.......0j35i39j0i10.K4T8ErbX7w8&ved=0ahUKEwinyZeMpaDkAhV_URUIHSrkCwkQ4dUDCAU&uact=5";
    static String url3 = "https://www.facebook.com";
    static String url4 = "https://www.flipkart.com";
    static String url5 = "https://www.google.com";

    public void invokeBrowser(String path) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(path);
    }

    public void closeBrowser() {
        driver.close();
    }

    public static void main(String[] args) {
        // url1
        SeleniumDemo test = new SeleniumDemo();
        test.invokeBrowser(url1);
        test.driver.findElement(By.id("comp-jua5821flabel")).click();
        test.driver.findElement(By.xpath("//*[@id=\"comp-juaayug9input\"]")).sendKeys("Yan");
        test.driver.findElement(By.xpath("//*[@id=\"comp-juaayugbinput\"]")).sendKeys("test");
        test.driver.findElement(By.xpath("//*[@id=\"comp-juaayugdinput\"]")).sendKeys("test@t.com");
        test.driver.findElement(By.xpath("//*[@id=\"comp-juaayugfinput\"]")).sendKeys("1111");
        test.driver.findElement(By.id("comp-juab70gccontainer")).click();
        test.driver.findElement(By.id("comp-juaayugglabel")).click();
        test.closeBrowser();

        // url2
        SeleniumDemo test2 = new SeleniumDemo();
        test2.invokeBrowser(url2);
        try {
            test2.driver.findElement(By.className("q qs"));
        } catch (Exception e) {
            System.out.println("Element not found");
        }
    }
}
