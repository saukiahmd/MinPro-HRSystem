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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('1.5. Project - List or Add Task/S150001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.5. Project - List or Add Task/th_Start Date'))

WebUI.delay(5)

String text1 = WebUI.getText(findTestObject('1.5. Project - List or Add Task/td_10th of January 2022 start date ascending')).replace('th', '').replace(' ', '').replace('of', '')

String text2 = WebUI.getText(findTestObject('1.5. Project - List or Add Task/td_10th of January 2022 start date ascending')).replace('th', '').replace(' ', '').replace('of', '')

while (text1 == text2) {
    WebUI.click(findTestObject('1.4. Assets - Logistic Support/a_Next'))

    text2 = WebUI.getText(findTestObject('1.5. Project - List or Add Task/td_10th of January 2022 start date ascending')).replace('th', '').replace(' ', '').replace('of', '')
}

Date date1

Date date2

if (!(text1.isEmpty())) {
    date1 = new SimpleDateFormat('ddMMMMMyyyy').parse(text1)
}

if (!(text2.isEmpty())) {
    date2 = new SimpleDateFormat('ddMMMMyyyy').parse(text2)
}

if (date1 < date2) {
    
	KeywordUtil.markFailed('Gagal sorting berdasarkan ascending')
} else {
	KeywordUtil.markPassed('Berhasil sorting berdasarkan ascending')
}

WebUI.closeBrowser()


