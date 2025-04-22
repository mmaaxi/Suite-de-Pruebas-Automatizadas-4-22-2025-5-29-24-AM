package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_008Page {

    WebDriver driver;

    private By exportButton = By.id("exportButton");
    private By ramoColumn = By.xpath("//th[contains(text(),'Ramo')]");
    private By folioPreSolicitudColumn = By.xpath("//th[contains(text(),'Folio Pre solicitud')]");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToExportPage() {
        driver.get("http://example.com/excel-export-page");
    }

    public void generateExcelExport() {
        driver.findElement(exportButton).click();
    }

    public boolean isFolioPreSolicitudColumnCorrectlyPlaced() {
        int ramoColumnIndex = driver.findElements(ramoColumn).size();
        int folioColumnIndex = driver.findElements(folioPreSolicitudColumn).size();
        return folioColumnIndex == ramoColumnIndex + 1;
    }
}