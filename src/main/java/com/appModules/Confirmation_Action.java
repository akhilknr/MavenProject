package com.appModules;

import org.testng.Reporter;

import com.pageObjects.BaseClass;
import com.pageObjects.Confirmation_Page;

public class Confirmation_Action {
	 public static void Execute() throws Exception{

	     	Confirmation_Page.sProductName=Confirmation_Page.txt_ProductName().getText();
	     	
	        
	     	if(!"".equals(Confirmation_Page.sProductName)){
	     		Reporter.log("Verification Passed for Product Name on Confirmation page");
	     	}else{
	     	    
	     		Reporter.log("Verification Failed for Product Name on Confirmation page");
	     		
	     		BaseClass.bResult=false;
	     	}
	     	
	     	Confirmation_Page.sProductPrice= Confirmation_Page.txt_ProductPrice().getText();
	     	if(!"".equals(Confirmation_Page.sProductPrice)){
	     		Reporter.log("Verification Passed for Product Price on Confirmation page");
	     	}else{
	     		Reporter.log("Verification Failed for Product Price on Confirmation page");
	     		BaseClass.bResult=false;
	     	}
		 }

}
