package org.porunai;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Search extends Base {
	public Search() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="search-input")
	private WebElement w;
	
	public  WebElement find() {
		return w;
		}
	public  void set (String l) {
		w.sendKeys(l);
	
	}
	@FindBy(xpath="//a[@aria-label='Snakes and Ladders']")
	private WebElement n;
	public  WebElement gameLoading() {
		return n;
	
	}
	public void Click() {
		n.click();
	}

	
	/*public  void Screenshot(String Pick) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		 File src = tk.getScreenshotAs(OutputType.FILE);
		 File  des=new File("C:\\Users\\91877\\eclipse-workspace\\New folder (2)\\Automation\\src\\test\\resources\\Image\\"+Pick+".png");
		 FileUtils.copyFile(src,des);		
	}*/
}
