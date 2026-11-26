import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Exercise12 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com");
            WebElement byId = driver.findElement(By.id("user-name"));
            WebElement byName = driver.findElement(By.name("password"));
            WebElement byClass = driver.findElement(By.className("login_logo"));
            WebElement byCss = driver.findElement(By.cssSelector("input[type='submit']"));
            WebElement byXpath = driver.findElement(By.xpath("//div[@class='login_logo']"));
            System.out.println("By id          : placeholder = " + byId.getAttribute("placeholder"));
            System.out.println("By name        : placeholder = " + byName.getAttribute("placeholder"));
            System.out.println("By className   : text = " + byClass.getText());
            System.out.println("By cssSelector : value = " + byCss.getAttribute("value"));
            System.out.println("By xpath       : text = " + byXpath.getText());
        } finally {
            driver.quit();
        }
    }
}
