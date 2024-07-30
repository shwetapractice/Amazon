package base;



import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonClassTestPage {

	
	WebDriver driver;

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")private WebElement searchBox;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")private WebElement serBut;
	@FindBy(linkText="Today's Deals")private WebElement deal;
	@FindBy(xpath="(//*[@class='a-truncate-cut'])[1]")private WebElement item;
	@FindBy(xpath="//div[@id='titleSection']")private WebElement titlesection;
	@FindBy(xpath="(//span[@class='a-price-whole'])[5]")private WebElement price;
	@FindBy(xpath="(//*[@class='a-truncate-cut'])[5]")private WebElement item2;
	@FindBy(xpath="//*[@class='a-size-large product-title-word-break']")private WebElement title2;
	@FindBy(xpath="(//*[@class='a-price-whole'])[5]")private WebElement price2;
	
	public AmazonClassTestPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void test_1() throws InterruptedException
	{
		searchBox.sendKeys("iphone");
		serBut.click();
	}
	
	public void test_2()
	{
		deal.click();
	}
	
	public void test_3() throws IOException
	{
		item.click();
		ExcelFileHandle.writeData(0, 0, 0, titlesection.getText());
		ExcelFileHandle.writeData(0, 0, 1, price.getText());
	}
	
	public void test_4() throws IOException
	{
		item2.click();
		ExcelFileHandle.writeData(1, 0, 0, title2.getText());
		ExcelFileHandle.writeData(1, 0, 1, price2.getText());
	}
	
}
