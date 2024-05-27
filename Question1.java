package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        String url= driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.quit();


    }
}
