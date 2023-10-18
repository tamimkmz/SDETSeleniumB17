package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 class CheckboxDemo {
    public static void main(String[] args) {


            /*Navigate to http://35.175.58.98/basic-checkbox-demo.php.

            Check the if Checkbox1 is enabled
            If Checkbox1 is disabled:
            Click on the "enable checkboxes" button.
            Verify that Checkbox1 is now enabled.
            Click on Checkbox1.
            Confirm that Checkbox1 is selected. (edited)
             */

                WebDriver driver = new ChromeDriver();
                driver.get("http://35.175.58.98/basic-checkbox-demo.php");
                driver.manage().window().maximize();

                //locate the checkbox element 1
                WebElement checkbox1 = driver.findElement(By.cssSelector("input[value='Checkbox-1'] "));
                checkbox1.click();

                boolean status = checkbox1.isEnabled();
                System.out.println("CheckBox Status: " + status);

                //Locate the button enable
                WebElement EnabledCheckBox = driver.findElement(By.cssSelector("button#enabledcheckbox"));
                //Click on the "enable checkboxes" button.
                EnabledCheckBox.click();


                boolean EnabledStatus = EnabledCheckBox.isEnabled();
                if (EnabledStatus) {
                    System.out.println("the check box button is enabled " + EnabledStatus);
                } else {
                    System.out.println("the check box button is not enabled " + EnabledStatus);
                }
                checkbox1.click();

                boolean checkb1selected = checkbox1.isSelected();
                if (checkb1selected) {
                    System.out.println("checkbox 1 is selected");
                } else {
                    System.out.println("checkbox 1 is not selected");
                }


            }
        }
