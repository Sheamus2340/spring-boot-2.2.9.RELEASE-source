package com.sheamus.config;

import com.sheamus.SimpleBean;
import com.sheamus.mark.ConfigMarker;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * title：
 */
@Configuration
@ConditionalOnBean(ConfigMarker.class)
public class MyAutoConfiguration {

	static {
		System.out.println(" MyAutoConfiguration init ...");
	}

	@Bean
	public SimpleBean getSimpleBean() {
		return new SimpleBean();
	}

}
