package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoqa.com/checkbox");

        //String homeCheckBoxCssValue="label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement homeCheckBox= driver.findElement(new By.ByCssSelector("label[for='tree-node-home'] span.rct-checkbox svg"));
        homeCheckBox.click();

        homeCheckBox= driver.findElement(new By.ByCssSelector("label[for='tree-node-home'] span.rct-checkbox svg"));

        String homeCheckBoxClassName=homeCheckBox.getAttribute("class");
        System.out.println(homeCheckBoxClassName);



    }

}
