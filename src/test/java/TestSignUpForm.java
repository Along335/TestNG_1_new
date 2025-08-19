import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;
import pages.ThankYouPage;

import java.time.Duration;

public class TestSignUpForm {

    @Test(description = "Testing the Sign Form")
    public void testSignUpForm()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");

        SignUpPage signUpPage = new SignUpPage(driver);
        Assert.assertTrue(signUpPage.isInitialized());
        signUpPage.enterName("John", "Doe");
        signUpPage.enterAddress("5th Ave","10010");
        signUpPage.submit();

        ThankYouPage thankYouPage = new ThankYouPage(driver);
        Assert.assertTrue(thankYouPage.isInitialized());

        driver.close();
        driver.quit();
    }
}
