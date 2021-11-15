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
 * Provides a wrapper for {@link DepartmentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DepartmentLocalService
 * @generated
 */
public class DepartmentLocalServiceWrapper
	implements DepartmentLocalService, ServiceWrapper<DepartmentLocalService> {

	public DepartmentLocalServiceWrapper(
		DepartmentLocalService departmentLocalService) {

		_departmentLocalService = departmentLocalService;
	}

	/**
	 * Adds the department to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DepartmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param department the department
	 * @return the department that was added
	 */
	@Override
	public com.liferay.employee.assignment.model.Department addDepartment(
		com.liferay.employee.assignment.model.Department department) {

		return _departmentLocalService.addDepartment(department);
	}

	@Override
	public com.liferay.employee.assignment.model.Department addDepartment(
			long userId, String deptName,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _departmentLocalService.addDepartment(
			userId, deptName, serviceContext);
	}

	/**
	 * Creates a new department with the primary key. Does not add the department to the database.
	 *
	 * @param Dept_Id the primary key for the new department
	 * @return the new department
	 */
	@Override
	public com.liferay.employee.assignment.model.Department createDepartment(
		long Dept_Id) {

		return _departmentLocalService.createDepartment(Dept_Id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _departmentLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the department from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DepartmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param department the department
	 * @return the department that was removed
	 */
	@Override
	public com.liferay.employee.assignment.model.Department deleteDepartment(
		com.liferay.employee.assignment.model.Department department) {

		return _departmentLocalService.deleteDepartment(department);
	}

	/**
	 * Deletes the department with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DepartmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Dept_Id the primary key of the department
	 * @return the department that was removed
	 * @throws PortalException if a department with the primary key could not be found
	 */
	@Override
	public com.liferay.employee.assignment.model.Department deleteDepartment(
			long Dept_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _departmentLocalService.deleteDepartment(Dept_Id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _departmentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _departmentLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _departmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.employee.assignment.model.impl.DepartmentModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _departmentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.employee.assignment.model.impl.DepartmentModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _departmentLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _departmentLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _departmentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.employee.assignment.model.Department fetchDepartment(
		long Dept_Id) {

		return _departmentLocalService.fetchDepartment(Dept_Id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _departmentLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the department with the primary key.
	 *
	 * @param Dept_Id the primary key of the department
	 * @return the department
	 * @throws PortalException if a department with the primary key could not be found
	 */
	@Override
	public com.liferay.employee.assignment.model.Department getDepartment(
			long Dept_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _departmentLocalService.getDepartment(Dept_Id);
	}

	/**
	 * Returns a range of all the departments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.employee.assignment.model.impl.DepartmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of departments
	 * @param end the upper bound of the range of departments (not inclusive)
	 * @return the range of departments
	 */
	@Override
	public java.util.List<com.liferay.employee.assignment.model.Department>
		getDepartments(int start, int end) {

		return _departmentLocalService.getDepartments(start, end);
	}

	/**
	 * Returns the number of departments.
	 *
	 * @return the number of departments
	 */
	@Override
	public int getDepartmentsCount() {
		return _departmentLocalService.getDepartmentsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _departmentLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _departmentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _departmentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the department in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DepartmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param department the department
	 * @return the department that was updated
	 */
	@Override
	public com.liferay.employee.assignment.model.Department updateDepartment(
		com.liferay.employee.assignment.model.Department department) {

		return _departmentLocalService.updateDepartment(department);
	}

	@Override
	public com.liferay.employee.assignment.model.Department updateDepartment(
			long userId, long deptId, String deptName,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _departmentLocalService.updateDepartment(
			userId, deptId, deptName, serviceContext);
	}

	@Override
	public DepartmentLocalService getWrappedService() {
		return _departmentLocalService;
	}

	@Override
	public void setWrappedService(
		DepartmentLocalService departmentLocalService) {

		_departmentLocalService = departmentLocalService;
	}

	private DepartmentLocalService _departmentLocalService;

}