package StepDefinitions;

import Pages.BodyContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class EditSteps {

    BodyContent bd=new BodyContent();
    @And("Click Edit Button in the Body Content")
    public void clickEditButtonInTheBodyContent(DataTable elements) {

        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();

        js.executeScript("window.scrollBy(0,-50)");
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            bd.findAndClick(listElement.get(i));
        }

    }
}
