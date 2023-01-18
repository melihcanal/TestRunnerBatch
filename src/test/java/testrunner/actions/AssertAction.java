package testrunner.actions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractions;
import org.junit.jupiter.api.Assertions;
import testrunner.model.StepDefinition;
import testrunner.page.DisplayedPage;

public class AssertAction extends UIInteractions {

    DisplayedPage displayedPage;

    public void assertEquals(String message, Object expected, String xpathOrCssSelector) {
        Serenity.reportThat(message, () -> Assertions.assertEquals(String.valueOf(expected), displayedPage.findElement((xpathOrCssSelector))));
    }

    public void assertThat(StepDefinition stepDefinition) {
        // TODO:
    }
}
