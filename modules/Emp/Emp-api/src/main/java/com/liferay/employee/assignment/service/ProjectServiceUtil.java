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

import com.liferay.employee.assignment.model.Project;
import com.liferay.portal.kernel.exception.PortalException;

/**
 * Provides the remote service utility for Project. This utility wraps
 * <code>com.liferay.employee.assignment.service.impl.ProjectServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ProjectService
 * @generated
 */
public class ProjectServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.employee.assignment.service.impl.ProjectServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Project addProject(
			long userId, String projectName,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addProject(userId, projectName, serviceContext);
	}

	public static Project deleteProject(long projectId) throws PortalException {
		return getService().deleteProject(projectId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Project getProject(long projectId) throws PortalException {
		return getService().getProject(projectId);
	}

	public static Project updateProject(
			long userId, long projectId, String projectName,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateProject(
			userId, projectId, projectName, serviceContext);
	}

	public static ProjectService getService() {
		return _service;
	}

	private static volatile ProjectService _service;

}