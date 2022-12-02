import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Practise {
    WebDriver driver;



    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

    }
    @Test
    public void Test() throws InterruptedException {

        WebElement firstnameBox= driver.findElement(By.cssSelector("input[name=firstname]"));
        firstnameBox.sendKeys("Ersin");

        Actions actions=new Actions(driver);
        Thread.sleep(1000);
        actions.sendKeys(Keys.TAB)
                .sendKeys("ateş").perform();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input[id=sex-0]")).click();
        driver.findElement(By.cssSelector("input[id=exp-4]")).click();
        Thread.sleep(1000);
        actions.sendKeys(Keys.TAB)
                .sendKeys("28/06/1995").perform();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#profession-1")).click();
        driver.findElement(By.cssSelector("input#tool-2")).click();


        //Seçim yapmak
       WebElement chooseContinent= driver.findElement(By.cssSelector("#continents"));
        Select slc=new Select(chooseContinent);
        slc.selectByVisibleText("Australia");


       WebElement seleiumCommands=driver.findElement(By.cssSelector("#selenium_commands"));
       slc=new Select(seleiumCommands);
       slc.selectByIndex(0);


    }
}
