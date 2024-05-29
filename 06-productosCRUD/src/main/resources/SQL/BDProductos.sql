CREATE TABLE Producto (
    cod_producto VARCHAR(50) PRIMARY KEY,
    nombre VARCHAR(100),
    stock INT,
    precio DOUBLE
);

INSERT INTO Producto (cod_producto, nombre, stock, precio) VALUES 
('P001', 'Producto 1', 100, 10.50),
('P002', 'Producto 2', 200, 20.00),
('P003', 'Producto 3', 300, 30.75);
