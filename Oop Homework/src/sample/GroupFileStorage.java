package sample;

import java.io.PrintWriter;
import java.util.Iterator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;

public class GroupFileStorage {
	public static void saveGroupToCSV(Group gr) throws IOException {
		File studentsList = new File(gr.getGroupName() + ".csv");
		Student[] groupStudens = gr.getStudents();
		String del = ",";
		try(PrintWriter pw = new PrintWriter(studentsList)){
			for(int i = 0; i < groupStudens.length; i++) {
				if(groupStudens[i] != null) {
					pw.println(groupStudens[i].getName() + del + groupStudens[i].getLastName() + del + groupStudens[i].getGender() + del + groupStudens[i].getId() + del + groupStudens[i].getGroupName());
			    }
			}
		}
	    
	}
	
	public static Group loadGroupFromCSV(File file) throws IOException {
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			Group newGroup = new Group();
			newGroup.setGroupName(file.getName());
			String studentString;
			while((studentString = br.readLine()) != null) {
				String[] splitedStudentString = studentString.split(",");
				Student newStudent = new Student(splitedStudentString[0], splitedStudentString[1], Gender.valueOf(splitedStudentString[2]), Integer.parseInt (splitedStudentString[3]), splitedStudentString[4]);
				try {
					newGroup.addStudent(newStudent);
				} catch (GroupOverflowException e) {
					System.out.println("Группа переполнена");
				}
			}
			return newGroup;
		}
	}
	
	public static File findFileByGroupName(String groupName, File workFolder) throws IOException, FileNotFindException {
		File searchedFile = null;
		if(workFolder.isDirectory() && workFolder != null) {
			File[] filesArray = workFolder.listFiles();
			for (int i = 0; i < filesArray.length; i++) {
				if(filesArray[i].isFile() && filesArray[i].getName().equals(groupName)) {
					searchedFile = filesArray[i];
					return searchedFile;
				}
			}
			throw new FileNotFindException("Файл не найден");
		} else {
			throw new IllegalArgumentException("Такой папки нет");
		}
		
	}

}
