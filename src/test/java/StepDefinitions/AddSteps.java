package StepDefinitions;

import Pages.BodyContent;
import Pages.LeftNavConent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class AddSteps {
    BodyContent bc=new BodyContent();
    LeftNavConent lnc=new LeftNavConent();

    @Given("Navigate to Upayments")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://upay.upayments.com/auth/login");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Click on the element in the Body Content")
    public void clickOnTheElementInTheHeaderContent(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            bc.findAndClick(listElement.get(i));
        }

    }

    @When("Send on the element in the Body Content")
    public void sendOnTheElementInTheBodyContent(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            bc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @Then("Click on the element in the Left Nav Content")
    public void clickOnTheElementInTheLeftNavContent(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            lnc.findAndClick(listElement.get(i));
        }

    }

    @Then("Upload product image")
    public void uploadProductImage(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++) {
            bc.findAndClick(listElement.get(i).get(0));
            bc.uploadImage(listElement.get(i).get(1));
        }


    }

    @Then("Send on the element in the Frame")
    public void sendOnTheElementInTheFrame(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            bc.findAndSendToFrame(listElement.get(i).get(0), listElement.get(i).get(1),listElement.get(i).get(2));

    }

    @And("Select on the element in the Body Content")
    public void selectOnTheElementInTheBodyContent(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            bc.findAndSelect(listElement.get(i).get(0), listElement.get(i).get(1));

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            bc.findAndContainsText(listElement.get(i).get(0), listElement.get(i).get(1));
    }
}
