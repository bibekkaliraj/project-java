package com.techaxis.resturantmanagement.people;

public class PeopleController {

	private PersonalInformation getPerson() {

		Address hemAddress = new Address();
		hemAddress.setStreet1("Kumaripati 89374 Smart Galli");
		hemAddress.setStreet2("House No: 32, 4th Floor");
		hemAddress.setCity("Lalitpur");
		hemAddress.setDistrict("Lalitpur");
		hemAddress.setState("State 3");
		hemAddress.setCountry("Nepal");
		hemAddress.setZipCode(97700);
		

		PersonalInformation hemPersonalInfo = new PersonalInformation();
		hemPersonalInfo.setName("Hem");
		hemPersonalInfo.setEmailId("hem@hem.com");
		hemPersonalInfo.setPhoneNumber("928639848");
		hemPersonalInfo.setAddress(hemAddress);
		
		return hemPersonalInfo;

	}

	public static void main(String[] args) {
		PeopleController p = new PeopleController();
		PersonalInformation hemInfo = p.getPerson();
		System.out.println(hemInfo.getAddress().getZipCode());
		hemInfo.getAddress().setZipCode(23432);
		System.out.println(hemInfo.getAddress().getZipCode());

	}
}
