package com.autowire.by.constructor.demo.beans;

public class EmployeeBean {

  private int employeeId;

  private String employeeName;

  private DepartmentBean departmentBean;

  public EmployeeBean(int employeeId, String employeeName, DepartmentBean departmentBean) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.departmentBean = departmentBean;
  }

  @Override
  public String toString() {
    return "EmployeeBean [employeeId=" + employeeId + ", employeeName=" + employeeName + ", departmentBean="
        + departmentBean + "]";
  }

}
