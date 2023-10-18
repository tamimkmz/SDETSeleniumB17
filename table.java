package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethod;

import java.util.List;

public class table extends CommonMethod {
    public static void main(String[] args) {
        String url="http://35.175.58.98/upload-image.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        boolean hasNextPage = true;
        while (hasNextPage) {
            // Find all rows with "remarks pass"
            List<WebElement> passRows = driver.findElements(By.xpath("//tr[contains(@class, 'pass')]"));

            // Print the data in each pass row
            for (WebElement row : passRows) {
                System.out.println(row.getText());
            }

            // Check if there's a next page
            WebElement nextPageButton = driver.findElement(By.id("nextPageButton")); // Change to the actual ID
            if (nextPageButton.getAttribute("class").contains("disabled")) {
                hasNextPage = false;
            } else {
                // Click the next page button
                nextPageButton.click();
            }
        }

        // Close the WebDriver
        driver.quit();
    }
}
