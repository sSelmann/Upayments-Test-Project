package StepDefinitions;

import Pages.BodyContent;
import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class DeleteSteps {

    DialogContent dc=new DialogContent();
    BodyContent bd=new BodyContent();

    @And("Click on the element in the Dialog Content")
    public void clickOnTheElementInTheDialogContent(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @Then("Click Delete Button in the Body Content")
    public void clickDeleteButtonInTheBodyContent(DataTable elements) {
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();

        js.executeScript("window.scrollBy(0,-200)");
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            bd.findAndClick(listElement.get(i));
        }

    }
}
