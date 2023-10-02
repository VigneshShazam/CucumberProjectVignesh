package AllPojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.superclass.SuperClass;

public class HealthcarePojoClass4 extends SuperClass {

	public HealthcarePojoClass4() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[@for='search-field']")
	private WebElement SearchBox;

	@FindBy(id = "search-field")
	private WebElement Searchfield;

	@FindBy(id = "onetrust-accept-btn-handler")
	private WebElement PopUp;

	@FindBy(id = "search-button")
	private WebElement SearchBtn;

	@FindBy(xpath = "//a[@data-search-entityid='mck_23622333827']")
	private WebElement FirstLink;

	public WebElement getSearchfield() {
		return Searchfield;
	}

	public WebElement getPopUp() {
		return PopUp;
	}

	public WebElement getSearchBox() {
		return SearchBox;
	}

	public WebElement getSearchBtn() {
		return SearchBtn;
	}

	public WebElement getFirstLink() {
		return FirstLink;
	}

//	@FindBys({
//		@FindBy(id="pass"),
//		@FindBy(xpath="//input[@data-testid='royal_pass']")
//	})
//	private WebElement txtPwd;
//	
//	@FindAll({
//		@FindBy(name="login"),
//		@FindBy(id="u_0_5_w4"),
//		@FindBy(xpath="//button[@type='submit']")
//	})
//	private WebElement LoginBtn;

//	public WebElement getTxtPwd() {
//		return txtPwd;
//	}
//
//	public WebElement getLoginBtn() {
//		return LoginBtn;
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	

}
