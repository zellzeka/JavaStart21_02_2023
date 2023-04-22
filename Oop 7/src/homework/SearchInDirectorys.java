package homework;

import java.io.File;

public class SearchInDirectorys implements Runnable {
	private SearchSystem link;
	private File searchDirectory;

	public SearchInDirectorys(SearchSystem link, File searchDirectory) {
		super();
		this.link = link;
		this.searchDirectory = searchDirectory;
	}

	public SearchInDirectorys() {
		super();
	}

	public SearchSystem getLink() {
		return link;
	}

	public void setLink(SearchSystem link) {
		this.link = link;
	}

	public File getSearchDirectory() {
		return searchDirectory;
	}

	public void setSearchDirectory(File searchDirectory) {
		this.searchDirectory = searchDirectory;
	}

	@Override
	public void run() {
		link.searchingFiles(searchDirectory);
		
	}

}
