package org.stepdefinition2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue = "org.stepdefinition2",monochrome = true)
public class Testclass {

}
