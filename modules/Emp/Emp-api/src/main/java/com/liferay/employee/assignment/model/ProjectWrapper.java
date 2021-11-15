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

package com.liferay.employee.assignment.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Project}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Project
 * @generated
 */
public class ProjectWrapper
	extends BaseModelWrapper<Project>
	implements ModelWrapper<Project>, Project {

	public ProjectWrapper(Project project) {
		super(project);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Project_Id", getProject_Id());
		attributes.put("Project_Name", getProject_Name());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Project_Id = (Long)attributes.get("Project_Id");

		if (Project_Id != null) {
			setProject_Id(Project_Id);
		}

		String Project_Name = (String)attributes.get("Project_Name");

		if (Project_Name != null) {
			setProject_Name(Project_Name);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	 * Returns the company ID of this project.
	 *
	 * @return the company ID of this project
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this project.
	 *
	 * @return the create date of this project
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this project.
	 *
	 * @return the group ID of this project
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this project.
	 *
	 * @return the modified date of this project
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this project.
	 *
	 * @return the primary key of this project
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project_ ID of this project.
	 *
	 * @return the project_ ID of this project
	 */
	@Override
	public long getProject_Id() {
		return model.getProject_Id();
	}

	/**
	 * Returns the project_ name of this project.
	 *
	 * @return the project_ name of this project
	 */
	@Override
	public String getProject_Name() {
		return model.getProject_Name();
	}

	/**
	 * Returns the user ID of this project.
	 *
	 * @return the user ID of this project
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this project.
	 *
	 * @return the user name of this project
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this project.
	 *
	 * @return the user uuid of this project
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this project.
	 *
	 * @param companyId the company ID of this project
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this project.
	 *
	 * @param createDate the create date of this project
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this project.
	 *
	 * @param groupId the group ID of this project
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this project.
	 *
	 * @param modifiedDate the modified date of this project
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this project.
	 *
	 * @param primaryKey the primary key of this project
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project_ ID of this project.
	 *
	 * @param Project_Id the project_ ID of this project
	 */
	@Override
	public void setProject_Id(long Project_Id) {
		model.setProject_Id(Project_Id);
	}

	/**
	 * Sets the project_ name of this project.
	 *
	 * @param Project_Name the project_ name of this project
	 */
	@Override
	public void setProject_Name(String Project_Name) {
		model.setProject_Name(Project_Name);
	}

	/**
	 * Sets the user ID of this project.
	 *
	 * @param userId the user ID of this project
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this project.
	 *
	 * @param userName the user name of this project
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this project.
	 *
	 * @param userUuid the user uuid of this project
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected ProjectWrapper wrap(Project project) {
		return new ProjectWrapper(project);
	}

}