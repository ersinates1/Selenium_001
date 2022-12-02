package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Test_17_DatePicker {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoqa.com/date-picker");
        WebElement  datePicker= driver.findElement(By.id("datePickerMonthYearInput"));
        datePicker.click();

        WebElement month=driver.findElement(By.className("react-datepicker__month-select"));
        Select select=new Select(month);
        select.selectByVisibleText("December");

        WebElement year=driver.findElement(By.className("react-datepicker__year-select"));
        select=new Select(year);
        select.selectByVisibleText("1995");
        List<WebElement> day=driver.findElements(By.cssSelector("div.react-datepicker__day"));

        for(WebElement i: day){
            String text=i.getText();
            if(text.equals("19")){
                i.click();
                break;
            }
        }



    }
}
