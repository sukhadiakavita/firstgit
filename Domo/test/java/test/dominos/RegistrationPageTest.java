/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.dominos;

import come.dominos.FileUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
public class RegistrationPageTest {

    static WebDriver driver;

    public RegistrationPageTest() {
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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

    @Test
    public void registrationTest() throws InterruptedException, IOException {
        driver.get("https://www.dominos.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Sign in & earn rewards')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Join Now')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("nameFirst")).sendKeys(FileUtil.readForm().getName());
        driver.findElement(By.name("nameLast")).sendKeys(FileUtil.readForm().getlName());
        driver.findElement(By.name("email")).sendKeys(FileUtil.readForm().getEmail());
        Thread.sleep(3000);
        driver.findElement(By.name("emailConfirm")).sendKeys(FileUtil.readForm().getConfEmail());
        driver.findElement(By.name("phone")).sendKeys("12345660");
        driver.findElement(By.name("password")).sendKeys(FileUtil.readForm().getPass());
        driver.findElement(By.name("passwordConfirm")).sendKeys(FileUtil.readForm().getConfPass());//
        driver.findElement(By.xpath("//button[contains(text(),'Join Now')]")).click();

    }
}
