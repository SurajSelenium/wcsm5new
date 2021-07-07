package flagsinTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
//c,d,b,a,e,f
public class Flag1 {
   //--------------------------------------
	@Test(priority = 4)
	public void c() 
	{
		Reporter.log("method c",true);
	}
	
	@Test(priority = -1)
	public void d() 
	{
		Reporter.log("method d",true);
	}
	
	@Test(priority = 2)
	public void b() 
	{
		Reporter.log("method b",true);
	}
	
	@Test()
	public void a() 
	{
		Reporter.log("method a",true);
	}
	
	
	@Test(priority = 1)
	public void e() 
	{
		Reporter.log("method e",true);
	}
	
	@Test(priority = 0)
	public void f() 
	{
		Reporter.log("method f",true);
		
	}
	
	
	
}
