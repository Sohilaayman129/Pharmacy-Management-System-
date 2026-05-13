Drop Table Companies;
Drop Table Medicines;
Drop Table Agents;

USE PharmacySystemManagment;
GO
CREATE TABLE companies (
     id INT PRIMARY KEY,
    name NVARCHAR(100),
	address NVARCHAR(100),
	companyExp INT,
	phone NVARCHAR(20) 
	);

CREATE TABLE Medicines (
    id INT PRIMARY KEY,
    medname NVARCHAR(100),
    quantity INT,
    fabdate DATE,
    expdate DATE,
    medcomp NVARCHAR(100),
    price FLOAT
);


CREATE TABLE Agents (
    id INT PRIMARY KEY,
    name NVARCHAR(100),
    age INT,
    phone NVARCHAR(20),
    password NVARCHAR(50),
	Gender VARCHAR(10)
);