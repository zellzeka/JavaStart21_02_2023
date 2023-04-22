package homework;

import java.io.File;

public class SearchSystem implements Runnable {
	private File searchDirectory;
	private String searchName;
	private int filesCounter = 0;

	public SearchSystem(File searchDirectory, String searchName) {
		super();
		this.searchDirectory = searchDirectory;
		this.searchName = searchName;
	}

	public SearchSystem() {
		super();
	}

	public File getSearchDirectory() {
		return searchDirectory;
	}

	public void setSearchDirectory(File searchDirectory) {
		this.searchDirectory = searchDirectory;
	}

	public String getSearchName() {
		return searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

	public int getFilesCounter() {
		return filesCounter;
	}

	public void setFilesCounter(int filesCounter) {
		this.filesCounter = filesCounter;
	}

	@Override
	public String toString() {
		return "searchSystem [searchDirectory=" + searchDirectory + ", searchName=" + searchName + "]";
	}

	@Override
	public void run() {
		searchingFiles(searchDirectory);
		
		
	}
	
	public void searchingFiles(File searchDirectory) {
		if(searchDirectory != null) {
			File[] filesArray = searchDirectory.listFiles();
			for (int i = 0; i < filesArray.length; i++) {
				if(filesArray[i].isFile() && filesArray[i].getName().equals(searchName)) {
					filesCounter ++;
					System.out.println(filesArray[i].getPath() + " файл найден потоком " + Thread.currentThread().getId());
				} else if (filesArray[i].isDirectory()) {
					Thread tr = new Thread(new SearchInDirectorys(this, filesArray[i]));
					tr.start();
				}
			}
			System.out.println("Найдено " + filesCounter + " файлов");
		}
	}
	
	

}
