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

WebUI.setText(findTestObject('Object Repository/1.4. Assets - Logistic Support/input'), 'computer a442u')

WebUI.click(findTestObject('Object Repository/1.4. Assets - Logistic Support/a_ini tiltle ta_btn btn-sm btn-primary wave_865216'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1.4. Assets - Logistic Support/select_Select Here                         _6dab76'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/1.4. Assets - Logistic Support/select_Select Here                         _8670b2'), 
    '6', true)


String text = WebUI.getText(findTestObject('1.4. Assets - Logistic Support/div_Successfully Updated'))

if (text.toLowerCase().contains('successfully')) {
	KeywordUtil.markPassed('Berhasil merubah data logistic support ')
}else {
	KeywordUtil.markFailed('Data kolom yang dipilih tidak saling berelasi seperti pada bagian tambah data')
}

WebUI.closeBrowser()

