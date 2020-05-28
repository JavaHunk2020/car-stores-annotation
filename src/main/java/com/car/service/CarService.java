package com.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.car.dao.Car;
import com.car.dao.CarDao;

//ID - carService - same as class only first letter will be small
@Service
@Scope("singleton")
public class CarService {
	
	@Autowired
	private CarDao carDao;
	
	public CarDao getCarDao() {
		return carDao;
	}
	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}

	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * save is  method which takes car as a parameter
	 * @param papa
	 */
	public void save(Car papa) {
		System.out.println("399393");
		System.out.println(papa);
		carDao.persist(papa);
	}
	
	/**
	 * save is  method which takes car as a parameter
	 * @param papa
	 */
	public List<Car> findCars() {
		return carDao.findCars();
	}
	
	public Car findCarById(int cid) {
		return carDao.findCarById(cid);
	}
	
	public void deleteCarById(int cid) {
		carDao.deleteCarById(cid);
	}

}
