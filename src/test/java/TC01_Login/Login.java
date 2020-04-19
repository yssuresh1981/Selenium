package TC01_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

    WebDriver driver;
    @Test
    public void login() throws Exception {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        driver =new ChromeDriver();
        driver.manage().window().maximize() ;

        driver.manage().deleteAllCookies();




        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        //driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        driver.quit();


    }
}
