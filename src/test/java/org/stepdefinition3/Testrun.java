package org.stepdefinition3;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources",glue = "org.stepdefinition3",monochrome = true,strict = false )
public class Testrun {

}
