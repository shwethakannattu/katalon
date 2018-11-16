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

def data_xls = TestDataFactory.findTestData('Supplier/Details')

String[] elementName1 = ['fname', 'lname', 'email', 'password', 'mobile', 'address1', 'address2', 'itemname']

for (int i = 1; i <= elementName1.size(); i++) {
    WebUI.setText(findTestObject('Supplier/Details/Details', [('Supplier') : elementName1[(i - 1)]]), data_xls.getValue(
            i, 1))
}

WebUI.click(findTestObject('Supplier/CountryArrow'))

WebUI.click(findTestObject('Supplier/CountryName'))

def data_xls1 = findTestData('Supplier/CheckBox')

for (def index : (1..data_xls1.getRowNumbers())) {
    for (def indexc : (1..data_xls1.getColumnNumbers())) {
        WebUI.scrollToElement(findTestObject('Supplier/Details/CheckBox', [('checkboxSupplier') : data_xls1.getValue(indexc, 
                        index)]), 10)

        WebUI.click(findTestObject('Supplier/Details/CheckBox', [('checkboxSupplier') : data_xls1.getValue(indexc, index)]))
    }
}

WebUI.click(findTestObject('Assessment1/Submitpage'))

