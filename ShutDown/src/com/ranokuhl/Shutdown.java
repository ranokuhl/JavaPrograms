package com.ranokuhl;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Shutdown {


    public static void main(String args[]) throws UnknownHostException {


        Runtime rt = Runtime.getRuntime();
        try
        {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input computername: ");

            String userInput = scanner.nextLine();



            InetAddress IPAddress = InetAddress.getByName(userInput);

            System.out.println("Restarting " + IPAddress.getHostName());
            System.out.println("IP Address: " + IPAddress.getHostAddress());

            // Process pr=rt.exec("cmd /c shutdown -s"); // for shutdown
            // System.out.println("Printing \u00050");
            Process pr1 = rt.exec("cmd /c shutdown -r -f -t 0 -m \\\\" + IPAddress.getHostAddress()); // for restart
            // Process pr2=rt.exec("cmd /c shutdown -l"); // for log off

            System.out.println("Computer " + IPAddress.getHostName() + " has been restarted.");


        }
        catch(Exception e)
        {

        }
    }

}
