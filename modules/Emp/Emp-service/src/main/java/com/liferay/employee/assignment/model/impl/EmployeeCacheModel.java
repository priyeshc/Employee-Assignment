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

package com.liferay.employee.assignment.model.impl;

import com.liferay.employee.assignment.model.Employee;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmployeeCacheModel
	implements CacheModel<Employee>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EmployeeCacheModel)) {
			return false;
		}

		EmployeeCacheModel employeeCacheModel = (EmployeeCacheModel)object;

		if (Emp_Id == employeeCacheModel.Emp_Id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Emp_Id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", Emp_Id=");
		sb.append(Emp_Id);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", Name=");
		sb.append(Name);
		sb.append(", Job_Title=");
		sb.append(Job_Title);
		sb.append(", Phone_No=");
		sb.append(Phone_No);
		sb.append(", Salary=");
		sb.append(Salary);
		sb.append(", Dept_Id=");
		sb.append(Dept_Id);
		sb.append(", Project_Id=");
		sb.append(Project_Id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Employee toEntityModel() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		if (uuid == null) {
			employeeImpl.setUuid("");
		}
		else {
			employeeImpl.setUuid(uuid);
		}

		employeeImpl.setEmp_Id(Emp_Id);
		employeeImpl.setGroupId(groupId);
		employeeImpl.setCompanyId(companyId);
		employeeImpl.setUserId(userId);

		if (userName == null) {
			employeeImpl.setUserName("");
		}
		else {
			employeeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			employeeImpl.setCreateDate(null);
		}
		else {
			employeeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			employeeImpl.setModifiedDate(null);
		}
		else {
			employeeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (Name == null) {
			employeeImpl.setName("");
		}
		else {
			employeeImpl.setName(Name);
		}

		if (Job_Title == null) {
			employeeImpl.setJob_Title("");
		}
		else {
			employeeImpl.setJob_Title(Job_Title);
		}

		if (Phone_No == null) {
			employeeImpl.setPhone_No("");
		}
		else {
			employeeImpl.setPhone_No(Phone_No);
		}

		employeeImpl.setSalary(Salary);
		employeeImpl.setDept_Id(Dept_Id);
		employeeImpl.setProject_Id(Project_Id);

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		Emp_Id = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		Name = objectInput.readUTF();
		Job_Title = objectInput.readUTF();
		Phone_No = objectInput.readUTF();

		Salary = objectInput.readFloat();

		Dept_Id = objectInput.readLong();

		Project_Id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(Emp_Id);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (Name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Name);
		}

		if (Job_Title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Job_Title);
		}

		if (Phone_No == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Phone_No);
		}

		objectOutput.writeFloat(Salary);

		objectOutput.writeLong(Dept_Id);

		objectOutput.writeLong(Project_Id);
	}

	public String uuid;
	public long Emp_Id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String Name;
	public String Job_Title;
	public String Phone_No;
	public float Salary;
	public long Dept_Id;
	public long Project_Id;

}