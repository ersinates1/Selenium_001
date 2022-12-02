package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test_05_Xpath {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoqa.com/dynamic-properties");

        WebElement textElement= driver.findElement(By.xpath("//div/p[text()='This text has random Id']"));
        String text=textElement.getText();
        System.out.println(text);

     //   WebElement firstButton= driver.findElement(By.id("enableAfter"));
     //   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
     //   wait.until(ExpectedConditions.elementToBeClickable(firstButton));
     //   firstButton.click();

        WebElement colorChangeButton= driver.findElement(By.id("colorChange"));
        String className=colorChangeButton.getAttribute("class");
        System.out.println("Before change: "+className);

     //   WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(5));
     //   wait.until(ExpectedConditions.attributeToBe(colorChangeButton,"class","mt-4 text-danger btn btn-primary"));
     //   className=colorChangeButton.getAttribute("class");
     //   System.out.println("After Change: "+className);


        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
         driver.findElement(By.id("visibleAfter")).click();



    }
}
