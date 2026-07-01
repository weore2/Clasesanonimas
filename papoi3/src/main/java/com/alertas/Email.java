package com.alertas;

public class Email implements Alerta {

    @Override
    public void enviarAlerta(String mensaje) {
        System.out.println("Enviando alerta por correo electrónico: " + mensaje);
    }

}
