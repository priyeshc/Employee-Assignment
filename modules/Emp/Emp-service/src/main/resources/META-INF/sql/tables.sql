create table Employee_Department (
	Dept_Id LONG not null primary key,
	Dept_Name VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table Employee_Employee (
	uuid_ VARCHAR(75) null,
	Emp_Id LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	Name VARCHAR(255) null,
	Job_Title VARCHAR(75) null,
	Phone_No VARCHAR(75) null,
	Salary DOUBLE,
	Dept_Id LONG,
	Project_Id LONG
);

create table Employee_Project (
	Project_Id LONG not null primary key,
	Project_Name VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);