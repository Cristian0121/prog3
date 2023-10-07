//Presentado por:
// Cristian Enrique Quintero 
// Juan Diego Rojas Lopez

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class Temporizador extends TimerTask {
    private String mensaje;

    public Temporizador(String mensaje) {
        this.mensaje = mensaje;
    }

    public void run() {
        System.out.println(mensaje);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Timer timer = new Timer();
        int contador = 0;

        while (true) {
            System.out.print("¿Desea crear un nuevo temporizador? (s/n): ");
            String respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("s")) {
                contador++;
                System.out.print("Introduzca el mensaje para el temporizador " + contador + ": ");
                String mensaje = sc.nextLine();
                System.out.print("Introduzca el tiempo de espera para el temporizador " + contador + " en milisegundos: ");
                long tiempo = sc.nextLong();
                sc.nextLine();

                Temporizador tarea = new Temporizador(mensaje);
                timer.schedule(tarea, tiempo);

                System.out.println("Se ha creado el temporizador " + contador + " con éxito.");
            } else if (respuesta.equalsIgnoreCase("n")) {
                System.out.println("Se ha terminado la creación de temporizadores.");
                break;
            } else {
                System.out.println("Respuesta inválida. Por favor, introduzca 's' o 'n'.");
            }
        }

        while (true) {
            System.out.print("¿Desea detener o reiniciar algún temporizador? (s/n): ");
            String respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("s")) {
                System.out.print("¿Desea detener o reiniciar un temporizador? (d/r): ");
                String accion = sc.nextLine();

                if (accion.equalsIgnoreCase("d")) {
                    System.out.print("Introduzca el número del temporizador que desea detener: ");
                    int numero = sc.nextInt();
                    sc.nextLine();

                    if (numero > 0 && numero <= contador) {
                        timer.cancel();
                        System.out.println("Se ha detenido el temporizador " + numero + ".");
                    } else {
                        System.out.println("Número inválido. Por favor, introduzca un número entre 1 y " + contador + ".");
                    }
                } else if (accion.equalsIgnoreCase("r")) {
                    System.out.print("Introduzca el número del temporizador que desea reiniciar: ");
                    int numero = sc.nextInt();
                    sc.nextLine();

                    if (numero > 0 && numero <= contador) {
                        timer.purge();
                        System.out.println("Se ha reiniciado el temporizador " + numero + ".");
                    } else {
                        System.out.println("Número inválido. Por favor, introduzca un número entre 1 y " + contador + ".");
                    }
                } else {
                    System.out.println("Acción inválida. Por favor, introduzca 'd' o 'r'.");
                }
            } else if (respuesta.equalsIgnoreCase("n")) {
                System.out.println("Se ha terminado la gestión de temporizadores.");
                break;
            } else {
                System.out.println("Respuesta inválida. Por favor, introduzca 's' o 'n'.");
            }
        }

        sc.close();
    }
}
