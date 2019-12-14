package com.amazon.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ProceedtoCheckout extends ProjectSpecificMethods {

	public  ProceedtoCheckout PrintDeliveryDate() {
	Set<String> window1 = driver.getWindowHandles();
	List<String> window2 = new ArrayList<String>(window1);
	String ref2 = window2.get(1);
	driver.switchTo().window(ref2);
	String deliveryDate = driver.findElementById("ddmDeliveryMessage").getText();
	System.out.println(deliveryDate);
	return this;
}
public ProceedToBuy clickonAddtoCart() {
	driver.findElementById("add-to-cart-button").click();
return new ProceedToBuy();
}
}