package GAN_TASK.stepDefinitions;



import GAN_TASK.pages.registrationPage;

import org.junit.Test;

public class registrationStep {

    registrationPage loginPage = new registrationPage();


    @Test
    public void testTask1(){


        loginPage.setUP();
        loginPage.setJoinNowBtn();
        loginPage.setTitle();
        loginPage.setFirstName();
        loginPage.setLastName();
        loginPage.setCheckbox();
        loginPage.setJoinNowRegBtn();
        loginPage.setValidationTxt();



    }
}


