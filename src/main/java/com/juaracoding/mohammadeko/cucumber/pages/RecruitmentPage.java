package com.juaracoding.mohammadeko.cucumber.pages;

import com.juaracoding.mohammadeko.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RecruitmentPage {
    private WebDriver driver;

    public RecruitmentPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    WebElement menuRecruitment;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement txtRecruitment;

    @FindBy(xpath = "//input[@placeholder='From']")
    WebElement searchCandidateByDate;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div")
    WebElement txtCandidateName;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSearch;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement btnAdd;

    @FindBy(name = "firstName")
    WebElement firstname;

    @FindBy(name = "middleName")
    WebElement middlename;

    @FindBy(name = "lastName")
    WebElement lastname;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[1]")
    WebElement selectVacancy;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")
    WebElement contactNumber;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/input")
    WebElement uploadResume;

    @FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
    WebElement keywords;

    @FindBy(xpath = "//input[@placeholder='yyyy-mm-dd']")
    WebElement dateOfApplication;

    @FindBy(xpath = "//textarea[@placeholder='Type here']")
    WebElement notes;

    @FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement checklistConsent;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSave;

    @FindBy(xpath = "//h6[normalize-space()='Application Stage']")
    WebElement txtApplicationStage;

    public void menuRecruitment(){
        menuRecruitment.click();
    }

    public String getTxtRecruitment(){
        return txtRecruitment.getText();
    }

    public void searchCandidateByDate(String date){
        this.searchCandidateByDate.sendKeys(date);
    }

    public void clickBtnSearch() {
        btnSearch.click();
    }

    public String getTxtCandidateName(){
        return txtCandidateName.getText();
    }

    public void clickBtnAdd() {
        btnAdd.click();
    }

    public void fullname(String firstname, String middlename, String lastname) {
        this.firstname.sendKeys(firstname);
        this.middlename.sendKeys(middlename);
        this.lastname.sendKeys(lastname);
    }

    public void selectVacancy() {
        selectVacancy.sendKeys("A" + Keys.ENTER);
    }

    public void email(String email) {
        this.email.sendKeys(email);
    }

    public void contactNumber(String contactNumber) {
        this.contactNumber.sendKeys(contactNumber);
    }

    public void uploadResume(String locationFile) {
        this.uploadResume.sendKeys(locationFile);
    }

    public void keywords(String keyword) {
        this.keywords.sendKeys(keyword);
    }

    public void dateOfApplication(String date) {
        this.dateOfApplication.sendKeys(date);
    }

    public void notes(String notes) {
        this.notes.sendKeys(notes);
    }

    public void checklistConsent() {
        checklistConsent.click();
    }

    public void clickBtnSave() {
        btnSave.click();
    }

    public String getTxtApplicationStage() {
        return txtApplicationStage.getText();
    }
}

