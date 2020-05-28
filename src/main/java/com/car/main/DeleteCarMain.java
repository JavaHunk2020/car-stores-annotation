package com.car.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.car.dao.Car;
import com.car.service.CarService;

public class DeleteCarMain {
public static void main(String[] args) {
	//Create spring container and reading cars.xml and creating two instance of car
			//inside spring container
			ApplicationContext applicationContext=new ClassPathXmlApplicationContext("cars-service.xml");
			CarService ttcarService=(CarService)applicationContext.getBean("carService");
			
			//loading all the cars
			List<Car> cars=ttcarService.findCars();
            System.out.println("Printing all the car details!!");
			cars.forEach(System.out::println);
			
			//Deleting the car as per id
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter carid which you want to delete");
			int cid=scanner.nextInt();
			ttcarService.deleteCarById(cid);
		
			//loading all the cars
		   cars=ttcarService.findCars();
            System.out.println("Printing all the car details!! again");
			cars.forEach(System.out::println);
			
		
}
}
