package com.example.spring.aspect.aop;

import com.example.spring.aspect.introduction.FileSystemLog;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by Yang, Haiqiang on 2019/01/23.
 */
@Aspect
@Component
public class FileLogAspect {

    @DeclareParents(value = "com.example.spring.aspect.service.*",
            defaultImpl = com.example.spring.aspect.introduction.WindowsFileSystemLog.class)
    public FileSystemLog fileSystemLog;
}
