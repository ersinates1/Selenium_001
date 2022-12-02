package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test_11_Alert {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoqa.com/alerts");
     //   driver.findElement(By.id("alertButton")).click();
        driver.findElement(By.id("promtButton")).click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
       // System.out.println(driver.switchTo().alert().getText());//alert uzerınde yazan yazıyı aldı
        //driver.switchTo().alert().accept();//alert kabul edip kapatıyor

        driver.switchTo().alert().sendKeys("ersin");
        driver.switchTo().alert().accept();


    }
}
