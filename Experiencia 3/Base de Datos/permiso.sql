use db_usuarios;
INSERT INTO permiso (nombre,descripcion) VALUES ('Cliente','PERMISOS BASICOS');
INSERT INTO permiso (nombre,descripcion) VALUES ('Empleado','PERMISOS MEDIOS');
INSERT INTO permiso (nombre,descripcion) VALUES ('Gerente','PERMISOS AVANZADOS');
INSERT INTO permiso (nombre,descripcion) VALUES ('Administrador','PERMISOS TOTALES');
SELECT * FROM db_usuarios.permiso;