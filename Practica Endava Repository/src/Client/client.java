package Client;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client {
	
	public static void main(String[] args) {
		
		try (Socket socket = new Socket("localhost", 8070)) {
            BufferedReader text = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter outputt= new PrintWriter(socket.getOutputStream(), true);

            @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
            int inputt;
            String lines;
            
            System.out.println("Choose from one 1 to 3 for the next operations:");
            System.out.println("1 for showing the sum of all orders.");	     
            System.out.println("2 for showing the order with highest price.");	  
            System.out.println("3 for showing the order with lowest price.");	   		         
            System.out.println("4 or more for closing the connection");	
          
            do {
                inputt = scan.nextInt();
                outputt.println(inputt); 
                
                lines = text.readLine();
                System.out.println(lines);
                                        
            } while(!(inputt == 4));

        } catch (IOException e) {
            System.out.println("Client Error: " + e.getMessage());

        }
	}
}
