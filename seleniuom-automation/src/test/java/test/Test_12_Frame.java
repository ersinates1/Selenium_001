package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Test_12_Frame {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoqa.com/frames");
        //driver.switchTo().frame(0); --> index ile frame girdik
        driver.switchTo().frame("frame1");



        WebElement heading= driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
        String text= heading.getText();
        System.out.println(text);

        driver.switchTo().parentFrame();

        List<WebElement> elementList=driver.findElements(By.cssSelector("div[id='framesWrapper'] div"));
        String paragraf=elementList.get(0).getText();
        System.out.println(paragraf);

        driver.switchTo().frame("frame2");
        WebElement heading2= driver.findElement(By.id("sampleHeading"));
        String text2= heading2.getText();
        System.out.println(text2);
    }
}
