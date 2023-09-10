package sg.ntu.edu.springbootjavaprojectsctpmodule3.Customer;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.UUID; // Import UUID


import org.springframework.stereotype.Service;

@Service //same as @Component.just sementics
public class CustomerService {

    public List<Customer> getCustomers(){
		UUID id = UUID.randomUUID(); // Generate a random UUID
		return List.of(
			new Customer(
				id,
				"Tommy",
				"Tommy123@email.com",
				21,
				LocalDate.of(2000,Month.JANUARY,5)
			)
		);
	}
    
}
