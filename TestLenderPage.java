package TestAutomation;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLenderPage
{

    WebDriver driver;

    public void invokesBrowser(){
        System.setProperty("webdriver.chrome.driver","D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://beta.themortgagex.com/lender/#/");
        testLender();
    }

    public static void main(String[] args) {

        TestLenderPage obj = new TestLenderPage();
        obj.invokesBrowser();
    }

    public void testLender() {

       /*
        tryCatch1000();
        driver.findElement(By.className("first-margin")).click();
        lenderFormFill();

        driver.findElement(By.xpath("//a[contains(text(),'Lender!')]")).click();
        lenderFormFill();
        */
        driver.findElement(By.className("last-margin")).click();
        //lenderLoginAfterVerification_NewProperty();
        lenderLoginAfterVerification();
        //payMembershipFee();
        Bid();
        useExistingCard();
    }

    /*-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+
    |                                                                                                                 |
    |                                                                                                                 |
    |                                                                                                                 |
    |                                                                                                                 |
    |                                        Function Declaration                                                      |
    |                                                                                                                 |
    |                                                                                                                 |
    |                                                                                                                 |
    |                                                                                                                 |
    -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+*/


    /*-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+
    |                                           Lender Form Fill Function                                           |
    -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+*/

    public void lenderFormFill() {


        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Gaurav");
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Sharma");
        WebElement me=driver.findElement(By.xpath("//select[@required='required']"));
        Select ste= new Select(me);
        ste.selectByVisibleText("Mr");
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("1992-09-10");
        driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
        tryCatch1000();
        driver.findElement(By.xpath("//input[@placeholder='Email Address for Login']")).sendKeys("gaurav@unoapp.io");
        driver.findElement(By.xpath("(//input[@placeholder='At least 8 characters'])[1]")).sendKeys("12345678");
        tryCatch1000();
        driver.findElement(By.xpath("(//input[@placeholder='At least 8 characters'])[2]")).sendKeys("12345678");
        tryCatch1000();
        driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
        tryCatch2000();
        driver.findElement(By.className("form-control")).sendKeys("Vau");
        tryCatch4000();
        driver.findElement(By.xpath("//span[contains(text(),'ghan Mills')]")).click();
        tryCatch4000();
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
        tryCatch1000();
        driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("0,800","");
        tryCatch1000();
        driver.findElement(By.className("checkmark")).click();
        driver.findElement(By.className("btn")).click();
        tryCatch3000();
        driver.navigate().to("http://www.gmail.com");
    }

    /*-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+
    |                                           Sign up As Lender                                                     |
    -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+*/

    public void lenderLoginAfterVerification_NewProperty() {

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gaurav@unoapp.io");
        tryCatch500();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678");
        tryCatch500();
        driver.findElement(By.className("btn")).click();
        tryCatch4000();
        driver.findElement(By.xpath("(//span[contains(text(),'click')])[1]")).click();
    }
    public void lenderLoginAfterVerification() {

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gaurav@unoapp.io");
        tryCatch500();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678");
        tryCatch500();
        driver.findElement(By.className("btn")).click();
    }

    /*-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+
    |                                           Pay Membership Fee                                                    |
    -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+*/

    public void payMembershipFee(){

        tryCatch2000();
        addnewCardForPayment();
    }

    /*-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+
    |                                               Add New Card                                                      |
    -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+*/

    public void addnewCardForPayment() {

        tryCatch1000();
        driver.findElement(By.className("name_on_card")).sendKeys("Gaurav Bhardwaj");
        tryCatch1000();
        driver.findElement(By.xpath("//input[@placeholder='Card Number']")).sendKeys("4545454545454545");
        tryCatch1000();
        driver.findElement(By.xpath("//input[@placeholder='CVC/CVV']")).sendKeys("145");
        tryCatch1000();
        driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys("08");
        tryCatch1000();
        driver.findElement(By.xpath("//input[@placeholder='YY']")).sendKeys("30");
        tryCatch1000();
        driver.findElement(By.className("btn")).click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
    }

    /*-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+
    |                                           Use Existing Card                                                     |
    -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+*/

    public void useExistingCard() {

        tryCatch4000();
        driver.findElement(By.xpath("//button[contains(text(),'Pay')]")).click();
        tryCatch5000();
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
    }

    /*-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+
    |                                                       Bid                                                       |
    -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+*/

    public void Bid(){

        JavascriptExecutor my=(JavascriptExecutor) driver;
        my.executeScript("window.scrollBy(0,800)","");
        tryCatch3000();
        driver.findElement(By.xpath("//h3[contains(text(),'Vaughan')]")).click();
        tryCatch3000();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)","");
        tryCatch3000();
        driver.findElement(By.xpath("//button[contains(text(),'Bid Now')]")).click();
        JavascriptExecutor ab=(JavascriptExecutor) driver;
        ab.executeScript("window.scrollBy(0,600)","");
        driver.findElement(By.id("bidOffer")).sendKeys("5000000");
        tryCatch1000();
        driver.findElement(By.id("InterestRateOfferStart")).sendKeys("15");
        tryCatch1000();
        driver.findElement(By.className("slider")).click();
        tryCatch1000();
        driver.findElement(By.id("interestRateOfferLow")).sendKeys("5");
        tryCatch1000();
        driver.findElement(By.xpath("//button[contains(text(),'Bid Now')]")).click();
    }
    /*-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+
    |                                                       Try/Catch                                                 |
    -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+*/

    public void tryCatch500() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void tryCatch1000() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void tryCatch2000() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void tryCatch3000() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void tryCatch4000() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void tryCatch5000() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void tryCatch6000() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

