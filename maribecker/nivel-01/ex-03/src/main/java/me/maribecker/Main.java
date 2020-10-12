package me.maribecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero1 = scanner.nextInt();

        System.out.println("Digite outro número");
        int numero2 = scanner.nextInt();

        System.out.println("A soma dos dois números digitados é " + (numero1 + numero2));
    }
}
