package com.appModules;

import org.testng.Reporter;

import com.pageObjects.BaseClass;
import com.pageObjects.CheckOut_Page;
import com.pageObjects.Confirmation_Page;

public class Verification_Action {
	public static void Execute() throws Exception{
		
		if(CheckOut_Page.sProductName.equals(Confirmation_Page.sProductName)){
			Reporter.log("Verification Passed for Product Name");
			
		}else{
			Reporter.log("Verification Failed for Product Name");
			BaseClass.bResult=false;
		}
		
		if(CheckOut_Page.sProductPrice.equals(Confirmation_Page.sProductPrice)){
			Reporter.log("Verification Passed for Product Price");
		}else{
			Reporter.log("Verification Failed for Product Price");
			BaseClass.bResult=false;
		}
	}
}
