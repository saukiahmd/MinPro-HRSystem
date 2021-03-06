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

WebUI.callTestCase(findTestCase('1.3. Employees - Edit Employees - Social Media/S130001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/1.3. Employees - Edit Employees - Social Media/input'), 'dimas pratama')

WebUI.click(findTestObject('Object Repository/1.3. Employees - Edit Employees - Social Media/i_EMPLOYEE_fa fa-pencil-square-o'))

WebUI.click(findTestObject('Object Repository/1.3. Employees - Edit Employees - Social Media/a_Social Media'))

WebUI.setText(findTestObject('Object Repository/1.3. Employees - Edit Employees - Social Media/input_Facebook_facebook'), 
    facebook)

WebUI.setText(findTestObject('Object Repository/1.3. Employees - Edit Employees - Social Media/input_Twitter_twitter'), 
    twitter)

WebUI.setText(findTestObject('Object Repository/1.3. Employees - Edit Employees - Social Media/input_Google_google'), google)

WebUI.setText(findTestObject('Object Repository/1.3. Employees - Edit Employees - Social Media/input_Skype_skype'), skype)

WebUI.click(findTestObject('Object Repository/1.3. Employees - Edit Employees - Social Media/i_Save_fa fa-check'))

String text = WebUI.getText(findTestObject('1.2. Employees - Edit Employees - Bank Account/div_Successfully Added'))

if (text.toLowerCase().contains('successfully')) {
    KeywordUtil.markPassed('Berhasil merubah data social media')
}else {
	KeywordUtil.markError('Gagal merubah data social media')
}

WebUI.closeBrowser()

