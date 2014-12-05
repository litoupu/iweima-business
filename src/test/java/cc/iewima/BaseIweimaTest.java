package cc.iewima;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/iweima-spring.xml")
public abstract class BaseIweimaTest {
	
	static {
		try {
            Log4jConfigurer.initLogging("classpath:config/log4j.properties");  
        } catch (FileNotFoundException ex) {  
            System.err.println("Cannot Initialize log4j");  
        }
	}
	Logger logger = Logger.getLogger(BaseIweimaTest.class);
	
}
