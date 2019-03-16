/**
 * Create Date:2019年3月15日
 */
package com.bwie.bean;

/**
 * @作者： 黄庆丰
 * @时间： 2019年3月15日
 */
public class Travel {
  private int tid;

  private String tname;

  private double price;

  private int num;

  private int up_num;

  private String descp;

  @Override
  public String toString() {
    return "Travel [tid=" + tid + ", tname=" + tname + ", price=" + price + ", num=" + num + ", up_num="
      + up_num + ", descp=" + descp + "]";
  }

  public Travel() {
    super();
  }

  public int getTid() {
    return tid;
  }

  public void setTid(int tid) {
    this.tid = tid;
  }

  public String getTname() {
    return tname;
  }

  public void setTname(String tname) {
    this.tname = tname;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public int getUp_num() {
    return up_num;
  }

  public void setUp_num(int up_num) {
    this.up_num = up_num;
  }

  public String getDescp() {
    return descp;
  }

  public void setDescp(String descp) {
    this.descp = descp;
  }

}
