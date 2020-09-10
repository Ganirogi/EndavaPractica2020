package Collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TextRead {

	String data;
	String[] data1= new String[20];
	List<String> list = new LinkedList<String>();
	
	public void LineReader(File myObj) {
	  {
	    try {

	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        data = myReader.nextLine();
	        data1 = data.split(" ");
	        
	        for(int i = 0; i < data1.length;i++)
	        	list.add(data1[i]);    	
	      }

	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }	     
		
		System.out.println("In file are: " + list.size() + " words.");
        
        System.out.println("The words which start with a specific letter " + myObj + " are:");
        list.stream()
            .filter(s-> s.startsWith("g"))
            .forEach(System.out::println);
        
        System.out.println("Every word counter: ");
           list.stream()
               .distinct()
               .forEach(s -> System.out.println(s+": "+Collections.frequency(list, s)+" "));
        System.out.println();
        
        System.out.println("The distinct words from file " + myObj + " are:");
           list.stream()
               .distinct()
               .forEach(s -> System.out.print(s+" "));
        System.out.println();
	  }
	}
}
