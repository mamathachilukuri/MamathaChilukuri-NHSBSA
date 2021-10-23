package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CountrySelectionPage extends BasePage {
    @FindBy(how = How.ID,using = "label-wales")
    private WebElement walesRadioButton;

    public CountrySelectionPage(WebDriver driver){
        super(driver);
    }
    public void clickOnWalesRadioButton(){
        walesRadioButton.click();

    }
}
