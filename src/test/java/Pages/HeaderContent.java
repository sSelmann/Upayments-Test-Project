package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderContent extends Parent {

    public HeaderContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='username username-hide-on-mobile']/following-sibling::i)[2]")
    private WebElement userDDMenu;

    @FindBy(xpath = "(//ul[@class='dropdown-menu info-logs']/li/a)[2]")
    private WebElement logOutButton;

    @FindBy(css="div[class='toast-message']")
    public static WebElement successMessage;

    WebElement myElement;

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "userDDMenu" : myElement =userDDMenu; break;
            case "logOutButton" : myElement =logOutButton; break;
        }

        clickFunction(myElement);
    }

}
