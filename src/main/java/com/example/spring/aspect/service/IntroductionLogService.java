package com.example.spring.aspect.service;

import com.example.spring.aspect.introduction.FileSystemLog;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;

/**
 * Created by Yang, Haiqiang on 2019/01/23.
 */
@Service
public class IntroductionLogService {

    public void logToFile() {
        AspectLogService aspectLogService = (AspectLogService) AopContext.currentProxy();
        FileSystemLog fileSystemLogUtil = (FileSystemLog) aspectLogService;
        fileSystemLogUtil.saveToDisk();
    }

}
