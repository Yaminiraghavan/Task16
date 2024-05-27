package Task16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
     WebElement search= driver.findElement(By.xpath("//input[@id='searchInput']"));
     search.sendKeys("Artificial Intelligence");
     search.sendKeys(Keys.ENTER);
     WebElement clkhis =driver.findElement(By.xpath("//span[@id='History']/parent::h2/following-sibling::p[1]/a"));
     clkhis.click();
     String sectionTitle = driver.getTitle();
     System.out.println("Title of the section: " + sectionTitle);

    }
}



