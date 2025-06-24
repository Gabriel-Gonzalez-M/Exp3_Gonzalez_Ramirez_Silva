USE db_usuarios;
INSERT INTO venta (total, descuento, id_cliente, presencial, id_empleado, codigo_promo, id_sucursal) VALUES (25000, 0.00, 1, TRUE, 1, 'CYBER25', 2);
INSERT INTO venta (total, descuento, id_cliente, presencial, id_empleado, codigo_promo, id_sucursal) VALUES (18000, 1500.00, 2,  TRUE, 2, 'CYBER25', 1);
INSERT INTO venta (total, descuento, id_cliente, presencial, id_empleado, codigo_promo, id_sucursal) VALUES (34000, 0.00, 3,  TRUE, 3, 'BIENVENIDO10', 3);
SELECT * FROM db_usuarios.venta;