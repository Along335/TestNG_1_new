import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;


public class WebTest {
    @Test(description = "Test for the Chrome Driver!")
    public void webDriverTest1(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //set wait - driver will wait until 10 sec to element to appear
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Open page
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.close();
        driver.quit();
    }
}
