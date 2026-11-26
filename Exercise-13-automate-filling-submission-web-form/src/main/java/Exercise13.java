import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Exercise13 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");
            System.out.println("Page title : " + driver.getTitle());
            driver.findElement(By.name("my-text")).sendKeys("Student");
            driver.findElement(By.name("my-password")).sendKeys("Secret@123");
            driver.findElement(By.name("my-textarea")).sendKeys("Automated using Selenium WebDriver");
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            System.out.println("Heading : " + driver.findElement(By.tagName("h1")).getText());
            System.out.println("Message : " + driver.findElement(By.id("message")).getText());
        } finally {
            driver.quit();
        }
    }
}
