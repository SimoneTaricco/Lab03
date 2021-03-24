package it.polito.tdp.spellchecker.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
	
	private int numeroParoleErrate;
	private Dictionary dizionario;
	private List inputTextFile;	
		
	public int getNumeroParoleErrate() {
		return numeroParoleErrate;
	}

	public void selezionaLingua(String lingua) throws Exception {
	
		try {
			this.dizionario = new Dictionary();
			this.dizionario.loadDictionary(lingua);
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	public List<String> parole(String s) {
		
		ArrayList res = new ArrayList<String>();		
		s = s.replaceAll("[.,\\/#!$%\\^&\\*;:{}=\\-_`~()\\[\\]\"?]", "");
		s = s.toLowerCase();
		String parole[] = s.split(" ");		
		for (String p:parole) {
			res.add(p);
		}	
		return res;
	}	

	public List<RichWord> spellCheckText(List<String>inputTextFile) {
		
		List res = new ArrayList<RichWord>();
		
		for(String s:inputTextFile) {
				if (this.dizionario.listaParole.contains(s) == false) {	
					RichWord r = new RichWord(s,false);
					res.add(r);		
				}			
		}
		
		this.numeroParoleErrate = res.size();
		
		return res;
	}
	
	public String stampaParoleErrate(List<RichWord> input){
		
		String res = "";
		
		for(RichWord r:input) {
			if (r.isCorrect() == false)
				res += r.getWord() + "\n";
		}
		return res.trim();
	}
	
	
	
}
