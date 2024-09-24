package com.ngeru;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("  ／l、\n（ﾟ､ ｡７\n l、ﾞ~ヽ\n じしf_, )ノ \n");


//      Create scanner33
        Scanner scanner = new Scanner(System.in);
//      while loop for the input prompt and switch statement
        while (true) {
            System.out.print("\uD83D\uDC08/> ");

//          Convert input to lower case
            String input = scanner.next().toLowerCase();

//          Switch statement for input
            switch (input) {
                case "help":
                    System.out.println("help - Display Information On Commands\n2");
                    break;
                case "test2":
                    System.out.println("test2");
                    break;


            }
        }
    }
}