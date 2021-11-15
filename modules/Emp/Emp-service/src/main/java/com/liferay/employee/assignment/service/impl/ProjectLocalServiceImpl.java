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
import com.liferay.employee.assignment.service.base.ProjectLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the project local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.employee.assignment.service.ProjectLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProjectLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.employee.assignment.model.Project",
	service = AopService.class
)
public class ProjectLocalServiceImpl extends ProjectLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.employee.assignment.service.ProjectLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.employee.assignment.service.ProjectLocalServiceUtil</code>.
	 */
	
	public Project addProject(long userId, String projectName, ServiceContext serviceContext)
			throws PortalException {
			
			long groupId= serviceContext.getScopeGroupId();
			
			User user= userLocalService.getUserById(userId);
			
			long projectId= counterLocalService.increment();
			
			Project project= projectPersistence.create(projectId);
			
			project.setUserUuid(serviceContext.getUuid());
			project.setUserId(userId);
			project.setGroupId(groupId);
			project.setCompanyId(user.getCompanyId());
			project.setUserName(user.getFullName());
			project.setCreateDate(serviceContext.getCreateDate());
			project.setModifiedDate(serviceContext.getModifiedDate());
			project.setExpandoBridgeAttributes(serviceContext);
			project.setProject_Id(projectId);
			project.setProject_Name(projectName);
			
			projectPersistence.update(project);
			System.out.println("add executed");
			
			return project;
			
		}
		
		public Project updateProject(long userId, long projectId, String projectName, ServiceContext serviceContext)
			throws PortalException {
			
			Project project= projectPersistence.findByPrimaryKey(projectId);
			
			User user = userLocalService.getUserById(userId);
			
			project.setUserId(userId);
			project.setUserName(user.getFullName());
			project.setModifiedDate(serviceContext.getModifiedDate());
			project.setExpandoBridgeAttributes(serviceContext);
			project.setProject_Id(projectId);
			project.setProject_Name(projectName);
			
			projectPersistence.update(project);
			
			return project;
		}
		
		public Project deleteProject(Project project) {
			
		projectPersistence.remove(project);
		
		return project;
		}
		public Project deleteProject(long projectId) throws PortalException {
			
			Project project= projectPersistence.findByPrimaryKey(projectId);
			
			return deleteProject(project);
			
		}
		public Project getProject(long projectId) throws PortalException{
			
			return projectPersistence.findByPrimaryKey(projectId);
		}
	
}