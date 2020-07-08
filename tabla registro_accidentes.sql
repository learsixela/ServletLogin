-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-07-2020 a las 05:27:20
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `servlet`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro_accidentes`
--

CREATE TABLE `registro_accidentes` (
  `id` int(11) NOT NULL,
  `nEmpresa` varchar(100) NOT NULL,
  `razonEmpresa` varchar(100) NOT NULL,
  `rutEmpresa` varchar(50) NOT NULL,
  `fechaAccidente` varchar(59) NOT NULL,
  `nivelAccidente` varchar(50) NOT NULL,
  `nombreAccidentado` varchar(50) NOT NULL,
  `apellidoPAC` varchar(50) NOT NULL,
  `apellidoMAC` varchar(50) NOT NULL,
  `obs` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `registro_accidentes`
--

INSERT INTO `registro_accidentes` (`id`, `nEmpresa`, `razonEmpresa`, `rutEmpresa`, `fechaAccidente`, `nivelAccidente`, `nombreAccidentado`, `apellidoPAC`, `apellidoMAC`, `obs`) VALUES
(1, 'formulario', 'formulario', 'accidente', '0000-00-00', '0', 'eduardo', 'accidenta', 'mala cuea', 'se murio por manko'),
(2, 'free mobile', 'free mobile', '76180623-8', '0000-00-00', '0', 'eduardo', 'accidenta', 'mala cuea', 'se murio por manko'),
(3, 'bebida negra', 'bebida negra', '31.213231.5', '0000-00-00', '0', 'el oso de cocacola', 'polar', 'de la casa', 'se murio por el calentaimiento global :('),
(4, 'coca cola', 'bebida negra', '31.213231.5', '0000-00-00', '0', 'el oso de cocacola', 'polar', 'de la casa', 'se murio por el calentaimiento global :('),
(5, 'coca cola', 'bebida negra', '31.213231.5', '0000-00-00', 'null', 'el oso de cocacola', 'polar', 'de la casa', 'se murio por el calentaimiento global :('),
(6, 'coca cola', 'bebida negra', '31.213231.5', 'null', 'null', 'el oso de cocacola', 'polar', 'de la casa', 'se murio por el calentaimiento global :('),
(7, 'coca cola', 'bebida negra', '31.213231.5', 'null', 'null', 'el oso de cocacola', 'polar', 'de la casa', 'se murio por el calentaimiento global :('),
(8, 'coca cola', 'bebida negra', '31.213231.5', 'null', 'null', 'el oso de cocacola', 'polar', 'de la casa', 'se murio por el calentaimiento global :('),
(9, 'dsadqwerwdas', 'wadsdas', 'asdqwdasdas', 'null', 'pdoasodkaspodkqwopkdp', 'preufasdas', 'asdasdas', 'qweqwdas', 'asdasdasdas'),
(10, 'Open Buy Hogar', 'Comercial y Servicios Free Mobile', '76.180.623-8', 'null', 'Grave', 'Eduardo', 'Mankeke', 'Pankeke', 'Se Accidento el dedo meñique programando, pd trabajador muy manko'),
(11, 'Open Buy Hogar', 'Comercial y Servicios Free Mobile', '76.180.623-8', 'null', 'Grave', 'Eduardo', 'Mankeke', 'Pankeke', 'Se Accidento el dedo meñique programando, pd trabajador muy manko'),
(12, 'Open Buy Hogar', 'Comercial y Servicios Free Mobile', '76.180.623-8', 'null', 'Grave', 'Eduardo', 'Mankeke', 'Pankeke', 'Se Accidento el dedo meñique programando, pd trabajador muy manko'),
(13, 'Open Buy Hogar', 'Comercial y Servicios Free Mobile', '76.180.623-8', 'null', 'Grave', 'Eduardo', 'Mankeke', 'Pankeke', 'Se Accidento el dedo meñique programando, pd trabajador muy manko'),
(14, 'Open Buy', 'Comercial y Servicios Free Mobile', '76.180.623-8', 'null', 'grave', 'Eduardo', 'Mankeke', 'Pankeke', 'Se lesiono el dedo meñique programando, trabajador muy manco'),
(15, 'pepito', '123123', 'asdasd', 'null', 'asdas', 'asdas', 'asdas', 'sdas', 'qeqweqweqwdsada'),
(16, 'Open Buy', 'Comercial y Servicios Free Mobile', '76.180.623-8', '21 de agosto', 'grave', 'Eduardo', 'Mankeke', 'Pankeke', 'Se lesiono el dedo meñique programando, trabajador muy manco'),
(17, 'qweqw', 'qeweqw', '21312', '2020-07-16', 'qwe', 'asasdas', 'qweqwd', 'asddsasdadas', 'dasdas'),
(18, 'dsadsa', 'asdas', 'asdas', '2020-07-25', 'dasdasd1231', 'el oso de cocacola', 'Mankeke', 'Pankeke', 'dasdqwrdasdasdas');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `registro_accidentes`
--
ALTER TABLE `registro_accidentes`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `registro_accidentes`
--
ALTER TABLE `registro_accidentes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
