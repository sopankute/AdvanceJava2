package com.datajpacrud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import com.datajpacrud.entities.Employee;
import com.datajpacrud.services.EmpServiceImpl;

@SpringBootApplication
public class DataJpaCrudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaCrudApplication.class, args);

		System.out.println("\n DataJpaCrudApplication.main() | " + "Application Started Successfully... \n");

		EmpServiceImpl empService = context.getBean(EmpServiceImpl.class);
//		EmpServiceImpl empService2 = context.getBean(EmpServiceImpl.class);
//		System.out.println(empService1.hashCode()+"\t"+empService2.hashCode()); // 2096708187	2096708187

//		void insertEmp(Employee emp);
//		empService.insertEmp(new Employee(3,"Alice", 29, 45000.00, "Female", "HR", "New York"));

//		void insertEmps(List<Employee> emps);
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(42, "Bob", 42, 23400.00, "Male", "IT", "Rome"));
		empList.add(new Employee(26, "Charlie", 37, 40000.00, "Male", "Finance", "London"));
		empList.add(new Employee(47, "Diana", 40, 95000.00, "Female", "Marketing", "DC"));
		empList.add(new Employee(75, "Ethan", 37, 34000.00, "Male", "Sales", "Boston"));
		empList.add(new Employee(68, "Fiona", 29, 76000.00, "Female", "IT", "Rome"));
		empList.add(new Employee(37, "George", 26, 75000.00, "Male", "Finance", "Boston"));
		empList.add(new Employee(58, "Hannah", 27, 28000.00, "Female", "Sales", "Rome"));
		empList.add(new Employee(91, "Ian", 42, 74000.00, "Male", "Marketing", "Miami"));
		empList.add(new Employee(40, "Julia", 33, 58000.00, "Female", "Sales", "London"));
		empList.add(new Employee(81, "Kevin", 31, 54000.00, "Male", "IT", "DC"));
		empList.add(new Employee(24, "Laura", 24, 61000.00, "Female", "Finance", "San Francisco"));
		empList.add(new Employee(33, "Michael", 37, 85600.00, "Male", "HR", "Boston"));
		empList.add(new Employee(74, "Nina", 30, 63400.00, "Female", "IT", "DC"));
		empList.add(new Employee(45, "Oliver", 26, 98000.00, "Male", "Sales", "London"));
//        empService.insertEmps(empList);

		
//      Employee updateEmp(Integer Id, String city);
//        Employee updateEmp = empService.updateEmp(11, "Boston");
//        System.out.println("The Updated Emp : "+updateEmp);;

		
//		Employee getEmp(Integer id);
//        Employee emp = empService.getEmp(13);
//        System.out.println("DataJpaCrudApplication.main()"+"| Emp Info : "+emp);

		
//		List<Employee> getAllEmps();
//        List<Employee> allEmps = empService.getAllEmps();
//        allEmps.forEach(e->System.out.println(e));

		
//		boolean isEmpPresent(Integer id);
//        boolean empPresent = empService.isEmpPresent(17);
//        System.out.println("DataJpaCrudApplication.main()"+"| Is Emp with ID=09 present : "+empPresent+"\n");

		
//		void removeEmp(Integer id);
//        empService.removeEmp(16);
//        System.out.println("Emp with an ID=16 is removed Successfully.\n");

		
//		void removeEmp(Employee emp);
//        Employee emp = new Employee(3,"Alice", 29, 45000.00, "Female", "HR", "New York");
//        empService.removeEmp(emp);
//        System.out.println("Emp removed Successfully : "+emp+"\n");
		
		
//		List<Employee> empSortById();
//		List<Employee> empSortById = empService.empSortById();
//		empSortById.forEach(e->System.out.println(e));
		
		
//		List<Employee> empSortDescById();
//		List<Employee> empSortDescById = empService.empSortDescById();
//		empSortDescById.forEach(e->System.out.println(e));
		
		
//		List<Employee> empSortByName();
//		List<Employee> empSortByName = empService.empSortByName();
//		empSortByName.forEach(e->System.out.println(e));
		
		
//		List<Employee> empSortByDeptNameAndByCity();
//		List<Employee> empSortByDeptNameAndByCity = empService.empSortByDeptNameAndByCity();
//		empSortByDeptNameAndByCity.forEach(e->System.out.println(e));
		
		
//		void getFirstEmpRecords();
//		empService.getFirstEmpRecords();
		
//		void getEmpRecordsPerPage(int pageNumber, int pageSize);
//		empService.getEmpRecordsPerPage(3, 6);
		
		
//		void getPageRecordsInSorted(int pageNumber, int pageSize, Sort sort);
		empService.getPageRecordsInSorted(1, 7);
	}

}
