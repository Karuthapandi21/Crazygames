package org.pom;
import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LogIn extends Baseclass {
	//verify login page
	public LogIn() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='header-login-button']")
	private WebElement loginbtn;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement continuebtn;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="(//button[text()='Log in'])[2]")
	private WebElement loginbtn2;
	
	
	public WebElement loginbtn() {
		return loginbtn;
	}
	
	public WebElement email() {
		return email;
	}
	
	public WebElement continuebtn() {
		return continuebtn;
	}
	
	public WebElement pass() {
		return pass;
	}
	
	public WebElement loginbtn2() {
		return loginbtn2;
	}
	
	
	
public void loginButton() throws InterruptedException{
		LogIn l=new LogIn();
		l.loginbtn().click();
		Thread.sleep(3000);
		l.email().sendKeys("Pandi8@gmail.com");
		Thread.sleep(5000);
		l.continuebtn().click();
		Thread.sleep(5000);
		l.pass().sendKeys("pandi@8");
		Thread.sleep(5000);
		l.loginbtn2().click();
		
		
		
		 }
}
