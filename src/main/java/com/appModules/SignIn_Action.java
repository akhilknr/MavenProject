package com.appModules;

import org.testng.Reporter;

import com.pageObjects.Home_Page;
import com.pageObjects.LogIn_Page;
import com.utility.Constant;
import com.utility.ExcelUtils;
import com.utility.Log;
import com.utility.Utils;

public class SignIn_Action {
    public static void Execute(int iTestCaseRow) throws Exception{
    	
    	Home_Page.lnk_MyAccount().click();
    	Log.info("Click action is perfromed on My Account link" );
    	String sUserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UserName);
        LogIn_Page.txtbx_UserName().sendKeys(sUserName);
        Log.info(sUserName+" is entered in UserName text box" );
        
        String sPassword = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
        LogIn_Page.txtbx_Password().sendKeys(sPassword);
        Log.info(sPassword+" is entered in Password text box" );
        
        LogIn_Page.btn_LogIn().click();
        Log.info("Click action is performed on Submit button");
        
        Utils.waitForElement(Home_Page.lnk_LogOut());
        Reporter.log("SignIn Action is successfully perfomred");
        
    }
}
