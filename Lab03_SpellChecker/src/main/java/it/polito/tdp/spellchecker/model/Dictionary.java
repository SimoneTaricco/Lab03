package it.polito.tdp.spellchecker.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dictionary {
	
	public List<RichWord> dictionary = new ArrayList<RichWord>();
	
	public void loadDictionary(String language) {

		language += ".txt";
		
		try { 
			 FileReader fr = new FileReader(language); 
			 BufferedReader br = new BufferedReader(fr); 
			 String word; 
			 while ((word = br.readLine()) != null) {
				 RichWord rWord = new RichWord(word);
				 this.dictionary.add(rWord);
		} br.close(); 
			    
		} catch (IOException e){ 
		System.out.println("Errore nella lettura del file");  }   
	}

}
