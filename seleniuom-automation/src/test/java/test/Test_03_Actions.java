package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class Test_03_Actions {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickButton= driver.findElement(By.id("doubleClickBtn"));

        Actions action=new Actions(driver);
        action.doubleClick(doubleClickButton).perform();

        WebElement message= driver.findElement(By.id("doubleClickMessage"));
        String messageText= message.getText();
        System.out.println(messageText);

        WebElement rightClickButton= driver.findElement(By.id("rightClickBtn"));
        action.contextClick(rightClickButton).perform();

       WebElement rightClickMessage= driver.findElement(By.id("rightClickMessage"));
        System.out.println(rightClickMessage.getText());
    }
}
