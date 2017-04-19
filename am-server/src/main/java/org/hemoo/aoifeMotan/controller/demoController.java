package org.hemoo.aoifeMotan.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.hemoo.aoifeMotan.config.MyApplicationContext;
import org.hemoo.aoifeMotan.domain.PasPoint;
import org.hemoo.aoifeMotan.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by sunjiawei on 2017/4/1.
 */
@Controller
@RequestMapping(value = "/")
public class demoController {

//    @Autowired
//    private TestService testService;

//    @RequestLimit(count=10,time=3000)
    @RequestMapping(value="hello", method = RequestMethod.GET)
//    @ResponseBody
    public ModelAndView hi(){

        TestService testService = MyApplicationContext.getInstance().getBean(TestService.class);
        List<PasPoint> pss = testService.ps();
        String str = "what's your name?";
        ModelAndView mav = new ModelAndView();
        mav.addObject("str", pss);
        mav.setViewName("hello");
        return mav;
    }
}
