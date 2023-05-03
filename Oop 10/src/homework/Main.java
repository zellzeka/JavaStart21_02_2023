package homework;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File englTxt = new File("English.in.txt");
		Translator tl = new Translator();
		
		tl.getDictionary().put("Mr.", "Містер");
		tl.getDictionary().put("Mrs.", "місіс");
		tl.getDictionary().put("and", "і");
		tl.getDictionary().put("Smith", "Сміт");
		tl.getDictionary().put("have", "є");
		tl.getDictionary().put("one", "один");
		tl.getDictionary().put("son", "син");
		tl.getDictionary().put("daughter", "дочка");
		tl.getDictionary().put("son's", "сина");
		tl.getDictionary().put("name", "звуть");
		tl.getDictionary().put("John", "Джон");
		tl.getDictionary().put("daughter's", "дочку");
		tl.getDictionary().put("Sarah", "Сара");
		
		tl.readText(englTxt);
		tl.addWords();
		tl.saveOnDisk();
	}
}
