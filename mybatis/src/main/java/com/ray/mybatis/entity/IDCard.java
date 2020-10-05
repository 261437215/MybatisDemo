package com.ray.mybatis.entity;


public class IDCard {

  // 用户编号
  private long uid;

  //身份证
  private long cardid;

  //用户的实体类
  private User user;

  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public long getCardid() {
    return cardid;
  }

  public void setCardid(long cardid) {
    this.cardid = cardid;
  }

}
