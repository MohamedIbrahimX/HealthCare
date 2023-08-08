import org.testng.annotations.Test;

public class LoginScreenTests extends TestBase {
    private HomeScreen homeScreen;
    private LoginScreen loginScreen;

    //UserLogin
    @Test(priority = 1)
    public void LoginTC()
    {
        homeScreen = new HomeScreen(driver);
        loginScreen = homeScreen.clickOnLoginButton();
        loginScreen.EnterEmail("Doctor");
        loginScreen.EnterPassword("Doctor");
        loginScreen.ClickingOnLoginButton();
    }

    //AdminLogin
    @Test
    public void AdminLoginTC()
    {
        homeScreen = new HomeScreen(driver);
        loginScreen = homeScreen.clickOnLoginButton();
        loginScreen.EnterEmail("admin");
        loginScreen.EnterPassword("admin");
        loginScreen.ClickingOnLoginButton();
    }

}
