package video5_junitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_BeforeClass_AfterClass_Notasyonu {
   static WebDriver driver;

    @BeforeClass
    public  static void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Downloads\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public static void tearDown(){driver.close();}

    @Test
    public  void test01(){
        driver.get("https:www.amazon.com");};

    @Test@Ignore
    public  void test02(){
        driver.get("https:www.bestbuy.com");
    }

    @Test
    public  void test03(){
        driver.get("https:www.facebook.com");
    }

}
