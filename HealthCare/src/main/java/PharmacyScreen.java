import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PharmacyScreen extends PageBase{
    public PharmacyScreen(WebDriver driver) {
        super(driver);
    }

    private By selectMedicine = By.className("");
    private WebElement selectMedicineElement;
    private By addQuantityFiled = By.className("");
    private WebElement addQuantityFiledElement;
    private By donateButton = By.className("");
    private WebElement donateButtonElement;

    public void SelectMedicine()
    {
        selectMedicineElement = driver.findElement(selectMedicine);
        Clicking(selectMedicineElement);
    }
    public void AddQuantity(String addquantity)
    {
        addQuantityFiledElement = driver.findElement(addQuantityFiled);
        sendText(addQuantityFiledElement,addquantity);
    }
    public void DonateButton()
    {
        donateButtonElement = driver.findElement(donateButton);
        Clicking(donateButtonElement);
    }

}
