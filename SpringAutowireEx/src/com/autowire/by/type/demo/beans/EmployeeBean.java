package com.autowire.by.type.demo.beans;

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

  public void setDeptBean(DepartmentBean deptBean) {
    this.deptBean = deptBean;
  }

  @Override
  public String toString() {
    return "EmployeeBean [employeeId=" + employeeId + ", employeeName=" + employeeName + ", deptBean=" + deptBean + "]";
  }

}
