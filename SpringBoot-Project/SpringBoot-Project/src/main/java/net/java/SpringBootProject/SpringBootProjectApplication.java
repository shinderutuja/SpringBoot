package net.java.SpringBootProject;

import net.java.SpringBootProject.model.Employee;
import net.java.SpringBootProject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Sagar");
		employee.setLastName("Thakar");
		employee.setEmailid("sagar.thakar998@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Vijay");
		employee1.setLastName("Owandkar");
		employee1.setEmailid("vijay.owandkar@gmail.com");
		employeeRepository.save(employee1);

	}
}
