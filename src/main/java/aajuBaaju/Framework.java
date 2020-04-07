package aajuBaaju;

import static org.junit.Assert.assertEquals;

import org.apache.http.util.Asserts;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Framework {
	@Before
	public void beforeTest() throws Exception {
		
		 Logger logger = Logger.getLogger(Framework.class);
		 
		 
		try {
		assertEquals(1, 2);
		}catch(AssertionError e) {
			logger.info(e.getMessage());
			logger.info("");
		}
		logger.info("Before test .....");
		System.out.println("Before test .....");
		Keywords.openBrowser();
		Keywords.navigateBrowser();
		Thread.sleep(3000);
		Keywords.screenShot();
		
			
}
	@Test( )
	public void atTest() throws Exception {
		System.out.println("At test");
		//Keywords.registerAccount();
		Keywords.loginAccount();
		//Keywords.search();
}
	@After
	public void afterTest() {
		System.out.println("......After test");
		Keywords.closeBrowser();
	}
}