
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject


def static "login.Keywordlogin1.login"(
    	String url	
     , 	String username	
     , 	String password	) {
    (new login.Keywordlogin1()).login(
        	url
         , 	username
         , 	password)
}

def static "login.keyword1.refreshBrowser"() {
    (new login.keyword1()).refreshBrowser()
}

def static "login.keyword1.clickElement"(
    	TestObject to	) {
    (new login.keyword1()).clickElement(
        	to)
}

def static "login.keyword1.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new login.keyword1()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

def static "login.Keywordlogin.login"(
    	String url	
     , 	String username	
     , 	String password	) {
    (new login.Keywordlogin()).login(
        	url
         , 	username
         , 	password)
}
