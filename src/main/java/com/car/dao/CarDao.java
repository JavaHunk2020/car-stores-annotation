package com.car.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * class which holds database programming
 * @author nagendra
 *
 */
//99.99% only one 
@Repository("tcarDao")
public class CarDao {
	
	@Autowired
	@Qualifier("pkdataSource")
	private DataSource dataSource;

	public void persist(Car car) {
		      JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		      String sql="insert into cars_tbl(model,color,price) values(?,?,?)";
		      jdbcTemplate.update(sql,new Object[] {car.getModel(),car.getColor(),car.getPrice()});
	}
	
	public List<Car> findCars(){
		    String sql="select cid,model,color,price from cars_tbl";
		    JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		    List<Car> cars=jdbcTemplate.query(sql,new BeanPropertyRowMapper(Car.class));
		    return cars;
	}
	
	public Car findCarById(int cid){
		  String sql="select cid,model,color,price from cars_tbl where cid = "+cid;
		    JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		    Car car=(Car)jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper(Car.class));
		    return car;
	}
	
	
	public void deleteCarById(int cid){
		  String sql="delete  from cars_tbl where cid = "+cid;
		    JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		    jdbcTemplate.update(sql);
	}
}
