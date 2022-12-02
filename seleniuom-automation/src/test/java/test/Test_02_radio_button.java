package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test_02_radio_button {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoqa.com/radio-button");

        WebElement yesradioButtonLabel= driver.findElement(new By.ByCssSelector("label[for='yesRadio']"));
        boolean isEnabled= yesradioButtonLabel.isEnabled();
        if (isEnabled) {
        yesradioButtonLabel.click();
            System.out.println("Clicked yesradioButton");
        }
        WebElement yesradioButton= driver.findElement(By.xpath("//input[@id='yesRadio']"));
        boolean isSelected= yesradioButton.isSelected();
        if(isSelected){
            System.out.println("Seçili");
        }



        WebElement output= driver.findElement(By.xpath("//p[@class='mt-3']"));
        System.out.println(output.getText());

        WebElement noRadio=driver.findElement(By.id("noRadio"));
        System.out.println(noRadio.isEnabled());


    }
}
