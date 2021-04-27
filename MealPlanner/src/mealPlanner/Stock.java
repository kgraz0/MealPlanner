package mealPlanner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class Stock {
	
	String fileDirectory;
	
	public Stock (String fileDirectory) {
		this.fileDirectory = fileDirectory;
	}
	
	public void getStock() {
		try {
			CSVReader reader = new CSVReader(new FileReader(fileDirectory));
			String[] nextLine;
			
			while ((nextLine = reader.readNext()) != null) {
				System.out.println(nextLine[0] + ", " + Integer.parseInt(nextLine[1]));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Invalid source directory.");
		} catch (CsvValidationException e) {
			System.out.println("Line is invalid.");
		} catch (IOException e) {
			System.out.println("Issue reading the file.");
		}
	}
}