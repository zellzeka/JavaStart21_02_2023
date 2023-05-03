package homework;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.io.PrintWriter;

public class Translator {
	private Map<String, String> dictionary;

	public Translator() {
		super();
		this.dictionary = new HashMap<>();
	}

	public Map<String, String> getDictionary() {
		return dictionary;
	}

	@Override
	public String toString() {
		return "Translator [dictionary=" + dictionary + "]";
	}
	
	public String[] readText(File file) {
		String[] wordsArray = null;
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String receiveText = "";
			while((receiveText = br.readLine()) != null) {	
				wordsArray = receiveText.split(" ");
			}
		} catch(IOException e){            
           System.out.println(e.getMessage());
       } 
		comparisonText(wordsArray);
		return wordsArray;
	}
	
	public String comparisonText(String[] string) {
		String translatedText = "";
		for (int i = 0; i < string.length; i++) {
			if(dictionary.containsKey(string[i])) {
				translatedText += dictionary.get(string[i]) + " ";
				
			}
		}
		writeText(translatedText);
		return translatedText;
	}
	
	public void writeText(String string) {
		File ukrFile = new File("Ukrainian.out.txt");
		try(FileWriter wr = new FileWriter(ukrFile.getName())){
			wr.write(string);
		} catch(IOException e){
           System.out.println(e.getMessage());
       } 
	}
	
	public void addWords() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите слово на английском");
		String engWord = sc.nextLine();
		System.out.println("Введите соответсвующее слово на украинском");
		String ukrWord = sc.nextLine();
		dictionary.put(engWord, ukrWord);
	}
	
	public void saveOnDisk() {
		File dictionaryFile = new File("Dictionary.csv");
		 try (PrintWriter pw = new PrintWriter(dictionaryFile)) {
			 Set<Map.Entry<String, String>> setOfPairs = dictionary.entrySet();
			 for (Map.Entry<String, String> value : setOfPairs) {
				 pw.println(value.getKey() + "," + value.getValue());
			}
		 } catch(IOException e){
	           System.out.println(e.getMessage());
	       }
	}
	
}
