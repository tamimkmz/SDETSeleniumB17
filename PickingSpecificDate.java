package SeleniumPractice;
/*
import Class03.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethod;

import java.time.Duration;
import java.util.List;

public class PickingSpecificDate extends CommonMethod {
    public static void main(String[] args) {
        String url = "https://www.globalsqa.com/demo-site/datepicker/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        // Find and click the date input field
        WebElement dateInput = driver.findElement(By.id("//input[@id='datepicker']"));
        dateInput.click();
        boolean notfound=true;
        while(notfound) {
            // Select the year 1998 from the year dropdown

             WebElement yearDropdown = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
             yearDropdown.click();
        driver.findElement(By.xpath("//span[@class='ui-datepicker-year']/option[text()='1998']")).click();
        // Select December from the month dropdown
            WebElement year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
            String currentYear = year.getText();
            // find the month and check if it is correct
            WebElement month = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
            WebElement day = driver.findElement(By.xpath("//a[text()='5']"));day.click();
            System.out.println("the current date is 5th Dec 1998");
            String currentMonth = month.getText();
            if (currentMonth.equals("December")) {
                List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
//                iterate
                for(WebElement date:dates){
                    String currentDate = date.getText();
                    if(currentDate.equals("5")){
                        date.click();
                        break;
                    }
                }
                notfound=false;
            } else {
                WebElement next = driver.findElement(By.xpath("//a[@data-handler='next']"));
                next.click();
            }
        }
    }
}
*/