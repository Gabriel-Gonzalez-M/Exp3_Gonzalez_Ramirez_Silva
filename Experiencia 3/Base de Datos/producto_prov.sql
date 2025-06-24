USE db_usuarios;
INSERT INTO producto_prov (cant_prodx_mayor,id_producto,id_proveedor,precio,tiempo_envio) VALUES (10,1,1,1000,'02:00:00');
INSERT INTO producto_prov (cant_prodx_mayor,id_producto,id_proveedor,precio,tiempo_envio) VALUES (30,2,2,1500,'09:00:00');
INSERT INTO producto_prov (cant_prodx_mayor,id_producto,id_proveedor,precio,tiempo_envio) VALUES (50,3,3,2000,'05:00:00');
SELECT * FROM db_usuarios.producto_prov;