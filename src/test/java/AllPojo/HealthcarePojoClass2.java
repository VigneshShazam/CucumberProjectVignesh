package AllPojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.superclass.SuperClass;

public class HealthcarePojoClass2 extends SuperClass {

	public HealthcarePojoClass2() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-search-entityid='mck_105226703631']")
	private WebElement SecLink;

	public WebElement getSecLink() {
		return SecLink;
	}

}