import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Exercise55 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
            driver.findElement(By.cssSelector("#start button")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement finish = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
            System.out.println("Dynamic text : " + finish.getText());
            System.out.println("Verification : " + (finish.getText().equals("Hello World!") ? "PASS" : "FAIL"));
        } finally {
            driver.quit();
        }
    }
}
