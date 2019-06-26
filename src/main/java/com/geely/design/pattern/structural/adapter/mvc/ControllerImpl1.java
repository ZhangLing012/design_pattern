package com.geely.design.pattern.structural.adapter.mvc;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerImpl1 extends ControllerImpl {
    void hand1() {
        System.out.println("ControllerImpl1");
    }
}
