import java.util.Scanner;

public class Avance1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombres de países y medallas correspondientes
        System.out.print("Nombre del país 1: ");
        String nombrePais1 = scanner.nextLine();
        System.out.print("Número de medallas de oro: ");
        int oroPais1 = scanner.nextInt();
        System.out.print("Número de medallas de plata: ");
        int plataPais1 = scanner.nextInt();
        System.out.print("Número de medallas de bronce: ");
        int broncePais1 = scanner.nextInt();

        System.out.print("Nombre del país 2: ");
        scanner.nextLine(); // Consumir el salto de línea
        String nombrePais2 = scanner.nextLine();
        System.out.print("Número de medallas de oro: ");
        int oroPais2 = scanner.nextInt();
        System.out.print("Número de medallas de plata: ");
        int plataPais2 = scanner.nextInt();
        System.out.print("Número de medallas de bronce: ");
        int broncePais2 = scanner.nextInt();

        System.out.print("Nombre del país 3: ");
        scanner.nextLine(); // Consumir el salto de línea
        String nombrePais3 = scanner.nextLine();
        System.out.print("Número de medallas de oro: ");
        int oroPais3 = scanner.nextInt();
        System.out.print("Número de medallas de plata: ");
        int plataPais3 = scanner.nextInt();
        System.out.print("Número de medallas de bronce: ");
        int broncePais3 = scanner.nextInt();

        // Calcular el puntaje total para cada país
        int puntajePais1 = oroPais1 * 3 + plataPais1 * 2 + broncePais1;
        int puntajePais2 = oroPais2 * 3 + plataPais2 * 2 + broncePais2;
        int puntajePais3 = oroPais3 * 3 + plataPais3 * 2 + broncePais3;

        // Imprimir el puntaje total de cada país
        System.out.println("El puntaje total de " + nombrePais1 + " es: " + puntajePais1);
        System.out.println("El puntaje total de " + nombrePais2 + " es: " + puntajePais2);
        System.out.println("El puntaje total de " + nombrePais3 + " es: " + puntajePais3);

        // Determinar el país que obtuvo el mayor puntaje
        if (puntajePais1 > puntajePais2 && puntajePais1 > puntajePais3) {
            System.out.println("El país que obtuvo mayor puntaje es: " + nombrePais1);
        } else if (puntajePais2 > puntajePais1 && puntajePais2 > puntajePais3) {
            System.out.println("El país que obtuvo mayor puntaje es: " + nombrePais2);
        } else if (puntajePais3 > puntajePais1 && puntajePais3 > puntajePais2) {
            System.out.println("El país que obtuvo mayor puntaje es: " + nombrePais3);
        } else {
            // Si hay empate, mostrar los países que empataron
            if (puntajePais1 == puntajePais2 && puntajePais1 == puntajePais3) {
                System.out.println("Hubo un empate entre " + nombrePais1 + ", " + nombrePais2 + " y " + nombrePais3);
            } else if (puntajePais1 == puntajePais2) {
                System.out.println("Hubo un empate entre " + nombrePais1 + " y " + nombrePais2);
            } else if (puntajePais1 == puntajePais3) {
                System.out.println("Hubo un empate entre " + nombrePais1 + " y " + nombrePais3);
            } else if (puntajePais2 == puntajePais3) {
                System.out.println("Hubo un empate entre " + nombrePais2 + " y " + nombrePais3);
            }
        }

        scanner.close();
    }
}