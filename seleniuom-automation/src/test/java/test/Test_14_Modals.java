package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test_14_Modals {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoqa.com/modal-dialogs");
        WebElement smalmodalButton= driver.findElement(By.id("showSmallModal"));
        smalmodalButton.click();

        WebElement modalText=driver.findElement(By.cssSelector("div.modal-body"));
        System.out.println(modalText.getText());
        WebElement closeButton= driver.findElement(By.id("closeSmallModal"));
        closeButton.click();

    }
}
