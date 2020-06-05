package com.viglet.shio.groovy;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import groovy.lang.Script;
import groovy.util.GroovyScriptEngine;

public class ShGroovy {

    public static void main(String[] args) {

        System.out.println("Hello World");

        Binding binding = new Binding();
        binding.setVariable("language", "Groovy");

        GroovyShell shell = new GroovyShell(binding);

        System.out.println(shell.evaluate("(1..10).sum()"));

    }
}