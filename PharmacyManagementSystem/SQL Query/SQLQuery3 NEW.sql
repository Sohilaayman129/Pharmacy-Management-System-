USE PharmacySystemManagment;

INSERT INTO Companies (id, name, address,companyExp,phone)
VALUES 
(1, 'Pfizer', 'USA',3 , '01000000000'),
(2, 'Novartis', 'Switzerland',2 , '01111111111');

INSERT INTO Medicines VALUES
(1, 'panadol', 100, '2024-01-01', '2026-01-01', 'Pfizer', 10.5),
(2, 'Brufen', 50, '2024-02-01', '2025-12-01', 'Novartis', 15.0);

INSERT INTO Agents VALUES
(3, 'Ahmed', 30, '01000000000', '1234','Male'),
(4, 'Ali', 28, '01111111111', '1234','Male');