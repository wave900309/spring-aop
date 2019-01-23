package com.example.spring.aspect.aop;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Yang, Haiqiang on 2018/09/13.
 */
public class LogPointCut {

    @Pointcut("execution(void com.example.spring.aspect.service.AspectLogService.log(..))")
    public void SpecifiedMethod() {

    }

    @Pointcut("within(com.example.spring.aspect.controller..*) && execution(* l*(..))")
    public void webLayer() {

    }

    @Pointcut("@annotation(com.example.spring.aspect.model.AspectLog)")
    public void annotationMethod() {

    }

    @Pointcut("within(com.example.spring.aspect..*)")
    public void allLayer() {

    }
}
