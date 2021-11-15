package com.liferay.assignment.empImpl;

import com.liferay.assignment.empApi.api.EmployeeApi;

import org.osgi.service.component.annotations.Component;

/**
 * @author Argil DX
 */
@Component(
	immediate = true,
	property = {
		// TODO enter required service properties
	},
	service = EmployeeApi.class
)
public class EmployeeImpl implements EmployeeApi {

	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		
	}

	// TODO enter required service methods

}