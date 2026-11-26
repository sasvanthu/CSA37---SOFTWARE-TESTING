import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Exercise52 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
            String badge = driver.findElement(By.className("shopping_cart_badge")).getText();
            System.out.println("Cart badge count : " + badge);
            driver.findElement(By.className("shopping_cart_link")).click();
            driver.findElement(By.id("checkout")).click();
            driver.findElement(By.id("first-name")).sendKeys("Test");
            driver.findElement(By.id("last-name")).sendKeys("User");
            driver.findElement(By.id("postal-code")).sendKeys("600001");
            driver.findElement(By.id("continue")).click();
            driver.findElement(By.id("finish")).click();
            String status = driver.findElement(By.className("complete-header")).getText();
            System.out.println("Order status     : " + status);
            System.out.println("System test      : "
                    + (badge.equals("1") && status.equals("Thank you for your order!") ? "PASS" : "FAIL"));
        } finally {
            driver.quit();
        }
    }
}
