package sample3;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File directory = new File("D:\\Java 11.09.2024\\EnglishFileText");

	        
	        if (directory.isDirectory()) {
	            Optional<File> largestFile = Arrays.stream(directory.listFiles())  
	                                              .filter(File::isFile) 
	                                              .max(Comparator.comparingLong(File::length));  

	           
	            largestFile.ifPresent(file -> System.out.println("Maximum file size: " + file.getAbsolutePath()));
	        } else {
	            System.out.println("The specified path is not a directory.");
	        }
	    }
	}
	

