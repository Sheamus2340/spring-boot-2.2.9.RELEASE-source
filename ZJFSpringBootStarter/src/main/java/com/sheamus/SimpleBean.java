package com.sheamus;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * title：
 */
@ConfigurationProperties(prefix = "simpleBean")
@EnableConfigurationProperties(SimpleBean.class)
public class SimpleBean {

	private int id;

	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SimpleBean() {
	}

	public SimpleBean(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "id:" + id + ",name:" + name;
	}

}
