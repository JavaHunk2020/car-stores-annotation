package com.car.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.car.dao.Car;
import com.car.service.CarService;

public class SingletonBeanExample {
public static void main(String[] args) {
	//Create spring container and reading cars.xml and creating two instance of car
			//inside spring container
			ApplicationContext applicationContext=new ClassPathXmlApplicationContext("cars-service.xml");
			CarService ttcarService1=(CarService)applicationContext.getBean("carService");
			CarService ttcarService2=(CarService)applicationContext.getBean("carService");
			CarService ttcarService3=(CarService)applicationContext.getBean("carService");
			CarService ttcarService4=(CarService)applicationContext.getBean("carService");
			
			if(ttcarService1==ttcarService2) {
				System.out.println("it is same");
			}
			
			if(ttcarService3==ttcarService4) {
				System.out.println("it is same");
			}
			
			if(ttcarService1==ttcarService4) {
				System.out.println("it is same");
			}
	}
}
