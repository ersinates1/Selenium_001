package video4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebElements03 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1-https://www.bestbuy.com adresine gidin
        driver.get("https://www.bestbuy.com");

        //2-sayfada kaç adet button bulunduğunu yazdırın
        List<WebElement> buttonListesi=driver.findElements(By.tagName("button"));
        System.out.println(buttonListesi.size());

        //3-sayfadaki her bir button üzerindeki yaziları yazdırın
        for(WebElement i:buttonListesi){
            System.out.println(i.getText());
        }
    }
}
