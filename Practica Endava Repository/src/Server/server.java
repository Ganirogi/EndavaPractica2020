package Server;

import java.io.*;
import java.net.*;

public class server {
	
	public static void main(String[] args) {
		
		try(ServerSocket serverSocket = new ServerSocket(8070)) {
            Socket socket = serverSocket.accept();
            System.out.println("Client Connected");
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter outputt = new PrintWriter(socket.getOutputStream(), true);
            
            int inputt;
            ComandaCalc cmdi=new ComandaCalc();
            
            while(true) {
            	inputt = Integer.parseInt(input.readLine());
            	
                if(inputt >= 4) {               	
                	System.out.println("Connection finished");
               	    outputt.println("Connection finished");
               	    break;
                }
                
                if (inputt == 1)
                {
                	outputt.println("The sum of orders is:" + cmdi.TotalSum());
                }
                else if (inputt == 2) 
                {
                	outputt.println("The order with the highest price is :"+cmdi.HighestPrice());
                }
                else if (inputt == 3)
                {
                	outputt.println("The order with the lowest price is :"+cmdi.LowestPrice());
                }

            }
            
        } catch(IOException e) {
            System.out.println("Server exception " + e.getMessage());
        }
	}
}
	
	

