package com.ray.mybatis.entity;


import java.util.List;

public class UserCombo {

  private long uid; // 用户编号
  private long cid; // 运营商编号
  private long price; // 价格
  private List<Combo> combos; // 运营商列表
  private List<User> users; // 用户列表

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }

  public List<Combo> getCombos() {
    return combos;
  }

  public void setCombos(List<Combo> combos) {
    this.combos = combos;
  }

  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "UserCombo{" +
            "uid=" + uid +
            ", cid=" + cid +
            ", price=" + price +
            ", combos=" + combos +
            '}';
  }
}
