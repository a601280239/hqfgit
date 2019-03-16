/**
 * Create Date:2019年3月15日
 */
package com.bwie.dao;

import java.util.List;

import com.bwie.bean.Travel;

/**
 * @作者： 黄庆丰
 * @时间： 2019年3月15日
 */
public interface TravelDao {
  public List<Travel> selectAll();
}
