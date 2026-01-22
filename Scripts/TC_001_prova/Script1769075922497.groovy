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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://portale-admin-t1.alveria.local/Aspx/login.aspx')

WebUI.setText(findTestObject('Object Repository/Prova/Page_/input_Username_ctl00_ctl00_PageBody_Contenu_b04958'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Prova/Page_/input_Password_ctl00_ctl00_PageBody_Contenu_40ebb5'), 
    'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/Prova/Page_/input_Password_ctl00_ctl00_PageBody_Contenu_9644f0'))

WebUI.click(findTestObject('Object Repository/Prova/Page_/span_Organizzazione'))

WebUI.click(findTestObject('Object Repository/Prova/Page_/span_Struttura Organizzativa'))

WebUI.click(findTestObject('Object Repository/Prova/Page_/span_WIND TRE ITALIA (CORTI GIANLUCA, 2, 6946)'))

WebUI.delay(5)

WebUI.closeBrowser()

