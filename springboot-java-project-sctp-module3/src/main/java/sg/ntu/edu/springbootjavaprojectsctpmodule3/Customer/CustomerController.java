package sg.ntu.edu.springbootjavaprojectsctpmodule3.Customer;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="api/v1/customer")
public class CustomerController {
    

    private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService=customerService;
    }


    @GetMapping
	public List<Customer> getCustomers(){
        return customerService.getCustomers();
		
	}
}
