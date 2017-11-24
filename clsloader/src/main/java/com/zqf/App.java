package com.zqf;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(App.class.getResource("/"));
        System.out.println(App.class.getResource("/").getPath());
    }
}
