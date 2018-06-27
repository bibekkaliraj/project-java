package com.techaxis.resturant.foodinfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FoodInformations {

	private void loadMenu() {

		MenuItem[] menuItem = new MenuItem[7];
		try {
			BufferedReader reader = new BufferedReader(
					new FileReader(new File("C:\\Users\\dell\\Desktop\\data\\java\\food_data.csv")));
			reader.readLine();
			String foodData = "";
			int counter = 0;
			while ((foodData = reader.readLine()) != null) {
				String[] parsedFood = foodData.split(",");
				menuItem[counter] = new MenuItem(parsedFood[0], Float.parseFloat(parsedFood[1]), parsedFood[2],
						Boolean.parseBoolean(parsedFood[3]));
				counter++;
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < menuItem.length; i++) {
			System.out.println(menuItem[i].toString());
		}
	}

	private void loadEnergyInfo() {
		Energy[] energyInfo = new Energy[7];
		try {
			BufferedReader reader = new BufferedReader(
					new FileReader(new File("C:\\Users\\dell\\Desktop\\data\\java\\energy_data.csv")));
			reader.readLine();
			String energyData = "";
			int counter = 0;
			while ((energyData = reader.readLine()) != null) {
				String[] parsedEnergy = energyData.split(",");
								
				energyInfo[counter] = new Energy(parsedFood[0],
				Float.parseFloat(parsedFood[1]),
				Float.parseFloat(parsedFood[2]), Float.parseFloat(parsedFood[3]),
				Float.parseFloat(parsedFood[4]), Float.parseFloat(parsedFood[5]));
				energyInfo[counter] = energy;
				counter++;
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < energyInfo.length; i++) {
			Energy energy = energyInfo[i];
			System.out.println("Food Name: " +energy.getMenu() + " Fat: " +energy.getFat() +" Protein: " +energy.getProtein());
			//System.out.println(energyInfo[i].toString());
		}
	}

	private void loadTableInfo() {
		Table[] tableInfo = new Table[5];

		try {
			BufferedReader reader = new BufferedReader(
					new FileReader(new File("C:\\Users\\dell\\Desktop\\data\\java\\table_data.csv")));
			reader.readLine();
			String tableData = "0";
			int counter = 0;
			while ((tableData = reader.readLine()) != null) {
				String[] parsedTable = tableData.split(",");
				tableInfo[counter] = new Table(Integer.parseInt(parsedTable[0]), Integer.parseInt(parsedTable[1])); // will
																													// take
																													// variable
																													// from
																													// Table
																													// construct
				counter++;
			}
			reader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < tableInfo.length; i++) {
			System.out.println(tableInfo[i].toString());
		}
	}

	public static void main(String[] args) {
		FoodInformations fic = new FoodInformations();
		// fic.loadMenu();

		FoodInformations energydesc = new FoodInformations();
		energydesc.loadEnergyInfo();

		FoodInformations tabledesc = new FoodInformations();
		// tabledesc.loadTableInfo();
	}

}
