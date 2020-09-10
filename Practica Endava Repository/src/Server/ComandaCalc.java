package Server;

import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

import Collections.Comanda;

public class ComandaCalc {

    LinkedList<Comanda> cmdi;
	
    public ComandaCalc() {
    	
    	this.cmdi=new LinkedList<Comanda>();
		try ( Scanner scan=new Scanner(new FileReader("C:\\Users\\HP19\\eclipse-workspace\\Practica Endava\\bin\\Collections\\listaComenzi.txt"))){	   	
			
			while(scan.hasNextLine()) {   
			 String list=scan.nextLine();
		     String[] arrayParameters=list.split(" ");	
		     int ID=Integer.parseInt(arrayParameters[0]);
			 double pret=Double.parseDouble(arrayParameters[1]);
			 int cantitate=Integer.parseInt(arrayParameters[2]); 
		    		 
			 Comanda cmd=new Comanda(ID,pret,cantitate);
			 cmdi.add(cmd); 
		   }
		   
		}catch(IOException e) {
			e.printStackTrace();
		}
    }
    
    public ComandaCalc(LinkedList<Comanda> cmdi2) {
    	this.cmdi=cmdi2;
    }
     
    public int LowestPrice() {
    	
   	 Comanda cmd=cmdi.stream()
             .max(Comparator.comparing(Comanda::Valoare))
             .orElseThrow(NoSuchElementException::new);

   	 	return cmd.getID();
   }
    
    public int HighestPrice() {
    	
        Comanda cmd=cmdi.stream()
                .min(Comparator.comparing(Comanda::getPret))
                .orElseThrow(NoSuchElementException::new);

        	return cmd.getID();
    }
    
    public double TotalSum() {
    	
    	double sum=0;  	
        for(Comanda cmd:cmdi)
        	sum+=cmd.getPret()*cmd.getCantitate();
        
        return sum;
    } 
}
