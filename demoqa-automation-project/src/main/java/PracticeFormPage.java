import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage {

        private WebDriver driver;
        private final  By name= By.id("firstName");
     private final  By lastName= By.id("lastName");
     private final  By email= By.id("userEmail");

     private  GenderSection genderSection;


    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
        genderSection=new GenderSection(driver);
    }
    public GenderSection genderSection(){
        return this.genderSection;
    }

    public void setName(String nameAsString){
        WebElement nameSpace= driver.findElement(name);
        nameSpace.click();
        nameSpace.sendKeys(nameAsString);

     }
     public void setLastName(String lastNameAsString){
         WebElement nameSpace= driver.findElement(lastName);
         nameSpace.click();
         nameSpace.sendKeys(lastNameAsString);

     }
     public void setEmail(String emailAsString){
         WebElement nameSpace= driver.findElement(email);
         nameSpace.click();
         nameSpace.sendKeys(emailAsString);

     }
     public String getName(){
        WebElement nameSpace=driver.findElement(name);
        return  nameSpace.getAttribute("value"); //kutuya yazdıgımız ismi almak için
     }
    public String getLastname(){
        WebElement lastNameSpace=driver.findElement(lastName);
        return  lastNameSpace.getAttribute("value"); //kutuya yazdıgımız ismi almak için
    }
    public String getEmail(){
        WebElement emailSpace=driver.findElement(email);
        return  emailSpace.getAttribute("value"); //kutuya yazdıgımız emaili almak için
    }

}
