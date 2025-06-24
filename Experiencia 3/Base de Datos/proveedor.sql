USE db_usuarios;
INSERT INTO proveedor (nombre, apellido, direccion, numero_calle, comuna, nacionalidad,telefono, correo, contrasena, web, horario_apertura, horario_cierre)
VALUES ('Juan', 'Pérez', 'Calle Falsa', 123, 'Santiago', 'Chilena',987654321, 'juan@mail.com', '1234', 'web.com', '09:00:00', '18:00:00');
INSERT INTO proveedor (apellido, comuna, contrasena, correo, direccion,horario_apertura, horario_cierre, nacionalidad, nombre,numero_calle, telefono, web)
VALUES ('Martínez', 'Providencia', 'Prov1234', 'contacto@fraganciasmartinez.cl','Av. Nueva Providencia', '09:00:00', '18:00:00', 'Chilena','Fragancias Martínez', 1125, '+56 9 8123 4567', 'https://fraganciasmartinez.cl');
INSERT INTO proveedor (apellido, comuna, contrasena, correo, direccion,horario_apertura, horario_cierre, nacionalidad, nombre,numero_calle, telefono, web)
VALUES ('Rossi', 'Viña del Mar', 'Perf2024!', 'ventas@rosiperfumes.com','Calle 15 Norte', '08:30:00', '17:30:00', 'Italiana','Rossi Perfumes Ltda.', 980, '+56 32 2765432', 'http://www.rosiperfumes.com');
SELECT * FROM db_usuarios.proveedor;