package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.*;
import utilis.EnvReader;

import java.io.IOException;

public class EndToEndJourney {
    WebDriver driver = Hooks.driver;

    CountrySelectionPage countrySelectionPage = new CountrySelectionPage(driver);
    DateOfBirthPage dateOfBirthPage = new DateOfBirthPage(driver);
    PartnerPage partnerPage = new PartnerPage(driver);
    DoYouOrYourPartnerClaimAnyBenefitsOrTaxCredits doYouOrYourPartnerClaimAnyBenefitsOrTaxCredits = new DoYouOrYourPartnerClaimAnyBenefitsOrTaxCredits(driver);
    PaidUniversalCreditQuestionPage paidUniversalCreditQuestionPage = new PaidUniversalCreditQuestionPage(driver);
    UniversalCreditClaimPage universalCreditClaimPage = new UniversalCreditClaimPage(driver);
    TakeHomePage takeHomePage = new TakeHomePage(driver);
    PregnantPage pregnantPage = new PregnantPage(driver);
    InjuryOrIllnessPage injuryOrIllnessPage = new InjuryOrIllnessPage(driver);
    DiabetesPage diabetesPage = new DiabetesPage(driver);
    GlaucomaPage glaucomaPage = new GlaucomaPage(driver);
    CareHomePage careHomePage = new CareHomePage(driver);
    SavingsPage savingsPage = new SavingsPage(driver);
    ResultsPage resultsPage = new ResultsPage(driver);
    LocalCouncilAssessedPage localCouncilAssessedPage = new LocalCouncilAssessedPage(driver);


    @Given("^I navigate to NHS Costs checker tool$")
    public void I_navigate_to_NHS_Costs_checker_tool() throws IOException {
        driver.get(EnvReader.getProperty("URL"));
    }

    @Given("^I am a person from Wales$")
    public void i_am_a_person_from_Wales() throws Throwable {
        StartPage startPage = new StartPage(driver);
        startPage.clickOnNextButton();

        countrySelectionPage.clickOnWalesRadioButton();
        countrySelectionPage.clickOnNextButton();

    }

    // this scenario related age to 18 to 24 and 25 to 60
    @When("^I put my \"([^\"]*)\" circumstances into the Checker tool$")
    public void I_put_my_circumstances_into_the_Checker_tool(String age) throws Throwable {

        /***
         * Used below Happy path for execution
         * DOB =01-01-2000 , 01-01-1990
         * PartnerPage- Yes
         * DoYouOrYourPartnerClaimAnyBenefitsOrTaxCredits-Yes
         * PaidUniversalCreditQuestionPage-Yes
         * UniversalCreditClaimPage-Yes
         * TakeHomePage-No
         * PregnantPage-No
         * InjuryOrIllnessPage-No
         * DiabetesPage-Yes
         * GlaucomaPage-No
         * CareHomePage-No
         * SavingsPage-No
         * ResultPage=outcome
         */
        if (age.equalsIgnoreCase("18 to 24")) {
            dateOfBirthPage.enterDateOfBirth("01", "01", "2000");
            dateOfBirthPage.clickOnNextButton();
        } else if (age.equalsIgnoreCase("25 to 60")) {
            dateOfBirthPage.enterDateOfBirth("01", "01", "1990");
            dateOfBirthPage.clickOnNextButton();
        }
        partnerPage.clickOnYesRadioButton();
        partnerPage.clickOnNextButton();

        doYouOrYourPartnerClaimAnyBenefitsOrTaxCredits.clickOnYesRadioButton();
        doYouOrYourPartnerClaimAnyBenefitsOrTaxCredits.clickOnNextButton();

        paidUniversalCreditQuestionPage.selectYesUniversalCreditRadioButton();
        paidUniversalCreditQuestionPage.clickOnNextButton();

        universalCreditClaimPage.clickOnYesRadioButton();
        universalCreditClaimPage.clickOnNextButton();

        takeHomePage.clickOnNoRadioButton();
        takeHomePage.clickOnNextButton();

        pregnantPage.clickOnNoRadioButton();
        pregnantPage.clickOnNextButton();

        injuryOrIllnessPage.clickOnNoRadioButton();
        injuryOrIllnessPage.clickOnNextButton();

        diabetesPage.clickOnYesRadioButton();
        diabetesPage.clickOnNextButton();

        glaucomaPage.clickOnNoRadioButton();
        glaucomaPage.clickOnNextButton();

        careHomePage.clickOnNoRadioButton();
        careHomePage.clickOnNextButton();

        savingsPage.clickOnNoRadioButton();
        savingsPage.clickOnNextButton();
    }

    @Then("^I should get a \"([^\"]*)\" result of whether I will get help or not$")
    public void I_should_get_a_result_of_whether_I_will_get_help_or_not(String age) throws Throwable {
        String heading = resultsPage.getHeading();
        String prescription = resultsPage.getPrescriptionText();

        if (age.equalsIgnoreCase("18 to 24")) {
            Assert.assertEquals(heading, "Based on what you've told us\n" + "You get help with NHS costs");
            Assert.assertEquals(prescription, "NHS prescriptions");
            String dentalExam = resultsPage.getDentalExamText();
            Assert.assertEquals(dentalExam, "NHS dental check-ups");
        } else if (age.equalsIgnoreCase("25 to 60")) {
            Assert.assertEquals(heading, "Based on what you've told us\n" + "You get help with NHS costs");
            Assert.assertEquals(prescription, "NHS prescriptions");

        }
    }

