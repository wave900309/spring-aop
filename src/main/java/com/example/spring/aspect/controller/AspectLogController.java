package com.example.spring.aspect.controller;

import com.example.spring.aspect.service.AspectLogService;
import com.example.spring.aspect.service.IntroductionLogService;
import com.example.spring.aspect.service.SelfInvokeTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yang, Haiqiang on 2018/09/13.
 */
@RestController
@RequestMapping("aspect")
public class AspectLogController {

    @Autowired
    private AspectLogService aspectLogService;

    @Autowired
    private IntroductionLogService introductionLogService;

    @Autowired
    private SelfInvokeTestService selfInvokeTestService;

    @RequestMapping(path = "/specifiedMethod")
    public String log() {
        aspectLogService.log();
        return "success";
    }

    @RequestMapping("/hasAnnotations")
    public String log2() {
        aspectLogService.logWithAnnotations();
        return "success";
    }

    @RequestMapping("/fileLog")
    public String log3() {
        introductionLogService.logToFile();
        return "success";
    }

    @RequestMapping("/selfLog")
    public String log4() {
        selfInvokeTestService.doLog();
        return "success";
    }
}
