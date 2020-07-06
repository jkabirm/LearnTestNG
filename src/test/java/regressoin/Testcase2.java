package regressoin;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase2 {
	@Test
public void validatetitle() {
String exp_title="yahoo.com";
String actual_title="gmail.com";


SoftAssert softass=new SoftAssert();


/* if(exp_title.equals(actual_title)) {
	 System.out.println("test case pass");
 } else {
	 System.out.println("test case fail");
 }

*/
//Assert.assertEquals(actual_title, exp_title); 
Assert.fail("");

}
}
