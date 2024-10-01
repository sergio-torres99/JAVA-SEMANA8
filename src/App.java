import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIngrese los números separados por comas: ");
        String entrada = scanner.nextLine();

        String[] elementos = entrada.split(",");
        double[] datos = new double[elementos.length];

        for (int i = 0; i < elementos.length; i++) {
            boolean entradaValida = false;

            while (!entradaValida) {
                try {
                    datos[i] = Double.parseDouble(elementos[i]);
                    entradaValida = true; // Salimos del bucle si la entrada es válida
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Debe ser un número.");
                    System.out.print("Por favor, ingrese un número para el valor " + (i + 1) + ": ");
                    elementos[i] = scanner.nextLine();
                }
            }
        }

        double suma = 0;

        for (double dato : datos) {
            suma += dato;
        }

        double media = suma / datos.length;

        double sumaCuadrados = 0;
        for (double dato : datos) {
            sumaCuadrados += Math.pow(dato - media, 2);
        }

        double varianza = sumaCuadrados / datos.length;
        System.out.println("La varianza es: " + varianza);

        scanner.close();

    //NUEVO EJERCICIO (Nota final estudiante)

        // Scanner scanner = new Scanner(System.in);
        
        // // Solicitar al usuario la cantidad de notas
        // System.out.print("\n¿Cuántas notas quieres ingresar? ");
        // int cantidadNotas = scanner.nextInt();
        
        // // Crear un arreglo para almacenar las notas
        // double[] notas = new double[cantidadNotas];
        // double sumaNotas = 0;
        
        // // Solicitar al usuario que ingrese las notas
        // System.out.println("Ingresa las notas (rengo 0.0 a 5.0):");
        // for (int i = 0; i < cantidadNotas; i++) {
        //     System.out.print("Nota " + (i + 1) + ": ");
        //     notas[i] = scanner.nextDouble();
            
        //     // Validar que la nota esté dentro del rango permitido (0.0 a 5.0)
        //     while (notas[i] < 0 || notas[i] > 5) {
        //         System.out.println("Nota inválida. Ingresa una nota entre 0.0 y 5.0:");
        //         notas[i] = scanner.nextDouble();
        //     }
            
        //     sumaNotas += notas[i]; // Sumar las notas para luego calcular el promedio
        // }
        
        // // Calcular el promedio de las notas
        // double promedio = sumaNotas / cantidadNotas;
        
        // // Definir el criterio de aprobación (en este caso, 3.0 es el mínimo para aprobar)
        // double notaAprobatoria = 3.0;
        
        // // Determinar si el estudiante aprobó o no
        // System.out.println("\nPromedio del estudiante: " + promedio);
        // if (promedio >= notaAprobatoria) {
        //     System.out.println("¡Felicidades! Has aprobado el curso.");
        // } else {
        //     System.out.println("Lo siento, no has aprobado el curso.");
        // }
        
        // scanner.close();
    



     }
}
