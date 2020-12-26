package TestingBasics;

import org.jetbrains.annotations.TestOnly;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Logintest {
    WebDriver driver;
    @BeforeMethod
    public void openAndNavigate(){
        System.setProperty("webdriver.chrome.driver", "/Users/abdullatif/Documents/drivers/chromedriver 8");
        driver = new ChromeDriver();
        driver.get("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    //    driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    @Test
    public void validAdminLogin(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        WebElement welcomeMessage = driver.findElement(By.cssSelector("a#welcome"));
        if(welcomeMessage.isSelected()) {
            System.out.println("Test pass");
        }else {
            System.out.println("Test fail");
        }
    }
    @Test
    public void titlevalidition(){
        String expectedTitle="Human Management System";
        String acualTitle=driver.getTitle();
        if(expectedTitle.equals(acualTitle)) {
            System.out.println("Title is valid, test pass");
        }else{
            System.out.println("Title is not matched. test fail");
        }
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
