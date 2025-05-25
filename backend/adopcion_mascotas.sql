CREATE DATABASE adopcion_mascotas;
USE adopcion_mascotas;

CREATE TABLE Mascota (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    tipo VARCHAR(20),
    edad INT,
    descripcion TEXT,
    estado ENUM('disponible', 'adoptado') DEFAULT 'disponible'
);

CREATE TABLE Persona (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    correo VARCHAR(100),
    ciudad VARCHAR(50)
);

CREATE TABLE Solicitud (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_mascota INT,
    id_persona INT,
    fecha_solicitud DATE,
    estado ENUM('pendiente', 'aceptada', 'rechazada') DEFAULT 'pendiente',
    FOREIGN KEY (id_mascota) REFERENCES Mascota(id),
    FOREIGN KEY (id_persona) REFERENCES Persona(id)
);

INSERT INTO Mascota (nombre, tipo, edad, descripcion, estado) VALUES
('Luna', 'Perro', 2, 'Juguetona y cariñosa', 'disponible'),
('Milo', 'Gato', 3, 'Tranquilo y dormilón', 'disponible'),
('Toby', 'Perro', 1, 'Muy activo y sociable', 'disponible');

INSERT INTO Persona (nombre, correo, ciudad) VALUES
('Ana García', 'ana@gmail.com', 'San Salvador'),
('Carlos Pérez', 'carlos@gmail.com', 'Santa Ana'),
('María López', 'maria@gmail.com', 'La Libertad');

INSERT INTO Solicitud (id_mascota, id_persona, fecha_solicitud, estado) VALUES
(1, 1, CURDATE(), 'pendiente'),
(2, 2, CURDATE(), 'pendiente'),
(3, 3, CURDATE(), 'pendiente');
