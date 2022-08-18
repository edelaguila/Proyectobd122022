-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-05-2022 a las 07:04:45
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdproyectop312022`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_aplicacion`
--

CREATE TABLE `tbl_aplicacion` (
  `aplid` int(11) NOT NULL,
  `aplnombre` varchar(50) DEFAULT NULL,
  `aplestatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_aplicacionperfil`
--

CREATE TABLE `tbl_aplicacionperfil` (
  `aplid` int(11) NOT NULL,
  `perid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_aplicacionusuario`
--

CREATE TABLE `tbl_aplicacionusuario` (
  `aplid` int(11) NOT NULL,
  `usuid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_bitacora`
--

CREATE TABLE `tbl_bitacora` (
  `id_bitacora` int(40) NOT NULL,
  `fecha` varchar(40) DEFAULT NULL,
  `area` varchar(40) DEFAULT NULL,
  `accion` varchar(40) DEFAULT NULL,
  `id_usuario` int(40) DEFAULT NULL,
  `id_aplicacion` int(40) DEFAULT NULL,
  `ip` varchar(40) DEFAULT NULL,
  `nombrepc` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_bitacora`
--

INSERT INTO `tbl_bitacora` (`id_bitacora`, `fecha`, `area`, `accion`, `id_usuario`, `id_aplicacion`, `ip`, `nombrepc`) VALUES
(150, '2022-05-26', 'Area Ventas', 'Ventas', 2, 3, '192.168.56.1', 'Pablo'),
(151, '2022-05-26', 'Area Ventas', 'Compras', 2, 3, '192.168.56.1', 'Pablo'),
(152, '2022-05-26', 'Area Ventas', 'Ventas', 2, 3, '192.168.56.1', 'Pablo'),
(153, '2022-05-26', 'Area Ventas', 'Compras', 2, 3, '192.168.56.1', 'Pablo'),
(154, '2022-05-26', 'Area Ventas', 'Compras', 2, 3, '192.168.56.1', 'Pablo'),
(155, '2022-05-26', 'Area Ventas', 'Compras', 2, 3, '192.168.56.1', 'Pablo'),
(156, '2022-05-26', 'Area Ventas', 'Compras', 2, 3, '192.168.56.1', 'Pablo'),
(157, '2022-05-26', 'Area Ventas', 'Compras', 2, 3, '192.168.56.1', 'Pablo'),
(158, '2022-05-26', 'Area Ventas', 'Compras', 2, 3, '192.168.56.1', 'Pablo'),
(159, '2022-05-26', 'Area Ventas', 'Compras', 2, 3, '192.168.56.1', 'Pablo'),
(160, '2022-05-26', 'Area Ventas', 'Compras', 2, 3, '192.168.56.1', 'Pablo'),
(161, '2022-05-26', 'Area Ventas', 'Compras', 2, 3, '192.168.56.1', 'Pablo'),
(162, '2022-05-26', 'Area Ventas', 'Compras', 2, 3, '192.168.56.1', 'Pablo'),
(163, '2022-05-26', 'Area Ventas', 'Compras', 2, 3, '192.168.56.1', 'Pablo'),
(164, '2022-05-27', 'Area Ventas', 'Ventas', 2, 3, '192.168.56.1', 'Pablo'),
(165, '2022-05-27', 'Area Ventas', 'Compras', 2, 3, '192.168.56.1', 'Pablo'),
(166, '2022-05-27', 'Area Ventas', 'Compras', 2, 3, '192.168.56.1', 'Pablo'),
(167, '2022-05-27', 'Area Ventas', 'Compras', 2, 3, '192.168.56.1', 'Pablo'),
(168, '2022-05-27', 'Area Ventas', 'Ventas', 2, 3, '192.168.56.1', 'Pablo'),
(169, '2022-05-27', 'Area Ventas', 'Ventas', 2, 3, '192.168.56.1', 'Pablo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_clientes`
--

CREATE TABLE `tbl_clientes` (
  `Id_cliente` int(11) NOT NULL,
  `Nombre` varchar(60) NOT NULL,
  `Direccion` varchar(60) NOT NULL,
  `Telefono` int(11) NOT NULL,
  `Correo` varchar(60) NOT NULL,
  `Estado` varchar(60) NOT NULL,
  `Tipo` varchar(60) NOT NULL,
  `Id_vendedor` int(11) NOT NULL,
  `Id_cobrador` int(11) NOT NULL,
  `Id_documento` int(11) NOT NULL,
  `Orden` varchar(100) DEFAULT NULL,
  `Credito` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_clientes`
--

INSERT INTO `tbl_clientes` (`Id_cliente`, `Nombre`, `Direccion`, `Telefono`, `Correo`, `Estado`, `Tipo`, `Id_vendedor`, `Id_cobrador`, `Id_documento`, `Orden`, `Credito`) VALUES
(1, 'pablo', 'zona 3', 45678912, 'pol@gmail.com', 'zona 3', 'minorista', 4, 2, 9, 'camisas para el tiempo', 805),
(2, 'vito', 'zona 15', 12345678, 'vitovas99@gmail.com', 'activo', 'minorista', 3, 2, 1, 'camisas', 256605),
(3, 'Juan', 'zona 1', 45678912, 'juanmisecundario7@gmail.com', 'activo', 'mayorista', 3, 2, 1, 'patineta', 800),
(4, 'Gabriel Omar', 'zona 18', 78945612, 'omar02cifuentes@gmail.com', 'inactivo', 'mayorista', 1, 1, 1, 'ropa', 1075),
(5, 'omar', 'zona 23', 45678912, 'omar@gmail.com', 'zona 23', 'mayorista', 2, 2, 1, '23', 570);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_cobradores`
--

CREATE TABLE `tbl_cobradores` (
  `Id_cobrador` int(11) NOT NULL,
  `Nombre` varchar(60) NOT NULL,
  `Direccion` varchar(60) NOT NULL,
  `Telefono` int(11) NOT NULL,
  `Correo` varchar(60) NOT NULL,
  `Estado` varchar(60) NOT NULL,
  `Tipo` varchar(60) NOT NULL,
  `Id_cliente` int(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_cobradores`
--

INSERT INTO `tbl_cobradores` (`Id_cobrador`, `Nombre`, `Direccion`, `Telefono`, `Correo`, `Estado`, `Tipo`, `Id_cliente`) VALUES
(1, 'Pablo', 'zona 6', 45612378, 'pablo@gmail.com', 'zona 6', 'mayorista', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_cotizaciones`
--

CREATE TABLE `tbl_cotizaciones` (
  `Id_cotizacion` int(40) NOT NULL,
  `tipo` varchar(40) DEFAULT NULL,
  `cantidad` int(40) DEFAULT NULL,
  `producto` varchar(40) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `total` float DEFAULT NULL,
  `fecha` varchar(40) DEFAULT NULL,
  `id_cliente` int(40) DEFAULT NULL,
  `id_vendedor` int(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_cotizaciones`
--

INSERT INTO `tbl_cotizaciones` (`Id_cotizacion`, `tipo`, `cantidad`, `producto`, `precio`, `total`, `fecha`, `id_cliente`, `id_vendedor`) VALUES
(1, 'minorista', 2, 'minorista', 20, 40, '2022-05-26', 3, 3),
(2, 'minorista', 5, 'minorista', 40, 200, '2022-05-26', 3, 3),
(3, 'minorista', 4, 'minorista', 20, 80, '2022-05-26', 2, 3),
(4, 'minorista', 2, 'minorista', 225, 450, '2022-05-26', 2, 3),
(5, 'minorista', 3, 'minorista', 20, 60, '2022-05-26', 2, 3),
(6, 'minorista', 1, 'minorista', 20, 20, '2022-05-26', 2, 3),
(7, 'minorista', 1, 'minorista', 20, 20, '2022-05-26', 2, 3),
(8, 'minorista', 1, 'minorista', 20, 20, '2022-05-26', 2, 3),
(9, 'minorista', 2, 'minorista', 40, 80, '2022-05-26', 2, 3),
(10, 'minorista', 1, 'minorista', 20, 20, '2022-05-27', 2, 3),
(11, 'minorista', 3, 'minorista', 40, 120, '2022-05-27', 2, 3),
(12, 'minorista', 1, 'minorista', 20, 20, '2022-05-27', 2, 3),
(13, 'minorista', 2, 'minorista', 40, 80, '2022-05-27', 2, 3),
(14, 'minorista', 1, 'minorista', 20, 20, '2022-05-27', 2, 3),
(15, 'minorista', 3, 'minorista', 40, 120, '2022-05-27', 2, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_modulo`
--

CREATE TABLE `tbl_modulo` (
  `modid` int(11) NOT NULL,
  `modnombre` varchar(60) NOT NULL,
  `modestatus` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_perfil`
--

CREATE TABLE `tbl_perfil` (
  `perid` int(11) NOT NULL,
  `pernombre` varchar(30) NOT NULL,
  `perestatus` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_perfilusuario`
--

CREATE TABLE `tbl_perfilusuario` (
  `perid` int(11) NOT NULL,
  `usuid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_productos`
--

CREATE TABLE `tbl_productos` (
  `Id_producto` int(40) NOT NULL,
  `producto` varchar(40) DEFAULT NULL,
  `precio_mayorista` double DEFAULT NULL,
  `precio_minorista` double DEFAULT NULL,
  `existencia` int(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_productos`
--

INSERT INTO `tbl_productos` (`Id_producto`, `producto`, `precio_mayorista`, `precio_minorista`, `existencia`) VALUES
(1, 'camisas', 15, 20, 71),
(2, 'pantalones', 30, 40, 70),
(3, 'zapatos', 150, 225, 13),
(4, 'piano', 15000, 21000, 276);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_tipo_de_documentos`
--

CREATE TABLE `tbl_tipo_de_documentos` (
  `Id_documento` int(11) NOT NULL,
  `Material` varchar(60) NOT NULL,
  `Tipo` varchar(60) NOT NULL,
  `Vista` varchar(60) NOT NULL,
  `Uso` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_usuario`
--

CREATE TABLE `tbl_usuario` (
  `usuid` int(11) NOT NULL,
  `usunombre` varchar(45) NOT NULL,
  `usucontrasena` varchar(25) NOT NULL,
  `usuultimasesion` date DEFAULT NULL,
  `usuestatus` varchar(1) NOT NULL,
  `usunombrereal` varchar(60) DEFAULT NULL,
  `usucorreoe` varchar(60) DEFAULT NULL,
  `usutelefono` varchar(25) DEFAULT NULL,
  `usudireccion` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_usuario`
--

INSERT INTO `tbl_usuario` (`usuid`, `usunombre`, `usucontrasena`, `usuultimasesion`, `usuestatus`, `usunombrereal`, `usucorreoe`, `usutelefono`, `usudireccion`) VALUES
(1, 'pablo01', 'quesoverde99', '0000-00-00', 'A', 'pablo daniel', 'pablo99@gmail.com', '48012293', 'avenda 12 manzana 3 lote 2 zona 4 de mixco'),
(2, 'pablo02', 'quesoverde99', '0000-00-00', 'A', 'pablo daniel', 'pablo99@gmail.com', '48012293', 'zona 14'),
(3, 'omar01', 'quesoverde99', '0000-00-00', 'A', 'omar', 'omar@gmail.com', '12345678', 'zona 18');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_vendedores`
--

CREATE TABLE `tbl_vendedores` (
  `Id_vendedor` int(11) NOT NULL,
  `Nombre` varchar(60) NOT NULL,
  `Direccion` varchar(60) NOT NULL,
  `Telefono` int(11) NOT NULL,
  `Correo` varchar(60) NOT NULL,
  `Estado` varchar(60) NOT NULL,
  `Tipo` varchar(60) NOT NULL,
  `Ventas` int(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_vendedores`
--

INSERT INTO `tbl_vendedores` (`Id_vendedor`, `Nombre`, `Direccion`, `Telefono`, `Correo`, `Estado`, `Tipo`, `Ventas`) VALUES
(1, 'pablo', 'zona 1', 48012293, 'vitovas@gmail.com', 'zona 1', 'mayorista', 21),
(2, 'juan', 'zona 18', 32165498, 'juanito@gmail.com', 'activo', 'minorista', 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_ventas`
--

CREATE TABLE `tbl_ventas` (
  `id_venta` int(40) NOT NULL,
  `tipo` varchar(40) DEFAULT NULL,
  `cantidad` int(40) DEFAULT NULL,
  `producto` varchar(40) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `total` float DEFAULT NULL,
  `fecha` varchar(40) DEFAULT NULL,
  `id_cliente` int(40) DEFAULT NULL,
  `id_vendedor` int(40) DEFAULT NULL,
  `tipo_de_pago` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_ventas`
--

INSERT INTO `tbl_ventas` (`id_venta`, `tipo`, `cantidad`, `producto`, `precio`, `total`, `fecha`, `id_cliente`, `id_vendedor`, `tipo_de_pago`) VALUES
(123, 'minorista', 2, 'camisas', 20, 40, '2022-05-26', 2, 3, 'Efectivo'),
(124, 'minorista', 3, 'pantalones', 40, 120, '2022-05-26', 2, 3, 'Efectivo'),
(125, 'minorista', 1, 'zapatos', 225, 225, '2022-05-26', 2, 3, 'Efectivo'),
(126, 'minorista', 2, 'camisas', 20, 40, '2022-05-26', 2, 3, 'Credito'),
(127, 'minorista', 3, 'pantalones', 40, 120, '2022-05-26', 2, 3, 'Credito'),
(128, 'minorista', 1, 'zapatos', 225, 225, '2022-05-26', 2, 3, 'Credito'),
(129, 'minorista', 1, 'camisas', 20, 20, '2022-05-26', 2, 3, 'Efectivo'),
(130, 'minorista', 3, 'pantalones', 40, 120, '2022-05-26', 2, 3, 'Efectivo'),
(131, 'minorista', 1, 'camisas', 20, 20, '2022-05-26', 2, 3, 'Efectivo'),
(132, 'minorista', 3, 'pantalones', 40, 120, '2022-05-26', 2, 3, 'Efectivo'),
(133, 'minorista', 5, 'zapatos', 225, 1125, '2022-05-26', 2, 3, 'Efectivo'),
(134, 'minorista', 3, 'pantalones', 40, 120, '2022-05-26', 2, 3, 'Efectivo'),
(135, 'minorista', 1, 'camisas', 20, 20, '2022-05-26', 2, 3, 'Efectivo'),
(136, 'minorista', 3, 'pantalones', 40, 120, '2022-05-26', 2, 3, 'Efectivo'),
(137, 'minorista', 5, 'zapatos', 225, 1125, '2022-05-26', 2, 3, 'Efectivo'),
(138, 'minorista', 3, 'pantalones', 40, 120, '2022-05-26', 2, 3, 'Efectivo'),
(139, 'minorista', 2, 'camisas', 20, 40, '2022-05-26', 2, 3, 'Credito'),
(140, 'minorista', 1, 'pantalones', 40, 40, '2022-05-26', 2, 3, 'Credito'),
(141, 'minorista', 3, 'zapatos', 225, 675, '2022-05-26', 2, 3, 'Credito'),
(142, 'minorista', 5, 'piano', 21000, 105000, '2022-05-26', 2, 3, 'Credito'),
(143, 'minorista', 5, 'pantalones', 40, 200, '2022-05-26', 2, 3, 'Credito'),
(144, 'minorista', 5, 'camisas', 20, 100, '2022-05-26', 2, 3, 'Credito'),
(145, 'minorista', 2, 'zapatos', 225, 450, '2022-05-26', 2, 3, 'Credito'),
(146, 'minorista', 1, 'piano', 21000, 21000, '2022-05-26', 2, 3, 'Credito'),
(147, 'minorista', 5, 'pantalones', 40, 200, '2022-05-26', 2, 3, 'Credito'),
(148, 'minorista', 5, 'camisas', 20, 100, '2022-05-26', 2, 3, 'Credito'),
(149, 'minorista', 2, 'zapatos', 225, 450, '2022-05-26', 2, 3, 'Credito'),
(150, 'minorista', 5, 'piano', 21000, 105000, '2022-05-26', 2, 3, 'Credito'),
(151, 'minorista', 1, 'camisas', 20, 20, '2022-05-27', 2, 3, 'Credito'),
(152, 'minorista', 3, 'pantalones', 40, 120, '2022-05-27', 2, 3, 'Credito'),
(153, 'minorista', 1, 'camisas', 20, 20, '2022-05-27', 2, 3, 'Credito'),
(154, 'minorista', 2, 'pantalones', 40, 80, '2022-05-27', 2, 3, 'Credito'),
(155, 'minorista', 1, 'camisas', 20, 20, '2022-05-27', 2, 3, 'Credito'),
(156, 'minorista', 3, 'pantalones', 40, 120, '2022-05-27', 2, 3, 'Credito'),
(157, 'mayorista', 3, 'camisas', 15, 45, '2022-05-27', 5, 2, 'Credito'),
(158, 'mayorista', 1, 'pantalones', 30, 30, '2022-05-27', 5, 2, 'Credito'),
(159, 'mayorista', 3, 'camisas', 15, 45, '2022-05-27', 4, 1, 'Credito'),
(160, 'mayorista', 1, 'pantalones', 30, 30, '2022-05-27', 4, 1, 'Credito'),
(161, 'minorista', 1, 'camisas', 20, 20, '2022-05-27', 2, 3, 'Credito'),
(162, 'minorista', 3, 'pantalones', 40, 120, '2022-05-27', 2, 3, 'Credito');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_aplicacion`
--
ALTER TABLE `tbl_aplicacion`
  ADD PRIMARY KEY (`aplid`);

--
-- Indices de la tabla `tbl_aplicacionperfil`
--
ALTER TABLE `tbl_aplicacionperfil`
  ADD PRIMARY KEY (`aplid`,`perid`),
  ADD KEY `perid` (`perid`);

--
-- Indices de la tabla `tbl_aplicacionusuario`
--
ALTER TABLE `tbl_aplicacionusuario`
  ADD PRIMARY KEY (`aplid`,`usuid`),
  ADD KEY `usuid` (`usuid`);

--
-- Indices de la tabla `tbl_bitacora`
--
ALTER TABLE `tbl_bitacora`
  ADD PRIMARY KEY (`id_bitacora`);

--
-- Indices de la tabla `tbl_clientes`
--
ALTER TABLE `tbl_clientes`
  ADD PRIMARY KEY (`Id_cliente`);

--
-- Indices de la tabla `tbl_cobradores`
--
ALTER TABLE `tbl_cobradores`
  ADD PRIMARY KEY (`Id_cobrador`);

--
-- Indices de la tabla `tbl_cotizaciones`
--
ALTER TABLE `tbl_cotizaciones`
  ADD PRIMARY KEY (`Id_cotizacion`);

--
-- Indices de la tabla `tbl_modulo`
--
ALTER TABLE `tbl_modulo`
  ADD PRIMARY KEY (`modid`);

--
-- Indices de la tabla `tbl_perfil`
--
ALTER TABLE `tbl_perfil`
  ADD PRIMARY KEY (`perid`);

--
-- Indices de la tabla `tbl_perfilusuario`
--
ALTER TABLE `tbl_perfilusuario`
  ADD PRIMARY KEY (`perid`,`usuid`),
  ADD KEY `usuid` (`usuid`);

--
-- Indices de la tabla `tbl_productos`
--
ALTER TABLE `tbl_productos`
  ADD PRIMARY KEY (`Id_producto`);

--
-- Indices de la tabla `tbl_tipo_de_documentos`
--
ALTER TABLE `tbl_tipo_de_documentos`
  ADD PRIMARY KEY (`Id_documento`);

--
-- Indices de la tabla `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  ADD PRIMARY KEY (`usuid`);

--
-- Indices de la tabla `tbl_vendedores`
--
ALTER TABLE `tbl_vendedores`
  ADD PRIMARY KEY (`Id_vendedor`);

--
-- Indices de la tabla `tbl_ventas`
--
ALTER TABLE `tbl_ventas`
  ADD PRIMARY KEY (`id_venta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tbl_aplicacion`
--
ALTER TABLE `tbl_aplicacion`
  MODIFY `aplid` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbl_bitacora`
--
ALTER TABLE `tbl_bitacora`
  MODIFY `id_bitacora` int(40) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=170;

--
-- AUTO_INCREMENT de la tabla `tbl_clientes`
--
ALTER TABLE `tbl_clientes`
  MODIFY `Id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `tbl_cobradores`
--
ALTER TABLE `tbl_cobradores`
  MODIFY `Id_cobrador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `tbl_cotizaciones`
--
ALTER TABLE `tbl_cotizaciones`
  MODIFY `Id_cotizacion` int(40) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `tbl_modulo`
--
ALTER TABLE `tbl_modulo`
  MODIFY `modid` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbl_perfil`
--
ALTER TABLE `tbl_perfil`
  MODIFY `perid` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbl_productos`
--
ALTER TABLE `tbl_productos`
  MODIFY `Id_producto` int(40) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=102;

--
-- AUTO_INCREMENT de la tabla `tbl_tipo_de_documentos`
--
ALTER TABLE `tbl_tipo_de_documentos`
  MODIFY `Id_documento` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  MODIFY `usuid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `tbl_vendedores`
--
ALTER TABLE `tbl_vendedores`
  MODIFY `Id_vendedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tbl_ventas`
--
ALTER TABLE `tbl_ventas`
  MODIFY `id_venta` int(40) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=163;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tbl_aplicacionperfil`
--
ALTER TABLE `tbl_aplicacionperfil`
  ADD CONSTRAINT `tbl_aplicacionperfil_ibfk_1` FOREIGN KEY (`aplid`) REFERENCES `tbl_aplicacion` (`aplid`),
  ADD CONSTRAINT `tbl_aplicacionperfil_ibfk_2` FOREIGN KEY (`perid`) REFERENCES `tbl_perfil` (`perid`);

--
-- Filtros para la tabla `tbl_aplicacionusuario`
--
ALTER TABLE `tbl_aplicacionusuario`
  ADD CONSTRAINT `tbl_aplicacionusuario_ibfk_1` FOREIGN KEY (`aplid`) REFERENCES `tbl_aplicacion` (`aplid`),
  ADD CONSTRAINT `tbl_aplicacionusuario_ibfk_2` FOREIGN KEY (`usuid`) REFERENCES `tbl_usuario` (`usuid`);

--
-- Filtros para la tabla `tbl_perfilusuario`
--
ALTER TABLE `tbl_perfilusuario`
  ADD CONSTRAINT `tbl_perfilusuario_ibfk_1` FOREIGN KEY (`perid`) REFERENCES `tbl_perfil` (`perid`),
  ADD CONSTRAINT `tbl_perfilusuario_ibfk_2` FOREIGN KEY (`usuid`) REFERENCES `tbl_usuario` (`usuid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
