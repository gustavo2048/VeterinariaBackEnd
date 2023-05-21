-- TABLA USUARIOS (AGREGAR VETERINARIOS)
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Suarez',false,'111111111','calle123','suarez@gmail.com','Ximena',1234567,'CLIENTE','22134223443',true);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Perez',false,'222222222','calle163','perez@gmail.com','Carla',1234567,'CLIENTE','22134223443',false);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Rodriguez',false,'33333333','calle123','rodriguez@gmail.com','Yamila',1234567,'CLIENTE','22134223443',false);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Romero',false,'444444444','calle23','romero@gmail.com','victoria',1234567,'CLIENTE','22134223443',false);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Benites',false,'55555555','calle32','benites@gmail.com','Carlos',1234567,'CLIENTE','221343443',false);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Bellino',false,'449392934','calle342','bellino@gmail.com','Fernanda',1234567,'CLIENTE','22134223443',false);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('vete',false,'449392934','calle3w2','pablo@gmail.com','Pablo',1234567,'VETERINARIO','22134223443',false);

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
INSERT INTO `adopcion` (`id`, `adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivo`, `observacion`, `titulo`, `usuario_id`)
VALUES (NULL, b'00000', b'00000', 'Se porta excelente.', NULL, 'Tuvimos muchas crías. No tenemos mas lugar.', 'Esta completamente sano.', 'Adoptamee', '1');
INSERT INTO `adopcion` (`id`, `adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivo`, `observacion`, `titulo`, `usuario_id`)
VALUES (NULL, b'00000', b'00000', 'Se porta excelente.', NULL, 'Tuvimos muchas crías. No tenemos mas lugar.', 'Esta completamente sano.', 'Se que me queres', '1');
INSERT INTO `adopcion` (`id`, `adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivo`, `observacion`, `titulo`, `usuario_id`)
VALUES (NULL, b'00000', b'00000', 'Se porta excelente.', NULL, 'Tuvimos muchas crías. No tenemos mas lugar.', 'Esta completamente sano.', 'Se que me queres', '2');
INSERT INTO `adopcion` (`id`, `adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivo`, `observacion`, `titulo`, `usuario_id`)
VALUES (NULL, b'00000', b'00000', 'Se porta excelente.', NULL, 'Tuvimos muchas crías. No tenemos mas lugar.', 'Esta completamente sano.', 'Adoptamee', '2');

-- TABLA PASEADORES

INSERT INTO `paseador` (`id`, `activo`, `apellido`, `borrado`, `descripcion`, `email`, `fecha_creacion`, `horario_trabajo`, `nombre`, `zona_trabajo`) 
VALUES (NULL, false, 'Lomas', false, 'ALTO CAPO', 'lomas@lomas', NULL, 'Tarde', 'Tomas', 'Centro');

-- TABLA TURNOS
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `id_mascota`, `usuario_id`) 
VALUES (b'00000', 'PENDIENTE', NULL, '2023-05-22 16:37:13', '2023-05-24 16:37:13', 'MAÑANA', 'Revisar el estado de mi mascota', '1', '1');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `id_mascota`, `usuario_id`) 
VALUES (b'00000', 'PENDIENTE', NULL, '2023-05-22 16:37:13', '2023-05-26 16:37:13', 'TARDE', 'Revisar el estado de mi mascota', '1', '1');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `id_mascota`, `usuario_id`) 
VALUES (b'00000', 'PENDIENTE', NULL, '2023-05-22 16:37:13', '2023-05-27 16:37:13', 'TARDE', 'Revisar el estado de mi mascota', '1', '1');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `id_mascota`, `usuario_id`) 
VALUES (b'00000', 'PENDIENTE', NULL, '2023-05-22 16:37:13', '2023-06-01 16:37:13', 'MAÑANA', 'Revisar el estado de mi mascota', '1', '1');