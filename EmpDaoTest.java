package com.techtest.dao;

import static org.junit.jupiter.api.Assertions.*;
import junit.framework.TestCase;

import org.junit.jupiter.api.Test;

import com.techtest.beans.Emp;

class EmpDaoTest extends TestCase{

	@Test
	void testSave() throws Exception{
		
		EmpDao testEmp = new EmpDao();
		Emp emp = new Emp();
		emp.setDesignation("Apps Programmer");
		emp.setName("John Doe");
		emp.setId(123);
		emp.setSalary(55000);
		assertEquals("Saving employee details", 1, testEmp.save(emp));
	}
		@Test
		void testUpdate() throws Exception{
			
			EmpDao testEmp = new EmpDao();
			Emp emp = new Emp();
			emp.setDesignation("Apps Programmer");
			emp.setName("John Doe");
			emp.setId(12);
			emp.setSalary(55000);
			assertEquals("Updating employee details", 1, testEmp.update(emp));
				
	}
		@Test
		void testDelete() throws Exception{
			
			EmpDao testEmp = new EmpDao();
			int id = 12;
			assertEquals("Deleting an employee record", 1, testEmp.delete(id));
				
	}
}
