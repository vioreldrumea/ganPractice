package GAN_TASK.pages;

import GAN_TASK.utility.browserSetUp;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class registrationPage extends base {

    Faker dummyData = new Faker();

    @FindBy(xpath = "//a[contains(text(),'Join Now!')]")
    protected WebElement JoinNowBtn;

    @FindBy(id = "title")
    protected WebElement title;

    @FindBy(name = "map(firstName)")
    protected WebElement firstName;

    @FindBy(name = "map(lastName)" )
    protected WebElement lastName;

    @FindBy(name = "map(terms)")
    protected WebElement checkbox;

    @FindBy(xpath = "//*[@class='promoReg green']")
    protected WebElement joinNowRegBtn;

    @FindBy(xpath = "//*[@for='dob']")
    protected WebElement validationTxt;



    public void setJoinNowBtn(){
        JoinNowBtn.click();
    }

    public void setTitle(){
        Select selectTitle = new Select(title);
        selectTitle.selectByIndex(2);
    }

    public void setFirstName(){
        firstName.sendKeys(dummyData.name().firstName());
    }

    public void setLastName(){
        lastName.sendKeys(dummyData.name().lastName());
    }



    public void setCheckbox(){
        checkbox.click();
        browserSetUp.wait(1);
        Assert.assertTrue("Check box 'I accept the Terms and Conditions and certify that i am over the age of 18' is selected",checkbox.isSelected());
    }

    public void setJoinNowRegBtn(){
        joinNowRegBtn.click();
    }

    public void setValidationTxt(){
        Assert.assertEquals("This field is required", validationTxt.getText());
    }


}
