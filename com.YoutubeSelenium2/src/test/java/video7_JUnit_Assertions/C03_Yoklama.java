package video7_JUnit_Assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class C03_Yoklama {
    @Test
    public void test01() {
        // 1.Launch Browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2.Navigate to url

        driver.get("https://wisequarter.com/it-courses/");

        String expectedUrl="https://wisequarter.com/it-courses/";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

/*
       WebElement adKutusu= driver.findElement(By.xpath("//div[text()='Yanıtınız']"));
       adKutusu.sendKeys("SeleniumileFreeJavaYoklama");

        WebElement soyadKutusu=driver.findElement(By.xpath("//input[@aria-describedby='i6 i7']"));
        soyadKutusu.sendKeys("12345");

        WebElement mailKutusu=driver.findElement(By.xpath("//input[@aria-describedby='i10 i11']"));
        soyadKutusu.sendKeys("ahmet@nehaber.com");

*/
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.TAB)
                .sendKeys("SeleniumIleYoklama")
                .sendKeys(Keys.TAB)
                .sendKeys("ersinates")
                .sendKeys(Keys.TAB)
                .sendKeys("ersinates@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();




   //     driver.findElement(By.xpath("//span[text()='Gönder']")).click();



    }
}