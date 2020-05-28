package com.pizza.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.car.service.CarService;
import com.pizza.service.PizzaShop;

public class PizzaMain {

	public static void main(String[] args) {
		//inside spring container
		//below line creating spring container and creating bean inside
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("pizza-service.xml");
		System.out.println(")@)@)Spring container is ready@)@@)");
		PizzaShop  pizzaShop=(PizzaShop)applicationContext.getBean("pizzaShop");
		pizzaShop.zee();
	}
}
