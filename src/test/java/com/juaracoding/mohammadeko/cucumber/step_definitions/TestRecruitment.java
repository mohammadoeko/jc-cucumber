package com.juaracoding.mohammadeko.cucumber.step_definitions;

import com.juaracoding.mohammadeko.cucumber.pages.RecruitmentPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestRecruitment {
    WebDriver driver;
    private static ExtentTest extentTest;
    private RecruitmentPage recruitmentPage = new RecruitmentPage();

    public TestRecruitment() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Test case one
    @When("User click menus recruitment")
    public void user_click_menus_recruitment() {
//		Hooks.delay(1);
        recruitmentPage.menuRecruitment();
        extentTest.log(LogStatus.PASS, "User click menus recruitment");
    }

    @Then("User on menu recruitment")
    public void user_on_menu_recruitment() {
        Assert.assertEquals(recruitmentPage.getTxtRecruitment(), "Recruitment");
        extentTest.log(LogStatus.PASS, "User on menu recruitment");
    }

    //Test case two
    @When("User select search Linda Anderson by hiring manager")
    public void user_select_by_hiring_manager() {
        recruitmentPage.searchByHiringManager();
        extentTest.log(LogStatus.PASS, "User select search Linda Anderson by hiring manager");
    }

    @And("User click button search")
    public void user_click_button_search() {
        recruitmentPage.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "User click button search");
    }

    @Then("User showing Linda Jane Anderson by hiring manager")
    public void user_showing_linda_jane_anderson_by_hiring_manager() {
        Assert.assertTrue(recruitmentPage.getTxtLinda().contains("Linda"));
    }
}
