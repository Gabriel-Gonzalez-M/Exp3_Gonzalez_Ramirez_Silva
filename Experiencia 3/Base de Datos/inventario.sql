USE db_usuarios;
INSERT INTO inventario (id_producto,id_sucursal,stock) VALUES (1,1,100);
INSERT INTO inventario (id_producto,id_sucursal,stock) VALUES (2,1,50);
INSERT INTO inventario (id_producto,id_sucursal,stock) VALUES (3,1,0);
SELECT * FROM db_usuarios.inventario;