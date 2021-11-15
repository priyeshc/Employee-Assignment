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

package com.liferay.employee.assignment.service.persistence;

import com.liferay.employee.assignment.model.Project;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the project service. This utility wraps <code>com.liferay.employee.assignment.service.persistence.impl.ProjectPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProjectPersistence
 * @generated
 */
public class ProjectUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Project project) {
		getPersistence().clearCache(project);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Project> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Project> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Project> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Project> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Project> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Project update(Project project) {
		return getPersistence().update(project);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Project update(
		Project project, ServiceContext serviceContext) {

		return getPersistence().update(project, serviceContext);
	}

	/**
	 * Caches the project in the entity cache if it is enabled.
	 *
	 * @param project the project
	 */
	public static void cacheResult(Project project) {
		getPersistence().cacheResult(project);
	}

	/**
	 * Caches the projects in the entity cache if it is enabled.
	 *
	 * @param projects the projects
	 */
	public static void cacheResult(List<Project> projects) {
		getPersistence().cacheResult(projects);
	}

	/**
	 * Creates a new project with the primary key. Does not add the project to the database.
	 *
	 * @param Project_Id the primary key for the new project
	 * @return the new project
	 */
	public static Project create(long Project_Id) {
		return getPersistence().create(Project_Id);
	}

	/**
	 * Removes the project with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Project_Id the primary key of the project
	 * @return the project that was removed
	 * @throws NoSuchProjectException if a project with the primary key could not be found
	 */
	public static Project remove(long Project_Id)
		throws com.liferay.employee.assignment.exception.
			NoSuchProjectException {

		return getPersistence().remove(Project_Id);
	}

	public static Project updateImpl(Project project) {
		return getPersistence().updateImpl(project);
	}

	/**
	 * Returns the project with the primary key or throws a <code>NoSuchProjectException</code> if it could not be found.
	 *
	 * @param Project_Id the primary key of the project
	 * @return the project
	 * @throws NoSuchProjectException if a project with the primary key could not be found
	 */
	public static Project findByPrimaryKey(long Project_Id)
		throws com.liferay.employee.assignment.exception.
			NoSuchProjectException {

		return getPersistence().findByPrimaryKey(Project_Id);
	}

	/**
	 * Returns the project with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Project_Id the primary key of the project
	 * @return the project, or <code>null</code> if a project with the primary key could not be found
	 */
	public static Project fetchByPrimaryKey(long Project_Id) {
		return getPersistence().fetchByPrimaryKey(Project_Id);
	}

	/**
	 * Returns all the projects.
	 *
	 * @return the projects
	 */
	public static List<Project> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the projects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of projects
	 * @param end the upper bound of the range of projects (not inclusive)
	 * @return the range of projects
	 */
	public static List<Project> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the projects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of projects
	 * @param end the upper bound of the range of projects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of projects
	 */
	public static List<Project> findAll(
		int start, int end, OrderByComparator<Project> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the projects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of projects
	 * @param end the upper bound of the range of projects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of projects
	 */
	public static List<Project> findAll(
		int start, int end, OrderByComparator<Project> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the projects from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of projects.
	 *
	 * @return the number of projects
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ProjectPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ProjectPersistence, ProjectPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ProjectPersistence.class);

		ServiceTracker<ProjectPersistence, ProjectPersistence> serviceTracker =
			new ServiceTracker<ProjectPersistence, ProjectPersistence>(
				bundle.getBundleContext(), ProjectPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}