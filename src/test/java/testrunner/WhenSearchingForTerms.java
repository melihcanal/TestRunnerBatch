package testrunner;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import testrunner.actions.ClickOnTarget;
import testrunner.actions.DisplayedArticle;
import testrunner.actions.NavigateActions;
import testrunner.actions.SendKeys;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingForTerms {

    /**
     * Define the webdriver instance to be used for these tests
     */
    @Managed(driver = "chrome", options = "headless")
    WebDriver driver;

    /**
     * Navigation actions. This is a UIInteraction class so it will be instantiated automatically by Serenity.
     */
    NavigateActions navigate;

    /**
     * Actions related to searches. This is a UIInteraction class so it will be instantiated automatically by Serenity.
     */
    SendKeys sendKeys;

    /**
     * A page object representing a Wikipedia article that is currently appearing in the browser.
     * Page Objects are automatically initialised by Serenity.
     */
    DisplayedArticle displayedArticle;

    ClickOnTarget click;

    @BeforeAll
    static void getTestSteps() {

    }

    @Test
    void searchBySingleKeyword() {
        navigate.toThePage("http://w3schools.com/");
        click.byId("search2");
        sendKeys.toTarget("Everest", "#search2");
        //Serenity.reportThat("The first heading should be 'Mount Everest'",
        //        () -> assertThat(displayedArticle.getFirstHeading()).contains("Everest")
        //);
    }
}
