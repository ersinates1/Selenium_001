package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test_15_Accordions {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoqa.com/accordian");
        WebElement firstcard= driver.findElement(By.xpath("//*[@id=\"accordianContainer\"]/div/div[1]/div[2]"));
        String classname=firstcard.getAttribute("class");
        System.out.println(classname);


        driver.findElement(By.id("section1Heading")).click();


        classname=firstcard.getAttribute("class");
        System.out.println(classname);

        Thread Tread = null;
        Tread.sleep(1000);
        classname=firstcard.getAttribute("class");
        System.out.println(classname);

    }
}
