import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.support.ui.Select as Select

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.kurtosys.com/')

WebUI.click(findTestObject('Resources/burger_menu'))

WebUI.enhancedClick(findTestObject('Resources/span_Resources'))

WebUI.click(findTestObject('Object Repository/Resources/Accept_cookies'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Resources/a_White papers'), 0)

WebElement ele = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Resources/a_White papers'), 30)
WebUI.executeJavaScript('arguments[0].click', Arrays.asList(ele))

WebUI.enhancedClick(findTestObject('Object Repository/Resources/a_UCITS White Paper'))

// ele= WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Resources/a_UCITS White Paper'),30)
//WebUI.executeJavaScript("arguments[0].click", Arrays.asList(ele))

//WebUI.navigateToUrl('https://www.kurtosys.com/white-papers/eu-rule-change-bolsters-need-for-fast-localized-fund-website-platforms-2/')

ele = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Resources/input_First Name'),  30)
WebUI.executeJavaScript('arguments[0].value=\'Gomolemo\'', Arrays.asList(ele))

WebUI.setText(findTestObject('Object Repository/Resources/input_Last Name_'), 'Molotsane')

ele = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Resources/input_Last Name'),  30)
WebUI.executeJavaScript('arguments[0].value=\'Molotsane\'', Arrays.asList(ele))

ele = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Resources/input_Email'),  30)
WebUI.executeJavaScript('arguments[0].value=\'gmolotsane@gmail.com\'', Arrays.asList(ele))

ele = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Resources/input_Company'),  30)
WebUI.executeJavaScript('arguments[0].value=\'OTM\'', Arrays.asList(ele))

ele = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Resources/input_Department'),  30)
WebUI.executeJavaScript('arguments[0].value=\'Information Technology\'', Arrays.asList(ele))

WebUI.click(findTestObject('Object Repository/Resources/Subscribe'))

ele = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Resources/Submit'), 30)
WebUI.executeJavaScript('arguments[0].click', Arrays.asList(ele))



