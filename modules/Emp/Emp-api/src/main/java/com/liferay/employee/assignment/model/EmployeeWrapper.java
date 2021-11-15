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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
public class EmployeeWrapper
	extends BaseModelWrapper<Employee>
	implements Employee, ModelWrapper<Employee> {

	public EmployeeWrapper(Employee employee) {
		super(employee);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("Emp_Id", getEmp_Id());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("Name", getName());
		attributes.put("Job_Title", getJob_Title());
		attributes.put("Phone_No", getPhone_No());
		attributes.put("Salary", getSalary());
		attributes.put("Dept_Id", getDept_Id());
		attributes.put("Project_Id", getProject_Id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long Emp_Id = (Long)attributes.get("Emp_Id");

		if (Emp_Id != null) {
			setEmp_Id(Emp_Id);
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

		String Name = (String)attributes.get("Name");

		if (Name != null) {
			setName(Name);
		}

		String Job_Title = (String)attributes.get("Job_Title");

		if (Job_Title != null) {
			setJob_Title(Job_Title);
		}

		String Phone_No = (String)attributes.get("Phone_No");

		if (Phone_No != null) {
			setPhone_No(Phone_No);
		}

		Float Salary = (Float)attributes.get("Salary");

		if (Salary != null) {
			setSalary(Salary);
		}

		Long Dept_Id = (Long)attributes.get("Dept_Id");

		if (Dept_Id != null) {
			setDept_Id(Dept_Id);
		}

		Long Project_Id = (Long)attributes.get("Project_Id");

		if (Project_Id != null) {
			setProject_Id(Project_Id);
		}
	}

	/**
	 * Returns the company ID of this employee.
	 *
	 * @return the company ID of this employee
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this employee.
	 *
	 * @return the create date of this employee
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the dept_ ID of this employee.
	 *
	 * @return the dept_ ID of this employee
	 */
	@Override
	public long getDept_Id() {
		return model.getDept_Id();
	}

	/**
	 * Returns the emp_ ID of this employee.
	 *
	 * @return the emp_ ID of this employee
	 */
	@Override
	public long getEmp_Id() {
		return model.getEmp_Id();
	}

	/**
	 * Returns the group ID of this employee.
	 *
	 * @return the group ID of this employee
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the job_ title of this employee.
	 *
	 * @return the job_ title of this employee
	 */
	@Override
	public String getJob_Title() {
		return model.getJob_Title();
	}

	/**
	 * Returns the modified date of this employee.
	 *
	 * @return the modified date of this employee
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this employee.
	 *
	 * @return the name of this employee
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the phone_ no of this employee.
	 *
	 * @return the phone_ no of this employee
	 */
	@Override
	public String getPhone_No() {
		return model.getPhone_No();
	}

	/**
	 * Returns the primary key of this employee.
	 *
	 * @return the primary key of this employee
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project_ ID of this employee.
	 *
	 * @return the project_ ID of this employee
	 */
	@Override
	public long getProject_Id() {
		return model.getProject_Id();
	}

	/**
	 * Returns the salary of this employee.
	 *
	 * @return the salary of this employee
	 */
	@Override
	public Float getSalary() {
		return model.getSalary();
	}

	/**
	 * Returns the user ID of this employee.
	 *
	 * @return the user ID of this employee
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this employee.
	 *
	 * @return the user name of this employee
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this employee.
	 *
	 * @return the user uuid of this employee
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this employee.
	 *
	 * @return the uuid of this employee
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this employee.
	 *
	 * @param companyId the company ID of this employee
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this employee.
	 *
	 * @param createDate the create date of this employee
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the dept_ ID of this employee.
	 *
	 * @param Dept_Id the dept_ ID of this employee
	 */
	@Override
	public void setDept_Id(long Dept_Id) {
		model.setDept_Id(Dept_Id);
	}

	/**
	 * Sets the emp_ ID of this employee.
	 *
	 * @param Emp_Id the emp_ ID of this employee
	 */
	@Override
	public void setEmp_Id(long Emp_Id) {
		model.setEmp_Id(Emp_Id);
	}

	/**
	 * Sets the group ID of this employee.
	 *
	 * @param groupId the group ID of this employee
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the job_ title of this employee.
	 *
	 * @param Job_Title the job_ title of this employee
	 */
	@Override
	public void setJob_Title(String Job_Title) {
		model.setJob_Title(Job_Title);
	}

	/**
	 * Sets the modified date of this employee.
	 *
	 * @param modifiedDate the modified date of this employee
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this employee.
	 *
	 * @param Name the name of this employee
	 */
	@Override
	public void setName(String Name) {
		model.setName(Name);
	}

	/**
	 * Sets the phone_ no of this employee.
	 *
	 * @param Phone_No the phone_ no of this employee
	 */
	@Override
	public void setPhone_No(String Phone_No) {
		model.setPhone_No(Phone_No);
	}

	/**
	 * Sets the primary key of this employee.
	 *
	 * @param primaryKey the primary key of this employee
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project_ ID of this employee.
	 *
	 * @param Project_Id the project_ ID of this employee
	 */
	@Override
	public void setProject_Id(long Project_Id) {
		model.setProject_Id(Project_Id);
	}

	/**
	 * Sets the salary of this employee.
	 *
	 * @param Salary the salary of this employee
	 */
	@Override
	public void setSalary(Float Salary) {
		model.setSalary(Salary);
	}

	/**
	 * Sets the user ID of this employee.
	 *
	 * @param userId the user ID of this employee
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this employee.
	 *
	 * @param userName the user name of this employee
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this employee.
	 *
	 * @param userUuid the user uuid of this employee
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this employee.
	 *
	 * @param uuid the uuid of this employee
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected EmployeeWrapper wrap(Employee employee) {
		return new EmployeeWrapper(employee);
	}

}