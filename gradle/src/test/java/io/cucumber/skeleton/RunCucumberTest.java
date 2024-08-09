package io.cucumber.skeleton;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.presentation.PresentationMode;
import net.masterthought.cucumber.sorting.SortingMethod;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-htmlreport", "json:build/cucumber-report.json"})
public class RunCucumberTest {
    @AfterClass
    public static void teardown() {
        File reportOutputDirectory = new File("target/");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("build/cucumber-report.json");
        String projectName = "RealWorld";
        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.setSortingMethod(SortingMethod.NATURAL);
        configuration.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}