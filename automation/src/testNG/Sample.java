package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {
  @Test
  public void f()
  {
	  Reporter.log("test 1",true);
  }
}
