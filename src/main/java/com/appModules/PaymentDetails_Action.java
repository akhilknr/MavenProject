package com.appModules;

import org.testng.Reporter;

import com.pageObjects.PaymentDetails_Page;
import com.utility.Constant;
import com.utility.ExcelUtils;
import com.utility.Log;

public class PaymentDetails_Action {
		public static void execute(int iTestCaseRow) throws Exception{
			try{
	        	
				String sEmail = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Email);
				
				PaymentDetails_Page.txt_Email().clear();
	       
				PaymentDetails_Page.txt_Email().sendKeys(sEmail);
				
				Log.info(sEmail +" is entered as First Name on the Payment detail page");
				
				
				String sFirstName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_FirstName);
				PaymentDetails_Page.txt_FirstName().clear();
				PaymentDetails_Page.txt_FirstName().sendKeys(sFirstName);
				Log.info(sFirstName +" is entered as First Name on the Payment detail page");
				
				String sLastName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_LastName);
				PaymentDetails_Page.txt_LastName().clear();
				PaymentDetails_Page.txt_LastName().sendKeys(sLastName);
				Log.info(sLastName +" is entered as Last Name on the Payment detail page");
				
				String sAddress = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Address);
				PaymentDetails_Page.txt_Address().clear();
				PaymentDetails_Page.txt_Address().sendKeys(sAddress);
				Log.info(sAddress +" is entered as Address on the Payment detail page");
				
				String sCity = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_City);
				PaymentDetails_Page.txt_City().clear();
				PaymentDetails_Page.txt_City().sendKeys(sCity);
				Log.info(sCity +" is entered as City on the Payment detail page");
				
				String sCountry = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Country);
				PaymentDetails_Page.drpdwn_Country(sCountry);
				Log.info(sCountry +" is Selected as Country on the Payment detail page");
				
				String sPhone = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Phone);
				PaymentDetails_Page.txt_Phone().clear();
				PaymentDetails_Page.txt_Phone().sendKeys(sPhone);
				Log.info(sPhone +" is entered as Phone on the Payment detail page");
				
				if(!PaymentDetails_Page.chkbx_SameAsBillingAdd().isSelected()){
	
					PaymentDetails_Page.chkbx_SameAsBillingAdd().click();
					Log.info("Same as Billing address check box is selected on the Payment detail page");
				}

				PaymentDetails_Page.btn_Purchase().click();
				Log.info("Click action is performed on Purchase button on the Payment detail page");
				
				Reporter.log("Payment is successfully perfromed for the purchased product.");
				
		    }catch(Exception e){
				throw(e);
				}
			}
}
