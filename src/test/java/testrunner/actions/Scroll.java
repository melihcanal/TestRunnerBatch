package testrunner.actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

/**
 * UIInteractionSteps let us define action classes which regroup related actions.
 * The @Step annotation is used to indicate that this action will appear as a step in the reports.
 */
public class Scroll extends UIInteractions {

    @Step("Scroll the web page to ({0}, {1})")
    public void windowTo(Integer scrollLeft, Integer scrollTop) {
        getJavascriptExecutorFacade().executeScript("window.scrollBy(" + scrollLeft + "," + scrollTop + ")", "");
    }
}
