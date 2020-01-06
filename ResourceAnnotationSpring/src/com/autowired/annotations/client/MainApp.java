package com.autowired.annotations.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.autowired.annotations.beans.BeanOne;

public class MainApp {

  public static void main(String[] args) {
    System.out.println("MainApp for calling the beans");
    ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
        "com/autowired/annotations/conf/appContextForResourceAnnotation.xml");
    BeanOne beanOne = (BeanOne) appContext.getBean("beanOne");
    beanOne.doSomething();
    appContext.close();
  }
}
