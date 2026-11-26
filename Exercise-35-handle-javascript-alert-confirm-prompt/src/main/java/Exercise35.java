import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Exercise35 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert text   : " + alert.getText());
            alert.accept();
            System.out.println("Result       : " + driver.findElement(By.id("result")).getText());
            driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
            alert = driver.switchTo().alert();
            System.out.println("Confirm text : " + alert.getText());
            alert.dismiss();
            System.out.println("Result       : " + driver.findElement(By.id("result")).getText());
            driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
            alert = driver.switchTo().alert();
            alert.sendKeys("Hello Selenium");
            alert.accept();
            System.out.println("Result       : " + driver.findElement(By.id("result")).getText());
        } finally {
            driver.quit();
        }
    }
}
