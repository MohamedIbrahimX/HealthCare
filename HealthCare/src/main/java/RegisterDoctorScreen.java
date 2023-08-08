import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterDoctorScreen extends PageBase {
    public RegisterDoctorScreen(WebDriver driver) {
        super(driver);
    }
    private By doctorType = By.className("");
    private WebElement doctorTypeElement;
    private By firstNameField = By.className("");
    private WebElement firstNameFiledElement;
    private By lastNameField = By.className("");
    private WebElement lastNameFieldElement;
    private By genderField = By.className("");
    private WebElement genderFieldElement;
    private By nationalIDField = By.className("");
    private WebElement nationalIDFieldElement;
    private By phoneNumberField = By.className("");
    private WebElement phoneNumberFieldElement;
    private By addressField = By.className("");
    private WebElement addressFieldElement;
    private By jobTitleField = By.className("");
    private WebElement jobTitleFieldElement;
    private By emailField = By.className("");
    private WebElement emailFieldElement;
    private By passwordField = By.className("");
    private WebElement passwordFieldElement;
    private By registeButton = By.className("");
    private WebElement registerButtonElement;

    public void SelectDoctorType()
    {
        doctorTypeElement = driver.findElement(doctorType);
        Clicking(doctorTypeElement);
    }
    public void EnterFirstName(String fname)
    {
        firstNameFiledElement = driver.findElement(firstNameField);
        sendText(firstNameFiledElement,fname);
    }
    public void EnterLastName(String lname)
    {
        lastNameFieldElement = driver.findElement(lastNameField);
        sendText(lastNameFieldElement,lname);
    }
    public void NationalId(String nationalid)
    {
        nationalIDFieldElement = driver.findElement(nationalIDField);
        sendText(nationalIDFieldElement,nationalid);
    }
    public void PhoneNumber(String phonenumber)
    {
        phoneNumberFieldElement = driver.findElement(phoneNumberField);
        sendText(phoneNumberFieldElement,phonenumber);
    }
    public void Address(String address)
    {
        addressFieldElement = driver.findElement(addressField);
        sendText(addressFieldElement,address);
    }
    public void JobTitle(String jobtitle)
    {
        jobTitleFieldElement = driver.findElement(jobTitleField);
        sendText(jobTitleFieldElement,jobtitle);
    }
    public void Email(String email)
    {
        emailFieldElement = driver.findElement(emailField);
        sendText(emailFieldElement,email);
    }
    public void Password(String password)
    {
        passwordFieldElement = driver.findElement(passwordField);
        sendText(passwordFieldElement,password);
    }

    public void chooseGender()
    {
        genderFieldElement = driver.findElement(genderField);
        Clicking(genderFieldElement);
    }
    public DoctorScreen clickingOnRegisterButton()
    {
        registerButtonElement = driver.findElement(registeButton);
        Clicking(registerButtonElement);
        return new DoctorScreen(driver);
    }

}
