package org.stepDefinitionFb;

import org.base.FbHelperClass;

import io.cucumber.java.Before;

public class Hooks extends FbHelperClass {

	@Before
	public void bef() {
	
		lauchBrowser();
		loadUrl("https://www.facebook.com");
		maxBrowser();

	}
	
}
