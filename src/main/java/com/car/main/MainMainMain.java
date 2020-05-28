package com.car.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.car.dao.Car;
import com.car.service.CarService;

public class MainMainMain {
public static void main(String[] args) {
	//Create spring container and reading cars.xml and creating two instance of car
			//inside spring container
			ApplicationContext applicationContext=new ClassPathXmlApplicationContext("cars-service.xml");
			CarService ttcarService=(CarService)applicationContext.getBean("carService");
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter model");
			String model=scanner.next();
			
			System.out.println("Enter color");
			String color=scanner.next();
			
			System.out.println("Enter price");
			int price=scanner.nextInt();
			
			Car honda=new Car();
			honda.setColor(color);
			honda.setModel(model);
			honda.setPrice(price);
			
			ttcarService.save(honda);
			System.out.println("Ahaha end of the main..");
			
			List<Car> cars=ttcarService.findCars();
            System.out.println("Printing all the car details!!");
			cars.forEach(System.out::println);
}
}
