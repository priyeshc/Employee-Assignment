package com.liferay.assignment.employee.ActionCommands;

import com.liferay.assignment.empApi.api.EmployeeApi;
import com.liferay.assignment.employee.constants.EmployeeWebPortletKeys;
import com.liferay.employee.assignment.model.Employee;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(property = { "javax.portlet.name=" + EmployeeWebPortletKeys.EMPLOYEE,
		"mvc.command.name=addEntry" }, service = MVCActionCommand.class)

public class AddEntryMVCActionCommand implements MVCActionCommand {

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) { // TODO
																								// Auto-generated
																								// method
																								// stub

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(Employee.class.getName(), actionRequest);
			// long empId = ParamUtil.getLong(actionRequest, "empId");
			String name = ParamUtil.getString(actionRequest, "name");
			String jobTitle = ParamUtil.getString(actionRequest, "jobTitle");
			String phone = ParamUtil.getString(actionRequest, "phone");
			float salary = ParamUtil.getFloat(actionRequest, "salary");
			long deptId = ParamUtil.getLong(actionRequest, "deptId");
			long projectId = ParamUtil.getLong(actionRequest, "projectId");

			_employeeAPI.addEmployee(serviceContext.getUserId(), name, jobTitle, phone, salary, deptId, projectId,
					serviceContext);
			return true;

		} catch (PortalException e) { // TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	@Reference
	EmployeeApi _employeeAPI;

}
