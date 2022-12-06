package StepDefinitions;

import Pages.BodyContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class SearchSteps {

    BodyContent bc=new BodyContent();
    @Then("Verify search results")
    public void verifySearchResults(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            bc.findAndContainsText(listElement.get(i).get(0), listElement.get(i).get(1));

    }

    @Then("Search and press enter")
    public void searchAndPressEnter(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++) {
            bc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
        Actions actions=new Actions(GWD.getDriver());
        Action action=actions.click().keyDown(Keys.ENTER).build();
        action.perform();

    }
}
