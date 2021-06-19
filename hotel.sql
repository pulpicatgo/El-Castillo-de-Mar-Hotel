-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-06-2021 a las 01:48:38
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huespedes`
--

CREATE TABLE `huespedes` (
  `nombre` varchar(45) NOT NULL,
  `tipohab` varchar(45) NOT NULL,
  `ciudadorigen` varchar(45) NOT NULL,
  `totalpersonas` int(2) NOT NULL,
  `totaldias` int(11) NOT NULL,
  `perExt` varchar(45) NOT NULL,
  `FInicial` varchar(45) NOT NULL,
  `FFinal` varchar(45) NOT NULL,
  `cargosExt` varchar(45) NOT NULL,
  `piso` int(5) NOT NULL,
  `hab` int(5) NOT NULL,
  `sencilla` int(2) NOT NULL,
  `doble` int(2) NOT NULL,
  `triple` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `huespedes`
--

INSERT INTO `huespedes` (`nombre`, `tipohab`, `ciudadorigen`, `totalpersonas`, `totaldias`, `perExt`, `FInicial`, `FFinal`, `cargosExt`, `piso`, `hab`, `sencilla`, `doble`, `triple`) VALUES
('Angel', 'Sencilla', 'Nayarit', 1, 11, '0', '2021/08/17', '28/08/2021', '440', 1, 6, 1, 0, 0),
('Daniel', 'Sencilla', 'CDMX', 1, 4, '0', '2021/06/22', '26/06/2021', '300', 1, 1, 1, 0, 0),
('Hank', 'Doble', 'Aguascalientes', 2, 7, '0', '2021/06/25', '02/07/2021', '110', 1, 10, 0, 1, 0),
('Ivan', 'Doble', 'Aguascalientes', 2, 7, '0', '2021/06/19', '26/06/2021', '480', 1, 11, 0, 1, 0),
('Ledesma', 'Doble', 'Guayabitos', 2, 20, '2', '2021/06/13', '03/07/2021', '110', 1, 7, 0, 1, 0),
('Miguel', 'Doble', 'CDMX', 2, 6, '0', '2021/08/17', '23/08/2021', '110', 1, 10, 0, 1, 0),
('Raul', 'Triple', 'Santa Fe', 3, 14, '2', '2021/07/31', '14/08/2021', '0', 1, 12, 0, 0, 1),
('Regina', 'Sencilla', 'Guadalajara', 1, 9, '0', '2021/06/30', '09/07/2021', '380', 1, 1, 1, 0, 0),
('Ricardo Ponce', 'Triple', 'Guanajuato', 3, 5, '1', '2021/06/11', '16/06/2021', '660', 1, 14, 0, 0, 1),
('Rodrigo', 'Sencilla', 'Baja California', 1, 7, '2', '2021/06/02', '09/06/2021', '120', 1, 2, 1, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `cuenta` varchar(10) NOT NULL,
  `password` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `login`
--

INSERT INTO `login` (`cuenta`, `password`) VALUES
('Angel', 'b59636e17f40f8637fd2744f18a15a89'),
('Ivan', '9450476b384b32d8ad8b758e76c98a69'),
('Miguel', 'f30a024d152f99ff4094b698255c361e');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `huespedes`
--
ALTER TABLE `huespedes`
  ADD PRIMARY KEY (`nombre`);

--
-- Indices de la tabla `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`cuenta`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
