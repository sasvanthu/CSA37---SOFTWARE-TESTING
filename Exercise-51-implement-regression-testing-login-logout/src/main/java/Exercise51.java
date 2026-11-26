import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Exercise51 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            String heading = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.className("title"))).getText();
            System.out.println("Login check  : " + (heading.equals("Products") ? "PASS" : "FAIL"));
            driver.findElement(By.id("react-burger-menu-btn")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link"))).click();
            boolean loginVisible = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("login-button"))).isDisplayed();
            System.out.println("Logout check : " + (loginVisible ? "PASS" : "FAIL"));
        } finally {
            driver.quit();
        }
    }
}
