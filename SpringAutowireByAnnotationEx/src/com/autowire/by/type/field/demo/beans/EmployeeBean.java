package com.autowire.by.type.field.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Here we are auto wiring the department bean through fields.
 * @author Surendar
 *
 */
public class EmployeeBean {

  private int employeeId;

  private String employeeName;

  /*
   * @Autowired default logic is injection byType. In this case if we have two beans for the same type we will get NoSuchBeanDefinitionException error.
   * So, to solve this we have to use @Primary or @Qualifier depends on the business.
   * In this example we are not showing the @Qualifier since spring 2.5.6 version won't have component-scan feature. 
   * Here AutowiredAnnotationBeanPostProcessor class which only scans @Autowired annotation not @Qualifier. So, we can't use @Qualifier here
   */
  @Autowired
  private DepartmentBean departmentBean;

  public int getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  @Override
  public String toString() {
    return "EmployeeBean [employeeId=" + employeeId + ", employeeName=" + employeeName + ", departmentBean="
        + departmentBean + "]";
  }

}
