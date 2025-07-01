package com.designpatterns.factorymethod;

public class CalculadoraDeImpostos {

    private Logger logger;

    public CalculadoraDeImpostos(Logger logger) {
        this.logger = logger;
    }

    public void calcular(double valor) {
        // Simulação de cálculo de impostos
        double imposto = valor * 0.15; // 15% de imposto
        
        // no fim, o programador gostaria de deixar registrado o valor calculado
        logger.log("Imposto calculado para o valor R$ " + imposto);
    }

}