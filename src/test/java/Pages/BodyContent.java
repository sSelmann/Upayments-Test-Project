package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BodyContent extends Parent{

    public BodyContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(name="email")
    private WebElement emailInput;

    @FindBy(name="password")
    private WebElement passwordInput;

    @FindBy(css="[class='actions'] a:nth-child(2)")
    private WebElement addProductButton;

    @FindBy(css="div[class*='uploaded-image']")
    private WebElement uploadImageButton;

    @FindBy(css="button[type='submit']")
    private WebElement loginButton;

    @FindBy(id="product_name_en")
    private WebElement productNameEN;

    @FindBy(id="product_name_ar")
    private WebElement productNameAR;

    @FindBy(xpath="(//body[contains(@class, 'cke_editable')])")
    private WebElement productDesc;

    @FindBy(name="country_of_origin")
    private WebElement selectCountryOrigin;

    @FindBy(name="sku")
    private WebElement sku;

    @FindBy(name="weight_type")
    private WebElement weightType;

    @FindBy(name="length_type")
    private WebElement lengthType;

    @FindBy(name="weight")
    private WebElement weightValue;

    @FindBy(name="length")
    private WebElement lengthValue;

    @FindBy(name="width")
    private WebElement widthValue;

    @FindBy(name="height")
    private WebElement heightValue;

    @FindBy(name="video_url")
    private WebElement videoUrl;

    @FindBy(name="product_category")
    private WebElement selectProductCategory;

    @FindBy(name="product_price")
    private WebElement productPrice;

    @FindBy(name="product_sale_price")
    private WebElement productSalePrice;

    @FindBy(name="item_code")
    private WebElement itemCode;

    @FindBy(name="product_quantity")
    private WebElement productQuantity;

    @FindBy(name="daily_qty_limit")
    private WebElement dailyQuantityLimit;

    @FindBy(css="button[type='submit']")
    private WebElement productSumbitButton;

    @FindBy(css="div[class='toast-message']")
    private WebElement successMessage;

    @FindBy(name="product_name_en")
    private WebElement productNameInput;

    @FindBy(css=".ui-sortable td>span")
    private WebElement searchResults;
    WebElement myElement;
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "emailInput" : myElement =emailInput; break;
            case "passwordInput" : myElement =passwordInput; break;
            case "productNameEN" : myElement =productNameEN; break;
            case "productNameAR" : myElement =productNameAR; break;
            case "sku" : myElement =sku; break;
            case "weightValue" : myElement =weightValue; break;
            case "lengthValue" : myElement =lengthValue; break;
            case "widthValue" : myElement =widthValue; break;
            case "heightValue" : myElement =heightValue; break;
            case "videoUrl" : myElement =videoUrl; break;
            case "productPrice" : myElement =productPrice; break;
            case "productSalePrice" : myElement =productSalePrice; break;
            case "itemCode" : myElement =itemCode; break;
            case "productQuantity" : myElement =productQuantity; break;
            case "dailyQuantityLimit" : myElement =dailyQuantityLimit; break;
            case "productNameInput" : myElement =productNameInput; break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndSendToFrame(String strElement, String value, String frameIndex){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "productDesc" : myElement =productDesc; break;
        }

        sendKeysToFrameFunction(myElement, value, frameIndex);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "addProductButton" : myElement =addProductButton; break;
            case "uploadImageButton" : myElement =uploadImageButton; break;
            case "loginButton" : myElement =loginButton; break;
            case "productSumbitButton" : myElement =productSumbitButton; break;
        }

        clickFunction(myElement);
    }

    public void findAndSelect(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "selectCountryOrigin" : myElement =selectCountryOrigin; break;
            case "weightType" : myElement =weightType; break;
            case "lengthType" : myElement =lengthType; break;
            case "selectProductCategory" : myElement =selectProductCategory; break;
        }

        selectFunction(myElement, value);
    }

    public void uploadImage(String path){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        uploadImageFunction(path);
    }



    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "successMessage" : myElement =successMessage; break;
            case "searchResults" : myElement =searchResults; break;
        }

        verifyContainsText(myElement,text);
    }

}
