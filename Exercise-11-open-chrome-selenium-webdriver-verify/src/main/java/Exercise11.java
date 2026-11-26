import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Exercise11 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com");
            String title = driver.getTitle();
            String url = driver.getCurrentUrl();
            System.out.println("Page title : " + title);
            System.out.println("Current URL : " + url);
            if (title.equals("Swag Labs") && url.contains("saucedemo")) {
                System.out.println("Title verification : PASS");
            } else {
                System.out.println("Title verification : FAIL");
            }
        } finally {
            driver.quit();
        }
    }
}
