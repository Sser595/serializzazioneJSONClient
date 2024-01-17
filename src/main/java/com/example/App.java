package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        try {
            System.out.println("Il client è partito");
            Socket s = new Socket("localhost", 1111);

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String infor =in.readLine();
            System.out.println(infor);        
            s.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("errore durante l'istanza del server");
            System.exit(1);
        }
    }
}
