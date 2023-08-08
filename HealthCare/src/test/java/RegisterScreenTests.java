import org.testng.annotations.Test;

public class RegisterScreenTests extends TestBase {

    private HomeScreen homeScreen;
    private RegisterDoctorScreen registerDoctorScreen;

    private RegisterPharmacyScreen registerPharmacyScreen;

    //DoctorRegister
    @Test
    public void RegisterDoctorTC()
    {
        homeScreen = new HomeScreen(driver);
        registerDoctorScreen = homeScreen.clickOnRegisterDoctorButton();
        registerDoctorScreen.SelectDoctorType();
        registerDoctorScreen.EnterFirstName("Mohamed");
        registerDoctorScreen.EnterLastName("Ibrahim");
        registerDoctorScreen.chooseGender();
        registerDoctorScreen.Address("4 Street Mohamed Hassan");
        registerDoctorScreen.Email("medoibrahim244@gmail.com");
        registerDoctorScreen.JobTitle("Emergency doctor");
        registerDoctorScreen.NationalId("30234567891213");
        registerDoctorScreen.PhoneNumber("01201234567");
        registerDoctorScreen.Password("assdfggh123");
        registerDoctorScreen.clickingOnRegisterButton();
    }

    //PharmacyRegister
    @Test
    public void RegisterPharmacyTC()
    {
        homeScreen = new HomeScreen(driver);
        registerPharmacyScreen = homeScreen.clickOnRegisterPharmacyButton();
        registerPharmacyScreen.SelectPharmacyType();
        registerPharmacyScreen.EnterPharmacyName("El Azabi");
        registerPharmacyScreen.Address("New Cairo");
        registerPharmacyScreen.Email("elazabi23@gmail.com");
        registerPharmacyScreen.PhoneNumber("01235475478");
        registerPharmacyScreen.PharmacyId("78945612345698");
        registerPharmacyScreen.EnterPharmacyDoctorName("Mohamed Elazabi");
        registerPharmacyScreen.NationalDoctorId("30102581473697");
        registerPharmacyScreen.Password("elazabii12");
        registerPharmacyScreen.clickingOnRegisterButton();
    }
}
