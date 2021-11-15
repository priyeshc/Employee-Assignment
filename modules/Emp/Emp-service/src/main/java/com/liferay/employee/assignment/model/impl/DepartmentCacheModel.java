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

import com.liferay.employee.assignment.model.Department;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Department in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DepartmentCacheModel
	implements CacheModel<Department>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DepartmentCacheModel)) {
			return false;
		}

		DepartmentCacheModel departmentCacheModel =
			(DepartmentCacheModel)object;

		if (Dept_Id == departmentCacheModel.Dept_Id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Dept_Id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{Dept_Id=");
		sb.append(Dept_Id);
		sb.append(", Dept_Name=");
		sb.append(Dept_Name);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Department toEntityModel() {
		DepartmentImpl departmentImpl = new DepartmentImpl();

		departmentImpl.setDept_Id(Dept_Id);

		if (Dept_Name == null) {
			departmentImpl.setDept_Name("");
		}
		else {
			departmentImpl.setDept_Name(Dept_Name);
		}

		departmentImpl.setGroupId(groupId);
		departmentImpl.setCompanyId(companyId);
		departmentImpl.setUserId(userId);

		if (userName == null) {
			departmentImpl.setUserName("");
		}
		else {
			departmentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			departmentImpl.setCreateDate(null);
		}
		else {
			departmentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			departmentImpl.setModifiedDate(null);
		}
		else {
			departmentImpl.setModifiedDate(new Date(modifiedDate));
		}

		departmentImpl.resetOriginalValues();

		return departmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Dept_Id = objectInput.readLong();
		Dept_Name = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(Dept_Id);

		if (Dept_Name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Dept_Name);
		}

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
	}

	public long Dept_Id;
	public String Dept_Name;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}