package TestAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLender {

    WebDriver driver;

    public void invokesBrowser(){

        System.setProperty("webdriver.chrome.driver","D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://beta.themortgagex.com/lender/#/");
    }

    public static void main(String[] args){

    }
}
