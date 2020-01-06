package com.autowired.annotations.listeners;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * BeanPostProcessor is an interface which provide two methods
 * (postProcessAfterInitialization and postProcessBeforeInitialization). We can
 * implement those methods and will do any pre object and post object
 * initialization activities in those two methods.
 * 
 * @author gbs04543
 *
 */
public class CustomBeanPostProcessor implements BeanPostProcessor {

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    System.out.println("postProcessAfterInitialization ==>" + bean.getClass() + " - " + beanName);
    return bean;
  }

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    System.out.println("postProcessBeforeInitialization ==>" + bean.getClass() + " - " + beanName);
    return bean;
  }

}
