package com.employee.service;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.dao.EmployeeDaoImpl;
import com.employee.pojo.Employee;
import com.employee.services.EmployeeServicesImpl;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c=new ClassPathXmlApplicationContext("employee.xml");
		Employee e=new Employee();
    	  e.setEmpid(1251);
          e.setEname("saikumar");
          e.setJob("devloper");
          e.setMgr(7566);
          e.setSal(5000);
          e.setComm(1000);
          e.setDeptno(20);
        
        EmployeeDaoImpl d=(EmployeeDaoImpl)c.getBean("edao");
         //d.insert(e);
        //d.delete(e);
       // d.update(e);
        //EmployeeServicesImpl ser=new EmployeeServicesImpl();
       // ser.updateEmpSal(e);
        //ser.getWithoutComm();
//       EmployeeServicesImpl ser=new EmployeeServicesImpl();
//        System.out.println(ser.updateEmpSal(e));
         //List<Employee> list= d.orderBy();
         List<Employee> list= d.groupby();
         for(Employee e1:list)
       {
        	 System.out.println(e1);
         }
	}

}
