package com.techaxis.practise.service;

import com.techaxis.resturantmanagement.people.Address;
import com.techaxis.resturantmanagement.people.Chef;
import com.techaxis.resturantmanagement.people.Customer;
import com.techaxis.resturantmanagement.people.Manager;
import com.techaxis.resturantmanagement.people.PersonalInformation;
import com.techaxis.resturantmanagement.people.Staff;

public class PeopleController {

	private Chef getChefInfomation() {

		Address hemAddress = new Address();
		hemAddress.setStreet1("Kumaripati 89374 Smart Galli");
		hemAddress.setStreet2("House No: 32, 4th Floor");
		hemAddress.setCity("Lalitpur");
		hemAddress.setDistrict("Lalitpur");
		hemAddress.setState("State 3");
		hemAddress.setCountry("Nepal");
		hemAddress.setZipCode(97700);

		Customer hemPersonalInfo = new Customer();
		hemPersonalInfo.setName("Hem");
		hemPersonalInfo.setEmailId("hem@hem.com");
		hemPersonalInfo.setPhoneNumber("928639848");
		hemPersonalInfo.setAddress(hemAddress);

		Chef chef1 = new Chef();
		chef1.setName("Hem");
		chef1.setEmailId("hem@hem.com");
		chef1.setPhoneNumber("928639848");
		chef1.setAddress(hemAddress);
		chef1.setAge(22);
		chef1.setDepartment("Non-Veg");
		chef1.setFoodListChefCanPrepare(new String[] { "Momo", "Pizza", "Burger" });
		chef1.setMontlySalary(40000.00f);
		chef1.setQualification("Bachelor's Degree in Food Tech");
		chef1.setSex("Male");
		chef1.setShift("Evening");
		return chef1;

	}

	private Manager getManagerInfomation() {

		Address hemAddress = new Address();
		hemAddress.setStreet1("Kumaripati 89374 Smart Galli");
		hemAddress.setStreet2("House No: 32, 4th Floor");
		hemAddress.setCity("Lalitpur");
		hemAddress.setDistrict("Lalitpur");
		hemAddress.setState("State 3");
		hemAddress.setCountry("Nepal");
		hemAddress.setZipCode(97700);

		Customer hemPersonalInfo = new Customer();
		hemPersonalInfo.setName("Hem");
		hemPersonalInfo.setEmailId("hem@hem.com");
		hemPersonalInfo.setPhoneNumber("928639848");
		hemPersonalInfo.setAddress(hemAddress);

		Manager manager = new Manager();
		manager.setName("Hem");
		manager.setEmailId("hem@hem.com");
		manager.setPhoneNumber("928639848");
		manager.setAddress(hemAddress);
		manager.setAge(22);
		manager.setDepartment("Non-Veg");
		manager.setDuties(new String[] { "Accounts", "People Management" });
		manager.setMontlySalary(50000.00f);
		manager.setQualification("Bachelor's Degree in Food Tech");
		manager.setSex("Male");
		manager.setShift("Evening");
		return manager;

	}

	public static void main(String[] args) {
		PeopleController p = new PeopleController();
		Staff chef1 = p.getChefInfomation();
		System.out.println(chef1.getYearlySalaryWithBouns());

		Staff manager1 = p.getManagerInfomation();
		System.out.println(manager1.getYearlySalaryWithBouns());

	}
}
