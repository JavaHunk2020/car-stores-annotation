package com.car.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.car.dao.Car;
import com.car.service.CarService;

public class FindCarByCidMain {
public static void main(String[] args) {
	//Create spring container and reading cars.xml and creating two instance of car
			//inside spring container
			ApplicationContext applicationContext=new ClassPathXmlApplicationContext("cars-service.xml");
			CarService ttcarService=(CarService)applicationContext.getBean("carService");
			//printing the car as per id
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter carid which you want to view");
			int cid=scanner.nextInt();
			Car car=ttcarService.findCarById(cid);
			System.out.println(car);
}
}
