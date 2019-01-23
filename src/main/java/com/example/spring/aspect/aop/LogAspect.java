package com.example.spring.aspect.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Yang, Haiqiang on 2018/09/13.
 */
@Aspect
@Component
public class LogAspect {

    @Around("com.example.spring.aspect.aop.LogPointCut.SpecifiedMethod()")
    public Object advice1(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long end = System.currentTimeMillis();
        String method = pjp.getSignature().getName();
        System.out.println("**AOP LOG*************specified method [" + method + "] takes " + (end - start) + " ms");
        return obj;
    }

    //@Around("com.example.spring.aspect.aop.LogPointCut.webLayer()")
    public Object advice2(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long end = System.currentTimeMillis();
        String method = pjp.getSignature().getName();
        System.out.println("**AOP LOG*************web method [" + method + "] + takes " + (end - start) + " ms");
        return obj;
    }

    @Before("com.example.spring.aspect.aop.LogPointCut.annotationMethod()")
    public void advice3(JoinPoint jp) {
        String method = jp.getSignature().getName();
        System.out.println("**AOP LOG*************invoke method [" + method + "] with @AspectLog");
    }

    //@AfterReturning("com.example.spring.aspect.aop.LogPointCut.allLayer()")
    public void advice4(JoinPoint jp) {
        String method = jp.getSignature().getName();
        System.out.println("**AOP LOG*************invoke method [" + method + "] with AfterReturning");
    }

}
