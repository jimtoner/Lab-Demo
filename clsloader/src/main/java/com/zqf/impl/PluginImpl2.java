package com.zqf.impl;

import com.zqf.intf.Plugin;

public class PluginImpl2 implements Plugin {
    public String helloWorld(String name) {
        return "hello,hello,"+name;
    }
}
