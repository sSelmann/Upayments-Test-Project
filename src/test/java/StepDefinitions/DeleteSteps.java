package StepDefinitions;

import Pages.BodyContent;
import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class DeleteSteps {

    DialogContent dc=new DialogContent();

    @And("Click on the element in the Dialog Content")
    public void clickOnTheElementInTheDialogContent(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            dc.findAndClick(listElement.get(i));
        }
    }
}
