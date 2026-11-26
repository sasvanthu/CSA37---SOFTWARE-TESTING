import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Exercise53 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            String base = "https://the-internet.herokuapp.com";
            String[][] pages = {
                {"/", "Welcome to the-internet"},
                {"/login", "Login Page"},
                {"/checkboxes", "Checkboxes"},
                {"/dropdown", "Dropdown List"}
            };
            int passed = 0;
            for (String[] p : pages) {
                driver.get(base + p[0]);
                String heading = driver.findElement(By.cssSelector("h1, h2, h3")).getText();
                boolean ok = heading.equals(p[1]);
                if (ok) passed++;
                System.out.println("Smoke " + p[0] + " -> " + heading + " -> " + (ok ? "PASS" : "FAIL"));
            }
            System.out.println("Smoke test result : " + passed + "/" + pages.length + " passed");
        } finally {
            driver.quit();
        }
    }
}
