package mealPlanner;

import java.io.FileNotFoundException;
import java.util.Random;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class Stock {
	
	String fileDirectory;
	ArrayList<Item> itemList = new ArrayList<Item>();
	boolean found = false;
	
	public Stock (String fileDirectory) {
		this.fileDirectory = fileDirectory;
	}
	
	public void setStock() {
		try {
			CSVReader reader = new CSVReader(new FileReader(fileDirectory));
			String[] nextLine;
			
			while ((nextLine = reader.readNext()) != null) {
				itemList.add(new Item(nextLine[0], Integer.parseInt(nextLine[1]), nextLine[2]));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Invalid source directory.");
		} catch (CsvValidationException e) {
			System.out.println("Line is invalid.");
		} catch (IOException e) {
			System.out.println("Issue reading the file.");
		}
	}
	
	public void getStock() {
		for (int i = 0; i < itemList.size(); i++) {
			System.out.println(itemList.get(i));
		}
	}

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}
	
	public Item pickItem(String type) {
		
		Random rand = new Random();
		
		int randNumber = rand.nextInt(itemList.size());
		
		while (found == false) {
			if (itemList.get(randNumber).getType().equals(type)) {
				found = true;
				return itemList.get(randNumber);
			} else {
				System.out.println("Not found.");
				randNumber = rand.nextInt(itemList.size());
			}
			}
		return itemList.get(randNumber);
	}
}