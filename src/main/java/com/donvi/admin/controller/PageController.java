package com.donvi.admin.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description:
 * @Author: yangdongwei
 * @CreateDate: 2020/4/13
 * @Version: 1.0
 */
@RestController
public class PageController {

    @RequestMapping("/testFrame")
    public ModelAndView testFrame(){
        ModelAndView mav = new ModelAndView("editGoods.html");
        return mav;
    }

}
