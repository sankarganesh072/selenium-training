package org.stepdefinition4;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue = "org.stepdefinition4",monochrome = true,dryRun = false,snippets = SnippetType.UNDERSCORE)

public class Testsrun {

}
