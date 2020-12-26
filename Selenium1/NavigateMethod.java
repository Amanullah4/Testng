package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/abdullatif/Documents/drivers/chromedriver 8");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com"); //navigate to google
        driver.navigate().to("http://facebook.com");// navigate to facebook
        driver.navigate().back();// navigate to backward
        Thread.sleep(1000);// pause for a second
        driver.navigate().forward();// naviagate to forward
        Thread.sleep(1000);//
        driver.navigate().refresh();// it refreshes the page
        driver.close();// it closes the current tab
        driver.quit();// it quit the whole browser


    }
}

