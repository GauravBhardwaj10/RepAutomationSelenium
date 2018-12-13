package TestAutomation;

import com.sun.media.sound.AiffFileReader;
import com.sun.org.apache.xalan.internal.xsltc.runtime.StringValueHandler;
import com.sun.org.apache.xpath.internal.operations.String;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.text.BreakIterator;

public class testBorrower {

    WebDriver driver;

    public void invokeBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://beta.themortgagex.com/borrower/#/");
        setCommands();
    }

    public static void main(java.lang.String[] args) {

        testBorrower obj = new testBorrower();
        obj.invokeBrowser();
    }

    public void setCommands() {

        tryCatch1000();

                //For Signup > As Borrower

        driver.findElement(By.className("first-margin")).click();
        tryCatch1000();
        driver.findElement(By.xpath("//*[contains(text(),'As Borrower')]")).click();
        tryCatch2000();
        BorrowerSignupFunction();

        //For Signup > As Lender


        driver.findElement(By.className("first-margin")).click();
        tryCatch1000();
        driver.findElement(By.xpath("//*[contains(text(),'As Lender')]")).click();
        LenderSignupFunction();

        //For Login As Borrower

        driver.findElement(By.className("last-margin")).click();
        //tryCatch1000();
        LoginAsBorrower();

        // For I'm a lender button

        driver.findElement(By.xpath("//button[contains(text(),'lender')]")).click();
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,300)","");
        tryCatch1000();
        LenderSignupFunction();
        tryCatch1000();

        // For I'm a borrower button

        driver.findElement(By.xpath("//button[contains(text(),'borrower')]")).click();
        tryCatch1000();
        BorrowerSignupFunction();
        tryCatch1000();

        //Other Links on Page


    }
    /*-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+
    |                                                                                                                |
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
    |                                           Lender Function Declaration                                           |
    -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+*/

    public void BorrowerSignupFunction(){

        driver.findElement(By.xpath("//input[@placeholder = 'First Name']")).sendKeys("Gaurav");
        tryCatch1000();
        driver.findElement(By.xpath("//input[@placeholder = 'Last Name']")).sendKeys("Sharma");
        tryCatch1000();
        WebElement ele= driver.findElement(By.xpath("//select[@required='required']"));
        Select st=new Select(ele);
        tryCatch1000();
        st.selectByVisibleText("Mr");
        tryCatch1000();
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
        tryCatch1000();
        driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
        tryCatch1000();
        driver.findElement(By.xpath("//input[@placeholder='Email Address for Login']")).sendKeys("autotest@gmail.com");
        tryCatch1000();
        driver.findElement(By.xpath("(//input[contains(@type,'password')])[1]")).sendKeys("Password");
        tryCatch1000();
        driver.findElement(By.xpath("(//input[contains(@type,'password')])[2]")).sendKeys("Password");
        tryCatch1000();
        driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
        tryCatch1000();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,800)", "");
        tryCatch500();
        driver.findElement(By.className("checkmark")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        tryCatch1000();
        driver.navigate().to("http://beta.themortgagex.com/borrower/#/");
        tryCatch1000();
    }

    /*-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+
    |                                           Lender Function Declaration                                           |
    -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+*/

    public void LenderSignupFunction(){

        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,300)","");
        tryCatch1000();
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Gaurav");
        tryCatch1000();
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Sharma");
        tryCatch1000();
        WebElement me=driver.findElement(By.xpath("//select[@required='required']"));
        Select ste= new Select(me);
        ste.selectByVisibleText("Mr");
        tryCatch1000();
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("1992-04-05");
        tryCatch1000();
        driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
        tryCatch1000();
        driver.findElement(By.xpath("//input[@placeholder='Email Address for Login']")).sendKeys("lender@gmail.com");
        tryCatch1000();
        driver.findElement(By.xpath("(//input[@placeholder='At least 8 characters'])[1]")).sendKeys("password");
        tryCatch1000();
        driver.findElement(By.xpath("(//input[@placeholder='At least 8 characters'])[2]")).sendKeys("password");
        tryCatch1000();
        driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
        tryCatch2000();
        driver.findElement(By.id("autocomplete")).sendKeys("123,ABC");
        tryCatch1000();
        driver.findElement(By.id("postal")).sendKeys("135001");
        tryCatch1000();
        WebElement sp=driver.findElement(By.xpath("//select[@required='required']"));
        Select opt= new Select(sp);
        opt.selectByVisibleText("Quebec");
        tryCatch1000();
        driver.findElement(By.id("city")).sendKeys("Montreal");
        tryCatch1000();
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
        tryCatch1000();
        driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
        jse = (JavascriptExecutor) driver;
        jse.executeScript("0,800","");
        tryCatch1000();
        driver.findElement(By.className("checkmark")).click();
        driver.findElement(By.className("btn")).click();
        tryCatch1000();
        driver.navigate().to("http://beta.themortgagex.com/borrower/#/");
        tryCatch1000();

    }

    /*-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+
    |                                           LoginAsBorrower Function Declaration                                           |
    -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+*/

    public void LoginAsBorrower() {

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gauravs10sharma@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678");
        driver.findElement(By.xpath("//*[@class='btn']")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.className("btn")).click();
        tryCatch500();
        driver.navigate().back();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        NewProperty();
    }

    /*-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+
    |                                           Add property Function Declaration                                           |
    -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+*/

    public void NewProperty() {

        driver.findElement(By.className("first-margin")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JavascriptExecutor jse= (JavascriptExecutor)  driver;
        jse.executeScript("0,250","");
        tryCatch1000();
        WebElement pr=driver.findElement(By.xpath("(//select[@required='required'])[1]"));
        Select puref=new Select(pr);
        puref.selectByVisibleText("Purchase");
        tryCatch1000();
        WebElement ro=driver.findElement(By.xpath("(//select[@required='required'])[2]"));
        Select reow=new Select(ro);
        reow.selectByVisibleText("Own");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement rr=driver.findElement(By.xpath("(//select[@required='required'])[3]"));
        Select rere=new Select(rr);
        rere.selectByVisibleText("Reside");
        driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("4200000");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("2500000");
        driver.findElement(By.className("form-control")).sendKeys("Air");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//span[contains(text(),'Mansfield, ON, Canada')]")).click();
        jse = (JavascriptExecutor) driver;
        jse.executeScript("0,1200","");
        tryCatch1000();
        driver.findElement(By.className("slider")).click();
        tryCatch1000();
        driver.findElement(By.xpath("//button[contains(text(),'Schedule')]")).click();
        tryCatch3000();
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
        tryCatch1000();
         driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).click();
        tryCatch1000();
        driver.findElement(By.xpath("(//span[contains(text(),'click here')])[1]")).click();
        driver.navigate().to("http://beta.themortgagex.com/borrower/#/");
        pageLinks();
    }
    /*-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+
    |                                                                                                                 |
    |                                               Adding Cards                                                      |                                                                                                         |
    |                                                                                                                 |
    -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+*/

    /*-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+
    |                                               Add New Card                                                      |
    -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+*/

    public void addnewCard() {

        driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
        tryCatch1000();
        driver.findElement(By.className("name_on_card")).sendKeys("Gaurav Bhardwaj");
        tryCatch1000();
        driver.findElement(By.xpath("//input[@placeholder='Card Number']")).sendKeys("3232323232323232");
        tryCatch1000();
        driver.findElement(By.xpath("//input[@placeholder='CVC/CVV']")).sendKeys("132");
        tryCatch1000();
        driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys("08");
        tryCatch1000();
        driver.findElement(By.xpath("//input[@placeholder='YY']")).sendKeys("30");
        tryCatch1000();
        driver.findElement(By.className("btn")).click();
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
    }
    /*-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+
    |                                           Use Existing Card                                                     |
    -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+*/

    public void useExistingCard() {

        driver.findElement(By.xpath("//button[contains(text(),'Pay')]")).click();
        tryCatch5000();
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
    }

    /*-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+
    |                                           Page Links                                                            |
    -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+*/

    public void pageLinks(){
        driver.findElement(By.xpath("(//span[@class='dot'])[4]")).click();
        tryCatch1000();
        driver.findElement(By.xpath("(//button[@class='btn'])[6]")).click();
        tryCatch500();
        driver.findElement(By.xpath("//p[contains(text(),'How much do you think I will be paying in closing costs?')]")).click();
        tryCatch500();
        driver.findElement(By.xpath("//p[contains(text(),'What fees am I responsible for?')]")).click();
        tryCatch500();
        driver.findElement(By.xpath("//button[contains(text(),'Application Process')]")).click();
        tryCatch500();
        driver.findElement(By.xpath("//p[contains(text(),'MortgageX')]")).click();
        tryCatch500();
        driver.findElement(By.xpath("//p[contains(text(),'What information is given to agents during the auction process?')]")).click();
        tryCatch500();
        driver.findElement(By.xpath("//p[contains(text(),'Am I obligated to sign and close a mortgage with MortgageX?')]")).click();
        tryCatch500();
        driver.findElement(By.xpath("//p[contains(text(),'I cannot upload all my documents online')]")).click();
        tryCatch500();
        driver.findElement(By.xpath("//p[contains(text(),'What happens if I am stuck and need to talk to somebody?')]")).click();
        tryCatch500();
        driver.findElement(By.xpath("//button[contains(text(),'ABOUT MortgageX')]")).click();
        tryCatch500();
        driver.findElement(By.xpath("//p[contains(text(),'How is MortgageX different from the conventional mortgage process?')]")).click();
        tryCatch500();
        driver.findElement(By.xpath("//p[contains(text(),'MortgageX process is fast and simple, what happened to the rest of it?')]")).click();
        tryCatch500();
        driver.findElement(By.xpath("//p[contains(text(),'Is my information secure?')]")).click();
        tryCatch500();
        driver.findElement(By.xpath("//p[contains(text(),'How does MortgageX get me the best rate?')]")).click();
        tryCatch500();
        driver.findElement(By.xpath("//p[contains(text(),'Who are your lenders?')]")).click();
        tryCatch500();
        driver.findElement(By.xpath("//p[contains(text(),'Where does MortgageX operate?')]")).click();
        tryCatch500();
        driver.findElement(By.xpath("//p[contains(text(),'What types of mortgages do you arrange?')]")).click();
        tryCatch500();
    }
    /*-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+
    |                                                      Try/Catch                                                   |
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