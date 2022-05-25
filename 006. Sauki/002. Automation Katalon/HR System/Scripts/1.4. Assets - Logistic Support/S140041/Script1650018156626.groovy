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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('1.4. Assets - Logistic Support/S140001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('1.4. Assets - Logistic Support/input'), 'computer')

WebUI.click(findTestObject('Object Repository/1.4. Assets - Logistic Support/a_ini tiltle ta_btn btn-sm btn-primary wave_865216'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1.4. Assets - Logistic Support/select_Select Here                         _6dab76'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/1.4. Assets - Logistic Support/select_Select Here                         _bd7afe'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/1.4. Assets - Logistic Support/select_Select Here                         _8670b2'), 
    '9', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/1.4. Assets - Logistic Support/select_Select here                         _845218'), 
    'Moo1402', true)

WebUI.setText(findTestObject('Object Repository/1.4. Assets - Logistic Support/input_Start Date_startdate'), '2022-04-12')

WebUI.setText(findTestObject('Object Repository/1.4. Assets - Logistic Support/input_End Date_enddate'), '2022-04-17')

WebUI.setText(findTestObject('Object Repository/1.4. Assets - Logistic Support/input_Refund Date_backdate'), '2022-01-12')

WebUI.setText(findTestObject('Object Repository/1.4. Assets - Logistic Support/input_Assign Qty_assignqty'), '5')

WebUI.setText(findTestObject('Object Repository/1.4. Assets - Logistic Support/input_Refund Qty_backqty'), '5')

WebUI.click(findTestObject('Object Repository/1.4. Assets - Logistic Support/div_Remarks'))

WebUI.setText(findTestObject('Object Repository/1.4. Assets - Logistic Support/textarea_Remarks_remarks'), 'employee dua')

WebUI.click(findTestObject('1.4. Assets - Logistic Support/button_Submit'))

String text = WebUI.getText(findTestObject('1.4. Assets - Logistic Support/div_Successfully Updated'))

if (text.toLowerCase().contains('successfully')) {
    KeywordUtil.markFailed('Berhasil merubah data logistic support ')
}
WebUI.closeBrowser()

