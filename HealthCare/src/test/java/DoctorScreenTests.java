import org.testng.annotations.Test;

public class DoctorScreenTests extends TestBase {
    private RegisterDoctorScreen registerScreen;
    private DoctorScreen doctorScreen;

    @Test
    public void DoctorTC()
    {
        doctorScreen.CreatePatientProfile();
        doctorScreen.EnterFullName("Ahmed Mohamed");
        doctorScreen.EnterAddress("Mansora");
        doctorScreen.ChooseGender();
        doctorScreen.EnterAge("45");
        doctorScreen.EnterDiseaseType("shortness of breath");
        doctorScreen.EnterCaseType("Urgent");
        doctorScreen.EnterMedicinesNames("Salamol");
        doctorScreen.EnterNationalID("30107894561235");
        doctorScreen.EnterPhoneNumber("0111298745");
        doctorScreen.clickOnSubmitButton();
    }

    @Test(priority = 2)
    public void DoctorTC2()
    {
        doctorScreen.SeeMedicalConvoyButton();
        doctorScreen.RequestToJoinButton();
    }
}
