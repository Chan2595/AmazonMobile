package com.amazon.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ChoosePhonePage extends ProjectSpecificMethods {
	public  ChoosePhonePage getPrice() {
		String price = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();
	
		System.out.println(price);
		return this;
	}
		public ProceedtoCheckout clickonPhone() {
		driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
		return new ProceedtoCheckout();
		
}
	
	
	}
	


