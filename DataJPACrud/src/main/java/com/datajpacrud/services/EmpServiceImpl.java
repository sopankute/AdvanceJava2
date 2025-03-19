package com.datajpacrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.datajpacrud.entities.Employee;
import com.datajpacrud.repository.EmpRepository;

@Service
public class EmpServiceImpl implements EmpService {

	private EmpRepository empRepo = null;

	public EmpServiceImpl(EmpRepository empRepo) {
		this.empRepo = empRepo;
	}

	@Override
	public void insertEmp(Employee emp) {
		Employee savedEmp = empRepo.save(emp);
		System.out.println("EmpServiceImpl.insertEmp()" + "| New Employee : " + savedEmp);
	}

	@Override
	public void insertEmps(List<Employee> emps) {
		List<Employee> savedAllEmps = empRepo.saveAll(emps);
		savedAllEmps.forEach(e -> System.out.println(e));
	}

	@Override
	public Employee updateEmp(Integer Id, String city) {
		Optional<Employee> emp = empRepo.findById(Id);	// loading employee
		if (emp.isPresent()) {
			System.out.println("Employee Found : " + emp.get());
			emp.get().setCity(city);
			empRepo.save(emp.get());	// updating loaded employee
		} else {
			System.out.println("Emp doesn't found with ID : " + Id);
		}
		return emp.get();
	}

	@Override
	public Employee getEmp(Integer id) {
		Optional<Employee> emp = empRepo.findById(id);
		return emp.get();
	}

	@Override
	public List<Employee> getAllEmps() {
		List<Employee> allEmps = empRepo.findAll();
		return allEmps;
	}

	@Override
	public boolean isEmpPresent(Integer id) {
		return empRepo.existsById(id);
	}

	@Override
	public void removeEmp(Integer id) {
		empRepo.deleteById(id);
	}

	@Override
	public void removeEmp(Employee emp) {
		empRepo.delete(emp);
	}

	
	// Sorting --------------
	@Override
	public List<Employee> empSortById() {
		List<Employee> sortedEmpsById = empRepo.findAll(Sort.by("empId"));	// Ascending
		return sortedEmpsById;
	}

	@Override
	public List<Employee> empSortDescById() {
		List<Employee> sortedEmpsById = empRepo.findAll(Sort.by(Direction.DESC, "empId"));	// Descending
//		List<Employee> sortedEmpsById = empRepo.findAll(Sort.by("empId").descending());
		return sortedEmpsById;
	}

	@Override
	public List<Employee> empSortByName() {
		List<Employee> sortedEmpsByName = empRepo.findAll(Sort.by("empName"));
		return sortedEmpsByName;
	}

	@Override
	public List<Employee> empSortByDeptNameAndByCity() {
		List<Employee> sortByDeptNameAndByCity = empRepo.findAll(Sort.by(Direction.ASC, "deptName", "city"));
		return sortByDeptNameAndByCity;
	}

	// Pagination ------------
	@Override
	public void getFirstEmpRecords() {
		Page<Employee> empPage = empRepo.findAll(Pageable.ofSize(13));
		List<Employee> empsRecords = empPage.getContent();
		empsRecords.forEach(e->System.out.println(e));
	}

	@Override
	public void getEmpRecordsPerPage(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize);		
		Page<Employee> recordPage = empRepo.findAll(pageable);
		List<Employee> recordsPerPage = recordPage.getContent();
		recordsPerPage.forEach(e->System.out.println(e));
		
//		List<Employee> recordsPerPage = empRepo.findAll(PageRequest.of(pageNumber, pageSize)).getContent();
//		recordsPerPage.forEach(e->System.out.println(e));
	}

	
	//	Pagination and Sorting
	@Override
	public void getPageRecordsInSorted(int pageNumber, int pageSize) {
		Page<Employee> sortedPagination = empRepo.findAll(PageRequest.of(pageNumber, pageSize, Sort.by("empId").descending()));
		List<Employee> sortedPageRecords = sortedPagination.getContent();
		sortedPageRecords.forEach(e->System.out.println(e));
	}
	
	
}










