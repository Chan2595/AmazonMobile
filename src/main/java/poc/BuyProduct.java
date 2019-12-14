package poc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BuyProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElementById("twotabsearchtextbox").sendKeys("Samsung Galaxy M30",Keys.ENTER);
		String price = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();

		System.out.println(price);
		driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
		Set<String> window1 = driver.getWindowHandles();
		List<String> window2 = new ArrayList<String>(window1);
		String ref2 = window2.get(1);
		driver.switchTo().window(ref2);
		String deliveryDate = driver.findElementById("ddmDeliveryMessage").getText();
		System.out.println(deliveryDate);
		driver.findElementById("add-to-cart-button").click();
		String cart=driver.findElementByXPath("//h1[contains(.,'Cart')]").getText();// ., specifies that it can have any text and the cart specifies to find the cart 
		System.out.println(cart);
		driver.findElementById("hlb-ptc-btn-native").click();
		driver.findElementById("continue").click();
		try {
			String errortext = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
			System.out.println(errortext);
		} catch (Exception e) {
			boolean displayed = driver.findElementByXPath("//div[@class='a-box-inner a-alert-container']").isDisplayed();
			// TODO Auto-generated catch block
			System.out.println(displayed);
		}
		driver.close();

		//div[@class='a-box-inner a-alert-container']



	}

}
