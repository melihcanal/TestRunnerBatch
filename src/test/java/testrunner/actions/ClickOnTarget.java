package testrunner.actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

/**
 * UIInteractionSteps let us define action classes which regroup related actions.
 * The @Step annotation is used to indicate that this action will appear as a step in the reports.
 */
public class ClickOnTarget extends UIInteractions {
    @Step("Click on target by id '{0}'")
    public void byId(String id) {
        $("#".concat(id)).click();
    }

    @Step("Click on target by id '{0}'")
    public void xpathOrCssSelector(String xpathOrCssSelector) {
        $(xpathOrCssSelector).click();
    }
}
