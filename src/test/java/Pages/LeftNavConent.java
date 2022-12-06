package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavConent extends Parent {

    public LeftNavConent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="//span[text()='Store']")
    private WebElement storeLeftNav;

    @FindBy(xpath="//a[text()='Products']")
    private WebElement productsUnderStoreLeftNav;

    WebElement myElement;
    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "storeLeftNav" : myElement =storeLeftNav; break;
            case "productsUnderStoreLeftNav" : myElement =productsUnderStoreLeftNav; break;
        }

        clickFunction(myElement);
    }

}
