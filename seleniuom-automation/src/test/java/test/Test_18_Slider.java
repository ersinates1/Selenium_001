package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Test_18_Slider {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoqa.com/slider");

        WebElement slider=driver.findElement(By.cssSelector("input[type='range']"));

        Actions action=new Actions(driver);
        action.dragAndDropBy(slider,10,0).perform();

        WebElement valueUnderSlider= driver.findElement(By.className("range-slider__tooltip__label"));
        String value=valueUnderSlider.getText();
        System.out.println("Recent Value: "+value);

        WebElement sliderValue=driver.findElement(By.id("sliderValue"));
        String sliderValueText=sliderValue.getAttribute("value");
        System.out.println("Slider Value: "+sliderValueText);



    }
}
