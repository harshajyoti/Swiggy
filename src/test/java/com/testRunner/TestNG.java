package com.testRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Features",
glue = {"stepDefinition"}
//tags = "@sample"
		)

public class TestNG extends AbstractTestNGCucumberTests {

}
