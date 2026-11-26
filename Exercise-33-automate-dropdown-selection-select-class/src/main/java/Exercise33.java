import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Exercise33 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/dropdown");
            Select dropdown = new Select(driver.findElement(By.id("dropdown")));
            dropdown.selectByVisibleText("Option 1");
            System.out.println("By visible text : " + dropdown.getFirstSelectedOption().getText());
            dropdown.selectByValue("2");
            System.out.println("By value        : " + dropdown.getFirstSelectedOption().getText());
            dropdown.selectByIndex(1);
            System.out.println("By index        : " + dropdown.getFirstSelectedOption().getText());
            System.out.println("Total options   : " + dropdown.getOptions().size());
        } finally {
            driver.quit();
        }
    }
}
