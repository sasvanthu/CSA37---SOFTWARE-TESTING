import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LoginDataDrivenTest {
    private WebDriver driver;
    @BeforeEach
    void setUp() { driver = new ChromeDriver(); }
    @AfterEach
    void tearDown() { driver.quit(); }
    @ParameterizedTest(name = "{0} / {1} -> {2}")
    @CsvSource(delimiter = '|', value = {
        "standard_user|secret_sauce|Products",
        "standard_user|wrong_pass|Epic sadface: Username and password do not match any user in this service",
        "locked_out_user|secret_sauce|Epic sadface: Sorry, this user has been locked out.",
        "<blank>|secret_sauce|Epic sadface: Username is required"
    })
    void loginScenarios(String user, String pass, String expected) {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys(user.equals("<blank>") ? "" : user);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.id("login-button")).click();
        List<WebElement> errors = driver.findElements(By.cssSelector("[data-test='error']"));
        String actual = errors.isEmpty()
                ? driver.findElement(By.className("title")).getText()
                : errors.get(0).getText();
        assertEquals(expected, actual);
    }
}
