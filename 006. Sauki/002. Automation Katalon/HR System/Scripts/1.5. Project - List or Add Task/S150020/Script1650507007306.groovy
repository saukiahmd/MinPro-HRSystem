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

WebUI.callTestCase(findTestCase('1.5. Project - List or Add Task/S150001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Object Repository/1.5. Project - List or Add Task/th_Project Title'))

String text1 = WebUI.getText(findTestObject('1.5. Project - List or Add Task/td_API Testing project title ascending'))

WebUI.delay(3)

String text2 = WebUI.getText(findTestObject('1.5. Project - List or Add Task/td_API Testing project title ascending'))

while (text1.charAt(0) == text2.charAt(0)) {
    WebUI.click(findTestObject('1.4. Assets - Logistic Support/a_Next'))

    text2 = WebUI.getText(findTestObject('1.5. Project - List or Add Task/td_API Testing project title ascending'))
}


char a

char b


if (!(text1.isEmpty())) {
    a = text1.charAt(0)
}

if (!(text2.isEmpty())) {
    b = text2.charAt(0)
}



if (a < b) {
	WebUI.delay(3)
	
	String text3 = WebUI.getText(findTestObject('1.5. Project - List or Add Task/td_Project X23 project title ascending page 1')).toLowerCase()
	
	WebUI.delay(3)
	
	String text4 = WebUI.getText(findTestObject('1.5. Project - List or Add Task/td_Project X23 project title ascending page 1')).toLowerCase()
	
	while (text3.charAt(0) == text4.charAt(0)) {
		WebUI.click(findTestObject('1.4. Assets - Logistic Support/a_Next'))
	
		text4 = WebUI.getText(findTestObject('1.5. Project - List or Add Task/td_Project X23 project title ascending page 1')).toLowerCase()
	}

	char c
	
	char d

	if (!(text3.isEmpty())) {
		c = text3.charAt(0)
	}
	
	if (!(text4.isEmpty())) {
		d = text4.charAt(0)
	}

	if(c < d) {
		KeywordUtil.markPassed('Berhasil sorting berdasarkan ascending')
	}else {
		KeywordUtil.markFailed('Gagal sorting berdasarkan ascending')
	}
} else {
	KeywordUtil.markFailed('Gagal sorting berdasarkan ascending')
}



WebUI.closeBrowser()

