
   -- Creación de la tabla Camarero
CREATE TABLE Camarero (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    edad INT,
    email VARCHAR(255)
);

-- Creación de la tabla Cliente
CREATE TABLE Cliente (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    edad INT,
    email VARCHAR(255)
);

-- Creación de la tabla Plato
CREATE TABLE Plato (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255),
    precio DECIMAL(10, 2) NOT NULL
);

-- Creación de la tabla Mesa
CREATE TABLE Mesa (
    id INT PRIMARY KEY AUTO_INCREMENT,
    numero VARCHAR(255) NOT NULL,
    capacidad INT
);
