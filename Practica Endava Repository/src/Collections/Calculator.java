package Collections;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Calculator {
	
	LinkedList<Comanda> cmdi;
	
    public Calculator(LinkedList<Comanda> cmdi2) {
    	this.cmdi=cmdi2;
    }
	
    public void TotalSum() {
    	
    	double sum=0;  	
        for(Comanda cmdi:cmdi)
        	sum+=cmdi.getPret()*cmdi.getCantitate();
        
        System.out.println("The sum of orders is:"+sum);
    }
    
    public void LowestPrice() {
    	
        Comanda cmd=cmdi.stream()
   	                        .min(Comparator.comparing(Comanda::getPret))
                            .orElseThrow(NoSuchElementException::new);
        
        System.out.println("The order with the lowest price is :"+cmd.getID());
   }
    
    public void HighestPrice() {
    	
    	 Comanda cmd=cmdi.stream()
                             .max(Comparator.comparing(Comanda::Valoare))
                             .orElseThrow(NoSuchElementException::new);
    	 
    	 System.out.println("The order with the highest price is :"+cmd.getID());
    }
    

    


}
