package com.designpatterns.factorymethod;

public class ConsoleLogPrinter implements LogPrinter {

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
