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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.click(findTestObject('Object Repository/Amazon_testcase_004_OR/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/Amazon_testcase_004_OR/input_email'), PhoneNo)

WebUI.click(findTestObject('Object Repository/Amazon_testcase_004_OR/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_testcase_004_OR/input_password'), 'sWIDqSuYDTb6OdfrXQbw6w==')

WebUI.click(findTestObject('Object Repository/Amazon_testcase_004_OR/inputsignInSubmit'))

WebUI.click(findTestObject('Object Repository/Amazon_testcase_004_OR/span_Hyderabad 500058'))

WebUI.setText(findTestObject('Amazon_testcase_004_button_OR/input_or enter a US zip code_GLUXZipUpdateInput'), PinCode)

WebUI.click(findTestObject('Amazon_testcase_004_OR/input_a-button-input'))

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/Amazon_testcase_004_CP'), false)

WebUI.closeBrowser()

