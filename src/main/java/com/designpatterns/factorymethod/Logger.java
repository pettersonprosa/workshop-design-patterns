package com.designpatterns.factorymethod;

public abstract class Logger {

    public abstract LogPrinter createLogger();

    // Método público que usa o Factory Method
    public void log(String message) {
        // Adiciona timestamp antes da mensagem
        String timestamp = java.time.LocalDateTime.now().toString();
        String formattedMessage = "[" + timestamp + "] " + message;
        
        // Usa o Factory Method para obter o LogPrinter e imprimir
        LogPrinter printer = createLogger();
        printer.print(formattedMessage);
    }
}
