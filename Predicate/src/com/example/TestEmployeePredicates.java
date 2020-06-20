package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static com.example.EmployeePredicates.*;

public class TestEmployeePredicates {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Rick","Beethovan",23,"M");
        Employee e2 = new Employee(2,"Martina","Hengis",13,"F");
        Employee e3 = new Employee(3,"Ricky","Martin",43,"M");
        Employee e4 = new Employee(4,"Jon","Lowman",26,"M");
        Employee e5 = new Employee(5,"Cristine","Maria",19,"F");
        Employee e6 = new Employee(6,"David","Feezor",15,"M");
        Employee e7 = new Employee(7,"Melissa","Roy",68,"F");
        Employee e8 = new Employee(8,"Alex","Gussin",79,"M");
        Employee e9 = new Employee(9,"Neetu","Singh",15,"F");
        Employee e10 = new Employee(10,"Naveen","Jain",45,"M");
        
        List<Employee> employees = new ArrayList<Employee>();
        
        employees.addAll(Arrays.asList(new Employee[] {e1, e2, e3, e4, e5, e6, e7, e8, e9, e10}));
        
        System.out.println( filterEmployees(employees, isAdultMale()));
        
        System.out.println( filterEmployees(employees, isAdultFemale()));
        
        System.out.println( filterEmployees(employees, isAgeMoreThan(35)));
        
        System.out.println( filterEmployees(employees, isAgeMoreThan(35).negate()));
	}

}
