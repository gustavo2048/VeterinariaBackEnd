-- TABLA USUARIOS (AGREGAR VETERINARIOS)
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Suarez',false,'2222','calle123','prueba2@gmail.com','Lautaro',1234,'CLIENTE','22134223443',true);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Gonzales',false,'3333','calle123','prueba3@gmail.com','Gustavo',1234,'CLIENTE','2213422234',true);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Roberto',false,'3333','calle123','veterinario1@gmail.com','Pedro',1234,'VETERINARIO','2213422234',true);


-- TABLA MASCOTA
INSERT INTO `mascota` (`id`, `borrado`, `caracteristicas`, `color`,`edad`,`sexo`, `foto`, `nombre`, `publicado`,`raza`, `tamanio`, `usuario_id`)
VALUES (NULL, b'00000', 'Es hermoso', 'negro', '2019-05-27 00:00:00', 'macho', NULL, 'Oddie',false, 'callejero', 'grande', '1');
INSERT INTO `mascota` (`id`, `borrado`, `caracteristicas`, `color`, `edad`,`sexo`,`foto`, `nombre`, `publicado`, `raza`, `tamanio`, `usuario_id`)
VALUES (NULL, b'00000', 'Se la re banca', 'blanco', '2022-05-27 00:00:00','hembra', NULL, 'Nancy',false, 'callejero', 'grande', '1');
INSERT INTO `mascota` (`id`, `borrado`, `caracteristicas`, `color`, `edad`,`sexo`, `foto`, `nombre`, `publicado`, `raza`, `tamanio`, `usuario_id`)
VALUES (NULL, b'00000', 'Mejor amigo', 'negro', '2021-05-27 00:00:00','hembra', NULL, 'Cristal',false, 'callejero', 'grande', '2');
INSERT INTO `mascota` (`id`, `borrado`, `caracteristicas`, `color`, `edad`,`sexo`, `foto`, `nombre`, `publicado`, `raza`, `tamanio`, `usuario_id`)
VALUES (NULL, b'00000', 'Se porta re bien', 'negro', '2023-05-27 00:00:00','hembra', NULL, 'Susy',true, 'callejero', 'grande', '2');

-- TABLA ENCONTRADOS
INSERT INTO `encontrado` (`id`, `descripcion`, `duenio`, `fecha_encontrado`, `color`,`tam`,`sexo`, `foto`, `raza`, `lugar`, `usuario_id`)
VALUES (NULL, 'Encontre este perro lastimado', false, '2023-06-05', 'negro','mediano','macho',NULL,'mestizo', 'Centro', '1');
INSERT INTO `encontrado` (`id`, `descripcion`, `duenio`, `fecha_encontrado`, `color`,`tam`,`sexo`, `foto`, `raza`, `lugar`, `usuario_id`)
VALUES (NULL, 'No tiene collar', true, '2023-06-05', 'negro','mediano','hembra',NULL,'mestizo', 'Plaza Malvinas', '1');


-- TABLA PERDIDOS
INSERT INTO `perdido` (`id`, `descripcion`, `encontrado`, `fecha_perdido`, `genero`, `lugar`, `mascota_id`, `usuario_id`)
VALUES (NULL, 'Perdi mi perro tiene collar',false, '2023-06-01', 'macho', '9 Y 60', '3', '2');
INSERT INTO `perdido` (`id`, `descripcion`, `encontrado`, `fecha_perdido`, `genero`, `lugar`, `mascota_id`, `usuario_id`)
VALUES (NULL, 'Se escapo mi perrito es ciego', true, '2023-06-01', 'macho', 'Plaza rocha', '4', '2');


-- TABLA DE DONACIONES A PERROS
INSERT INTO `donacion_perro` (`id`, `cbu`, `descripcion`, `fecha_limite`, `historia`, `monto`) 
VALUES (NULL, '234231432', 'terriblemente atropellado se parece a marcos', '2023-07-28', 'amigable, amoroso y bondadoso. Vivio mucho tiempo en la calle hasta que lo rescato la duenia', '33456');
INSERT INTO `donacion_perro` (`id`, `cbu`, `descripcion`, `fecha_limite`, `historia`, `monto`) 
VALUES (NULL, '2341432', 'le falta una pata le van a cortar la otra', '2023-08-1', ' Vivio mucho tiempo en la calle es callejero', '4500');


