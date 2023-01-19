package A07;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    // Revertir la cadena de texto
    public static String reverse(String texto) {
        String revertido = "";
        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
            revertido = caracter + revertido;
        }
        return revertido;
    }

    public static void corredorUnidimensional(String[] strings) {
        for (String string :
                strings) {
            System.out.println(string);
        }
    }
    
    public static void corredorBidimensional(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.println("El valor de la celda " + (i + 1) + "-" + (j + 1) + " es: " + ints[i][j]);
            }
        }
    }

    public static int dividirPorCero(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void copiar(String entrada, String salida) {
        try {
            InputStream inputStream = new FileInputStream(entrada);
            byte[] datos = inputStream.readAllBytes();
            inputStream.close();

            PrintStream printStream = new PrintStream(salida);
            printStream.write(datos);
            printStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("\nEjercicio #1");
        String texto = "hola mundo";
        System.out.println("\nLa cadena original era: " + texto);
        System.out.println("La cadena invertida es: " + reverse(texto));
        System.out.println("👺👹💀");

        System.out.println("\nEjercicio #2");
        String[] arrayUni = {"It's", "a", "shame", "to", "lay", "in", "on", "a", "day", "like", "this."};
        System.out.println("\nLos valores del Array Unidimensional son:");
        corredorUnidimensional(arrayUni);

        System.out.println("\nEjercicio #3");
        int[][] arrayBi = {
                {23, 98, 14, 64, 77, 32, 41, 87, 3, 69},
                {9, 86, 37, 91, 44, 50, 40, 21, 67, 2}
        };
        System.out.println("\nLos valores del Array Bidimensional son:");
        corredorBidimensional(arrayBi);

        System.out.println("\nEjercicio #4");
        Vector<Integer> vector = new Vector<>();
        vector.add(39);
        vector.add(8);
        vector.add(96);
        vector.add(54);
        vector.add(12);
        System.out.println("Así luce el Vector antes de editarlo: " + vector);
        vector.remove(2);
        vector.remove(1);
        System.out.println("Así quedó el Vector después de editarlo: " + vector);

        System.out.println("\nEjercicio #5");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Billie");
        arrayList.add("Holiday");
        arrayList.add("Easy");
        arrayList.add("Living");

        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            linkedList.add(i, arrayList.get(i));
        }

        System.out.println("Elementos del ArrayList:");
        for (String strings : arrayList) {
            System.out.print(strings + " ");
        }
        System.out.println("\n\nElementos del LinkedList:");
        for (String strings : linkedList) {
            System.out.print(strings + " ");
        }

        System.out.println("\n\nEjercicio #6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica los números que quieres dividir: ");
        System.out.print("Número 1: ");
        int a = scanner.nextInt();
        System.out.print("Número 2: ");
        int b = scanner.nextInt();
        try {
            System.out.println("Resultado: " + dividirPorCero(a, b));
        } catch (ArithmeticException e) {
            System.out.println("El valor es infinito; " + e.getClass());
        }

        System.out.println("\n\nEjercicio #7");
        String entrada = scanner.nextLine();
        String salida = scanner.nextLine();
        copiar(entrada, salida);
    }
}
