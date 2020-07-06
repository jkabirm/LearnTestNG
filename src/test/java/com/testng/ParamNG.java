package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamNG {

@Test(dataProvider="getdata")
public void testdata(String username,String password,String is_correct) {
System.out.println(username+"---"+password+"---"+is_correct);
}	
	
@DataProvider
public static Object[][] getdata()
{
	Object[][] data = new Object[2][3];
	return data;
}
	
	
	
	
	
}
