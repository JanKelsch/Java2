package testPage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SighUpFormTest extends FunctionalTest {

    @Test
    public void signUp() throws InterruptedException {
        driver.get("https://kimschiller.com/page-object-pattern-tutorial/index.html");

        SighUpPage sighUpPage = new SighUpPage(driver);
        assertTrue(sighUpPage.isInitialized());

        sighUpPage.enterName("First", "Last");
        sighUpPage.enterAddress("123 Street", "12");
        Thread.sleep(2000);

        ReceiptPage receiptPage = sighUpPage.submit();
        assertTrue(receiptPage.isInitialized());

        assertEquals("Thank you!", receiptPage.confirmationHeader());
    }
}
