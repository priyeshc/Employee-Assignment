package com.liferay.assignment.employee.portlet;

import com.liferay.assignment.empApi.api.EmployeeApi;
import com.liferay.assignment.employee.constants.EmployeeWebPortletKeys;
import com.liferay.employee.assignment.model.Employee;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Argil DX
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.office",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Employee", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp", "javax.portlet.name=" + EmployeeWebPortletKeys.EMPLOYEE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class EmployeeWebPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException { // TODO Auto-generated
		super.render(renderRequest, renderResponse);
	}

	

	

	@SuppressWarnings("deprecation")
	public void viewEntry(ActionRequest request, ActionResponse response) throws PortalException, SystemException {

		List<Employee> employeeList = _employeeAPI.getAllEmployees();
		request.setAttribute("employeeList", employeeList);
		System.out.println("Portlet respose" + employeeList);
		response.setRenderParameter("mvcPath", "/viewEmployees.jsp");

		// response.getRenderParameters().setValue("mvcPath", "/viewEmployee.jsp");
		// System.out.println("after :");
	}

	// @Reference
	// private EmployeeLocalService _employeeLocalService;

	@Reference
	private EmployeeApi _employeeAPI;
}