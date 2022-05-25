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

WebUI.callTestCase(findTestCase('1.5. Project - List or Add Task/S150002'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('1.5. Project - List or Add Task/select_Project X23'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('1.5. Project - List or Add Task/select_Project X23'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/1.5. Project - List or Add Task/span_Choose a Category'))

WebUI.click(findTestObject('1.5. Project - List or Add Task/li_Super Admin'))

WebUI.setText(findTestObject('1.5. Project - List or Add Task/input_Collaborators_select2-search__field'), 'super admin')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('1.5. Project - List or Add Task/input_Collaborators_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/1.5. Project - List or Add Task/input_Task Title_tasktitle'), 'Update Hardware Terbaru')

WebUI.setText(findTestObject('Object Repository/1.5. Project - List or Add Task/input_Task Start Date_startdate'), '2022-04-12')

WebUI.setText(findTestObject('Object Repository/1.5. Project - List or Add Task/input_Task End Date_enddate'), '2022-04-13')

WebUI.setText(findTestObject('Object Repository/1.5. Project - List or Add Task/textarea_Details_details'), 'Update')

WebUI.click(findTestObject('Object Repository/1.5. Project - List or Add Task/label_Running'))

WebUI.click(findTestObject('Object Repository/1.5. Project - List or Add Task/label_Office'))

WebUI.click(findTestObject('Object Repository/1.5. Project - List or Add Task/button_Submit'))

WebUI.verifyElementPresent(findTestObject('1.5. Project - List or Add Task/label_Please enter at least 10 characters'), 
    0)

WebUI.closeBrowser()

