package com.techaxis.resturantmanagement.people;

import java.util.Arrays;

public class Customer extends PersonalInformation {

	
	public Customer() {

	}

	private String orderedFoodName;
	private int quantity;
	private float billingAmount;
	private String[] favourateItems;

	public String getOrderedFoodName() {
		return orderedFoodName;
	}

	public void setOrderedFoodName(String orderedFoodName) {
		this.orderedFoodName = orderedFoodName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getBillingAmount() {
		return billingAmount;
	}

	public void setBillingAmount(float billingAmount) {
		this.billingAmount = billingAmount;
	}

	public String[] getFavourateItems() {
		return favourateItems;
	}

	public void setFavourateItems(String[] favourateItems) {
		this.favourateItems = favourateItems;
	}

	//
	// @Override
	// public String toString() {
	// return super.toString() + " Customer [orderedFoodName=" + orderedFoodName
	// + ", quantity=" + quantity + ", billingAmount="
	// + billingAmount + "]";
	// }
	@Override
	public String toString() {
		return super.toString() + " Customer [orderedFoodName=" + orderedFoodName + ", quantity=" + quantity
				+ ", billingAmount=" + billingAmount + ", favourateItems=" + Arrays.toString(favourateItems) + "]";
	}

}
