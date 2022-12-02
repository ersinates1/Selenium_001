package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.time.Duration;

public class Test_08_DownLoad {
    public static void main(String[] args) {
        //siteden inen dosyları indirilenlerde bulma

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoqa.com/upload-download");
        WebElement downloadButton= driver.findElement(By.xpath("//*[@id=\"downloadButton\"]"));
        Actions action=new Actions(driver);
        downloadButton.click();

        String path="C:\\Users\\ersin\\Downloads";//dosyanın indiği yer
        String fileName="sampleFile.jpeg";
        boolean isDownloaded=isFileDownloaded(path,fileName);
        System.out.println(isDownloaded);

    }
    public static boolean isFileDownloaded(String downloadPath,String fileName){
        File file=new File(downloadPath);
        File[]files=file.listFiles();

        for(int i=0;i<files.length;i++){
            if(files[i].getName().equals(fileName));
            files[i].delete();
            return true;
        }

        return false;
    }


}
