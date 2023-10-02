package AllPojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.superclass.SuperClass;

public class HealthcarePojoClass3 extends SuperClass {

	public HealthcarePojoClass3() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-search-entityid='mck_23622333808']")
	private WebElement ThirdLink;

	public WebElement getThirdLink() {
		return ThirdLink;
	}

}