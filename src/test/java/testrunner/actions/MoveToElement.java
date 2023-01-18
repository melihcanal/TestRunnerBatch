package testrunner.actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

/**
 * UIInteractionSteps let us define action classes which regroup related actions.
 * The @Step annotation is used to indicate that this action will appear as a step in the reports.
 */
public class MoveToElement extends UIInteractions {

    @Step("Scroll to target by xpath or css selector '{0}'")
    public void byXpathOrCssSelector(String xpathOrCssSelector) {
        moveTo(xpathOrCssSelector);
    }
}
