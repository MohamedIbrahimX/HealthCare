import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DoctorScreen extends PageBase {

    public DoctorScreen(WebDriver driver) {
        super(driver);
    }

    private By createPatientProfile = By.className("");
    private WebElement createPatientProfileElement;
    private By fullNameFiled = By.className("");
    private WebElement fullNameFiledElement;
    private By genderFiled = By.className("");
    private WebElement genderFiledElement;
    private By addressFiled = By.className("");
    private WebElement addressFiledElement;
    private By ageFiled = By.className("");
    private WebElement ageFiledElement;
    private By phoneNumberFiled = By.className("");
    private WebElement phoneNumberFiledElement;
    private By nationalIDFiled = By.className("");
    private WebElement nationalIDFiledElement;
    private By diseaseTypeFiled = By.className("");
    private WebElement diseaseTypeFiledElement;
    private By medicinesNamesFiled = By.className("");
    private WebElement medicinesNamesFiledElement;
    private By caseTypeFiled = By.className("");
    private WebElement caseTypeFiledElement;
    private By submitButton = By.className("");
    private WebElement submitButtonElement;

    private By seeMedicalConvoysButton = By.xpath("//*[@id=\"root\"]/nav/ul/li[2]/a");
    private WebElement seeMedicalConvoysButtonElement;
    private By requestJoinButton = By.xpath("//*[@id=\"root\"]/div/div/a[1]/div/div[2]/button");
    private WebElement requestJoinButtonElement;

    public void CreatePatientProfile()
    {
        caseTypeFiledElement = driver.findElement(caseTypeFiled);
        Clicking(createPatientProfileElement);
    }
    public void EnterFullName(String fullname)
    {
        fullNameFiledElement = driver.findElement(fullNameFiled);
        sendText(fullNameFiledElement,fullname);
    }
    public void EnterAddress(String address)
    {
        addressFiledElement = driver.findElement(addressFiled);
        sendText(addressFiledElement,address);
    }
    public void EnterAge(String age)
    {
        ageFiledElement = driver.findElement(ageFiled);
        sendText(ageFiledElement,age);
    }
    public void EnterPhoneNumber(String phonenumber)
    {
        phoneNumberFiledElement = driver.findElement(phoneNumberFiled);
        sendText(phoneNumberFiledElement,phonenumber);
    }
    public void EnterNationalID(String nationalid)
    {
        nationalIDFiledElement = driver.findElement(nationalIDFiled);
        sendText(nationalIDFiledElement,nationalid);
    }
    public void EnterDiseaseType(String diseasetype)
    {
        diseaseTypeFiledElement = driver.findElement(diseaseTypeFiled);
        sendText(diseaseTypeFiledElement,diseasetype);
    }
    public void EnterMedicinesNames(String medicinesnames)
    {
        medicinesNamesFiledElement = driver.findElement(medicinesNamesFiled);
        sendText(medicinesNamesFiledElement,medicinesnames);
    }
    public void EnterCaseType(String casetype)
    {
        caseTypeFiledElement = driver.findElement(caseTypeFiled);
        sendText(createPatientProfileElement,casetype);
    }
    public void ChooseGender()
    {
        genderFiledElement = driver.findElement(genderFiled);
        Clicking(genderFiledElement);
    }
    public void clickOnSubmitButton()
    {
        submitButtonElement = driver.findElement(submitButton);
        Clicking(submitButtonElement);
    }

    public void SeeMedicalConvoyButton()
    {
        submitButtonElement = driver.findElement(seeMedicalConvoysButton);
        Clicking(seeMedicalConvoysButtonElement);
    }
    public void RequestToJoinButton()
    {
        requestJoinButtonElement = driver.findElement(requestJoinButton);
        Clicking(requestJoinButtonElement);
    }

}
