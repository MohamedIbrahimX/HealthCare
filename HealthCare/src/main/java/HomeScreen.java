import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeScreen extends PageBase {
    public HomeScreen(WebDriver driver) {
        super(driver);
    }

    By registerButton = By.xpath("");
    WebElement registerButtonElement;
    By loginButton = By.xpath("//*[@id=\"root\"]/nav/ul/li[2]/a");
    WebElement loginButtonElement;


    public RegisterDoctorScreen clickOnRegisterDoctorButton()
    {
        registerButtonElement = driver.findElement(registerButton);
        Clicking(registerButtonElement);
        return new RegisterDoctorScreen(driver);
    }
    public RegisterPharmacyScreen clickOnRegisterPharmacyButton()
    {
        registerButtonElement = driver.findElement(registerButton);
        Clicking(registerButtonElement);
        return new RegisterPharmacyScreen(driver);
    }

    public LoginScreen clickOnLoginButton()
    {
        loginButtonElement = driver.findElement(loginButton);
        Clicking(loginButtonElement);
        return new LoginScreen(driver);
    }


}
