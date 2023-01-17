package org.testautomation;

import org.openqa.selenium.WebDriver;
import org.testautomation.drivers.ChromeDriverLauncher;
import org.testautomation.drivers.DriverLauncher;

public class Main {

    public static void main(String[] args) {
        DriverLauncher driverLauncher = new ChromeDriverLauncher();
        WebDriver driver = driverLauncher.getDriver();
    }
}