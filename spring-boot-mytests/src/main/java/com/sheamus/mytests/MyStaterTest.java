package com.sheamus.mytests;

import com.sheamus.SimpleBean;
import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * title：
 */
@SpringBootTest
public class MyStaterTest {

	@Autowired
	private SimpleBean simpleBean;

	@Test
	public void getBean() {
		System.out.println(simpleBean);
	}

}
