package GAN_TASK.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class driverSetUp {

    private static WebDriver driver;

    private driverSetUp(){}

    public static WebDriver getDriver(){
        if(driver==null){
            String browser = configurationReader.getProperty("browser");
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                default:
                    throw new RuntimeException("No such a browser!");
            }
        }

        return driver;
    }

    public static void closeDriver(){
        if( driver != null )
            driver.quit();
        driver = null;
    }
}
