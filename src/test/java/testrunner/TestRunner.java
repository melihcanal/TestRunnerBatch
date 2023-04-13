package testrunner;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import testrunner.actions.*;
import testrunner.enums.ActionType;
import testrunner.internal.ReadData;
import testrunner.model.StepDefinition;
import testrunner.page.DisplayedPage;

import java.util.List;

@ExtendWith(SerenityJUnit5Extension.class)
class TestRunner {

    @Managed(driver = "chrome")
    WebDriver driver;

    DisplayedPage displayedArticle;

    NavigateActions navigate;

    SendKeys sendKeys;

    SearchAction search;

    ClickOnTarget click;

    Hover hover;

    Scroll scroll;

    AssertAction assertAction;

    static List<StepDefinition> stepDefinitions;

    @BeforeAll
    static void getTestSteps() {
        stepDefinitions = ReadData.readDataFromJson();
    }

    @Test
    void executeTestSteps() {
        stepDefinitions.forEach(stepDefinition -> {
            if (stepDefinition.getActionType().equals(ActionType.CLICK)) {
                click.byXpathOrCssSelector(stepDefinition.getXpathOrCssSelector());
            } else if (stepDefinition.getActionType().equals(ActionType.SEND_KEYS)) {
                sendKeys.toTarget(stepDefinition.getKeyword(), stepDefinition.getXpathOrCssSelector());
            } else if (stepDefinition.getActionType().equals(ActionType.SEARCH)) {
                search.onTarget(stepDefinition.getKeyword(), stepDefinition.getXpathOrCssSelector());
            } else if (stepDefinition.getActionType().equals(ActionType.HOVER)) {
                hover.over(stepDefinition.getXpathOrCssSelector());
            } else if (stepDefinition.getActionType().equals(ActionType.SCROLL)) {
                scroll.windowTo(stepDefinition.getScrollLeft(), stepDefinition.getScrollTop());
            } else if (stepDefinition.getActionType().equals(ActionType.GO_TO_URL)) {
                navigate.toThePage(stepDefinition.getUrl());
            } else if (stepDefinition.getActionType().equals(ActionType.ASSERT_EQUALS)) {
                assertAction.assertEquals(stepDefinition.getMessage(), stepDefinition.getExpected(), stepDefinition.getXpathOrCssSelector());
            } else if (stepDefinition.getActionType().equals(ActionType.ASSERT_THAT)) {
                assertAction.assertThat(stepDefinition);
            }
        });
    }
}
