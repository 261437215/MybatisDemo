package com.ray.mybatis.entity;


import java.util.List;

public class User {

  private long id;
  private String name;

  // phone集合
  private List<Phone> phones;
  private List<UserCombo> userCombos;

  public List<UserCombo> getUserCombos() {
    return userCombos;
  }

  public void setUserCombos(List<UserCombo> userCombos) {
    this.userCombos = userCombos;
  }

  public List<Phone> getPhones() {
    return phones;
  }

  public void setPhones(List<Phone> phones) {
    this.phones = phones;
  }

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

  public User() {

  }

  public User(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}
