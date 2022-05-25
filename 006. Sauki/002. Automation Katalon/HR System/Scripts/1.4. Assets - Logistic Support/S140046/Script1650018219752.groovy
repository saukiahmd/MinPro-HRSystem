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

WebUI.callTestCase(findTestCase('1.4. Assets - Logistic Support/S140001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/1.4. Assets - Logistic Support/input'), 'computer')

WebUI.click(findTestObject('Object Repository/1.4. Assets - Logistic Support/a_ini tiltle ta_btn btn-sm btn-primary wave_865216'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1.4. Assets - Logistic Support/select_Select Here                         _6dab76'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/1.4. Assets - Logistic Support/select_Select Here                         _bd7afe'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/1.4. Assets - Logistic Support/select_Select Here                         _8670b2'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/1.4. Assets - Logistic Support/select_Select here                         _845218'), 
    'Moo1402', true)

WebUI.setText(findTestObject('Object Repository/1.4. Assets - Logistic Support/input_Assign Qty_assignqty'), '3')

WebUI.setText(findTestObject('Object Repository/1.4. Assets - Logistic Support/input_Refund Qty_backqty'), '1')

WebUI.click(findTestObject('1.4. Assets - Logistic Support/button_Submit'))

WebUI.verifyTextPresent('Successfully Updated', false)

WebUI.closeBrowser()
