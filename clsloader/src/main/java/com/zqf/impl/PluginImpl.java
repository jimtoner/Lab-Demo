package com.zqf.impl;

import com.zqf.intf.Plugin;

public class PluginImpl implements Plugin {
    public String helloWorld(String name) {
        return "hello,"+name;
    }
}
