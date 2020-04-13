package com.org.lab1.collection;

import java.util.ArrayList;
import java.util.List;
import com.org.lab1.employee.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Collection {

	private List<Employee> empList= new ArrayList<Employee>();
	
	@Bean
	public List<Employee> getEmpList()
	{
		empList.add(new Employee(100, "alisha",980000.0));
		empList.add(new Employee(101,"raj",5000.0));
		empList.add(new Employee(102,"kirti", 20000.0));
		empList.add(new Employee(103,"raj",55000.0));
		
		return empList;
	}
}
