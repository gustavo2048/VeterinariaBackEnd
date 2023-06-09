-- TABLA USUARIOS (AGREGAR VETERINARIOS)
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`, `monto_descuento`) 
VALUES ('Suarez',false,'2222','calle123','prueba2@gmail.com','Lautaro',1234,'CLIENTE','22134223443',true, 0);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`,`monto_descuento`) 
VALUES ('Gonzales',false,'3333','calle123','prueba3@gmail.com','Gustavo',1234,'CLIENTE','2213422234',true, 0);
INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`,`monto_descuento`) 
VALUES ('Roberto',false,'3333','calle123','veterinario1@gmail.com','Pedro',1234,'VETERINARIO','2213422234',true, 0);

INSERT INTO `usuario`(`apellido`, `borrado`, `dni`, `domicilio`, `email`, `nombre`, `password`, `rol`, `telefono`, `verificado`, `monto_descuento`) 
VALUES ('Talerico',false,'3333333','calle123','prueba0@gmail.com','Yamila',1234,'CLIENTE','22134223443',false, 0);



--- TABLA TARJETAS
INSERT INTO `tarjeta` (`id`, `codigo`, `fecha`, `monto`, `nombre`, `nro_tarjeta`,`usuario_id`)
VALUES (NULL, '123', '2025-07-09', '50000', 'lautaro', '7654321','1');

-- TABLA MASCOTA
INSERT INTO `mascota` (`id`, `borrado`, `caracteristicas`, `color`,`edad`,`sexo`, `foto`, `nombre`, `publicado`,`raza`, `tamanio`, `usuario_id`,`en_adopcion`)
VALUES (NULL, b'00000', 'Es hermoso', 'negro', '2019-05-27 00:00:00', 'Macho', NULL, 'Oddie',false, 'Mestizo', 'grande', '1', true);
INSERT INTO `mascota` (`id`, `borrado`, `caracteristicas`, `color`, `edad`,`sexo`,`foto`, `nombre`, `publicado`, `raza`, `tamanio`, `usuario_id`,`en_adopcion`)
VALUES (NULL, b'00000', 'Se la re banca', 'blanco', '2022-05-27 00:00:00','Hembra', NULL, 'Nancy',false, 'Mestizo', 'grande', '1',false);
INSERT INTO `mascota` (`id`, `borrado`, `caracteristicas`, `color`, `edad`,`sexo`, `foto`, `nombre`, `publicado`, `raza`, `tamanio`, `usuario_id`,`en_adopcion`)
VALUES (NULL, b'00000', 'Mejor amigo', 'negro', '2021-05-27 00:00:00','Hembra', NULL, 'Cristal',false, 'Mestizo', 'grande', '2',true);
INSERT INTO `mascota` (`id`, `borrado`, `caracteristicas`, `color`, `edad`,`sexo`, `foto`, `nombre`, `publicado`, `raza`, `tamanio`, `usuario_id`,`en_adopcion`)
VALUES (NULL, b'00000', 'Se porta re bien', 'negro', '2023-05-27 00:00:00','Hembra', NULL, 'Susy',true, 'Mestizo', 'grande', '2',true);

INSERT INTO `mascota` (`id`, `borrado`, `caracteristicas`, `color`,`edad`,`sexo`, `foto`, `nombre`, `publicado`,`raza`, `tamanio`, `usuario_id`,`en_adopcion`)
VALUES (NULL, b'00000', 'Es hermoso', 'gris', '2023-07-01 00:00:00', 'Macho', NULL, 'Junior',false, 'Mestizo', 'grande', '1', false);



-- TABLA ENCONTRADOS
INSERT INTO `encontrado` (`id`, `descripcion`, `duenio`, `fecha_encontrado`, `color`,`tam`,`sexo`, `foto`, `raza`, `lugar`, `usuario_id`)
VALUES (NULL, 'Encontre este perro lastimado', false, '2023-06-05', 'negro','mediano','Macho',NULL,'Mestizo', 'Centro', '1');
INSERT INTO `encontrado` (`id`, `descripcion`, `duenio`, `fecha_encontrado`, `color`,`tam`,`sexo`, `foto`, `raza`, `lugar`, `usuario_id`)
VALUES (NULL, 'No tiene collar', true, '2023-06-05', 'negro','mediano','Hembra',NULL,'Mestizo', 'Plaza Malvinas', '1');


-- TABLA PERDIDOS
INSERT INTO `perdido` (`id`, `descripcion`, `encontrado`, `fecha_perdido`, `genero`, `lugar`, `mascota_id`, `usuario_id`)
VALUES (NULL, 'Perdi mi perro tiene collar',false, '2023-06-01', 'Macho', '9 Y 60', '3', '2');
INSERT INTO `perdido` (`id`, `descripcion`, `encontrado`, `fecha_perdido`, `genero`, `lugar`, `mascota_id`, `usuario_id`)
VALUES (NULL, 'Se escapo mi perrito es ciego', true, '2023-06-01', 'Macho', 'Plaza rocha', '4', '2');


-- TABLA DE DONACIONES A PERROS
INSERT INTO `donacion_perro` (`id`, `cbu`, `descripcion`, `fecha_limite`, `foto`, `historia`, `monto`) 
VALUES (NULL, '234231432', 'terriblemente atropellado se parece a marcos', '2023-06-22',NULL, 'amigable, amoroso y bondadoso. Vivio mucho tiempo en la calle hasta que lo rescato la duenia', '33456');
INSERT INTO `donacion_perro` (`id`, `cbu`, `descripcion`, `fecha_limite`, `foto`, `historia`, `monto`) 
VALUES (NULL, '2341432', 'le falta una pata le van a cortar la otra', '2023-08-1',NULL, ' Vivio mucho tiempo en la calle es callejero', '4500');


-- TABLA DE DONACIONES A REFUGIOS
INSERT INTO `donacion_refugio` (`id`, `cbu`, `contacto`, `fecha_limite`, `foto`, `causa`, `monto`, `zona`) 
VALUES (NULL, '23421422', 'elparaiso@gmail.com', '2023-06-17',NULL,'perro hambrientos', '133000', 'parque arana');
INSERT INTO `donacion_refugio` (`id`, `cbu`, `contacto`, `fecha_limite`, `foto`, `causa`, `monto`, `zona`) 
VALUES (NULL, '23421422', 'elchato@gmail.com', '2023-08-17',NULL,'ataque de garrapatas y pulgas', '133000', 'parque saavedra');


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

-- TABLA CUIDADORES

INSERT INTO `cuidador` (`id`, `activo`, `apellido`, `disponible`, `descripcion`, `email`, `fecha_creacion`, `horario_trabajo`, `nombre`, `zona_trabajo`) 
VALUES (NULL, false, 'Lomas', true, 'Mas de 10 anios de experiencia', 'lomas@lomas', NULL, 'Tarde', 'Tito', 'Centro');
INSERT INTO `cuidador` (`id`, `activo`, `apellido`, `disponible`, `descripcion`, `email`, `fecha_creacion`, `horario_trabajo`, `nombre`, `zona_trabajo`) 
VALUES (NULL, false, 'Gutierrez', true, 'Amante de los perros', 'lomas@2lomas', NULL, 'Maniana', 'Paco', 'Zona Pza Rocha');
INSERT INTO `cuidador` (`id`, `activo`, `apellido`, `disponible`, `descripcion`, `email`, `fecha_creacion`, `horario_trabajo`, `nombre`, `zona_trabajo`) 
VALUES (NULL, false, 'Torres', false, 'Puntual', 'lomas@lomas1', NULL, 'Tarde', 'Ayelen', 'Centro');



-- TABLA TURNOS
INSERT INTO `turno` (`borrado`, `estado_solicitud`,eleccion_motivo, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CONFIRMADO','VACUNACION', '2023-07-12 00:00:00', '2023-05-22 00:00:00', '2023-05-24 00:00:00', 'MAÑANA', 'Revisar el estado de mi mascota', '1', '1');
INSERT INTO `turno` (`borrado`, `estado_solicitud`,eleccion_motivo, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'PENDIENTE','ATENCIONCLINICA', NULL, '2023-05-22 00:00:00', '2023-07-13 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '1', '1');
INSERT INTO `turno` (`borrado`, `estado_solicitud`,eleccion_motivo, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'PENDIENTE','ATENCIONCLINICA', NULL, '2023-05-22 00:00:00', '2023-06-17 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '2', '1');
INSERT INTO `turno` (`borrado`, `estado_solicitud`,eleccion_motivo, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CONFIRMADO','CASTRACION', '2023-07-10 00:00:00', '2023-05-22 00:00:00', '2023-05-27 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '4', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`,eleccion_motivo, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'PENDIENTE','DESPARACITACION', NULL, '2023-05-22 00:00:00', '2023-07-15 00:00:00', 'MAÑANA', 'Revisar el estado de mi mascota', '3', '2');

