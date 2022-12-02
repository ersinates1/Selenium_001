import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Junit_Uygulama2 {

    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("http://automationexercise.com");

        String expectedUrl="https://automationexercise.com/";
        String currentUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,currentUrl);

        driver.findElement(By.xpath("//a[@href='/products']")).click();

        WebElement productsLogo= driver.findElement(By.xpath("//img[@src='/static/images/shop/sale.jpg']"));
        Assert.assertTrue(productsLogo.isDisplayed());

        WebElement searchBox= driver.findElement(By.xpath("//input[@type='text']"));
        searchBox.sendKeys("nutella");
        driver.findElement(By.xpath("//button[@id='submit_search']")).click();

        WebElement searchedProduct= driver.findElement(By.xpath("//h2[text()='Searched Products']"));
        Assert.assertTrue(searchedProduct.isDisplayed());

        driver.close();


    }
}
