package com.amazon.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ProceedToBuy extends ProjectSpecificMethods{
	public ProceedToBuy verifyAddedtoCart() {
		String cart= driver.findElementByXPath("//h1[contains(.,'Cart')]").getText();// ., specifies that it can have any text and the cart specifies to find the cart 
		System.out.println(cart);
return this;
	}
public LoginPage ClickProceedtoBuyButton() {
	driver.findElementById("hlb-ptc-btn-native").click();
	return new LoginPage();
}
}
