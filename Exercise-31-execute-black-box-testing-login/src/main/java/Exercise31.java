import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Exercise31 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            String[][] cases = {
                {"standard_user", "secret_sauce", "inventory"},
                {"standard_user", "wrong_pass",
                    "Epic sadface: Username and password do not match any user in this service"},
                {"", "secret_sauce", "Epic sadface: Username is required"},
                {"standard_user", "", "Epic sadface: Password is required"}
            };
            int tc = 1;
            for (String[] c : cases) {
                driver.manage().deleteAllCookies();
                driver.get("https://www.saucedemo.com");
                driver.findElement(By.id("user-name")).sendKeys(c[0]);
                driver.findElement(By.id("password")).sendKeys(c[1]);
                driver.findElement(By.id("login-button")).click();
                String actual;
                if (c[2].equals("inventory")) {
                    actual = driver.getCurrentUrl().contains("inventory") ? "inventory" : "login failed";
                } else {
                    actual = driver.findElement(By.cssSelector("[data-test='error']")).getText();
                }
                System.out.println("TC" + tc + " : " + (actual.equals(c[2]) ? "PASS" : "FAIL"));
                tc++;
            }
        } finally {
            driver.quit();
        }
    }
}
