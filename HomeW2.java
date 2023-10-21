package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.CommonMethod;
/*select the date from calendar "5th Dec 1998"

https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker
*/
public class HomeW2 extends CommonMethod {
    /*
    * sleect the date from calander "5th Dec 1998"

https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker
*/
    public static void main(String[] args) {

        String url = "https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement simple = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(simple);
        WebElement calendar = driver.findElement(By.xpath("//input[@id='datepicker']"));
        calendar.click();

        String monthText = driver.findElement(By.className("ui-datepicker-month")).getText();
        String yearText = driver.findElement(By.className("ui-datepicker-year")).getText();
        while (!(yearText.equals("1998"))) {
            driver.findElement(By.xpath("//a[@data-handler='prev']")).click();

            yearText = driver.findElement(By.className("ui-datepicker-year")).getText();
            while (!(monthText.equals("December"))) {
                monthText = driver.findElement(By.className("ui-datepicker-month")).getText();
                driver.findElement(By.xpath("//a[@data-handler='prev']")).click();

            }

        }
        driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='5']")).click();
    }

}


