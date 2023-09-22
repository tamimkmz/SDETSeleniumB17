package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingLoginProcess {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        //1 Go to the OrangeHRM login page.
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //3Clear the username field.
        WebElement userName = driver.findElement(By.name("username"));
        //2Enter the username "abc".
        userName.sendKeys("abc");
        Thread.sleep(3000);
        userName.sendKeys(Keys.CONTROL + "a");
        userName.sendKeys(Keys.DELETE);
        //4Enter the username "Admin".
        userName.sendKeys("Admin");
        //5Enter the password "admin123".
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        //6Get the text from the login button web element and print it on the console.
        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

    }
    }

