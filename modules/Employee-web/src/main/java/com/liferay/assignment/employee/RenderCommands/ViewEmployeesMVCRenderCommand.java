package com.liferay.assignment.employee.RenderCommands;

import com.liferay.assignment.empApi.api.EmployeeApi;
import com.liferay.assignment.employee.constants.EmployeeWebPortletKeys;
import com.liferay.employee.assignment.model.Employee;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name="+ EmployeeWebPortletKeys.EMPLOYEE,
			"mvc.command.name=/office/render"
		},
		service = MVCRenderCommand.class
	)

public class ViewEmployeesMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		
		List<Employee> employeeList = _employeeAPI.getAllEmployees();
		renderRequest.setAttribute("employeeList", employeeList);
		//System.out.println(employeeList);
		
		
		return "/viewEmployee.jsp";
	}
	
	@Reference
	EmployeeApi _employeeAPI;

}
