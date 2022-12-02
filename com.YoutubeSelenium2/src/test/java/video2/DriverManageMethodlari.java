package video2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

/*
        driver.manage().window().setSize(new Dimension(900,750));
        driver.manage().window().setPosition(new Point(15,65));
        System.out.println("Yeni pencere ölçüleri: "+driver.manage().window().getSize());
        System.out.println("Yeni pencere konumu" +driver.manage().window().getPosition());

        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.manage().window().minimize();
        */


    }

}
