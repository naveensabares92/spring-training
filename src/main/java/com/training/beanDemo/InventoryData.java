package com.training.beanDemo;

public class InventoryData {
	// INSTANCE VARIABLES
	private Inventory inventory;

	// CONSTRUCTORS
	public InventoryData() {
		super();
		System.out.println("In Non-parameterised InventoryData Constructor");
	}

	public InventoryData(Inventory inventory) {
		super();
		this.inventory = inventory;
		System.out.println("In parameterised InventoryData Constructor");
		System.out.println(this.toString());
	}
	
	// GETTERS & SETTERS
	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	@Override
	public String toString() {
		return "InventoryData [inventory=" + inventory + "]";
	}
}
