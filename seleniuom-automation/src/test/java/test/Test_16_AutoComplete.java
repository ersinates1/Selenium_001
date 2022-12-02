package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Test_16_AutoComplete {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoqa.com/auto-complete");
        WebElement input= driver.findElement(By.id("autoCompleteSingleInput"));
        input.sendKeys("R");

        List<WebElement> suggestions=driver.findElements(By.cssSelector("div.auto-complete__option"));
        for(WebElement i:suggestions){
            String text=i.getText();
            System.out.println(i.getText());

            if(text.toLowerCase().contains("r")){
                System.out.println(text+" has r letter");
            }
        }
            suggestions.get(0).click();

    }

}
