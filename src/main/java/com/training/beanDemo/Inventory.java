package com.training.beanDemo;

/**
 * @author naveensabares
 * {@link https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/beans.html}
 * {@link https://bbooks.info/b/w/e9924ed9a96033f984451a426133d367a8c78845/spring-in-action-5th-edition.pdf}
 * @category SPRING DEMO 
 */
public class Inventory {
	// INSTANCE VARIABLES
	private int id;
	private String name;

	// CONSTRUCTORS
	public Inventory() {
		System.out.println("In Non-parameterised Inventory Constructor");
	}

	public Inventory(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("In parameterised Inventory Constructor");
	}

	// GETTERS & SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", name=" + name + "]";
	}
}
