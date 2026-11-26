import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Exercise34 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            driver.get("about:blank");
            js.executeScript("document.body.innerHTML = \"<input id='age' type='number' min='18' max='60'>\";");
            int[] values = {17, 18, 19, 59, 60, 61};
            for (int v : values) {
                WebElement age = driver.findElement(By.id("age"));
                age.clear();
                age.sendKeys(String.valueOf(v));
                Boolean valid = (Boolean) js.executeScript("return arguments[0].checkValidity();", age);
                System.out.println("Age " + v + " -> valid = " + valid);
            }
        } finally {
            driver.quit();
        }
    }
}
