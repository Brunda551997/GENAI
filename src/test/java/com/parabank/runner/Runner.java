package com.parabank.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="feature/Feature.feature",
	tags="@Register",
	glue="com.parabank.stepdef",
	monochrome=true,
	plugin= {"pretty"}
	)

	public class Runner {

	}
