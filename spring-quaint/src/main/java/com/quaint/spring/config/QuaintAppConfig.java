package com.quaint.spring.config;

import com.quaint.spring.service.impl.QuaintTestServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author quaint
 * @date 2019-12-31 14:27
 */
@ComponentScan("com.quaint.spring")
//@Configuration
public class QuaintAppConfig implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

//		GenericBeanDefinition quaintUserService = (GenericBeanDefinition) beanFactory.getBeanDefinition("quaintUserServiceImpl");
//		quaintUserService.setBeanClass(QuaintTestServiceImpl.class);

	}
}
