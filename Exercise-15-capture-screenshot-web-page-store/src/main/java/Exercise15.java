import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
public class Exercise15 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com");
            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Path dest = Paths.get("screenshots", "home_page.png");
            Files.createDirectories(dest.getParent());
            Files.copy(source.toPath(), dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Screenshot saved at : " + dest.toAbsolutePath());
        } finally {
            driver.quit();
        }
    }
}
