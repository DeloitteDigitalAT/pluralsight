package com.al;

import java.io.FileFilter;
import java.io.File;
import java.util.Arrays;

    public class FirstLambda {

    public static void main(String[] args) {
        
        FileFilter filter = (File file) -> file.getName().endsWith(".class");
           
        String path = FirstLambda.class.getResource(".").getPath();
        
        File root = new File(path);
        File[] files = root.listFiles(filter);
        System.out.println(Arrays.toString(files));
    }
    
    
}
