<%@include file="init.jsp"%>
<%@page import="com.liferay.employee.assignment.model.Employee"%>
<%@page import="com.liferay.assignment.employee.portlet.EmployeeWebPortlet"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<div>
<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>
	EmployeeList "${ employeeList }"
	<aui:button type="cancel" onClick="<%=viewURL.toString()%>"></aui:button>
</div>