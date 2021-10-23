package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaidUniversalCreditQuestionPage extends BasePage {
    @FindBy(how = How.XPATH, using = "//label[@for='yes-universal']")
    private WebElement yesUniversalCreditRadioButton;
    @FindBy(how = How.ID, using = "not-yet")
    private WebElement notYetUniversalCreditRadioButton;
    @FindBy(how = How.ID, using = "different-benefit")
    private WebElement differentBenefitRadioButton;

    public PaidUniversalCreditQuestionPage(WebDriver driver) {
        super(driver);
    }

    public void selectYesUniversalCreditRadioButton() {
        yesUniversalCreditRadioButton.click();
    }
}
