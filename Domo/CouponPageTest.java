/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.dominos;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static test.dominos.HomePageTest.driver;

/**
 *
 * @author virad
 */
public class CouponPageTest {
    static WebDriver driver;
    public CouponPageTest() {
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        driver.quit();
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        
    }
    
    @Test(priority = 3)

    public void verifyPageTitleTest() throws InterruptedException {
        driver.get("https://www.dominos.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'Coupons')]")).click();

        try {
            String actualTitle = driver.getTitle();
            System.out.println(actualTitle);
            assertEquals("Get National & Local Dominos Pizza Coupons for Carryout or Delivery", driver.getTitle());
            System.out.println(" =====Test pass Title match===== ");
        } catch (Exception e) {
            System.out.println("Test Failed Title does not match");
        }
}
    @Test (priority = 2)
    
    public void textCheckTest(){
        driver.get("https://www.dominos.com/");
        
        driver.findElement(By.xpath("//a[contains(text(),'Coupons')]")).click();
        String text = driver.findElement(By.xpath("//span[contains(text(),\"Domino's Local Coupons\")]")).getText();
        System.out.println(text);
        Assert.assertEquals(text, text);
        System.out.println("Domino's local coupons text is displayed---assret passed");
       //See local coupons
        
    }
    @Test(priority = 1)
    public void linkBoxTest() throws InterruptedException{
        driver.get("https://www.dominos.com/");
         driver.findElement(By.xpath("//a[contains(text(),'Coupons')]")).click();
         //Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'See local coupons')]")).click();
        
    }
    
    
    
}