INSERT INTO `turno` (`borrado`, `estado_solicitud`,eleccion_motivo, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'PENDIENTE','VACUNACION', NULL, '2023-05-22 00:00:00', '2023-07-15 00:00:00', 'MAÑANA', 'Revisar el estado de mi mascota', '4', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`,eleccion_motivo, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CONFIRMADO','ATENCIONCLINICA', '2023-07-10 00:00:00', '2023-05-22 00:00:00', '2023-06-03 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '1', '1');
INSERT INTO `turno` (`borrado`, `estado_solicitud`,eleccion_motivo, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CONFIRMADO','VACUNACION', '2023-07-10 00:00:00', '2023-05-22 00:00:00', '2023-06-04 00:00:00', 'MAÑANA', 'Revisar el estado de mi mascota', '3', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`,eleccion_motivo, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CONFIRMADO','DESPARACITACION', '2023-07-11 00:00:00', '2023-05-22 00:00:00', '2023-06-05 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '1', '1');
INSERT INTO `turno` (`borrado`, `estado_solicitud`,eleccion_motivo, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CONFIRMADO','DESPARACITACION', '2023-07-10 00:00:00', '2023-05-22 00:00:00', '2023-06-05 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '2', '1');

INSERT INTO `turno` (`borrado`, `estado_solicitud`,eleccion_motivo, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CANCELADO','VACUNACION', NULL, '2023-05-22 00:00:00', '2023-06-18 00:00:00', 'MAÑANA', 'Revisar el estado de mi mascota', '4', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`,eleccion_motivo, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CANCELADO','DESPARACITACION', NULL, '2023-05-22 00:00:00', '2023-06-22 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '4', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`,eleccion_motivo, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'CANCELADO','ATENCIONCLINICA', NULL, '2023-05-22 00:00:00', '2023-06-18 00:00:00', 'MAÑANA', 'Revisar el estado de mi mascota', '4', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`,eleccion_motivo, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'ATENDIDO','DESPARACITACION', '2023-05-22 00:00:00', '2023-05-22 00:00:00', '2023-06-22 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '4', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`,eleccion_motivo, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'ATENDIDO','DESPARACITACION', '2023-05-12 00:00:00', '2023-05-22 00:00:00', '2023-06-18 00:00:00', 'MAÑANA', 'Revisar el estado de mi mascota', '4', '2');
INSERT INTO `turno` (`borrado`, `estado_solicitud`,eleccion_motivo, `fecha_asignada`, `fecha_creado`, `fecha_solicitada`, `horario_tentativo`, `motivo`, `mascota_id`, `usuario_id`) 
VALUES (b'00000', 'ATENDIDO','ATENCIONCLINICA', '2023-06-02 00:00:00', '2023-05-22 00:00:00', '2023-06-22 00:00:00', 'TARDE', 'Revisar el estado de mi mascota', '4', '2');


--Vacunas
INSERT INTO `vacuna` (`borrado`, `descripcion`, `dosis`, `fecha_creacion`, `tipo`) VALUES (b'00000', 'amoxilina', '4 dosis', '2023-07-07 00:00:34', 'tipoB');
INSERT INTO `vacuna` (`borrado`, `descripcion`, `dosis`, `fecha_creacion`, `tipo`) VALUES (b'00000', 'analgesico', '1 dosis', '2023-07-04 00:00:34', 'tipoB');
INSERT INTO `vacuna` (`borrado`, `descripcion`, `dosis`, `fecha_creacion`, `tipo`) VALUES (b'00000', 'analgesico', '2 dosis', '2023-07-05 00:00:34', 'tipoB');
INSERT INTO `vacuna` (`borrado`, `descripcion`, `dosis`, `fecha_creacion`, `tipo`) VALUES (b'00000', 'sedante', '1 dosis', '2023-07-06 00:00:34', 'Ninguna');

INSERT INTO `vacuna` (`borrado`,`fecha_creacion`,`dosis`, `tipo`) VALUES (b'00000','2023-07-08 00:00:34','2dosis', 'Ninguna');
INSERT INTO `vacuna` (`borrado`,`fecha_creacion`,`dosis`, `tipo`) VALUES (b'00000','2023-07-04 00:00:34', '12 dosis','tipoA');
INSERT INTO `vacuna` (`borrado`,`fecha_creacion`, `tipo`) VALUES (b'00000','2023-07-05 00:00:34', 'tipoA');
INSERT INTO `vacuna` (`borrado`,`fecha_creacion`, `tipo`) VALUES (b'00000','2023-07-02 00:00:34', 'tipoA');


--HistorialClinico
INSERT INTO `historiaclinica` (`borrado`, `fecha_creacion`, `monto`, `motivo`, `observacion`, `peso`, `mascota_id`, `vacuna_id`) 
VALUES (b'00000', '2023-07-06 00:00:00', '5000', 'CASTRACION', 'llevo al cachorro para realizarle la castracion', '10.5', 1, 5);
INSERT INTO `historiaclinica` (`borrado`, `fecha_creacion`, `monto`, `motivo`, `observacion`, `peso`, `mascota_id`, `vacuna_id`) 
VALUES (b'00000', '2023-07-06 00:00:00', '3000', 'VACUNACION', 'llevo al cachorro para realizarle una vacunacion', '5.5', 2, 3);
INSERT INTO `historiaclinica` (`borrado`, `fecha_creacion`, `monto`, `motivo`, `observacion`, `peso`, `mascota_id`, `vacuna_id`)
VALUES (b'00000', '2023-07-06 00:00:00', '6000', 'DESPARACITACION', 'llevo al cachorro para realizarle una desparacitacion', '8.5', 2, 6);

INSERT INTO `historiaclinica` (`borrado`, `fecha_creacion`, `monto`, `motivo`, `observacion`, `peso`, `mascota_id`, `vacuna_id`) VALUES (b'00000', '2023-07-06 00:00:00', '5600', 'ATENCIONCLINICA', 'llevo al cachorro para realizar una revision', '9', 2, 2);
INSERT INTO `historiaclinica` (`borrado`, `fecha_creacion`, `monto`, `motivo`, `observacion`, `peso`, `mascota_id`, `vacuna_id`) VALUES (b'00000', '2023-07-06 00:00:00', '4000', 'VACUNACION', 'llevo al cachorro para realizar vacunacion ', '11.5', 1, 1);
INSERT INTO `historiaclinica` (`borrado`, `fecha_creacion`, `monto`, `motivo`, `observacion`, `peso`, `mascota_id`, `vacuna_id`) VALUES (b'00000', '2023-07-06 00:00:00', '4800', 'CASTRACION', 'llevo al cachorro para realizarle una castracion', '9', 2, 7);
INSERT INTO `historiaclinica` (`borrado`, `fecha_creacion`, `monto`, `motivo`, `observacion`, `peso`, `mascota_id`, `vacuna_id`) VALUES (b'00000', '2023-07-06 00:00:00', '7000', 'DESPARACITACION', 'llevo al cachorro para realizarle una desparacitacion', '12.5', 1, 4);
INSERT INTO `historiaclinica` (`borrado`, `fecha_creacion`, `monto`, `motivo`, `observacion`, `peso`, `mascota_id`, `vacuna_id`) VALUES (b'00000', '2023-07-06 00:00:00', '8500', 'ATENCIONCLINICA', 'llevo al cachorro para una revision Clinica', '8.5', 2, 8);