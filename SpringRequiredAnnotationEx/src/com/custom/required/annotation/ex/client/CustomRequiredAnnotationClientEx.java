package com.custom.required.annotation.ex.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.custom.required.annotation.ex.beans.Customer;

public class CustomRequiredAnnotationClientEx {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
        "com/custom/required/annotation/ex/conf/applicationContext.xml");
    Customer customer = (Customer) appContext.getBean("customer");
    System.out.println(customer);
    appContext.close();
  }
}
