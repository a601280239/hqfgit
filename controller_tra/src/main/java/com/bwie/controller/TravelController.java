/**
 * Create Date:2019年3月15日
 */
package com.bwie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bwie.bean.Travel;
import com.bwie.service.TravelService;

/**
 * @作者： 黄庆丰
 * @时间： 2019年3月15日
 */
@Controller
public class TravelController {
  @Autowired
  private TravelService ts;

  @RequestMapping("list.do")
  public String list(Model m) {
    List<Travel> list = ts.selectAll();
    m.addAttribute("list", list);
    return "list";

  }
}
