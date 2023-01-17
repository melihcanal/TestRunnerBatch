package org.testautomation.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverLauncher extends DriverLauncher {

    public EdgeDriverLauncher() {
        super();
        WebDriverManager.chromiumdriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }
}
