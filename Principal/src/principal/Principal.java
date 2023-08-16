
package principal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que tipo de reloj desea usar?");
        System.out.println("1. Reloj normal");
        System.out.println("2. Reloj Fit");
        System.out.print("Elija una opcion: ");
        int tipoReloj = scanner.nextInt();
        
        Reloj reloj = new Reloj(LocalDateTime.now());
       if (tipoReloj == 2) {
          reloj = new RelojFit(reloj.hora);}
        Persona unaPersona = new Persona("Juan", reloj);

        int opcion;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Ver fecha y hora");
            if (reloj instanceof RelojFit) {
                System.out.println("2. Iniciar contador de pasos");
                System.out.println("3. Detener contador de pasos");
                System.out.println("4. Contar pasos");
                System.out.println("5. Frecuencia aleatoria");
            } else {
                System.out.println("2. Aumentar horas");
                System.out.println("3. Aumentar minutos");
                System.out.println("4. Aumentar segundos");
                System.out.println("5. Aumentar dias");
                System.out.println("6. Aumentar anios");
            }
            System.out.println("7. Salir");
            System.out.print("Elija una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
                    System.out.println("Fecha: " + dateFormatter.format(reloj.hora.toLocalDate()));
                    System.out.println("Hora: " + timeFormatter.format(reloj.hora.toLocalTime()));
                    break;
                case 2:
                    if (reloj instanceof RelojFit) {
                        ((RelojFit) reloj).iniciarContadorPasos();
                    } else {
                        System.out.print("Ingrese la cantidad de horas a aumentar: ");
                        int horas = scanner.nextInt();
                        reloj.aumentarHoras(horas);
                    }
                    break;
                case 3:
                    if (reloj instanceof RelojFit) {
                        ((RelojFit) reloj).detenerContadorPasos();
                    } else {
                        System.out.print("Ingrese la cantidad de minutos a aumentar: ");
                        int minutos = scanner.nextInt();
                        reloj.aumentarMinutos(minutos);
                    }
                    break;
                case 4:
                    if (reloj instanceof RelojFit) {
                        System.out.print("Ingrese las coordenadas X e Y: ");
                        int x = scanner.nextInt();
                        int y = scanner.nextInt();
                        ((RelojFit) reloj).cuentaPasos(x, y);
                    } else {
                        System.out.print("Ingrese la cantidad de segundos a aumentar: ");
                        int segundos = scanner.nextInt();
                        reloj.aumentarSegundos(segundos);
                    }
                    break;
                case 5:
                    if (reloj instanceof RelojFit) {
                        ((RelojFit) reloj).frecuenciaAleatoria();
                    } else {
                        System.out.print("Ingrese la cantidad de días a aumentar: ");
                        int dias = scanner.nextInt();
                        reloj.aumentarDias(dias);
                    }
                    break;
                case 6:
                    if (!(reloj instanceof RelojFit)) {
                        System.out.print("Ingrese la cantidad de anios a aumentar: ");
                        int anios = scanner.nextInt();
                        reloj.aumentarAnios(anios);
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
              
            }
        } while (opcion != 7);
    }
 }


