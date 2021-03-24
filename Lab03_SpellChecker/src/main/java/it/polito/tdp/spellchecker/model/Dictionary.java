package it.polito.tdp.spellchecker.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import it.polito.tdp.spellchecker.FXMLController;

public class Dictionary {
	
	public List<String> listaParole = new ArrayList<String>();
	File newFile;
	
	public void loadDictionary(String language) throws FileNotFoundException {

		language += ".txt";
		
		try { 
			 newFile = new File("src/main/resources",language);
			 FileReader fr = new FileReader(newFile); 
			 BufferedReader br = new BufferedReader(fr); 
			 String word; 
			 
			 while ((word = br.readLine()) != null) {
				 this.listaParole.add(word);
			 } 
		br.close(); 			
		} catch (IOException e){ 
			throw new FileNotFoundException("Selezionare una lingua");
		}   
	}

}
