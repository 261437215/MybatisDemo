package com.ray.mybatis.entity;


import java.util.List;

public class Combo {

  private long id; // 运营商编号
  private String name; //运营商列表
  private List<UserCombo> userCombos;

  public List<UserCombo> getUserCombos() {
    return userCombos;
  }

  public void setUserCombos(List<UserCombo> userCombos) {
    this.userCombos = userCombos;
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

  @Override
  public String toString() {
    return "Combo{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", userCombos=" + userCombos +
            '}';
  }
}
