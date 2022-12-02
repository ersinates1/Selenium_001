package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test_13_NestedFrame {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoqa.com/nestedframes");
        driver.switchTo().frame("frame1");
        WebElement parenBody= driver.findElement(By.tagName("body"));
        System.out.println(parenBody.getText());// ilk frame için dogrulama

        driver.switchTo().frame(0);
        WebElement p=driver.findElement(By.tagName("p"));
        System.out.println(p.getText());



    }
}
