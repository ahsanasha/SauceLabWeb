# SauceLab web automation Katalon and BDD
This is a sample project web automation testing using Katalon with BDD cucumber

### Behavior-driven development (BDD)
[Behavior-driven development (BDD)](https://docs.katalon.com/docs/general-information/supported-integration/supported-integration-overview/bdd-testing-framework-cucumber-integration-overview) Behavior-driven development (BDD) testing framework allows you to create test cases in plain English. BDD testing framework focuses on the behavior of the product and user acceptance criteria. Cucumber is a BDD framework tool to write test cases, which uses Gherkin, an ordinary language parser, that permits writing scripts in English.
The integration of the Cucumber framework in Katalon Studio allows you to include Cucumber test hooks, which work at the start and the end of a scenario in a behavior-driven development (BDD) test. To learn more about test hooks in the Cucumber framework, you can refer to Cucumber document:

With the BDD testing framework in Katalon Studio, you can:

* Create or add a feature file.
* Define and link steps.
* Set the default package for step definitions.
* Run your feature file.
* Add your feature file to a test case.
* View BDD report files generated from Katalon Studio.
* Upload and view BDD reports on Katalon TestOps.

## Working with BDD feature files in Katalon Studio
### Add Feature Files
This section shows you how to add feature files in Katalon Studio. Steps in the scenario will then be defined by step definitions.
### Maintain Features File
For better management, you might want to organize your feature files with a multi-level system. A feature file can contain many scenarios. However, you should have one scenario per feature file for easy maintenance.
In Katalon Studio, there are three options to help you maintain the feature file. Right click anywhere in the feature file editor view and choose from the following options:

|Option| Description |
|--|--|
| Pretty Format | Re-do the format when the current format is not organized properly. |
| Find Step | Find relevant step of current Gherkin step in existing Step Definitions files. |
| Recalculate steps | Recalculate steps in the feature file when there are changes in Step Definitions. |

### Define Steps
After you added your feature files, you need to define and link steps before using that feature file.
Each Gherkin step in the features file needs to be defined as a set of programming code so that Katalon Studio can execute the action of that step. These step definitions can be implemented in the Keyword folder by leveraging the Script Mode. Katalon Studio built-in keywords can also be re-used in Step Definition files as well. When Katalon Studio executes any features files in a test case, it also look for the matching step definitions in the source folder.
Step Definitions can be written in any Cucumber-supported programming languages including Groovy and Java.
For example, we have two scenario outlines: Login with a valid credential and login with an invalid credential. With two scenario outlines, we have totally 6 steps like below:
* Given I navigate to Cura System homepage
* And I click Make Appointment button
* And I enter username <username> and password <password>
* When I click Log in button
* Then I should be able to login successfully

### Set the default package for step definitions
You can define the location of a step definitions for Cucumber by using CucumberKW.GLUE = ['package1', 'package2']. The default value of CucumberKW.GLUE = [''] is all packages, which means the test engine takes time to scan all the packages. Defining specific locations narrows down the packages to find the steps definitions before executing feature files; hence, reducing the execution time.
We recommend putting the script of directing to a package in a test listener.

`import com.kms.katalon.core.annotation.AfterTestCase`
`import com.kms.katalon.core.annotation.BeforeTestCase`
`import com.kms.katalon.core.context.TestCaseContext`
`import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW`

`class NewTestListener {`
    `@BeforeTestCase`
   ` def sampleBeforeTestCase(TestCaseContext testCaseContext) {`
        `CucumberKW.GLUE = ['package1', 'package2']`
    `}`
`}`

### Run a Feature File
Katalon Studio allows you to run the feature file instantly by itself to make sure it works properly. To do so, open the desired Features file, then click the Run button on the main toolbar.