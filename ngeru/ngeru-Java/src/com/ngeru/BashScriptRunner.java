package com.ngeru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BashScriptRunner {

    private String scriptPath;

    public BashScriptRunner(String scriptPath) {
        this.scriptPath = scriptPath;
    }

    public void runScript() {
        ProcessBuilder processBuilder = new ProcessBuilder(scriptPath);
        processBuilder.redirectErrorStream(true); // Combine stdout and stderr

        try {
            Process process = processBuilder.start(); // Start the process

            // read the output from the command
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // wait for the process to finish
            int exitCode = process.waitFor();
            System.out.println("Process exited with code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
// Usage example:
//public class Main {
//    public static void main(String[] args) {
//        // Specify the path to your Bash script
//        String scriptPath = "./script.sh";
//
//        // Create an instance of BashScriptRunner and run the script
//        BashScriptRunner runner = new BashScriptRunner(scriptPath);
//        runner.runScript();
//    }
//}