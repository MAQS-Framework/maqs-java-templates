/*
 * Copyright 2022 (C) Cognizant SoftVision, All rights Reserved
 */

package stepdefs.selenium;

import com.cognizantsoftvision.maqs.cucumber.steps.BaseSeleniumStep;
import io.cucumber.java.en.Given;

public class SeleniumSteps extends BaseSeleniumStep {

    @Given("^Selenium Step$")
    public void Step() {
        this.getDriver().navigate().to("https://magenicautomation.azurewebsites.net/");
        this.getLogger().logMessage("info");
    }

    @When("Selenium Step2")
    public void Step2() throws Throwable {
        this.getLogger().logMessage("Step2");
    }

    @Then("Selenium Step3")
    public void Step3() throws Throwable {
        this.getLogger().logMessage("Step3");
    }
}