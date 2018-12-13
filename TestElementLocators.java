package TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestElementLocators {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.in");
        driver.findElement(By.linkText("Amazon Pay")).click();
        driver.navigate().back();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo Laptops");
        driver.findElement(By.className("nav-input")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Customer")).click();
        driver.close();
    }
}






