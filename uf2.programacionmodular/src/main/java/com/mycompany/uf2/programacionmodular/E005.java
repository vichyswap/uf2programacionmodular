package com.mycompany.uf2.programacionmodular;;

public class E005 {

    public static void main(String[] args) {
        int contador = 1;

        int list[] = new int[3];

        list[0] = 1;
        list[1] = 2;
        list[2] = 3;

        duplicarArray(list);
        for (int i = 0; i < 3; i++) {
            System.out.println(list[i]);
        }
    }

    public static int duplicarValor(int x) {
        x = x * 2;
        return x;
    }

    public static void duplicarArray(int[] lista) {
        for (int i = 0; i < 3; i++) {
            lista[i] = lista[i] * 2;
        }
    }
}
