package com.ngeru;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("  ／l、\n（ﾟ､ ｡７\n l、ﾞ~ヽ\n じしf_, )ノ \n");


//      Create scanner
        Scanner scanner = new Scanner(System.in);
//      while loop for the input prompt and switch statement
        while (true) {
            System.out.print("\uD83D\uDC08/> ");

//          Convert input to lower case
            String input = scanner.next().toLowerCase();

//          Strings needed for commands
            String scriptPath = "ngeru/ngeru-Java/src/com/ngeru/windows_meterpreter";

//          Switch statement for input
            switch (input) {
                case "help":
                    System.out.println("help - Display Information On Commands\nwmeterpretr - Windows Meterpeter shell via MSF");
                    break;
                case "wmeterpreter":
                    BashScriptRunner runner = new BashScriptRunner(scriptPath);
                    runner.runScript();
                    break;


            }
        }
    }
}