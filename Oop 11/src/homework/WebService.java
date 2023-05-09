package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.io.PrintWriter;
import java.io.FileReader;

public class WebService {
	public static String getMarkup(String spec, String code) throws IOException {
		URL url = new URL(spec);
	    URLConnection conn = url.openConnection();
	    String result = "";
	    try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), code))) {
		      for (;;) {
		        String temp = br.readLine();
		        if (temp == null) {
		          break;
		        }
		        result += temp + System.lineSeparator();
		      }
		      return result;
		}
		
	}
	
	public static int getLinks(String spec, File file) throws IOException {
		String markup = getMarkup(spec, "UTF-8");
		String[] markupArray = markup.split("href=\"");
		int linkQuantity = markupArray.length;
		try (PrintWriter pr = new PrintWriter(file)){
			for (int i = 0; i < markupArray.length; i++) {
				int linkEnd = markupArray[i].indexOf("\"");
				String link = markupArray[i].substring(0, linkEnd);
				pr.println(link);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return linkQuantity;
		
	}
	
	public static void checkStatus(File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String urls = "";
            for (;;) {
            	urls = br.readLine();
                if (urls == null) {
                    break;
                }
                URL url = new URL(urls);
                URLConnection conn = url.openConnection();
                Map<String, List<String>> headers = conn.getHeaderFields();
                
                if (headers.isEmpty()) {
                    System.out.println("Сайт недоступен");
                } else {
                    System.out.println("Сайт доступен");
                }
            }
            
        }
	}
}
