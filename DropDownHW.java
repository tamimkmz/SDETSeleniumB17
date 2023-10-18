package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHW {
    public static void main(String[] args) throws InterruptedException {
        //instance
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");
//        maximize the window
        driver.manage().window().maximize();
        WebElement dream= driver.findElement(By.xpath("//div[contains(text(),'Select Your Dream Destination')]"));
        dream.click();
        Thread.sleep(3000);

        WebElement DropDown= driver.findElement(By.xpath("//a[contains(text(),'japan')]"));
        DropDown.sendKeys("Hello");
        Thread.sleep(3000);
        driver.quit();

    }
}
