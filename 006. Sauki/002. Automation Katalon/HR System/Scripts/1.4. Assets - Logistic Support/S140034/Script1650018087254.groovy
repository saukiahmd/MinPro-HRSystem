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

WebUI.click(findTestObject('1.4. Assets - Logistic Support/th_Back Qty'))

String text1 = WebUI.getText(findTestObject('1.4. Assets - Logistic Support/td_ini tiltle ta_sorting_1 back qty page 1'))

WebUI.delay(3)

String text2 = WebUI.getText(findTestObject('1.4. Assets - Logistic Support/td_ini tiltle ta_sorting_1 back qty page 1'))

while (text1 == text2) {
    WebUI.click(findTestObject('1.4. Assets - Logistic Support/a_Next'))

    text2 = WebUI.getText(findTestObject('1.4. Assets - Logistic Support/td_ini tiltle ta_sorting_1 back qty page 1'))
}


int number1

int number2

if (!(text1.isEmpty())) {
	 number1 = Integer.parseInt(text1)
}

if (!(text2.isEmpty())) {
	 number2 = Integer.parseInt(text2)
}

if ((number1 < number2) == 12) {
	KeywordUtil.markPassed('Berhasil sorting berdasarkan ascending')
} else {
	KeywordUtil.markFailed('Gagal sorting berdasarkan ascending')
}

WebUI.closeBrowser()

