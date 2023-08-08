import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginScreen extends PageBase {
    public LoginScreen(WebDriver driver)
    {
        super(driver);
    }

    //UserLogin
    private By emailFiled = By.id("form2Example1");
    private WebElement emailFieldElement;
    private By passwordFiled = By.id("form2Example2");
    private WebElement passwordFieldElement;
    private By loginButton = By.className("LoginPageStyles_formButton__Wyw5H");
    private WebElement loginButtonElement;

    public void EnterEmail(String email)
    {
        emailFieldElement = driver.findElement(emailFiled);
        sendText(emailFieldElement,email);
    }
    public void EnterPassword(String password)
    {
        passwordFieldElement = driver.findElement(passwordFiled);
        sendText(passwordFieldElement,password);
    }
    public void ClickingOnLoginButton()
    {
        loginButtonElement = driver.findElement(loginButton);
        Clicking(loginButtonElement);
    }

}
