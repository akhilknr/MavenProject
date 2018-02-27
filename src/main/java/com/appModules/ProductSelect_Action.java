package com.appModules;

import com.pageObjects.Home_Page;
import com.pageObjects.ProductListing_Page;
import com.utility.Constant;
import com.utility.ExcelUtils;
import com.utility.Log;

public class ProductSelect_Action {
		public static void productType(int iTestCaseRow) throws Exception{
			try{
				
				if("Accessories".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductType))){
		        	
					Home_Page.TopNavigation.Product_Type.Accessories();
					Log.info("Product Type Accessories is selected from the Top menu");
				}
				if("iMacs".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductType))){
					Home_Page.TopNavigation.Product_Type.iMacs();
					Log.info("Product Type iMacs is selected from the Top menu");
				}
				if("iPads".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductType))){
					Home_Page.TopNavigation.Product_Type.iPads();
					Log.info("Product Type iPads is selected from the Top menu");
				}
				if("iPhones".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductType))){
					Home_Page.TopNavigation.Product_Type.iPhones();
					Log.info("Product Type iPhones is selected from the Top menu");
				}
				if("".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductType))){
					Log.warn("Excel value for Product Type is Blank");
				}
			
		    }catch(Exception e){
		    	throw(e);
				}
			}
		
		
		public static void productNumber(int iTestCaseRow) throws Exception{
			try{
				
				if("Product 1".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductNumber))){
					
					ProductListing_Page.Product_1.btn_AddToCart().click();
					Log.info("Product 1 is selected from the Product listing page");
				}
				if("Product 2".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductNumber))){
					ProductListing_Page.Product_2.btn_AddToCart().click();
					Log.info("Product 2 is selected from the Product listing page");
				}
				if("".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductNumber))){
					Log.warn("Excel value for Product Number is Blank");
				}
				
				ProductListing_Page.PopUpAddToCart.btn_GoToCart().click();

			 }catch(Exception e){
				
				throw(e);
				}
			}

}
