package com.liferay.assignment.empImpl;

import com.liferay.assignment.empApi.api.EmployeeApi;
import com.liferay.employee.assignment.model.Employee;
import com.liferay.employee.assignment.service.EmployeeLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Argil DX
 */
@Component(immediate = true, property = {
		// TODO enter required service properties
}, service = EmployeeApi.class)
public class EmployeeImpl implements EmployeeApi {

	EmployeeLocalService empLocalService;

	@Override
	public Employee addEmployee(long userId, String name, String jobTitle, String phoneNo, float salary, long deptId,
			long projectId, ServiceContext serviceContext) throws PortalException {

		return empLocalService.addEmployee(userId, name, jobTitle, phoneNo, salary, deptId, projectId, serviceContext);

		// TODO Auto-generated method stub

	}

	@Override
	public Employee deleteEmployee(long Emp_Id) throws PortalException {
		// TODO Auto-generated method stub
		return empLocalService.deleteEmployee(Emp_Id);
	}

	@Override
	public Employee getEmployee(long Emp_Id) throws PortalException {
		// TODO Auto-generated method stub
		return empLocalService.getEmployee(Emp_Id);
	}

	@Override
	public List<Employee> getEmployeeByJT() {
		// TODO Auto-generated method stub
		return empLocalService.getEmployeeByJT();
	}

	// TODO enter required service methods

}