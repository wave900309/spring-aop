package com.example.spring.aspect.service;

import com.example.spring.aspect.model.AspectLog;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by Yang, Haiqiang on 2019/01/23.
 */
@Service
public class SelfInvokeTestService {

    @Autowired
    private ApplicationContext context;

    public void doLog() {
        //SelfInvokeTestService self = (SelfInvokeTestService)AopContext.currentProxy();
        SelfInvokeTestService self = (SelfInvokeTestService)context.getBean("selfInvokeTestService");
        self.selfLog();
        //selfLog();
    }

    @AspectLog
    public void selfLog() {

    }
}
