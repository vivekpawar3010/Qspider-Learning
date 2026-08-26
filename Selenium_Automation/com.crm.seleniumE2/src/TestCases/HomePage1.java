package TestCases;


import UtilityClasses.BaseClass;
import UtilityClasses.SeleniumUtility;

public class HomePage1 {
	public static void main(String[] args) throws Exception {
		String expected_Url="https://demowebshop.tricentis.com/";
        BaseClass.precondition();
        String actual = BaseClass.driver.getCurrentUrl();
        if(expected_Url.equals(actual)){
            System.out.println("page loaded successully and testcase passed");
        }else{
            SeleniumUtility.webPageScreenshot(BaseClass.driver, "TC_001");
            BaseClass.postCondition();
            throw new Exception("page is not loaded succesfully and testcase fail");
        }
		
		
	}
}
