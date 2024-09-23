package com.ngeru;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ／l、" );
        System.out.println("（ﾟ､ ｡７" );
        System.out.println(" l、ﾞ~ヽ");
        System.out.println("じしf_, )ノ ");
        System.out.println("    ");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\uD83D\uDC08/> ");

            String input = scanner.next().toLowerCase();


            switch (input) {
                case "help":
                    System.out.println("1\n2");
                    break;
                case "test2":
                    System.out.println("test2");
                    break;

            }
        }
    }
}