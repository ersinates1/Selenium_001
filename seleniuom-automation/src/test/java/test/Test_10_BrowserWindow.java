package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Test_10_BrowserWindow {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoqa.com/browser-windows");

        WebElement  tabButton= driver.findElement(By.id("tabButton"));
        tabButton.click();

        List<String> tabs=new ArrayList<>(driver.getWindowHandles());//acılan windowları listeye açtık
        System.out.println(tabs.size());//listede kaç tane window tab oldugunu gosterır
        driver.switchTo().window(tabs.get(1)); //1.indexdeki yere gıder
        System.out.println(driver.getCurrentUrl());


    }
}
