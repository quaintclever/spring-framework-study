package com.quaint.spring.po;

import org.springframework.stereotype.Component;

/**
 * @author quaint
 * @date 2019-12-31 14:08
 */
@Component
public class QuaintUser {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "QuaintUser{" +
				"name='" + name + '\'' +
				'}';
	}
}
