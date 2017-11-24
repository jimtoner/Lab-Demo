package com.zqf.impl;

import com.zqf.intf.Plugin;

public class PluginImpl2 implements Plugin {
    public PluginImpl2(){
        System.out.println("init ....");
    }
    static {
        System.out.println("static init ...");
    }
    public String helloWorld(String name) {
        return "hello,hello,"+name;
    }
}
