-- TABLA USUARIOS (AGREGAR VETERINARIOS)
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Suarez',false,'111111111','calle123','suarez@gmail.com','Ximena',1234567,'CLIENTE','22134223443',false);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Perez',false,'222222222','calle163','perez@gmail.com','Carla',1234567,'CLIENTE','22134223443',false);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Rodriguez',false,'33333333','calle123','rodriguez@gmail.com','Yamila',1234567,'CLIENTE','22134223443',false);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Romero',false,'444444444','calle23','romero@gmail.com','victoria',1234567,'CLIENTE','22134223443',false);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Benites',false,'55555555','calle32','benites@gmail.com','Carlos',1234567,'CLIENTE','221343443',false);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Bellino',false,'6666666','calle342','bellino@gmail.com','Fernanda',1234567,'CLIENTE','22134223443',false);

-- TABLA MASCOTA
INSERT INTO `mascota`(`borrado`, `caracteristicas`, `edad`, `foto`, `nombre`, `raza`, `tamanio`,`usuario_id`) 
VALUES (false, 'caracteristica1 gris', '12años', 'foto1.jpg', 'tito', 'razaDogo', 'Tamaño grande',1 );
INSERT INTO `mascota`(`borrado`, `caracteristicas`, `edad`, `foto`, `nombre`, `raza`, `tamanio`, `usuario_id`) 
VALUES (false, 'caracteristica2 gris', '1años', 'foto2.jpg', 'Rocco', 'pepe', 'Tamaño chico',2 );
INSERT INTO `mascota`(`borrado`, `caracteristicas`, `edad`, `foto`, `nombre`, `raza`, `tamanio`, `usuario_id`) 
VALUES (false, 'caracteristica3 gris', '2años', 'foto3.jpg', 'Toto', 'Labrador', 'Tamaño mediano' ,3);
INSERT INTO `mascota`(`borrado`, `caracteristicas`, `edad`, `foto`, `nombre`, `raza`, `tamanio`, `usuario_id`) 
VALUES (false, 'caracteristica4 gris', '3años', 'foto4.jpg', 'Rocco2', 'Lazy', 'Tamaño mediano',4);
INSERT INTO `mascota`(`borrado`, `caracteristicas`, `edad`, `foto`, `nombre`, `raza`, `tamanio`, `usuario_id`) 
VALUES (false, 'caracteristica5 gris', '10años', 'foto5.jpg', 'Rocco3', 'Doberman', 'Tamaño mediano',5);
INSERT INTO `mascota`(`borrado`, `caracteristicas`, `edad`, `foto`, `nombre`, `raza`, `tamanio`, `usuario_id`) 
VALUES (false, 'caracteristica6 gris', '1años', 'foto6.jpg', 'Rocco4', 'Pitbull', 'Tamaño mediano',6);

-- TABLA ADOPCIONES
INSERT INTO `adopcion` (`id`, `adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivacion`, `observacion`, `titulo`, `id_usuario_creo`) 
VALUES (NULL, b'00000', b'00000', 'Es un perrito re lindo.', NULL, 'Tuvimos muchas crías, no podemos quedárnoslo.', 'Esta perfectamente sano.', 'Adoptame porfi!', NULL);
INSERT INTO `adopcion` (`id`, `adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivacion`, `observacion`, `titulo`, `id_usuario_creo`) 
VALUES (NULL, b'00000', b'00000', 'Es un perrito re lindo.', NULL, 'Tuvimos muchas crías, no podemos quedárnoslo.', 'Esta perfectamente sano.', 'Soy re bueno', NULL);
INSERT INTO `adopcion` (`id`, `adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivacion`, `observacion`, `titulo`, `id_usuario_creo`) 
VALUES (NULL, b'00000', b'00000', 'Es un perrito re lindo.', NULL, 'Tuvimos muchas crías, no podemos quedárnoslo.', 'Esta perfectamente sano.', 'Tu mejor Amigo', NULL);
INSERT INTO `adopcion` (`id`, `adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivacion`, `observacion`, `titulo`, `id_usuario_creo`) 
VALUES (NULL, b'00000', b'00000', 'Es un perrito re lindo.', NULL, 'Tuvimos muchas crías, no podemos quedárnoslo.', 'Esta perfectamente sano.', 'yo se que queres un perrito', NULL);
INSERT INTO `adopcion` (`id`, `adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivacion`, `observacion`, `titulo`, `id_usuario_creo`) 
VALUES (NULL, b'00000', b'00000', 'Es un perrito re lindo.', NULL, 'Tuvimos muchas crías, no podemos quedárnoslo.', 'Esta perfectamente sano.', 'Adoptame porfi!', NULL);
INSERT INTO `adopcion` (`id`, `adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivacion`, `observacion`, `titulo`, `id_usuario_creo`) 
VALUES (NULL, b'00000', b'00000', 'Es un perrito re lindo.', NULL, 'Tuvimos muchas crías, no podemos quedárnoslo.', 'Esta perfectamente sano.', 'Soy re bueno', NULL);
INSERT INTO `adopcion` (`id`, `adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivacion`, `observacion`, `titulo`, `id_usuario_creo`) 
VALUES (NULL, b'00000', b'00000', 'Es un perrito re lindo.', NULL, 'Tuvimos muchas crías, no podemos quedárnoslo.', 'Esta perfectamente sano.', 'Tu mejor Amigo', NULL);
INSERT INTO `adopcion` (`id`, `adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivacion`, `observacion`, `titulo`, `id_usuario_creo`) 
VALUES (NULL, b'00000', b'00000', 'Es un perrito re lindo.', NULL, 'Tuvimos muchas crías, no podemos quedárnoslo.', 'Esta perfectamente sano.', 'yo se que queres un perrito', NULL);