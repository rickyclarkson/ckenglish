package com.globant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class TextReceiveController extends AbstractController {
  @Override
  protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
    ModelAndView modelAndView = new ModelAndView("results.jsp");
    httpServletRequest.setAttribute("sanitized", "Sane");
    modelAndView.addObject("sanitized", "Sane");
    return modelAndView;
  }
}
