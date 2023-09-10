package sg.ntu.edu.springbootjavaprojectsctpmodule3.Customer;

import java.time.LocalDate;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table


public class Customer {
    @Id // Use @Id to specify the primary key
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_sequence")
    @SequenceGenerator(
        name = "customer_sequence",
        sequenceName = "customer_sequence",
        allocationSize = 1
    )

    private UUID id;
    private String name;
    private String email;
    private Integer age;
    private LocalDate dob;






    public Customer() {
    }


    public Customer(UUID id, String name, String email, Integer age, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }


    public Customer(String name, String email, Integer age, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }


    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }


    public LocalDate getDob() {
        return dob;
    }


    public void setDob(LocalDate dob) {
        this.dob = dob;
    }


    
}



