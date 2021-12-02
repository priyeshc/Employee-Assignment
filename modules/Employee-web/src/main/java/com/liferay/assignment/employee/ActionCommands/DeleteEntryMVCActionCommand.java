package com.liferay.assignment.employee.ActionCommands;

import com.liferay.assignment.empApi.api.EmployeeApi;
import com.liferay.assignment.employee.constants.EmployeeWebPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(property = { "javax.portlet.name=" + EmployeeWebPortletKeys.EMPLOYEE,
"mvc.command.name=addEntry" }, service = MVCActionCommand.class)

public class DeleteEntryMVCActionCommand implements MVCActionCommand {

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		// TODO Auto-generated method stub
		
		long empId = ParamUtil.getLong(actionRequest, "empId");
		try {
			// ServiceContext serviceContext =
			// ServiceContextFactory.getInstance(Employee.class.getName(), request);
			// _employeeLocalService.deleteEmployee(empId);
			_employeeAPI.deleteEmployee(empId);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Reference
	EmployeeApi _employeeAPI;

}
