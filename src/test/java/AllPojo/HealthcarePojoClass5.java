package AllPojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.superclass.SuperClass;

public class HealthcarePojoClass5 extends SuperClass {

	public HealthcarePojoClass5() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-search-entityid='mck_23622333845']")
	private WebElement FourthLink;

	public WebElement getFourthLink() {
		return FourthLink;
	}

	
	@FindBy(xpath = "//a[@data-search-entityid='mck_23622336677']")
	private WebElement FifthLink;

	public WebElement getFifthLink() {
		return FifthLink;
	}

	@FindBy(xpath = "//a[@data-search-entityid='mck_23622333848']")
	private WebElement SixthLink;

	public WebElement getSixthLink() {
		return SixthLink;
	}

	@FindBy(xpath = "//a[@data-search-entityid='mck_23622336955']")
	private WebElement SeventhLink;

	public WebElement getSeventhLink() {
		return SeventhLink;
	}
















}