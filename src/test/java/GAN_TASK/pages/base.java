package GAN_TASK.pages;

import GAN_TASK.utility.configurationReader;
import GAN_TASK.utility.driverSetUp;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public abstract class base {


    public base() {
        PageFactory.initElements(driverSetUp.getDriver(), this);
    }

    public void setUP(){
        driverSetUp.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driverSetUp.getDriver().manage().window().maximize();
        driverSetUp.getDriver().get(configurationReader.getProperty("url"));
    }


}
