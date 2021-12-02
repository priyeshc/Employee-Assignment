<%@ include file="/init.jsp"%>

<portlet:renderURL var="addEntryURL">
	<portlet:param name="mvcPath" value="/add_entry.jsp"></portlet:param>
</portlet:renderURL>

<portlet:renderURL var="deleteEntryURL">
	<portlet:param name="mvcPath" value="/delete_entry.jsp"></portlet:param>
</portlet:renderURL>

<portlet:renderURL var="viewEntryURL">
	<portlet:param name="mvcRenderCommandName" value="/office/render"></portlet:param>
</portlet:renderURL>

<aui:button-row>
	<aui:button onClick="<%=addEntryURL.toString()%>"
		value="Register Employee"></aui:button>
</aui:button-row>

<aui:button-row>
	<aui:button onClick="<%=deleteEntryURL.toString()%>"
		value="Delete Employee"></aui:button>
</aui:button-row>

<aui:button-row>
	<aui:button onClick="<%=viewEntryURL.toString()%>"
		value="View All Employees"></aui:button>
</aui:button-row>

