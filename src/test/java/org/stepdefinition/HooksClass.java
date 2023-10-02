package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.superclass.SuperClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends SuperClass {

	@Before(order = 1)
	public void OpenBrowser() {
		openChrome();
		launchUrl("https://www.mckesson.com/");
	}

	@Before(order = 2)
	public void MaxWindow() {
		maxwindow();
		toImplicitWait(20);
	}

	@After(order = 2)
	public void printBrowser() {
		System.out.println("Google Browser");
	}

	@After(order = 1)
	public void CloBrowser(Scenario s) throws IOException {
		String name = s.getName();
		String filename = name.replace(" ", "_");
		takescreenshot(filename);

		if (s.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "image/png");

		}

		closeBrowser();
	}

}
