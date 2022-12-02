package video2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back(); //amazona gitti
        driver.navigate().forward(); // facebook'a gitti
        driver.navigate().refresh(); // sayfayi yeniledi
        driver.quit(); // tüm sekmeleri kapattı


    }
}
