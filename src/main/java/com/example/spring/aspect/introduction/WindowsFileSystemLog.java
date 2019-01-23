package com.example.spring.aspect.introduction;

/**
 * Created by Yang, Haiqiang on 2019/01/23.
 */
public class WindowsFileSystemLog implements FileSystemLog {

    @Override
    public void saveToDisk() {
        System.out.println("**AOP LOG*************save to DeskTop folder");
    }
}
