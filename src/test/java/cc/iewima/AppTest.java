package cc.iewima;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cc.iweima.App;

public class AppTest extends BaseIweimaTest{
	@Autowired
	App app;
	
	@Test
	public void testPrint(){
		app.print();
		logger.info("----testPrint----");
		System.out.println("end!");
	}
    
}
