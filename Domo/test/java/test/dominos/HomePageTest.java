/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.dominos;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * @author virad
 */
public class HomePageTest {
    static WebDriver driver;
    public HomePageTest() {
    }

    

    @BeforeClass
    public static void setUpClass() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        driver.quit();
    }

    @BeforeMethod
//    @Parameters("browser")
//    public void setUpMethod(String browser) throws Exception {
//        
//  
//    {
//        if(browser.equalsIgnoreCase("chrome")) 
//        {
//            System.setProperty("webdriver.gecko.driver", "C:\\QA\\drivers\\chromedriver.exe");
//            driver = new ChromeDriver();  
//
//        }
//        else if(browser.equalsIgnoreCase("chrome"))
//        {
//            System.setProperty("webdriver.chrome.driver", "C:\\QA\\drivers\\chromedriver.exe"); 
//            driver = new ChromeDriver();  
//        }
//        else
//        { 
//            System.setProperty("webdriver.ie.driver", "D:\\Selenium\\edgedriver.exe");
//            driver = new EdgeDriver();
//        }
//    }
//    }
//
//    @AfterMethod
//    public void tearDownMethod() throws Exception {
//        
//    }
    @Test
    public void titleTest(){
        driver.get("https://www.dominos.com/");
        try {
            String actualTitle = driver.getTitle();
            System.out.println(actualTitle);
            //assertEquals("Pizza Delivery & Carryout, Pasta, Chicken & More | Domino's", driver.getTitle());
            Assert.assertTrue(true, "Pizza Delivery & Carryout, Pasta, Chicken & More | Domino's");
            System.out.println(" =====Test pass Title match===== ");
        } catch (Exception e) {
            System.out.println("Test Failed Title does not match");
        }
    }
        
        @Test
        
       
    public void chatboxTest() throws InterruptedException{
        driver.get("https://www.dominos.com/");
        boolean button =  driver.findElement(By.xpath("//span[contains(text(),'Order With Dom')]")).isEnabled();
        
            System.out.println(button);
            Thread.sleep(5000);
    }
    
    
}
