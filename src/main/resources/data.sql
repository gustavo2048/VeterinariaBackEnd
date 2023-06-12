-- TABLA USUARIOS (AGREGAR VETERINARIOS)
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Suarez',false,'2222','calle123','prueba2@gmail.com','Lautaro',1234,'CLIENTE','22134223443',true);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Gonzales',false,'3333','calle123','prueba3@gmail.com','Gustavo',1234,'CLIENTE','2213422234',true);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`) 
VALUES ('Roberto',false,'3333','calle123','veterinario1@gmail.com','Nicolas',1234,'VETERINARIO','2213422234',true);


-- TABLA MASCOTA
INSERT INTO `mascota` (`id`, `borrado`, `caracteristicas`, `color`, `edad`, `foto`, `nombre`, `raza`, `tamanio`, `usuario_id`)
VALUES (NULL, b'00000', 'Es hermoso', 'negro', '2019-05-27 00:00:00', NULL, 'Oddie', 'callejero', 'grande', '1');
INSERT INTO `mascota` (`id`, `borrado`, `caracteristicas`, `color`, `edad`, `foto`, `nombre`, `raza`, `tamanio`, `usuario_id`)
VALUES (NULL, b'00000', 'Se la re banca', 'blanco', '2022-05-27 00:00:00', NULL, 'Nancy', 'callejero', 'grande', '1');
INSERT INTO `mascota` (`id`, `borrado`, `caracteristicas`, `color`, `edad`, `foto`, `nombre`, `raza`, `tamanio`, `usuario_id`)
VALUES (NULL, b'00000', 'Mejor amigo', 'negro', '2021-05-27 00:00:00', NULL, 'Cristal', 'callejero', 'grande', '2');
INSERT INTO `mascota` (`id`, `borrado`, `caracteristicas`, `color`, `edad`, `foto`, `nombre`, `raza`, `tamanio`, `usuario_id`)
VALUES (NULL, b'00000', 'Se porta re bien', 'negro', '2023-05-27 00:00:00', NULL, 'Susy', 'callejero', 'grande', '2');

-- TABLA ENCONTRADOS
INSERT INTO `encontrado` (`id`, `descripcion`, `duenio`, `fecha_encontrado`, `genero`, `lugar`, `mascota_id`, `usuario_id`)
VALUES (NULL, 'dasdsad', false, '2023-06-05', 'asdf', 'fffff', '2', '1');
INSERT INTO `encontrado` (`id`, `descripcion`, `duenio`, `fecha_encontrado`, `genero`, `lugar`, `mascota_id`, `usuario_id`)
VALUES (NULL, 'dasdsad', true, '2023-06-05', 'asdf', 'fffff', '1', '1');

-- TABLA PERDIDOS
INSERT INTO `perdido` (`id`, `descripcion`, `encontrado`, `fecha_perdido`, `genero`, `lugar`, `mascota_id`, `usuario_id`)
VALUES (NULL, 'asdffff',false, '2023-06-01', 'asdffff', 'sssssssss', '3', '2');
INSERT INTO `perdido` (`id`, `descripcion`, `encontrado`, `fecha_perdido`, `genero`, `lugar`, `mascota_id`, `usuario_id`)
VALUES (NULL, 'asdffff', true, '2023-06-01', 'asdffff', 'sssssssss', '4', '2');


-- TABLA ADOPCIONES
INSERT INTO `adopcion` (`adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivo`, `raza`, `sexo`, `tamanio`, `titulo`,`mascota_id`, `usuario_id`)
VALUES (b'00000', b'00000', 'Es un perrinchi camina bien', NULL, 'No tenemos mas lugar', 'Callejero', 'Macho', 'Grande', 'Adoptame Porfis',1, 1);
INSERT INTO `adopcion` (`adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivo`, `raza`, `sexo`, `tamanio`, `titulo`,`mascota_id`, `usuario_id`)
VALUES (b'00000', b'00000', 'Es lo mas lindo que vi', NULL, 'Muchas crias', 'Callejero', 'Hembra', 'Pequenia', 'Soy re bella', 2,1);
INSERT INTO `adopcion` (`adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivo`, `raza`, `sexo`, `tamanio`, `titulo`,`mascota_id`, `usuario_id`)
VALUES (b'00000', b'00000', 'Tu compa ideal', NULL, 'Lo encontramos en la calle', 'Callejero', 'Macho', 'Grande', 'No te vas a arrepentir',3, 2);
INSERT INTO `adopcion` (`adoptado`, `borrado`, `descripcion`, `fecha_creacion`, `motivo`, `raza`, `sexo`, `tamanio`, `titulo`,`mascota_id`, `usuario_id`)
VALUES (b'00000', b'00000', 'Se porta increible', NULL, 'No tenemos mas lugar', 'Callejero', 'Macho', 'Grande', 'Es un amor',4, 2);
-- TABLA PASEADORES

INSERT INTO `paseador` (`id`, `activo`, `apellido`, `borrado`, `descripcion`, `email`, `fecha_creacion`, `horario_trabajo`, `nombre`, `zona_trabajo`) 
VALUES (NULL, false, 'Lomas', false, 'Mas de 10 anios de experiencia', 'lomas@lomas', NULL, 'Tarde', 'Tomas', 'Centro');
INSERT INTO `paseador` (`id`, `activo`, `apellido`, `borrado`, `descripcion`, `email`, `fecha_creacion`, `horario_trabajo`, `nombre`, `zona_trabajo`) 
VALUES (NULL, false, 'Gutierrez', false, 'Amante de los perros', 'lomas@2lomas', NULL, 'Maniana', 'Tobias', 'Zona Pza Rocha');
INSERT INTO `paseador` (`id`, `activo`, `apellido`, `borrado`, `descripcion`, `email`, `fecha_creacion`, `horario_trabajo`, `nombre`, `zona_trabajo`) 
VALUES (NULL, false, 'Torres', false, 'Puntual', 'lomas@lomas1', NULL, 'Tarde', 'Gaston', 'Centro');

-- TABLA TURNOS
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CONFIRMADO', '2023-06-24 00:00:00', '2023-05-22 00:00:00', '2023-05-24 00:00:00', 'MAÑANA', 'Revisar el estado de mi mascota', '1', '1');
INSERT INTO `turno` (`borrado`, `estado_solicitud`, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'PENDIENTE', NULL, '2023-05-22 00:00:00', '2023-06-26 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '1', '1');
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

