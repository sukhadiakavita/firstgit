/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.dominos;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author virad
 */
public class MenuTest {

    WebDriver driver;

    public MenuTest() {
    }

    // public void hello() {}
    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }

    @Test
    public void pizzaTest() throws InterruptedException {
        driver.get("https://www.dominos.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'Menu')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//h2[contains(text(),'Specialty Pizzas')]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        driver.findElement(By.xpath("//div[@id='js-categoryArea']/section/div/div[12]/a")).click();
        driver.findElement(By.id("Carryout")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //driver.findElement(By.linkText("Future Carryout Order - 572 W Army Trail Rd Carol Stream, IL")).click();
    }
}

