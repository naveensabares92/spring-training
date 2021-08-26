package com.training.beanDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InventoryClient {

	public static void main(String[] args) {
//		InventoryData i = new InventoryData();
//		i.setInventory(new Inventory(11, "NS"));

		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("inventoryBean.xml");
		
		Inventory invent = ctx.getBean(Inventory.class);
		System.out.println(invent);
	}
}
