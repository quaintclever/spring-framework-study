package com.quaint.spring.test;

import com.quaint.spring.config.QuaintAppConfig;
import com.quaint.spring.service.QuaintTestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author quaint
 * @date 2019-12-31 13:45
 */
public class QuaintTest {

	public static void main(String[] args) {

		// 初始化 spring 上下文 , 容器
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(QuaintAppConfig.class);

		System.out.println(context.getBean(QuaintTestService.class));

	}

}
