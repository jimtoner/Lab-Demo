package com.zqf.clsloader;

import com.zqf.intf.Plugin;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class UrlClsloader {
    public void dotest() {
        try {
            URL url = UrlClsloader.class.getResource("/../clsloader-1.0-SNAPSHOT.jar");
            URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{url});
            Class cl = Class.forName("com.zqf.impl.PluginImpl", true, urlClassLoader);
            Plugin plugin = (Plugin) cl.newInstance();
            System.out.println(plugin.helloWorld("chris"));
            urlClassLoader.close();

            urlClassLoader = new URLClassLoader(new URL[]{url});
            cl = Class.forName("com.zqf.impl.PluginImpl", true, urlClassLoader);
            plugin = (Plugin) cl.newInstance();
            System.out.println(plugin.helloWorld("000"));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UrlClsloader urlClsloader = new UrlClsloader();
        urlClsloader.dotest();

    }
}
