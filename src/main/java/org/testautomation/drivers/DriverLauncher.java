package org.testautomation.drivers;

import org.openqa.selenium.WebDriver;

public abstract class DriverLauncher {

    protected WebDriver driver;

    public DriverLauncher() {

    }

    public WebDriver getDriver() {
        return driver;
    }

}
