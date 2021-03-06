package com.globant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class TextReceiveController extends AbstractController {
  @Override
  protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
    ModelAndView modelAndView = new ModelAndView("results.jsp");
    httpServletRequest.setAttribute("sanitized", new HTMLInputFilter().filter(httpServletRequest.getParameter("text")));
    modelAndView.addObject("sanitized", new HTMLInputFilter().filter(httpServletRequest.getParameter("text")));
    return modelAndView;
  }
}
