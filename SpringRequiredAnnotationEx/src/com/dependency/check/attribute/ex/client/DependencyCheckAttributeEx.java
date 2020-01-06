package com.dependency.check.attribute.ex.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dependency.check.attribute.ex.beans.Customer;

public class DependencyCheckAttributeEx {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
        "com/dependency/check/attribute/ex/conf/applicationContext.xml");
    Customer customer = (Customer) appContext.getBean("customer");
    System.out.println(customer);
    appContext.close();
  }
}
