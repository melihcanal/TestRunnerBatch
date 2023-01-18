package testrunner.page;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.stream.Collectors;

public class DisplayedPage extends PageComponent {

    private WebElementFacade webElementFacade;

    public String getElementText(String xpathOrCssSelector) {
        return find(xpathOrCssSelector).getText();
    }

    public List<String> getAllElementsText(String xpathOrCssSelector) {
        return findAll(xpathOrCssSelector).stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
    }
}
