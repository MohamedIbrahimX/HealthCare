import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminScreen extends PageBase{
    public AdminScreen(WebDriver driver) {
        super(driver);
    }

    private By addAdminButton = By.className("");
    private WebElement addAdminButtonElement;

    private By addDoctorButton = By.className("");
    private WebElement addDoctorButtonElement;
    private By addPharmacyButton = By.className("");
    private WebElement addPharmacyButtonElement;
    private By addMedicalConvoyButton = By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div[1]");
    private WebElement addMedicalConvoyButtonElement;
    private By medicalConvoyAddress = By.id("address");
    private WebElement medicalConvoyaddressElement;
    private By medicalConcoyId = By.className("");
    private WebElement medicalConvoyIdElement;
    private By medicalConvoyStartDate = By.id("start_data");
    private WebElement medicalConvoyStartDateElement;
    private By medicalConvoyEndDate = By.className("");
    private WebElement medicalConvoyEndDateElement;

    private By submitMedicalConvoyButton = By.xpath("//*[@id=\"right_part\"]/div/form/div[3]/button");
    private WebElement submitMedicalConvoyButtonElement;

    private By requestsButton = By.className("");
    private WebElement requestsButtonElement;
    private By acceptRequestsButton = By.className("");
    private WebElement acceptRequestsButtonElement;
    private By rejectRequestsButton = By.className("");
    private WebElement rejectRequestsButtonElement;

    public void AddAdminButton()
    {
        addAdminButtonElement = driver.findElement(addAdminButton);
        Clicking(addAdminButtonElement);
    }
    public void AddDoctorButton()
    {
        addDoctorButtonElement = driver.findElement(addDoctorButton);
        Clicking(addDoctorButtonElement);
    }
    public void AddPharmacyButton()
    {
        addPharmacyButtonElement = driver.findElement(addPharmacyButton);
        Clicking(addPharmacyButtonElement);
    }
    public void AddMedicalConvoyButton()
    {
        addMedicalConvoyButtonElement = driver.findElement(addMedicalConvoyButton);
        Clicking(addMedicalConvoyButtonElement);
    }
    public void EnterMedicalConvoyAddress(String medical_convoy_address)
    {
        medicalConvoyaddressElement = driver.findElement(medicalConvoyAddress);
        sendText(medicalConvoyaddressElement,medical_convoy_address);
    }
    public void EnterMedicalConvoyID(String medical_convoy_id)
    {
        medicalConvoyIdElement = driver.findElement(medicalConcoyId);
        sendText(medicalConvoyIdElement,medical_convoy_id);
    }
    public void EnterMedicalConvoyStartDate(String medical_convoy_start_date)
    {
        medicalConvoyStartDateElement = driver.findElement(medicalConvoyStartDate);
        sendText(medicalConvoyStartDateElement,medical_convoy_start_date);
    }
    public void EnterMedicalConvoyEndDate(String medical_convoy_end_date)
    {
        medicalConvoyEndDateElement = driver.findElement(medicalConvoyEndDate);
        sendText(medicalConvoyEndDateElement,medical_convoy_end_date);
    }
    public void SubmitMedicalConvoyButton()
    {
        submitMedicalConvoyButtonElement = driver.findElement(submitMedicalConvoyButton);
        Clicking(submitMedicalConvoyButtonElement);
    }
    public void RequestsButton()
    {
        requestsButtonElement = driver.findElement(requestsButton);
        Clicking(requestsButtonElement);
    }
    public void AcceptRequestsButton()
    {
        acceptRequestsButtonElement = driver.findElement(acceptRequestsButton);
        Clicking(acceptRequestsButtonElement);
    }
    public void RejectRequestsButton()
    {
        rejectRequestsButtonElement = driver.findElement(rejectRequestsButton);
        Clicking(rejectRequestsButtonElement);
    }
}
