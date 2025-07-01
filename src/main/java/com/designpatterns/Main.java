package com.designpatterns;

import com.designpatterns.factorymethod.CalculadoraDeImpostos;
import com.designpatterns.factorymethod.ConsoleLogCreator;
import com.designpatterns.factorymethod.Logger;

public class Main {
    public static void main(String[] args) {
        // Exemplo usando Console Logger
        Logger consoleLogger = new ConsoleLogCreator();
        CalculadoraDeImpostos calc1 = new CalculadoraDeImpostos(consoleLogger);
        calc1.calcular(1000.0);
    }
}