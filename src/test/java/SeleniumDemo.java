import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDemo {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        String searchTerm = "chatGPT";
        searchBox.sendKeys(searchTerm, Keys.ENTER);
        String currentTitle = driver.getTitle();
        if (currentTitle.contains(searchTerm)){
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED. the current title is " + currentTitle);
        }

    }
}
