package com.sheamus.test;

import com.sheamus.SimpleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

/**
 * title：
 */
@SpringBootTest
public class MyAutoStarterTest {

	@Autowired
	private SimpleBean simpleBean;

	@Test
	public void getBean() {
		System.out.println(simpleBean);
	}

}

