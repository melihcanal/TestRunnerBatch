package testrunner.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import testrunner.enums.ActionType;

@Getter
@Setter
@ToString
public class StepDefinition {
    private ActionType actionType;

}
