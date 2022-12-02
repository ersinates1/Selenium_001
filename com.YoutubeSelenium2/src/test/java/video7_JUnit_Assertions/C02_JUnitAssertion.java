package video7_JUnit_Assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_JUnitAssertion {

    @Test
    public void test01() {
        // 1.Launch Browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2.Navigate to url

        driver.get("https://automationexercise.com");

        //3.Verify that home is visible succesfully
        WebElement logoElementi=driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(logoElementi.isDisplayed()); //isDisplayed görünüyor mu diye sorar?

        //4.Click on Product
        driver.findElement(By.xpath("//a[text()='Products']")).click();

        //5.Verify user is navigated to All Products page succesfully
        String expectedUrl="https://automationexercise.com/products";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        //6.Enter product name in search input and click search button
        WebElement aramaKutusu= driver.findElement(By.xpath("//input[@id='search_product']"));
        aramaKutusu.sendKeys("tshirt");
        driver.findElement(By.xpath("//button[id='submit_search']")).click();

        //7.Verify 'Search Product'
        WebElement aramaYapildiElementi= driver.findElement(By.xpath("h2[text()='Searched Products']"));
        Assert.assertTrue(aramaYapildiElementi.isDisplayed());

        //8.driveri kapat
        driver.close();





    }
}
