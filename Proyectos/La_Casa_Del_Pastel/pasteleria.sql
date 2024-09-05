-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-12-2023 a las 22:19:27
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pasteleria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(30) NOT NULL,
  `nombre` text NOT NULL,
  `apellido` text NOT NULL,
  `telefono` text NOT NULL,
  `direccion` text NOT NULL,
  `correo` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nombre`, `apellido`, `telefono`, `direccion`, `correo`) VALUES
(23908987, 'Maria', 'Omaña', '04141112345', 'Las Lomas', 'Miripriv@gmail.com'),
(26803874, 'Carlos', 'Cantero', '04141401685', 'San Diego', 'cmc98@gmail.com'),
(28412111, 'Laura', 'Alvarez', '04122235456', 'Valencia', 'laurita@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `id_materia` int(11) NOT NULL,
  `nombreing` text NOT NULL,
  `unidad` text NOT NULL,
  `cantidad` text NOT NULL,
  `preciototal` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`id_materia`, `nombreing`, `unidad`, `cantidad`, `preciototal`) VALUES
(1, 'Azucar', 'Paquete', '30', '30'),
(2, 'Harina', 'Paquete', '20', '24'),
(3, 'Crema de Leche', 'Lata', '20', '35');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `id_pedido` int(11) NOT NULL,
  `id_clientee` text NOT NULL,
  `direccionn` text NOT NULL,
  `base` text NOT NULL,
  `fecha` text NOT NULL,
  `totalpedido` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`id_pedido`, `id_clientee`, `direccionn`, `base`, `fecha`, `totalpedido`) VALUES
(1, '28412111', 'Valencia', '10', '30/10/23', '11.6'),
(2, '28412111', 'Valencia', '22', '11/11/23', '25.3'),
(3, '26803874', 'San Diego', '10', '18/11/23', '11.6');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(25) NOT NULL,
  `nombreproducto` text NOT NULL,
  `categoria` text NOT NULL,
  `peso` text NOT NULL,
  `precio` text NOT NULL,
  `existencia` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_producto`, `nombreproducto`, `categoria`, `peso`, `precio`, `existencia`) VALUES
(1, 'Tres Leches', 'Pastel', '2', '10', '3'),
(2, 'Borwnie', 'Pastel', '0.15', '1.5', '10'),
(3, 'Oreo', 'Galletas', '0.25', '2.2', '120');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`id_materia`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
