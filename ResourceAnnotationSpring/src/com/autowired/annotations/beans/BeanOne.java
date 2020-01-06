package com.autowired.annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanOne {

  @Autowired
  public BeanTwo beanTwo;

  public BeanTwo getBeanTwo() {
    return beanTwo;
  }

  public void setBeanTwo(BeanTwo beanTwo) {
    this.beanTwo = beanTwo;
  }

  public void doSomething() {
    System.out.println("BeanOne doSomething method");
    beanTwo.doSomething();
  }

}
