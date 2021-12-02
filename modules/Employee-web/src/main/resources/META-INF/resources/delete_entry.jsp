<%@ include file="init.jsp"%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="deleteEntry" var="deleteEntryURL"></portlet:actionURL>


<aui:form action="<%=deleteEntryURL%>" name="<portlet:namespace />fm">
	<aui:fieldset>

		<aui:input name="empId"></aui:input>
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" name="Delete" value="Delete"></aui:button>
		<aui:button type="cancel" onClick="<%=viewURL.toString()%>"></aui:button>
	</aui:button-row>

</aui:form>