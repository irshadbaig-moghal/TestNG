package com.ibm.testng;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParallelismAndTimeoutsSecondTest {
	
	@BeforeSuite
	public void beforeSuite(ITestContext context){
		System.out.println(context.getSuite().getName());
	}
	
	@Test
	public void firstTest(Method method, ITestContext context){
		System.out.println(method.getName()+" OF "+context.getCurrentXmlTest().getName());
	}
	
	@Test
	public void secondTest(Method method, ITestContext context){
		System.out.println(method.getName()+" OF "+context.getCurrentXmlTest().getName());
	}

}
