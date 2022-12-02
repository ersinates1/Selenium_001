package video4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElements02 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com");
        //driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']"));
         WebElement epostaKutusu =driver.findElement(By.xpath("//input[@id='email']"));
        epostaKutusu.sendKeys("sjseojfse");
        WebElement  passKutusu= driver.findElement(By.xpath("//input[@id='pass']"));
        passKutusu.sendKeys("awdhadhw");
        driver.findElement(By.xpath("//button[@name='login']")).click();
        WebElement sonucYaziElementi= driver.findElement(By.xpath("//div[@class='_9ay7']"));
        String expectedSonucYazisi="Girdiğin e-posta veya cep telefonu numarası bir hesaba bağlı değil. Hesabını bul ve giriş yap.";
        String actualSonucYazisi=sonucYaziElementi.getText();
        if(expectedSonucYazisi.equals(actualSonucYazisi)){
            System.out.println("Girilemedi testi passed");
        }
        else{
            System.out.println("Girilemedi testi failed");
        }
       // driver.close();

    }
}
