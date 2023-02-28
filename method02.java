package Bonigarcia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.DriverManager;

public class method02 {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lloydsbank.com/");

        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/div/div/div[1]/div[2]/a[1]/span")).click();
        driver.findElement(By.id("frmLogin:strCustomerLogin_userID")).sendKeys("Rohitsavaliya@gmanil.con");
        driver.findElement(By.id("frmLogin:strCustomerLogin_pwd")).sendKeys("Rohit@123");
        driver.findElement(By.id("frmLogin:btnLogin1")).click();
    }

}
