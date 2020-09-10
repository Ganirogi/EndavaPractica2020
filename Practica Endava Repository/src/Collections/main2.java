package Collections;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class main2 {

	public static void main(String[] args) throws Exception {

		LinkedList<Comanda> cmd=new LinkedList<Comanda>();

		try ( Scanner scan=new Scanner(new FileReader("C:\\Users\\HP19\\eclipse-workspace\\Practica Endava\\bin\\Collections\\listaComenzi.txt"))){	   	
			
			while(scan.hasNextLine()) {   
			 String list=scan.nextLine();
		     String[] arrayParameters=list.split(" ");
			 int ID=Integer.parseInt(arrayParameters[0]);
			 double pret=Integer.parseInt(arrayParameters[1]);
			 int cantitate=Integer.parseInt(arrayParameters[2]);
			 
			 Comanda cmdi = new Comanda(ID,pret,cantitate);
			 cmd.add(cmdi); 
			 

		   }
		   
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("The orders are: ");
		cmd.forEach(System.out::println);
		System.out.println();
		
		Calculator calc = new Calculator(cmd);
		calc.TotalSum();
		calc.HighestPrice();
		calc.LowestPrice();		
	}

}
