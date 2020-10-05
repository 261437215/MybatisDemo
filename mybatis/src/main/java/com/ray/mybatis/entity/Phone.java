package com.ray.mybatis.entity;


public class Phone {

  private long id;
  private String name;
  private long number;
  private long uid;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }

  @Override
  public String toString() {
    return "Phone{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", number=" + number +
            ", uid=" + uid +
            '}';
  }
}
