import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Junit_Uygulama {
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
    //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://automationexercise.com");
        WebElement logoelementi= driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(logoelementi.isDisplayed());

        WebElement singup= driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        singup.click();

        WebElement loginYaziElementi= driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(loginYaziElementi.isDisplayed());

        WebElement emailAdresKutusu=driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        emailAdresKutusu.sendKeys("ersiinates@gmail.com");

        WebElement passwordAdresKutusu=driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        passwordAdresKutusu.sendKeys("12345");

        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

        WebElement loggedYazisi=driver.findElement(By.xpath("//a[text()=' Logged in as ']"));
        Assert.assertTrue(loggedYazisi.isDisplayed());

        driver.findElement(By.xpath("//a[@href='/logout']")).click();

        String expectedUrl="https://automationexercise.com/login";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
