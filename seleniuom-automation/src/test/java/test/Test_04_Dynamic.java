package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test_04_Dynamic {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoqa.com/buttons");

        WebElement dynamicClickButton= driver.findElement(By.xpath("//div[last()]/button"));
        dynamicClickButton.click();
        ////div/button[starts-with(text(),'Click Me')]
        //div[last()]/button
    }
}
