package testrunner.actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class SendKeys extends UIInteractions {

    @Step("Send keyword '{0}' to target '{1}'")
    public void toTarget(String keyword, String xpathOrCssSelector) {
        $(xpathOrCssSelector).sendKeys(keyword);
    }
}
