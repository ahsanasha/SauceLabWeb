package authentication
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginStep {
	@Given("User navitages to the login page")
	public void user_navitages_to_the_login_page() {
		WebUI.openBrowser(GlobalVariable.baseUrl)
	}

	@Given("User enters user name")
	public void user_enters_user_name() {
		WebUI.sendKeys(findTestObject('Object Repository/login_page/input_user_name'),GlobalVariable.userName )
	}

	@Given("User enters password")
	public void user_enters_password() {
		WebUI.sendKeys(findTestObject('Object Repository/login_page/input_password'), GlobalVariable.password)
	}
	

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		WebUI.click(findTestObject('Object Repository/login_page/button_login'))
	}

	@Then("User should be redirected to the home page")
	public void user_should_be_redirected_to_the_home_page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/home_page/label_products_header'))
	}
	
	@Given("User enters invalid username")
	public void user_enters_invalid_username() {
		WebUI.sendKeys(findTestObject('Object Repository/login_page/input_user_name'),GlobalVariable.invalidUserName )
	}
	
	@Given("User enters invalid password")
	public void user_enters_invalid_password() {
		WebUI.sendKeys(findTestObject('Object Repository/login_page/input_password'), GlobalVariable.invalidPassword)
	}
	
	
	@Then("User will be get error message invalid credentials")
	public void user_will_be_get_error_message_invalid_credentials() {
		WebUI.verifyElementText(findTestObject('Object Repository/login_page/label_error_message'), "Epic sadface: Username and password do not match any user in this service")
	}
	
}