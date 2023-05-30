-- TABLA USUARIOS (AGREGAR VETERINARIOS)
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Suarez',false,'2222','calle123','prueba2@gmail.com','Lautaro',1234,'CLIENTE','22134223443',true);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Gonzales',false,'3333','calle123','prueba3@gmail.com','Gustavo',1234,'CLIENTE','2213422234',true);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Gonzales',false,'3333','calle123','pablo@gmail.com','pablo',1234,'VETERINARIO','2213422234',false);
VALUES ('Roberto',false,'3333','calle123','veterinario1@gmail.com','Nicolas',1234,'VETERINARIO','2213422234',true);


-- TABLA MASCOTA
INSERT INTO `mascota`(`borrado`, `caracteristicas`, `edad`, `foto`, `nombre`, `raza`, `tamanio`,`usuario_id`) 
VALUES (false, 'Es blanco con manchitas negras', '2 años', 'foto1.jpg', 'Oddie', 'Mestizo', 'mediano',1 );
INSERT INTO `mascota`(`borrado`, `caracteristicas`, `edad`, `foto`, `nombre`, `raza`, `tamanio`,`usuario_id`) 
VALUES (false, 'Es naranja', '5 años', 'foto1.jpg', 'Francis', 'Doberman', 'grande', 1 );

INSERT INTO `mascota`(`borrado`, `caracteristicas`, `edad`, `foto`, `nombre`, `raza`, `tamanio`,`usuario_id`) 
VALUES (false, 'Es hermosa', '4 años', 'foto1.jpg', 'Luz', 'Caniche', 'chiquitita',2 );
INSERT INTO `mascota`(`borrado`, `caracteristicas`, `edad`, `foto`, `nombre`, `raza`, `tamanio`,`usuario_id`) 
VALUES (false, 'Aun mas hermosa', '2 años', 'foto1.jpg', 'Luna', 'Caniche', 'chiquita', 2 );

-- TABLA ENCONTRADOS
INSERT INTO `encontrado` (`id`, `con_duenio`, `descripcion`, `fecha_encontrado`, `genero`, `lugar`)
VALUES (NULL, true, 'Se encontro perro mestizo mediano ', NULL, 'masculino', 'centro');
INSERT INTO `encontrado` (`id`, `con_duenio`, `descripcion`, `fecha_encontrado`, `genero`, `lugar`)
VALUES (NULL, false, 'Se encontro perro bulldog grande ', NULL, 'femenino', 'centro');

-- TABLA PERDIDOS
INSERT INTO `perdido` (`id`, `descripcion`, `encontrado`, `fecha_perdido`, `genero`, `lugar`)
VALUES (NULL, 'lindo perro', false, NULL, 'femenino', 'tolosa centro');
INSERT INTO `perdido` (`id`, `descripcion`, `encontrado`, `fecha_perdido`, `genero`, `lugar`)
VALUES (NULL, 'lindo perro', true, NULL, 'masculino', 'centro');
INSERT INTO `perdido` (`id`, `descripcion`, `encontrado`, `fecha_perdido`, `genero`, `lugar`)
VALUES (NULL, 'lindo perro', false, NULL, 'femenino', 'tolosa centro');
INSERT INTO `perdido` (`id`, `descripcion`, `encontrado`, `fecha_perdido`, `genero`, `lugar`)
VALUES (NULL, 'lindo perro', true, NULL, 'masculino', 'centro');

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
VALUES (NULL, false, 'Lomas', false, 'Mas de 10 anios de experiencia', 'lomas@lomas', NULL, 'Tarde', 'Tomas', 'Centro');
INSERT INTO `paseador` (`id`, `activo`, `apellido`, `borrado`, `descripcion`, `email`, `fecha_creacion`, `horario_trabajo`, `nombre`, `zona_trabajo`) 
VALUES (NULL, false, 'Gutierrez', false, 'Amante de los perros', 'lomas@2lomas', NULL, 'Maniana', 'Tobias', 'Zona Pza Rocha');
INSERT INTO `paseador` (`id`, `activo`, `apellido`, `borrado`, `descripcion`, `email`, `fecha_creacion`, `horario_trabajo`, `nombre`, `zona_trabajo`) 
VALUES (NULL, false, 'Torres', false, 'Puntual', 'lomas@lomas1', NULL, 'Tarde', 'Gaston', 'Centro');

-- TABLA TURNOS
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CONFIRMADO', NULL, '2023-05-22 00:00:00', '2023-05-24 00:00:00', 'MAÑANA', 'Revisar el estado de mi mascota', '1', '1');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'PENDIENTE', NULL, '2023-05-22 00:00:00', '2023-05-26 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '1', '1');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'PENDIENTE', NULL, '2023-05-22 00:00:00', '2023-05-26 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '2', '1');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CONFIRMADO', NULL, '2023-05-22 00:00:00', '2023-05-27 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '1', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'PENDIENTE', NULL, '2023-05-22 00:00:00', '2023-06-01 00:00:00', 'MAÑANA', 'Revisar el estado de mi mascota', '1', '2');
