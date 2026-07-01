package com.alertas;

public class SMS implements Alerta {

    @Override
    public void enviarAlerta(String mensaje) {
        System.out.println("Enviando alerta por SMS: " + mensaje);
    }

}
