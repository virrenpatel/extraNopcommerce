package resources.testdata;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsPageTest extends BaseTest {

    ElectronicsPage electronicsPage = new ElectronicsPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        electronicsPage.mouseHoverOnElectronics();
        electronicsPage.mouseHoverOnCellPhonesAndClick();
        String expectedText = "Cell phones";
        Assert.assertEquals(electronicsPage.verifyTextCellPhones(),expectedText,"Cell phones");
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully(){

    }
}
