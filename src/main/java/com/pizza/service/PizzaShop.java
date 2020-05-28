package com.pizza.service;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
//@Lazy
@Scope("singleton")
public class PizzaShop {
	
	private String name="Domino!!!!";
	
	@PostConstruct
	public void init() {
		System.out.println(this);
		System.out.println("init init");
		name="Spring5.x";
		System.out.println(this);
	}
	
	public PizzaShop() {
		System.out.println(this);
		System.out.println("PizzaShop Default constructor is called");
		name="Oleta";
	}
	
	public void zee() {
		System.out.println("This one bean instance method which is zee!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

	@Override
	public String toString() {
		return "PizzaShop [name=" + name + "]";
	}
	
}
