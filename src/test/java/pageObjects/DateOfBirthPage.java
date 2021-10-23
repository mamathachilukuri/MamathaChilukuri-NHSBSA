package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DateOfBirthPage extends BasePage {
    @FindBy(how = How.ID, using = "dob-day")
    private WebElement dayTextBox;
    @FindBy(how = How.ID, using = "dob-month")
    private WebElement monthTextBox;
    @FindBy(how = How.ID, using = "dob-year")
    private WebElement yearTextBox;


    public DateOfBirthPage(WebDriver driver) {
        super(driver);

    }

    public void enterDateOfBirth(String day, String month, String year) {
        dayTextBox.clear();
        dayTextBox.sendKeys(day);

        monthTextBox.clear();
        monthTextBox.sendKeys(month);

        yearTextBox.clear();
        yearTextBox.sendKeys(year);
    }
}
