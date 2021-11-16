package com.liferay.assignment.empApi.api;

import com.liferay.employee.assignment.model.Employee;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.List;

/**
 * @author Argil DX
 */
public interface EmployeeApi  {
	
	public Employee addEmployee(long userId, String name, String jobTitle, String phoneNo, float salary, long deptId, long projectId,ServiceContext serviceContext) throws PortalException;
	public Employee deleteEmployee(long Emp_Id) throws PortalException;
	public Employee getEmployee(long Emp_Id) throws PortalException;
	public List<Employee> getEmployeeByJT();

		
	
}