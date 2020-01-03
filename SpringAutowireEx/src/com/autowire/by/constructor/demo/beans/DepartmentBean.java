package com.autowire.by.constructor.demo.beans;

public class DepartmentBean {

  private int deptId;

  private String departmentName;

  public DepartmentBean() {
  }

  public DepartmentBean(int deptId, String departmentName) {
    this.deptId = deptId;
    this.departmentName = departmentName;
  }

  @Override
  public String toString() {
    return "DepartmentBean [deptId=" + deptId + ", departmentName=" + departmentName + "]";
  }

}
