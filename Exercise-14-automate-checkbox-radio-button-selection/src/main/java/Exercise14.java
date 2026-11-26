import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class Exercise14 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/checkboxes");
            List<WebElement> boxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
            System.out.println("Checkbox 1 initially selected : " + boxes.get(0).isSelected());
            System.out.println("Checkbox 2 initially selected : " + boxes.get(1).isSelected());
            if (!boxes.get(0).isSelected()) boxes.get(0).click();
            if (boxes.get(1).isSelected()) boxes.get(1).click();
            System.out.println("Checkbox 1 after click : " + boxes.get(0).isSelected());
            System.out.println("Checkbox 2 after click : " + boxes.get(1).isSelected());
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");
            driver.findElement(By.id("my-radio-2")).click();
            System.out.println("Radio 1 selected : " + driver.findElement(By.id("my-radio-1")).isSelected());
            System.out.println("Radio 2 selected : " + driver.findElement(By.id("my-radio-2")).isSelected());
        } finally {
            driver.quit();
        }
    }
}
