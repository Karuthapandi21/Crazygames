package org.porunai;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestNG  extends Base{
	@BeforeMethod 
public void Propose() {
	System.out.println("LOVE");
}
	@Test(priority=3,enabled=false)
	public void Propose1() {
		System.out.println("I love you Subhiksha darling ");
	}
	@Test(priority=1,invocationCount=2)
	public void Propose2() {
		System.out.println("I love you Jayaseeli darling");
	}
	@Test(priority=2)
	public void Propose3() {
		System.out.println("I love you Kruthu darling");
	}
	@AfterMethod
	public void k() {
		System.out.println("I am Karuthapandi");
		
	}
	
	}
	
	


