package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Test_09_Upload {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoqa.com/upload-download");

        WebElement uploadFileButton= driver.findElement(By.xpath("//*[@id=\"uploadFile\"]"));
        Actions action=new Actions(driver);
       uploadFileButton.sendKeys("C:\\Users\\ersin\\Downloads\\sampleFile.jpeg");//upload yaparken clıck degıl sendkeys yapılır
    }
}
