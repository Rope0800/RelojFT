
package principal;

import java.time.LocalDateTime;
import java.util.Random;

class RelojFit extends Reloj {
    private boolean contadorPasosActivo = false;
    private int pasosContados = 0;

    public RelojFit(LocalDateTime hora) {
        super(hora);
    }

    public void iniciarContadorPasos() {
        contadorPasosActivo = true;
        pasosContados = 0;
        System.out.println("Contador de pasos iniciado.");
    }

    public void detenerContadorPasos() {
        contadorPasosActivo = false;
        System.out.println("Contador de pasos detenido. Pasos contados: " + pasosContados);
    }

    public void cuentaPasos(int x, int y) {
        if (contadorPasosActivo) {
            int pasos = Math.abs(x) + Math.abs(y);
            pasosContados += pasos;
            System.out.println("Pasos contados: " + pasos);
        } else {
            System.out.println("El contador de pasos no está activo. Inícialo primero.");
        }
    }

    public void frecuenciaAleatoria() {
        Random random = new Random();
        int frecuencia = random.nextInt(100) + 60; // Frecuencia entre 60 y 159
        System.out.println("Frecuencia aleatoria: " + frecuencia + " bpm");
    }
}