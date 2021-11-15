/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.employee.assignment.service.impl;

import com.liferay.employee.assignment.model.Project;
import com.liferay.employee.assignment.service.base.ProjectServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the project remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.employee.assignment.service.ProjectService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProjectServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=employee",
		"json.web.service.context.path=Project"
	},
	service = AopService.class
)
public class ProjectServiceImpl extends ProjectServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.liferay.employee.assignment.service.ProjectServiceUtil</code> to access the project remote service.
	 */
	
	public Project addProject(long userId, String projectName, ServiceContext serviceContext)
			throws PortalException {
		
		return projectLocalService.addProject(userId, projectName, serviceContext);
	}
	public Project updateProject(long userId, long projectId, String projectName, ServiceContext serviceContext)
			throws PortalException {
		
		return projectLocalService.updateProject(userId, projectId, projectName, serviceContext);
	}
	public Project deleteProject(long projectId) throws PortalException {
		
		return projectLocalService.deleteProject(projectId);
		
	}
	public Project getProject(long projectId) throws PortalException{
		
		return projectLocalService.getProject(projectId);
	}	
}