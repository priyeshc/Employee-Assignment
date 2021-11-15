create index IX_9B2FC022 on Employee_Employee (Name[$COLUMN_LENGTH:255$], Salary);
create index IX_B14813D9 on Employee_Employee (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_2545BC9B on Employee_Employee (uuid_[$COLUMN_LENGTH:75$], groupId);