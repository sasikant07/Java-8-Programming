package com.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonOptionalDemo {

	public static void main(String[] args) {
		Address address = new Address("15/2", "16th Main Road", "Bangalore", "Karnataka", 560029);
		
		Person john = new Person("John", Optional.of(address), 745785445);
		
		Person mac = new Person("Mac", Optional.empty(), 875475743);
		
		Person steve = new Person("Steve", Optional.empty(), 985472142);
		
		List<Person> person = new ArrayList<Person>();
		
		person.add(john);
		person.add(mac);
		person.add(steve);
		
		person.stream().forEach((p) -> System.out.println(p.getName()+" "+p.getAddress().orElse(Address.EMPTY_ADDRESS)));
		
		/*   
		    Output: 
		    
		 	John From Address : houseNum=15/2, streetName=16th Main Road, city=Bangalore, country=Karnataka, pincode=560029
			Mac From Address : houseNum=, streetName=, city=, country=, pincode=0
			Steve From Address : houseNum=, streetName=, city=, country=, pincode=0
		*/
	}

}
