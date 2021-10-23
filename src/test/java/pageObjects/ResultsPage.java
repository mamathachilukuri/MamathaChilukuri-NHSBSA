package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResultsPage extends BasePage {
    @FindBy(how = How.ID, using = "result-heading")
    private WebElement resultsHeading;
    @FindBy(how = How.ID, using = "prescription-tick")
    private WebElement prescriptionText;
    @FindBy(how = How.ID, using = "dental-exam-tick")
    private WebElement dentalExamText;
    @FindBy(how = How.ID, using = "dental-treatment-tick")
    private WebElement dentalTreatmentText;
    @FindBy(how = How.XPATH, using = "//div[@class='done-panel']")
    private WebElement doneResultText;


    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    public String getHeading() {
        return resultsHeading.getText();
    }


    public String getPrescriptionText() {
        return prescriptionText.getText();
    }

    public String getDentalExamText() {
        return dentalExamText.getText();
    }

    public String getDentalTreatmentText() {
        return dentalTreatmentText.getText();
    }

    public String getDonePanelText() {
        return doneResultText.getText();
    }
}
