package testrunner.actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class SearchAction extends UIInteractions {

    @Step("Search by keyword '{0}' on target {1}")
    public void onTarget(String keyword, String xpathOrCssSelector) {
        $(xpathOrCssSelector).sendKeys(keyword, Keys.ENTER);
    }
}
