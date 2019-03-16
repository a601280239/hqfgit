/**
 * Create Date:2019年3月15日
 */
package com.bwie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bwie.bean.Travel;
import com.bwie.dao.TravelDao;

/**
 * @作者： 黄庆丰
 * @时间： 2019年3月15日
 */
@Service
@Transactional
public class TravelServiceImp implements TravelService {
  @Autowired
  private TravelDao td;

  @Override
  public List<Travel> selectAll() {
    // TODO Auto-generated method stub
    return td.selectAll();
  }

}
