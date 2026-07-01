package com.alertas;

public class Main {
    public static void main(String[] args) {

        Alerta alertaEmail = new Email();
        Alerta alertaSMS = new SMS();

        ManejadorEnvios notificador = new ManejadorEnvios();
        notificador.agregarNotificacion(alertaEmail);
        notificador.agregarNotificacion(alertaSMS);
        notificador.agregarNotificacion(alertaSMS);

        notificador.enviarNotificaciones();

        }

    }
