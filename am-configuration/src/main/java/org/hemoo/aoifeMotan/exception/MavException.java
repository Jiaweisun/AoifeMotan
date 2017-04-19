package org.hemoo.aoifeMotan.exception;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sunjiawei on 2017/4/17.
 */
@ControllerAdvice
public class MavException {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("e", e);
        mv.addObject("uri", req.getRequestURI());
        return mv;
    }
}
