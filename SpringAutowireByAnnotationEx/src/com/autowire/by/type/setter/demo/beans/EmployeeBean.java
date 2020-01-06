package com.autowire.by.type.setter.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Here we are using @Autowired annotation in the setter method.
 * @author Surendar
 *
 */
public class EmployeeBean {

  private int employeeId;

  private String employeeName;

  private DepartmentBean deptBean;

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

  public DepartmentBean getDeptBean() {
    return deptBean;
  }

  @Autowired
  public void setDeptBean(DepartmentBean deptBean) {
    this.deptBean = deptBean;
  }

  @Override
  public String toString() {
    return "EmployeeBean [employeeId=" + employeeId + ", employeeName=" + employeeName + ", deptBean=" + deptBean + "]";
  }

}
