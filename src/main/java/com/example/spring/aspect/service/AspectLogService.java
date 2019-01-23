package com.example.spring.aspect.service;

import com.example.spring.aspect.model.AspectLog;
import org.springframework.stereotype.Service;

/**
 * Created by Yang, Haiqiang on 2018/09/13.
 */
@Service
public class AspectLogService {

    public void log() {

    }

    @AspectLog
    public void logWithAnnotations() {

    }
}
