package com.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(101, "Kevin", 25));
		list.add(new Employee(110, "Max", 27));
		list.add(new Employee(121, "Steve", 35));
		list.add(new Employee(119, "Lucy", 22));
		list.add(new Employee(125, "Sam", 29));
		list.add(new Employee(165, "Jessei", 39));
		list.add(new Employee(145, "Andy", 31));
		list.add(new Employee(125, "Newton", 30));
		list.add(new Employee(146, "Einstien", 33));
		
		System.out.println("Before sorting the employee list : \n");
		
		list.forEach(l -> System.out.println(l));
		
		System.out.println("\n\n");
		
		System.out.println("After sorting the employee list by id : \n");
		list.sort(
				(Employee e1, Employee e2) -> e1.getId() - e2.getId()
		);
		
		list.forEach(l -> System.out.println(l));
		
		
		System.out.println("\n\n");
		
		System.out.println("After sorting the employee list by name : \n");
		list.sort(
				(Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName())
		);
		
		list.forEach(l -> System.out.println(l));
		
		
		System.out.println("\n\n");
		
		System.out.println("After sorting the employee list by id : \n");
		list.sort(
				(Employee e1, Employee e2) -> e1.getId() - e2.getId()
		);
		
		list.forEach(l -> System.out.println(l));
		
		
		System.out.println("\n\n");
		
		System.out.println("After sorting the employee list by age : \n");
		list.sort(
				(Employee e1, Employee e2) -> e1.getAge() - e2.getAge()
		);
		
		list.forEach(l -> System.out.println(l));
	}

}
