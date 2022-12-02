import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)



public class BaseTest {
    protected    WebDriver driver;

    PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
    @BeforeAll
    public  void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        String baseUrl = "https://demoqa.com/automation-practice-form";
        driver.get(baseUrl);

        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println("Test initiated");
        practiceFormPage=new PracticeFormPage(driver);


    }

  /*  @AfterAll
    public void tearDown(){
        driver.quit();
        System.out.println("Test finished.");
    }

   */
}
