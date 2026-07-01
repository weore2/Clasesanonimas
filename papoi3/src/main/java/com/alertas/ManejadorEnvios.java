package com.alertas;

public class ManejadorEnvios {

    private Alerta[] alertas = new Alerta[2];
    private int contador = 0;

    void agregarNotificacion(Alerta alerta) {
            if ( contador < alertas.length) {
                alertas[contador] = alerta;
                contador++;
            } else {
                Alerta radioAlerta = new Email() {
                    @Override
                    public void enviarAlerta(String mensaje) {
                        System.out.println("Arreglo saturado. No se pueden agregar más alertas. Enviando alerta por radio: " + mensaje);
                    }
                };
                radioAlerta.enviarAlerta("¡Alerta de radio!");
        }
    }

    void enviarNotificaciones() {
        for(Alerta alerta : alertas) {
            alerta.enviarAlerta("¡Alerta de prueba!");
        }
    }
}
