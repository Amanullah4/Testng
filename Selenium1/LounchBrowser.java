package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LounchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/abdullatif/Documents/drivers/chromedriver 8");
        WebDriver driver = new ChromeDriver();// it opens the chrome browser
        driver.get("https://syntaxtechs.com/");// it opens syntax page
        String url = driver.getCurrentUrl();// it display url
        System.out.println(url);
        String title = driver.getTitle();// is display the title of page
        System.out.println(title);
    }
}
