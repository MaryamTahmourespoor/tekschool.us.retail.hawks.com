package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsAndNotebooksPageObject extends Base {

	public LaptopsAndNotebooksPageObject() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNotebooks;
	@FindBy(xpath = "(//a[@class='list-group-item'])[2]")
	private WebElement macs;
	@FindBy(xpath = "//*[@id=\"column-left\"]/div[1]/a[4]")
	private WebElement windows;
	@FindBy(xpath = "(//a[text()='Macs (0)'])[2]")
	private WebElement macs0;
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/ul/li[2]/a")
	private WebElement windows0;
	@FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
	private WebElement hplp3065;
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[7]")
	private WebElement addToCardHplp;
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookPro;
	@FindBy(xpath = "//a[contains(text(),'Air')]")
	private WebElement macBokAir;

	public void clickOnLaptopsAndNotebooks() {
		laptopsAndNotebooks.click();
	}

	public void clickOnMacs() {
		macs.click();
	}

	public void clickOnWindows() {
		windows.click();
	}

	public void clickOnMacs0() {
		macs0.click();
	}

	public void clickOnWindows0() {
		windows0.click();
	}

	public void clickOnHplp3065() {
		hplp3065.click();
	}

	public void clickOnAddToCardHplp() {
		addToCardHplp.click();
	}

	public void clickOnMacBookPro() {
		macBookPro.click();
	}

	public void clickOnMacBokAir() {
		macBokAir.click();
	}

}