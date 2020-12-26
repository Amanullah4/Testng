package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    // lounch the browser
    // navigae to amazon
    // print out the title and the url in the cocsule
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/abdullatif/Documents/drivers/chromedriver 8");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=381823327672&hvpos=&hvnetw=g&hvrand=14877864443685211150&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=9061271&hvlocphy=1000002&hvtargid=kwd-10573980&ref=pd_sl_7j18redljs_e&hydadcr=28883_11845445&gclid=CjwKCAiA5IL-BRAzEiwA0lcWYoNNBnZylYVXoRnKQ9odEdnw7546_fQu2Zk8OzT0u6iKtjNz54bk4xoCsNwQAvD_BwE");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);
    }
}
