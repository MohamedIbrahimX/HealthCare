import org.testng.annotations.Test;

public class PharmacyScreenTests extends TestBase{

    private RegisterPharmacyScreen registerPharmacyScreen;
    private  PharmacyScreen pharmacyScreen;

    @Test
    public void PharmacyTC()
    {
        pharmacyScreen.SelectMedicine();
        pharmacyScreen.AddQuantity("50");
        pharmacyScreen.DonateButton();
    }
}
