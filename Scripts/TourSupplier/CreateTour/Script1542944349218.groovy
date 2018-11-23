import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.InternalData as InternalData

WebUI.callTestCase(findTestCase('AdminCreation/Submit'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyTextPresent('kannattu', false)

WebUI.delay(5)

CustomKeywords.'login.Keywordlogin1.login'('url', 'username', 'password')

WebUI.delay(5)

WebUI.click(findTestObject('Tour/Tour/Page_Dashboard/a_Tours'))

WebUI.click(findTestObject('Tour/Tour/Page_Dashboard/a_Tours_1'))

WebUI.click(findTestObject('Tour/Tour/Page_Tours Management/button_Add'))

InternalData data = findTestData('Tour/General')

int i = 1

WebUI.setText(findTestObject('Tour/General/General Tab', [('General') : 'tourname']), data.getValue(i++, 1))

WebUI.setText(findTestObject('Tour/General/General Tab', [('General') : 'maxadult']), data.getValue(i++, 1))

WebUI.setText(findTestObject('Tour/General/General Tab', [('General') : 'adultprice']), data.getValue(i++, 1))

WebUI.scrollToElement(findTestObject('Tour/General/Child Enable'), 10)

WebUI.click(findTestObject('Tour/General/Child Enable'))

WebUI.click(findTestObject('Tour/General/Infant Enable'))

WebUI.setText(findTestObject('Tour/General/General Tab', [('General') : 'maxchild']), data.getValue(i++, 1))

WebUI.setText(findTestObject('Tour/General/General Tab', [('General') : 'childprice']), data.getValue(i++, 1))

WebUI.setText(findTestObject('Tour/General/General Tab', [('General') : 'maxinfant']), data.getValue(i++, 1))

WebUI.setText(findTestObject('Tour/General/General Tab', [('General') : 'infantprice']), data.getValue(i++, 1))

WebUI.click(findTestObject('Tour/General/ClickStar'))

WebUI.click(findTestObject('Tour/General/Star'))

WebUI.setText(findTestObject('Tour/General/General Tab', [('General') : 'tourdays']), data.getValue(i++, 1))

WebUI.setText(findTestObject('Tour/General/General Tab', [('General') : 'tournights']), data.getValue(i++, 1))

WebUI.click(findTestObject('Tour/General/ClickTourType'))

WebUI.click(findTestObject('Tour/General/SelectTourType', [('type') : data.getValue(i++, 1)]))

WebUI.click(findTestObject('Tour/General/LocationClick'))

WebUI.setText(findTestObject('Tour/General/LocationValue'), 'Paris')

WebUI.click(findTestObject('Tour/General/LocationValueClick'))

WebUI.scrollToElement(findTestObject('Tour/Inclusions/Page_Add Tour/a_Inclusions'), 10)

WebUI.click(findTestObject('Tour/Inclusions/Page_Add Tour/a_Inclusions'))

WebUI.click(findTestObject('Tour/Inclusions/SelectAll'))

WebUI.delay(10)

WebUI.click(findTestObject('Tour/Inclusions/SelectAll'))

def inclusions = [' Collision Coverage', ' Cab Facilities', ' Golf Nearby', ' Transportation', ' Cruise']

for (int j = 1; j <= inclusions.size(); j++) {
    WebUI.click(findTestObject('Tour/Inclusions/Options', [('Option') : inclusions[(j - 1)]]))
}

WebUI.click(findTestObject('Tour/Exclusions/ClickExclusions'))

def exclusions = [' Airfare & airport taxes', ' Visa charges', ' Insurance', ' Passport costs', ' All meals and drinks', ' Tips to coach drivers']

for (int k = 1; k <= exclusions.size(); k++) {
    WebUI.click(findTestObject('Tour/Exclusions/ClickOptions', [('ExclusionOption') : exclusions[(k - 1)]]))
}

WebUI.click(findTestObject('Tour/Tour/Submit'))

WebUI.delay(5)

WebUI.verifyTextPresent('Forv', false)

WebUI.delay(10)

CustomKeywords.'login.Keywordlogin1.login'('url', 'username', 'password')

WebUI.click(findTestObject('Supplier/Page_Dashboard/a_Accounts'))

WebUI.click(findTestObject('Supplier/Page_Dashboard/a_Suppliers'))

WebUI.click(findTestObject('Supplier/Page_Suppliers Management/button_Add'))

WebUI.callTestCase(findTestCase('TourSupplier/CreateSupplier'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Sajin', false)

not_run: WebUI.closeBrowser()

