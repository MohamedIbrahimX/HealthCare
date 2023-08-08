import org.testng.annotations.Test;

public class AdminScreenTests extends TestBase{
    private AdminScreen adminScreen;

    @Test
    public void AddAdminTC1()
    {
        adminScreen.AddAdminButton();
    }
    @Test
    public void AddDoctorTC2()
    {
        adminScreen.AddDoctorButton();
    }
    @Test
    public void AddPharmacyTC3()
    {
        adminScreen.AddPharmacyButton();
    }
    @Test
    public void AddMedicalConvoyTC4()
    {
        adminScreen.AddMedicalConvoyButton();
        adminScreen.EnterMedicalConvoyAddress("Sohag");
        adminScreen.EnterMedicalConvoyID("50");
        adminScreen.EnterMedicalConvoyStartDate("15-8-2023");
        adminScreen.EnterMedicalConvoyEndDate("19-8-2023");
        adminScreen.SubmitMedicalConvoyButton();
    }
    @Test
    public void AcceptRequestsTC5()
    {
        adminScreen.RequestsButton();
        adminScreen.AcceptRequestsButton();
    }
    @Test
    public void RejectRequestsTC5()
    {
        adminScreen.RequestsButton();
        adminScreen.RejectRequestsButton();
    }
}
