package SeleniumPractice;
/*http://35.175.58.98/synchronization-explicit-wait.php
click to open alert and handle it

click to change text and get the changed text

click to get hidden button click on it

click to get tge checkbox selected and print if it is selected or not*/
import class07.CommonMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeW1 extends CommonMethod {
    public static void main(String[] args) {

        String url = "http://35.175.58.98/synchronization-explicit-wait.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        WebElement alertBtn=driver.findElement(By.xpath("//Button[@id=\"show_alert\"]"));
        alertBtn.click();
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Text: " + alert.getText());
        alert.accept();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//Button[@id=\"changetext_button\"]")));



    }
}