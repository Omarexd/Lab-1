package Laboratorio1;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab_1 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> estudiantes = new ArrayList<>();
    static ArrayList<Double> notas = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1: agregarEstudiante(); break;
                case 2: mostrarEstudiantes(); break;
                case 3: calcularPromedio(); break;
                case 4: mostrarMayorNota(); break;
                case 0: System.out.println("Saliendo-..."); break;
                default: System.out.println("Opción inválida");
            }

        } while (opcion != 0);
    }

    // MENU
    static void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Mostrar estudiantes");
        System.out.println("3. Calcular promedio");
        System.out.println("4. Mayor calificación");
        System.out.println("0. Salir");
    }

    static int leerEntero(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Ingrese un número válido.");
            }
        }
    }

    static double leerNota() {
        while (true) {
            try {
                System.out.print("Ingrese nota (0-100): ");
                double nota = Double.parseDouble(sc.nextLine());

                if (nota < 0 || nota > 100) {
                    System.out.println("La nota debe estar entre 0 y 100.");
                } else {
                    return nota;
                }

            } catch (Exception e) {
                System.out.println("Debe ingresar un número válido.");
            }
        }
    }

    static void agregarEstudiante() {
            try {
                System.out.print("Nombre del estudiante: ");
                String nombre = sc.nextLine();

                if (nombre.isEmpty()) {
                    System.out.println("El nombre no puede ser vacio");
                    throw new Exception();
                }

                if (nombre.matches(".*\\d.*")) {
                    System.out.println("El nombre no puede contener numeros");
                    throw new Exception();
                }

                double nota = leerNota();

                estudiantes.add(nombre);
                notas.add(nota);

                System.out.println("Estudiante agregado correctamente.");
            }catch (Exception e)
            {
                System.out.println("Ingrese un nombre valido");
            }
    }

    static void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println(estudiantes.get(i) + " - Nota: " + notas.get(i));
        }
    }

    static void calcularPromedio() {
        if (notas.isEmpty()) {
            System.out.println("No hay notas registradas.");
            return;
        }

        double suma = 0;
        for (double n : notas) suma += n;

        System.out.println("Promedio: " + (suma / notas.size()));
    }

    static void mostrarMayorNota() {
        if (notas.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        double mayor = notas.get(0);
        int posicion = 0;

        for (int i = 1; i < notas.size(); i++) {
            if (notas.get(i) > mayor) {
                mayor = notas.get(i);
                posicion = i;
            }
        }

        System.out.println("Mejor estudiante: " + estudiantes.get(posicion));
        System.out.println("Nota: " + mayor);
    }
}