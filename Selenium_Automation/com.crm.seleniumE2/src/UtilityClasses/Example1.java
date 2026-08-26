package UtilityClasses;

import java.time.LocalDateTime;


public class Example1 {

	public static void main(String[] args) throws InterruptedException {

//		for (int i = 0; i < 100; i++) {
//			checkTime();
//			Thread.sleep(1000);
//		
//		}

		
		SeleniumUtility.webPageScreenshot(null, null);
	}

	public static void checkTime() {
//		LocalDateTime dateTime = LocalDateTime.now();
//		
//		String dt = dateTime.toString().replace(':', '-');
//		
//		String dynamicName = "DemoWorkShop" + dt;
//		
//		System.out.println(dynamicName);
		System.out.println(JavaUtility.dynamicNameWithDateTime("DateTime"));
	}

}


