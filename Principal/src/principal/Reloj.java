
package principal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class Reloj {
    protected LocalDateTime hora;

    public Reloj(LocalDateTime hora) {
        this.hora = LocalDateTime.now();
    }

    public void mostrarHora() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("Fecha: " + formatter.format(hora));
    }

    public void aumentarHoras(int horas) {
        hora = hora.plusHours(horas);
    }

    public void aumentarMinutos(int minutos) {
        hora = hora.plusMinutes(minutos);
    }

    public void aumentarSegundos(int segundos) {
        hora = hora.plusSeconds(segundos);
    }

    public void aumentarDias(int dias) {
        hora = hora.plusDays(dias);
    }

    public void aumentarAnios(int anios) {
        hora = hora.plusYears(anios);
    }
}
