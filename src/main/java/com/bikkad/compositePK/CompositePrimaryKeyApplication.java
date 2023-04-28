package com.bikkad.compositePK;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikkad.compositePK.model.Employee;
import com.bikkad.compositePK.repository.EmpRepository;

@SpringBootApplication
@RestController
@RequestMapping("/employee")
public class CompositePrimaryKeyApplication {
	
	@Autowired
	private EmpRepository empRepository;
	
	@PostMapping
	public Employee save(@RequestBody Employee emp) {
		System.out.println(emp);
		 Employee save = empRepository.save(emp);
		 System.out.println(save);
		 return save;
	}
	
	@GetMapping
	public List<Employee> getAll(){
		System.out.println("Get all Employee Record");
		 List<Employee> findAll = empRepository.findAll();
		 System.out.println(findAll);
		 return findAll;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(CompositePrimaryKeyApplication.class, args);
	}

}
