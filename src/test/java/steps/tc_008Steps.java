package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_008Page;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("I am on the Excel export page")
    public void iAmOnTheExcelExportPage() {
        page.navigateToExportPage();
    }

    @When("I generate the Excel export")
    public void iGenerateTheExcelExport() {
        page.generateExcelExport();
    }

    @Then("I should see 'Folio Pre solicitud' column added right of the 'Ramo' column without values")
    public void iShouldSeeFolioPreSolicitudColumn() {
        Assert.assertTrue(page.isFolioPreSolicitudColumnCorrectlyPlaced());
    }
}