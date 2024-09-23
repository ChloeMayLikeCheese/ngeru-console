package com.ngeru;

import java.io.*;
import java.util.Scanner;

public class PortScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting IP address: ");
        String startingIP = scanner.nextLine();

        System.out.print("Enter the last octet of the last IP address: ");
        String lastOctet = scanner.nextLine();

        System.out.print("Enter the port you want to scan for: ");
        String port = scanner.nextLine();

        String nmapCommand = String.format("nmap -sT %s-%s -p %s -oG MySqlscan", startingIP, lastOctet, port);

        try {
            // Execute the nmap command
            ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", nmapCommand);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            process.waitFor();

            // Read nmap output
            File outputFile = new File("MySqlscan");
            File outputFilteredFile = new File("MySqlscan2 ");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                 FileWriter writer =    new FileWriter(outputFilteredFile)) {

                String line;
                while ((line = reader.readLine()) != null) {
                    // Filter for open ports
                    if (line.contains("open")) {
                        writer.write(line + System.lineSeparator());
                    }
                }
            }

            // Display filtered output
            System.out.println("Results:");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(outputFilteredFile)))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}


