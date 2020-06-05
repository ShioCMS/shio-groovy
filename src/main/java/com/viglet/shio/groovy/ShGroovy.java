package com.viglet.shio.groovy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.io.IOUtils;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;

public class ShGroovy {
    public static void main(String[] args) {

        System.out.println("Hello World");

        Binding binding = new Binding();
        binding.setVariable("language", "Groovy");

        GroovyShell shell = new GroovyShell(binding);
        InputStream is = ShGroovy.class.getClassLoader().getResourceAsStream("groovy/template.groovy");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        
        try {
            String s = IOUtils.toString(br);
            System.out.println(shell.evaluate(s));
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        

    }
}