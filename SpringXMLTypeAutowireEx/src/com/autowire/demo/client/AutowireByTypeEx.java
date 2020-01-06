package com.autowire.demo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.autowire.by.type.demo.beans.EmployeeBean;

/**
 * This auto wiring happens based on the class type. So, we can have any name if
 * we want. So, it won't do anything with names. It will check if any type of
 * departmentBean is there in the bean factory. If present it will initialize
 * otherwise it will return as null
 * 
 * If we have two beans of same type then it will throw below error.
 * 
 * No unique bean of type [com.autowire.byType.demo.beans.DepartmentBean] is
 * defined: expected single matching bean but found 2: [departmentBean,
 * departmentBean1]
 * 
 * @author gbs04543
 *
 */
public class AutowireByTypeEx {

  public static void main(String[] args) {
    // For single context file we can pass directly like this
    ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("xml/applicationContextByType.xml");
    // For passing multiple context files we can pass the files inside the String
    // array like below
    // ApplicationContext appContext = new ClassPathXmlApplicationContext(new
    // String[] { "applicationContextByType.xml" });
    EmployeeBean employeeBean = (EmployeeBean) appContext.getBean("employeeBean");
    System.out.println(employeeBean);

    appContext.close();
  }
}
