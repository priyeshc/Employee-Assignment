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

package com.liferay.employee.assignment.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProjectService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProjectService
 * @generated
 */
public class ProjectServiceWrapper
	implements ProjectService, ServiceWrapper<ProjectService> {

	public ProjectServiceWrapper(ProjectService projectService) {
		_projectService = projectService;
	}

	@Override
	public com.liferay.employee.assignment.model.Project addProject(
			long userId, String projectName,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _projectService.addProject(userId, projectName, serviceContext);
	}

	@Override
	public com.liferay.employee.assignment.model.Project deleteProject(
			long projectId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _projectService.deleteProject(projectId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _projectService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.employee.assignment.model.Project getProject(
			long projectId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _projectService.getProject(projectId);
	}

	@Override
	public com.liferay.employee.assignment.model.Project updateProject(
			long userId, long projectId, String projectName,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _projectService.updateProject(
			userId, projectId, projectName, serviceContext);
	}

	@Override
	public ProjectService getWrappedService() {
		return _projectService;
	}

	@Override
	public void setWrappedService(ProjectService projectService) {
		_projectService = projectService;
	}

	private ProjectService _projectService;

}