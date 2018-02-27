package com.appModules;

import org.testng.Reporter;

import com.pageObjects.BaseClass;
import com.pageObjects.CheckOut_Page;

public class CheckOut_Action {
		 public static void Execute() throws Exception{
			 
			
	     	CheckOut_Page.sProductName=CheckOut_Page.txt_ProductName().getText();
	     	
	     	if(!"".equals(CheckOut_Page.sProductName)){
	     		Reporter.log("Verification Passed for Product Name on Check Out page.");
	     	}else{
	     		Reporter.log("Verification Failed for Product Name on Check Out page.");
	     	
	     		BaseClass.bResult=false;
	     	}
	     	
	     	CheckOut_Page.sProductPrice= CheckOut_Page.txt_ProductPrice().getText();
	     	if(!"".equals(CheckOut_Page.sProductPrice)){
	     		Reporter.log("Verification Passed for Product Price on Check Out page.");
	     	}else{
	     		Reporter.log("Verification Failed for Product Price on Check Out page.");
	     		BaseClass.bResult=false;
	     
	     	}
	     	
	     
	     	CheckOut_Page.btn_Continue().click();
		 }

}
