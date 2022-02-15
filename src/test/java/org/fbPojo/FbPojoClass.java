package org.fbPojo;

import org.base.FbHelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPojoClass extends FbHelperClass {
	
	public FbPojoClass() {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement emailid;
	
	@FindBy(id="pass")
	private WebElement passwd;
	
	@FindBy(name="login")
	private WebElement lgnbtn;

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getLgnbtn() {
		return lgnbtn;
	}
	
	
	

}