-- TABLA ADOPCIONES
INSERT INTO `adopcion` (`adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivo`, `raza`, `sexo`, `tamanio`, `titulo`,`mascota_id`, `usuario_id`)
VALUES (b'00000', b'00000', 'Es un perrinchi camina bien', NULL, 'No tenemos mas lugar', 'Callejero', 'Macho', 'Grande', 'Adoptame Porfis',1, 1);
INSERT INTO `adopcion` (`adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivo`, `raza`, `sexo`, `tamanio`, `titulo`,`mascota_id`, `usuario_id`)
VALUES (b'00000', b'00000', 'Tu compa ideal', NULL, 'Lo encontramos en la calle', 'Callejero', 'Macho', 'Grande', 'No te vas a arrepentir',3, 2);
INSERT INTO `adopcion` (`adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivo`, `raza`, `sexo`, `tamanio`, `titulo`,`mascota_id`, `usuario_id`)
VALUES (b'00000', b'00000', 'Se porta increible', NULL, 'No tenemos mas lugar', 'Callejero', 'Macho', 'Grande', 'Es un amor',4, 2);
-- TABLA PASEADORES

INSERT INTO `paseador` (`id`, `activo`, `apellido`, `disponible`, `descripcion`, `email`, `fecha_creacion`, `horario_trabajo`, `nombre`, `zona_trabajo`) 
VALUES (NULL, false, 'Lomas', true, 'Mas de 10 anios de experiencia', 'lomas@lomas', NULL, 'Tarde', 'Tomas', 'Centro');
INSERT INTO `paseador` (`id`, `activo`, `apellido`, `disponible`, `descripcion`, `email`, `fecha_creacion`, `horario_trabajo`, `nombre`, `zona_trabajo`) 
VALUES (NULL, false, 'Gutierrez', true, 'Amante de los perros', 'lomas@2lomas', NULL, 'Maniana', 'Tobias', 'Zona Pza Rocha');
INSERT INTO `paseador` (`id`, `activo`, `apellido`, `disponible`, `descripcion`, `email`, `fecha_creacion`, `horario_trabajo`, `nombre`, `zona_trabajo`) 
VALUES (NULL, false, 'Torres', false, 'Puntual', 'lomas@lomas1', NULL, 'Tarde', 'Gaston', 'Centro');

-- TABLA TURNOS
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CONFIRMADO', '2023-06-24 00:00:00', '2023-05-22 00:00:00', '2023-05-24 00:00:00', 'MAÑANA', 'Revisar el estado de mi mascota', '1', '1');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'PENDIENTE', NULL, '2023-05-22 00:00:00', '2023-06-22 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '1', '1');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'PENDIENTE', NULL, '2023-05-22 00:00:00', '2023-06-27 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '2', '1');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CONFIRMADO', '2023-06-27 00:00:00', '2023-05-22 00:00:00', '2023-05-27 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '4', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'PENDIENTE', NULL, '2023-05-22 00:00:00', '2023-07-01 00:00:00', 'MAÑANA', 'Revisar el estado de mi mascota', '3', '2');

INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'PENDIENTE', NULL, '2023-05-22 00:00:00', '2023-06-30 00:00:00', 'MAÑANA', 'Revisar el estado de mi mascota', '4', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CONFIRMADO', '2023-07-03 00:00:00', '2023-05-22 00:00:00', '2023-06-03 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '4', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CONFIRMADO', '2023-06-24 00:00:00', '2023-05-22 00:00:00', '2023-06-04 00:00:00', 'MAÑANA', 'Revisar el estado de mi mascota', '3', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CONFIRMADO', '2023-06-22 00:00:00', '2023-05-22 00:00:00', '2023-06-05 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '3', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CONFIRMADO', '2023-06-22 00:00:00', '2023-05-22 00:00:00', '2023-06-05 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '3', '2');

INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CANCELADO', NULL, '2023-05-22 00:00:00', '2023-06-18 00:00:00', 'MAÑANA', 'Revisar el estado de mi mascota', '4', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CANCELADO', NULL, '2023-05-22 00:00:00', '2023-06-22 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '4', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CANCELADO', NULL, '2023-05-22 00:00:00', '2023-06-18 00:00:00', 'MAÑANA', 'Revisar el estado de mi mascota', '4', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'ATENDIDA', '2023-05-22 00:00:00', '2023-05-22 00:00:00', '2023-06-22 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '4', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'ATENDIDO', '2023-05-12 00:00:00', '2023-05-22 00:00:00', '2023-06-18 00:00:00', 'MAÑANA', 'Revisar el estado de mi mascota', '4', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'ATENDIDO', '2023-06-02 00:00:00', '2023-05-22 00:00:00', '2023-06-22 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '4', '2');

