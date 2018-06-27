package com.techaxis.resturantmanagement.people;

public class PeopleController {

	private void loadAndDisplayCustomer() {
		Customer customer1 = new Customer();
		customer1.setName("Vivek");
		customer1.setEmailId("vivek@techaxis.com.np");
		customer1.setPhoneNumber("9874502834");
		customer1.setOrderedFoodName("Chicken Momo");
		customer1.setQuantity(2);
		customer1.setBillingAmount(120);
		customer1.setFavourateItems(new String[] { "Momo", "Chicken Chilly", "Beer" });

		Customer customer2 = new Customer();
		customer2.setName("Karan");
		customer2.setEmailId("karan@techaxis.com.np");
		customer2.setPhoneNumber("9874502834");
		customer2.setOrderedFoodName("Veg Momo");
		customer2.setQuantity(2);
		customer2.setBillingAmount(120);
		//customer2.setFavourateItems(Utility.AVAILABLE_FOODS);
		customer2.setFavourateItems(
				new String[] { Utility.AVAILABLE_FOODS[0], Utility.AVAILABLE_FOODS[4], Utility.AVAILABLE_FOODS[2] });

		System.out.println(customer1);
		System.out.println(customer2);

	}

	public static void main(String[] args) {
		PeopleController pc = new PeopleController();
		pc.loadAndDisplayCustomer();

	}

}
