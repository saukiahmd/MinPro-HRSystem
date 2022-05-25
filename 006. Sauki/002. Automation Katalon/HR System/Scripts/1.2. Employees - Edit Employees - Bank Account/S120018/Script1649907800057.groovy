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

WebUI.callTestCase(findTestCase('1.2. Employees - Edit Employees - Bank Account/S120001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/1.2. Employees - Edit Employees - Bank Account/input'), 'aliva martatia')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/1.2. Employees - Edit Employees - Bank Account/i_EMPLOYEE_fa fa-pencil-square-o'))

WebUI.click(findTestObject('Object Repository/1.2. Employees - Edit Employees - Bank Account/a_Bank Account'))

WebUI.setText(findTestObject('Object Repository/1.2. Employees - Edit Employees - Bank Account/input_Bank Holder Name_holder_name'), 
    'Aliva12345')

WebUI.setText(findTestObject('Object Repository/1.2. Employees - Edit Employees - Bank Account/input_Bank Name_bank_name'), 
    'Bank12345')

WebUI.setText(findTestObject('Object Repository/1.2. Employees - Edit Employees - Bank Account/input_Branch Name_branch_name'), 
    'KCP Jakarta ITC Fatmawati')

WebUI.setText(findTestObject('Object Repository/1.2. Employees - Edit Employees - Bank Account/input_Bank Account Number_account_number'), 
    '12345rekening')

WebUI.setText(findTestObject('Object Repository/1.2. Employees - Edit Employees - Bank Account/input_Bank Account Type_account_type'), 
    'Konvensional')

WebUI.click(findTestObject('Object Repository/1.2. Employees - Edit Employees - Bank Account/button_Save'))

String text = WebUI.getText(findTestObject('1.2. Employees - Edit Employees - Bank Account/div_Successfully Added'))

if (text.toLowerCase().equals('successfully')) {
	KeywordUtil.markPassed('Berhasil merubah data bank account')
}else {
	KeywordUtil.markFailed('Gagal merubah data bank account')
}


WebUI.closeBrowser()