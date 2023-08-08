import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPharmacyScreen extends PageBase {
    public RegisterPharmacyScreen(WebDriver driver) {
        super(driver);
    }

    private By pharmacyType = By.className("");
    private WebElement pharmacyTypeElement;
    private By pharmacyNameField = By.className("");
    private WebElement pharmacyNameFiledElement;
    private By pharmacyDoctorNameField = By.className("");
    private WebElement pharmacyDoctorNameFieldElement;
    private By nationalDoctorIDField = By.className("");
    private WebElement nationalDoctorIDFieldElement;
    private By phoneNumberField = By.className("");
    private WebElement phoneNumberFieldElement;
    private By addressField = By.className("");
    private WebElement addressFieldElement;
    private By pharmacyIDField = By.className("");
    private WebElement pharmacyIDFieldElement;
    private By emailField = By.className("");
    private WebElement emailFieldElement;
    private By passwordField = By.className("");
    private WebElement passwordFieldElement;
    private By registerButton = By.className("");
    private WebElement registerButtonElement;

    public void SelectPharmacyType()
    {
        pharmacyTypeElement = driver.findElement(pharmacyType);
        Clicking(pharmacyTypeElement);
    }
    public void EnterPharmacyName(String phname)
    {
        pharmacyNameFiledElement = driver.findElement(pharmacyNameField);
        sendText(pharmacyNameFiledElement,phname);
    }
    public void EnterPharmacyDoctorName(String phdoctorname)
    {
        pharmacyDoctorNameFieldElement = driver.findElement(pharmacyDoctorNameField);
        sendText(pharmacyDoctorNameFieldElement,phdoctorname);
    }
    public void NationalDoctorId(String nationaldoctorid)
    {
        nationalDoctorIDFieldElement = driver.findElement(nationalDoctorIDField);
        sendText(nationalDoctorIDFieldElement,nationaldoctorid);
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
    public void PharmacyId(String phid)
    {
        pharmacyIDFieldElement = driver.findElement(pharmacyIDField);
        sendText(pharmacyIDFieldElement,phid);
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

    public PharmacyScreen clickingOnRegisterButton()
    {
        registerButtonElement = driver.findElement(registerButton);
        Clicking(registerButtonElement);
        return new PharmacyScreen(driver);
    }

}
