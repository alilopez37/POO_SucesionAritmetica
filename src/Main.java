import models.SucesionAritmetica;

import java.util.Scanner;

public class Main {
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        short size;
        short[] array;
        SucesionAritmetica objeto;
        System.out.println("App - Suceción Aritmética");
        System.out.print("Ingresa el tamaño del arreglo: ");
        size = keyboard.nextShort();
        array = new short[size];
        for (short i=0;i<array.length;i++){
            System.out.print("Array["+i+"]: ");
            array[i] = keyboard.nextShort();
        }
        objeto = new SucesionAritmetica();
        objeto.initData(size);
        objeto.setData(array);
        objeto.run();
        System.out.println("Total: " + objeto.getCount());

    }
}