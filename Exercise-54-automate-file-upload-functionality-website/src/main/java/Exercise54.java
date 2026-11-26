import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.nio.file.Files;
public class Exercise54 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            File file = File.createTempFile("upload_", ".txt");
            Files.writeString(file.toPath(), "Selenium file upload test");
            driver.get("https://the-internet.herokuapp.com/upload");
            driver.findElement(By.id("file-upload")).sendKeys(file.getAbsolutePath());
            driver.findElement(By.id("file-submit")).click();
            String status = driver.findElement(By.tagName("h3")).getText();
            String uploaded = driver.findElement(By.id("uploaded-files")).getText();
            System.out.println("Upload status     : " + status);
            System.out.println("File name matches : " + uploaded.equals(file.getName()));
        } finally {
            driver.quit();
        }
    }
}
