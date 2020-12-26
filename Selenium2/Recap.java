package Selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/abdullatif/Documents/drivers/chromedriver 8");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        if(title.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
            System.out.println("Title is right");
        }else{
            System.out.println("Title is Wrong");
        }
    }

}
