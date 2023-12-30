package VickyProject;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Groceryclass extends BaseClass {

		
	
	          public void ordercreation() throws IOException, InterruptedException {
	        	  
	        	  
	        	  browserLaunch();
	        	  maximizeWindow();
	        	  
	        	  
	        	  enterApplnUrl(getCellData("login",1,0));
	        	  
	        	  WebElement txtusername=LocatorById("email");
	        	  elementSendkeys(txtusername,getCellData("login",1,1));
	        	  
	        	  WebElement txtpass=LocatorById("pass");
	        	  elementSendkeys(txtpass,getCellData("login",1,2));
	        	  
	        	  WebElement btnlogin=LocatorByXpath("//button[text()='Login']");
	        	  elementClick(btnlogin);
	        	  
	        	
	        	  

	      		WebElement txtSearch = LocatorById("search");
	      		elementSendkeysenter(txtSearch, getCellData("Grocery", 1, 3));
	      		
	      		WebElement searchResult = LocatorByXpath("//h5[contains(text(),'Search Result')]");
	      		String result = getText(searchResult);
	      		System.out.println(result);
	      		
	      		WebElement clickProduct = LocatorByXpath("//a[contains(@class,'addBtn-17')]");
	      		elementClick(clickProduct);
	      		
	      		WebElement clickVariant = LocatorById("cart-21");
	      		elementClick(clickVariant);
	      		
	      		WebElement btnGoToCart = LocatorByXpath("//a[text()=' Go To Cart ']");
	      		clickJs(btnGoToCart);
	      		
	      		WebElement myCartTxt = LocatorByXpath("//h5[text()='My Cart']");
	      		String myCart = getText(myCartTxt);
	      		System.out.println(myCart);
	      		
	      		WebElement btnAddress = LocatorByXpath("//div[@data-target='#addressModal']");
	      		elementClick(btnAddress);

	      		WebElement ddnAddressType = LocatorById("address_type");
	      		selectOptionByVisibleText(ddnAddressType, getCellData("Grocery", 1, 4));
	      		
	      		WebElement txtFirstName = LocatorByName("first_name");
	      		elementSendkeys(txtFirstName, getCellData("Grocery", 1, 5));
	      		
	      		WebElement txtLastName = LocatorByName("last_name");
	      		elementSendkeys(txtLastName, getCellData("Grocery", 1, 6));
	      		
	      		WebElement mobileNo = LocatorByName("mobile");
	      		elementSendkeys(mobileNo, getCellData("Grocery", 1, 7));
	      		
	      		WebElement txtAddressLine1 = LocatorByName("apartment");
	      		elementSendkeys(txtAddressLine1, getCellData("Grocery", 1, 8));
	      		
	      		WebElement txtAddressLine2 = LocatorByName("address");
	      		elementSendkeys(txtAddressLine2, getCellData("Grocery", 1, 9));
	      		
	      		WebElement ddnState = LocatorByName("state");
	      		selectOptionByVisibleText(ddnState, getCellData("Grocery", 1, 10));
	      		
	      		WebElement ddnCity = LocatorByName("city");
	      		selectOptionByVisibleText(ddnCity, getCellData("Grocery", 1, 11));
	      		
	      		WebElement txtZipCode = LocatorByName("zipcode");
	      		elementSendkeys(txtZipCode, getCellData("Grocery", 1, 12));
	      		
	      		WebElement btnSave = LocatorByXpath("//button[contains(@class,'saveAddress')]");
	      		elementClick(btnSave);
	      		
	      		Thread.sleep(1000);
	      		WebElement debitCard = LocatorByXpath("//option[text()=' Debit Card ']");
	      		elementClick(debitCard);
	      		
	      		WebElement radioBtnVisa = LocatorByXpath("//label[@for='visa_card']");
	      		elementClick(radioBtnVisa);
	      				
	      		WebElement txtCardNo = LocatorByName("card_no");
	      		elementSendkeys(txtCardNo, getCellData("Grocery", 1, 13));
	      		
	      		WebElement ddnMonth = LocatorById("month");
	      		selectOptionByValue(ddnMonth, getCellData("Grocery", 1, 14));
	      		
	      		WebElement ddnYear = LocatorById("year");
	      		selectOptionByValue(ddnYear, getCellData("Grocery", 1, 15));
	      		
	      		WebElement txtCvv = LocatorByName("cvv");
	      		elementSendkeys(txtCvv, getCellData("Grocery", 1, 16));
	      		
	      		WebElement btnPlaceOrder = LocatorById("placeOrder");
	      		elementClick(btnPlaceOrder);
	      		
	      		WebElement orderNoTxt = LocatorByXpath("(//span[@class='font16 fontNormal color36'])[1]");
	      		String orderNo = getText(orderNoTxt);
	      		createCellData("Grocery", 1, 17, orderNo);
	      		System.out.println(orderNo);		
	      	}
	        	  
	        	  
	        	  
	          
	
	
	
	      	public static void main(String[] args) throws IOException, InterruptedException {	
	Groceryclass groceryclass = new Groceryclass();
	groceryclass.ordercreation();
	
	
	
	
	
	}
}
