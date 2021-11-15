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
 * This class is a wrapper for {@link Department}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Department
 * @generated
 */
public class DepartmentWrapper
	extends BaseModelWrapper<Department>
	implements Department, ModelWrapper<Department> {

	public DepartmentWrapper(Department department) {
		super(department);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Dept_Id", getDept_Id());
		attributes.put("Dept_Name", getDept_Name());
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
		Long Dept_Id = (Long)attributes.get("Dept_Id");

		if (Dept_Id != null) {
			setDept_Id(Dept_Id);
		}

		String Dept_Name = (String)attributes.get("Dept_Name");

		if (Dept_Name != null) {
			setDept_Name(Dept_Name);
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
	 * Returns the company ID of this department.
	 *
	 * @return the company ID of this department
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this department.
	 *
	 * @return the create date of this department
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the dept_ ID of this department.
	 *
	 * @return the dept_ ID of this department
	 */
	@Override
	public long getDept_Id() {
		return model.getDept_Id();
	}

	/**
	 * Returns the dept_ name of this department.
	 *
	 * @return the dept_ name of this department
	 */
	@Override
	public String getDept_Name() {
		return model.getDept_Name();
	}

	/**
	 * Returns the group ID of this department.
	 *
	 * @return the group ID of this department
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this department.
	 *
	 * @return the modified date of this department
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this department.
	 *
	 * @return the primary key of this department
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this department.
	 *
	 * @return the user ID of this department
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this department.
	 *
	 * @return the user name of this department
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this department.
	 *
	 * @return the user uuid of this department
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
	 * Sets the company ID of this department.
	 *
	 * @param companyId the company ID of this department
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this department.
	 *
	 * @param createDate the create date of this department
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the dept_ ID of this department.
	 *
	 * @param Dept_Id the dept_ ID of this department
	 */
	@Override
	public void setDept_Id(long Dept_Id) {
		model.setDept_Id(Dept_Id);
	}

	/**
	 * Sets the dept_ name of this department.
	 *
	 * @param Dept_Name the dept_ name of this department
	 */
	@Override
	public void setDept_Name(String Dept_Name) {
		model.setDept_Name(Dept_Name);
	}

	/**
	 * Sets the group ID of this department.
	 *
	 * @param groupId the group ID of this department
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this department.
	 *
	 * @param modifiedDate the modified date of this department
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this department.
	 *
	 * @param primaryKey the primary key of this department
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this department.
	 *
	 * @param userId the user ID of this department
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this department.
	 *
	 * @param userName the user name of this department
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this department.
	 *
	 * @param userUuid the user uuid of this department
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected DepartmentWrapper wrap(Department department) {
		return new DepartmentWrapper(department);
	}

}