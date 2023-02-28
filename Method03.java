package Bonigarcia;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Method03 {



    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.harrow.gov.uk/");
        Thread.sleep(2000);
        driver.findElement(By.className("icon-fallback")).click();
        driver.findElement(By.id("username-input")).sendKeys("Savaliyarohit@gmail.com");
        driver.findElement(By.id("password-input")).sendKeys("Rohit!123");
        driver.findElement(By.id("submitBtnSignIn")).click();
    }
}
