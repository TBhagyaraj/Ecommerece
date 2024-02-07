package com.PageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.base.TestBase;

public class WishlistFunctionality extends TestBase{

	
	@FindBy(xpath="//span[@class=\"ptr\"]")
	WebElement OppoF23;
			
	@FindBy(xpath="//i[@class=\"fa fa-heart-o \"]")
	WebElement Oppowishlist;
	
    @FindBy(xpath = "//a[text()='Home']")
    WebElement Homebutton;
    
    @FindBy(xpath="(//a[@href=\"https://e-quarz.com/product/avro-furniture-set-of-2-plastic-chairs-matt-and-gloss-pattern-plastic-chairs-for-home-living-room-bearing-capacity-up-to\"])[1]")
    WebElement AvroFurniture;
    
    @FindBy(xpath="//i[@class=\"fa fa-heart-o \"]")
    WebElement Avrowishlist;
    
    @FindBy(xpath="//img[@alt=\"Realme\"]")
    WebElement RealmeMobiles;
	
	@FindBy(xpath = "(//div[@class=\"d-flex d-block\"])[2]")
    WebElement GiftKart;
	
	@FindBy(xpath = "//i[@class='fa fa-heart-o ']")
    WebElement GKwishlist;
	
	@FindBy(xpath="//a[@href=\"https://e-quarz.com/wishlists\"]")
	WebElement Heart;
	
	@FindBy(xpath="//i[@onclick=\"removeWishlist('16')\"]")
	WebElement RemoveAvro;
	
	@FindBy(xpath="(//a[@class=\"navbar-tool-icon-box bg-secondary dropdown-toggle\"])[1]")
	WebElement Hearts;
	
	@FindBy(xpath="//a[text()='WOW IMAGINE Oppo F23 5G Slim Ultra Soft Rubberised Back Cover']")
	WebElement Selectproduct;
	
	@FindBy(xpath="//button[@onclick=\"buy_now()\"]")
    WebElement ProductBuy;
	
	@FindBy(xpath="//span[@class=\"countWishlist\"]")
	WebElement WishlistCount;
	
	public WishlistFunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void OPPO()
	{
		OppoF23.click();
		Oppowishlist.click();
	}
	
	public void homepage()
	{
		Homebutton.click();;
	}
	public void Avro()
	{
		AvroFurniture.click();  
		Avrowishlist.click();
    }

    public void realme() 
    {
    	RealmeMobiles.click();	
    	GiftKart.click();
    	GKwishlist.click();
    }

    public void Remove() 
    {
    	Heart.click();
    	RemoveAvro.click();
    }

	public void Buy()
	{
		Hearts.click();
		Selectproduct.click();
		ProductBuy.click();
	}
	public void count() 
	{
		WishlistCount.click();
	}
	

	
}