    // this scenario related to age under 16

    @Given("^I put my under 16 circumstances into the Checker tool$")
    public void I_put_my_under_16_circumstances_into_the_checker_tool() {

        /**
         * DOB = 01-01-2010
         * result page
         */
        dateOfBirthPage.enterDateOfBirth("01", "01", "2010");
        dateOfBirthPage.clickOnNextButton();

    }

    @Then("^I should get a under 16 result of whether I will get help or not$")
    public void I_should_get_a_under_16_result_of_whether_I_will_get_help_or_not() {
        String doneText = resultsPage.getDonePanelText();
        System.out.println(doneText);
        Assert.assertEquals(doneText, "Done\n" + "Based on what you've told us\n" + "You get help with NHS costs");
    }
//this scenario related to age over 60

    @Given("^I put my over 60 circumstances into the Checker tool$")
    public void I_put_my_over_60_circumstances_into_the_Checker_tool() {

        /***
         * Used below Happy path for execution
         * DOB =02-03-1950
         * PartnerPage- No
         * DoYouOrYourPartnerClaimAnyBenefitsOrTaxCredits-No
         * InjuryOrIllnessPage-No
         * CareHomePage-Yes
         * LocalCouncilAssessedPage-Yes
         * ResultPage-Done
         */

        dateOfBirthPage.enterDateOfBirth("02", "03", "1950");
        dateOfBirthPage.clickOnNextButton();

        partnerPage.clickOnNoRadioButton();
        partnerPage.clickOnNextButton();

        doYouOrYourPartnerClaimAnyBenefitsOrTaxCredits.clickOnNoRadioButton();
        doYouOrYourPartnerClaimAnyBenefitsOrTaxCredits.clickOnNextButton();

        injuryOrIllnessPage.clickOnNoRadioButton();
        injuryOrIllnessPage.clickOnNextButton();

        careHomePage.clickOnYesRadioButton();
        careHomePage.clickOnNextButton();

        localCouncilAssessedPage.clickOnYesRadioButton();
        localCouncilAssessedPage.clickOnNextButton();


    }

    @Then("^I should get a over 60 result of whether I will get help or not$")
    public void I_should_get_a_over_60_result_of_whether_I_will_get_help_or_not() {

        String doneText = resultsPage.getDonePanelText();
        System.out.println(doneText);
        Assert.assertEquals(doneText, "Done\n" + "Based on what you've told us\n" + "You can apply for help with NHS costs");
    }


    // this scenario related to pregnant circumstances
    @When("^I put my pregnant circumstances into the Checker tool$")
    public void I_put_my_pregnant_circumstances_into_the_Checker_tool() throws Throwable {

        /***
         * Used below Happy path for execution
         * DOB =01-01-1985
         * PartnerPage- Yes
         * DoYouOrYourPartnerClaimAnyBenefitsOrTaxCredits-No
         * PregnantPage-Yes
         * InjuryOrIllnessPage-No
         * DiabetesPage-Yes
         * GlaucomaPage-No
         * CareHomePage-No
         * SavingsPage-Yes
         * ResultPage=outcome
         */
        dateOfBirthPage.enterDateOfBirth("01", "01", "1985");
        dateOfBirthPage.clickOnNextButton();

        partnerPage.clickOnYesRadioButton();
        partnerPage.clickOnNextButton();

        doYouOrYourPartnerClaimAnyBenefitsOrTaxCredits.clickOnNoRadioButton();
        doYouOrYourPartnerClaimAnyBenefitsOrTaxCredits.clickOnNextButton();

        pregnantPage.clickOnYesRadioButton();
        pregnantPage.clickOnNextButton();

        injuryOrIllnessPage.clickOnNoRadioButton();
        injuryOrIllnessPage.clickOnNextButton();

        diabetesPage.clickOnYesRadioButton();
        diabetesPage.clickOnNextButton();

        glaucomaPage.clickOnNoRadioButton();
        glaucomaPage.clickOnNextButton();

        careHomePage.clickOnNoRadioButton();
        careHomePage.clickOnNextButton();

        savingsPage.clickOnYesRadioButton();
        savingsPage.clickOnNextButton();
    }

    @Then("^I should get a pregnant result of whether I will get help or not$")
    public void I_should_get_a_pregnant_result_of_whether_I_will_get_help_or_not() throws Throwable {
        String heading = resultsPage.getHeading();
        String prescription = resultsPage.getPrescriptionText();

        Assert.assertEquals(heading, "Based on what you've told us\n" + "You get help with NHS costs");
        Assert.assertEquals(prescription, "NHS prescriptions");
        String dentalExam = resultsPage.getDentalExamText();
        Assert.assertEquals(dentalExam, "NHS dental check-ups");
        String dentalTreatment = resultsPage.getDentalTreatmentText();
        Assert.assertEquals(dentalTreatment, "NHS dental treatment");

    }


}











