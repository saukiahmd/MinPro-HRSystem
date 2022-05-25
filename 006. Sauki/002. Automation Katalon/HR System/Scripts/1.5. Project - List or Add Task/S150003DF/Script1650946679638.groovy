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

WebUI.callTestCase(findTestCase('1.5. Project - List or Add Task/S150002'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('1.5. Project - List or Add Task/select_Project X23                         _d4a0d0'), 
    project_list, false)

WebUI.click(findTestObject('Object Repository/1.5. Project - List or Add Task/span_Choose a Category'))

WebUI.click(findTestObject('Object Repository/1.5. Project - List or Add Task/li_Employee Dua'))

WebUI.setText(findTestObject('1.5. Project - List or Add Task/input_Collaborators_select2-search__field'), collaborators)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('1.5. Project - List or Add Task/input_Collaborators_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/1.5. Project - List or Add Task/input_Task Title_tasktitle'), task_title)

WebUI.setText(findTestObject('Object Repository/1.5. Project - List or Add Task/input_Task Start Date_startdate'), task_startdate)

WebUI.setText(findTestObject('Object Repository/1.5. Project - List or Add Task/input_Task End Date_enddate'), task_enddate)

WebUI.setText(findTestObject('Object Repository/1.5. Project - List or Add Task/textarea_Details_details'), details)

WebUI.click(findTestObject('Object Repository/1.5. Project - List or Add Task/label_Running'))

WebUI.click(findTestObject('Object Repository/1.5. Project - List or Add Task/label_Office'))

WebUI.click(findTestObject('Object Repository/1.5. Project - List or Add Task/button_Submit'))

if (WebUI.verifyTextPresent('Successfully Added', false)) {
    KeywordUtil.markPassed('')
} else if (WebUI.verifyTextPresent('The tasktitle field is required.', false) || WebUI.verifyTextPresent('The details field is required.', 
    false)) {
    KeywordUtil.markFailed('Gagal Menambahkan Data')
}

WebUI.closeBrowser()

