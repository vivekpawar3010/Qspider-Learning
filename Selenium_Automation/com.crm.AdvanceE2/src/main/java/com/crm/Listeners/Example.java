package com.crm.Listeners;

import java.io.File;
import java.util.logging.FileHandler;
import org.openqa.selenium.io.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utilities.BaseClass;
import Utilities.JavaUtility;

public class Example implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("OnTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("OnTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("OnTestFailuer");
		
		WebDriver driver = BaseClass.driver;
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		String name = JavaUtility.dynamicNameWithDateTime("tc_001");
		File location = new File(".\\src\\test\\resources\\" + name + ".png");
		try {
			FileHandler.copy(screenshot, location);
			Thread.sleep(1000);
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("OnTestSkipped");
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("OnStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("OnFinish");
	}
	
	
	
}
