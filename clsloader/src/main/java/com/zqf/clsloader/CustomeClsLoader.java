package com.zqf.clsloader;

import com.zqf.intf.Plugin;

import java.io.*;

public class CustomeClsLoader {
    public static void main(String[] args) {
        MyLoader myLoader = new MyLoader(CustomeClsLoader.class.getResource("/").getPath());
        try {
            Class cl = Class.forName("com.zqf.impl.PluginImpl2", true, myLoader);
            System.out.println("--------------------------------------------");
            Plugin plugin = (Plugin) cl.newInstance();
            System.out.println(plugin.helloWorld("chris"));

            Class<?> cl2=myLoader.loadClass("com.zqf.impl.PluginImpl2");
            System.out.println("--------------------------------------------");
            Plugin plugin2= (Plugin) cl2.newInstance();
            System.out.println(plugin2.helloWorld("00000"));

            System.out.println("--------------------------------------------");
            System.out.println(cl.equals(cl2));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    static class MyLoader extends ClassLoader {
        private String classPath;

        public MyLoader(String classPath) {
            this.classPath = classPath;
        }

        @Override
        protected Class<?> findClass(String name) throws ClassNotFoundException {
            byte[] classBytes = this.getClassBytes(name);
            if (classBytes == null) {
                throw new ClassNotFoundException(name);
            } else {
                return defineClass(name, classBytes, 0, classBytes.length);
            }
        }

        private byte[] getClassBytes(String name) throws ClassNotFoundException {
            byte[] classBytes = null;
            String className = this.classPath.concat(name.replace(".", File.separator)).concat(".class");
            try {
                BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(className));
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                int bytesNumRead = 0;
                byte[] buffer = new byte[1024];
                while ((bytesNumRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesNumRead);
                }
                classBytes = outputStream.toByteArray();
            } catch (FileNotFoundException e) {
                throw new ClassNotFoundException(className);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return classBytes;
        }
    }
}
