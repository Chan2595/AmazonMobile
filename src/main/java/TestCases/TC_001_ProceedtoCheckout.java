package TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.pages.Homepage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC_001_ProceedtoCheckout extends ProjectSpecificMethods{
	@BeforeTest
	public void set() {
		excelFileName = "Amazon";
	}
	@Test(dataProvider = "fetchData")
	public void runTestcase(String Phonename){
		new Homepage()
		.enterText(Phonename)	

		.getPrice()
		.clickonPhone()

		.PrintDeliveryDate()
		.clickonAddtoCart()

		.verifyAddedtoCart()
		.ClickProceedtoBuyButton()

		.clickOnContinue()
		.checkErrorMessage();
	}
}

