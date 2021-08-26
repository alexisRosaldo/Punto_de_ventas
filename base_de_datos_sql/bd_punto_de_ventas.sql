-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-01-2021 a las 19:09:25
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_punto_de_ventas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturadetallada`
--

CREATE TABLE `facturadetallada` (
  `ID` int(11) NOT NULL,
  `fecha` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `IDUsuario` int(11) NOT NULL,
  `listaProductos` text COLLATE utf8_unicode_ci NOT NULL,
  `monto` double NOT NULL,
  `nombreComprador` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `descripccion` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `facturadetallada`
--

INSERT INTO `facturadetallada` (`ID`, `fecha`, `IDUsuario`, `listaProductos`, `monto`, `nombreComprador`, `descripccion`) VALUES
(5, '20/01/2021', 1, 'asdasdadads', 500, 'Jose', 'Una factura para muestra'),
(1111555, '22/01/2021', 1, '1,Galleta donde,', 20, 'Nombre del comprador', 'sdasdadasd'),
(8787, '23/01/2021', 1, '1,Galleta donde,', 100, 'Nombre del comprador', 'Descripccion'),
(665544, '23/01/2021', 1, '1,Galleta donde,', 20, 'Nombre del comprador', 'Una factura de prueba'),
(7890, '27/01/2021', 1, '1,Doritos,10,Frijol,', 90, 'Maria Marquez', 'Factura de compras para el hogar'),
(6709, '28/01/2021', 1, '1,Doritos,10,Frijol,', 30, 'asdadada', 'asdasdadada'),
(102030, '28/01/2021', 1, '1,Doritos,12,Chocolate,', 20, 'yyyyy', 'yyyyyyyy'),
(1239900, '28/01/2021', 1, 'ID: 1, Nom: Doritos, Prec: 10.0, Cant: 2.0ID: 2, Nom: CocaCola, Prec: 30.0, Cant: 10.0', 40, 'Jose Juan Canul', 'Factura de snacks'),
(667890, '28/01/2021', 1, 'ID: 1, Nom: Doritos, Prec: 10.0, Cant: 5.0ID: 2, Nom: CocaCola, Prec: 30.0, Cant: 9.0', 40, 'Marco Vazquez', 'Una factura detallada'),
(78901122, '28/01/2021', 1, 'ID: 1, Nom: Doritos, Prec: 10.0, Cant: 4.0ID: 2, Nom: CocaCola, Prec: 30.0, Cant: 8.0', 70, 'Jose Jose', 'asdasdadadsadadadsadasd'),
(46587354, '28/01/2021', 1, 'ID: 1, Nom: Doritos, Prec: 10.0, Cant: 3.0ID: 2, Nom: CocaCola, Prec: 30.0, Cant: 6.0', 40, 'sfdsdfsfdsf', 'dfsfdsfsfsfsfdsfsfsf'),
(55667711, '28/01/2021', 1, 'ID: 1, Nom: Doritos, Prec: 10.0, Cant: 2.0', 10, 'Karl Tam', 'asdasdadadasdasdasdasd'),
(456289, '28/01/2021', 1, 'ID: 1, Nom: Doritos, Prec: 10.0, Cant: 5.0ID: 2, Nom: CocaCola, Prec: 30.0, Cant: 5.0', 50, 'Carlos R', 'asdasdadadasdvcbvdfgdg'),
(8900, '28/01/2021', 1, 'ID: 1, Nom: Doritos, Prec: 10.0, Cant: 3.0ID: 2, Nom: CocaCola, Prec: 30.0, Cant: 4.0', 40, 'Marco Sans', 'acxzczcxzczcxzcxzcxzcx'),
(123564756, '28/01/2021', 1, 'ID: 1, Nom: Doritos, Prec: 10.0, Cant: 2.0', 10, 'sdasdadad', 'asdasdadsadadsa'),
(9999999, '28/01/2021', 1, 'ID: 1, Nom: Doritos, Prec: 10.0, Cant: 1.0ID: 2, Nom: CocaCola, Prec: 30.0, Cant: 3.0', 40, 'Jose Carlos Suarez', 'Una factura detallada');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

CREATE TABLE `facturas` (
  `ID` int(11) NOT NULL,
  `fecha` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `IDUsuario` int(50) NOT NULL,
  `listaProductos` text COLLATE utf8_unicode_ci NOT NULL,
  `monto` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `facturas`
--

INSERT INTO `facturas` (`ID`, `fecha`, `IDUsuario`, `listaProductos`, `monto`) VALUES
(23, '31/12/2020', 23, '1,galletas donde,', 40),
(77, '02/01/2021', 0, '1,galletas donde,', 60),
(89, '30/12/2020', 34, '1,galletas,6,sabrita,', 540),
(99, '31/12/2020', 1, '1,galletas donde,6,sabrita,', 90),
(789, '03/01/2021', 1, '1,Galleta donde,6,sabrita,', 70),
(1111, '31/12/2020', 1, '1,galletas donde,', 160),
(5457, '30/12/2020', 5, '5,chetos,1,galletas,', 40),
(9870, '03/01/2021', 0, '7,Pepsi,', 330),
(67890, '22/01/2021', 1, '1,Galleta donde,', 20),
(77777, '08/01/2021', 1, '1,Galleta donde,6,sabrita,', 350),
(123456, '14/01/2021', 1, '4,cocacola,', 150),
(778899, '09/01/2021', 1, '1,Galleta donde,6,sabrita,', 70),
(889900, '17/01/2021', 1, '1,Galleta donde,', 20),
(999000, '09/01/2021', 1, '1,Galleta donde,', 60),
(11111111, '09/01/2021', 1, '1,Galleta donde,', 20),
(11223344, '22/01/2021', 1, '1,Galleta donde,', 20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `ID` int(50) NOT NULL,
  `NombreProducto` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Precio` double NOT NULL,
  `Cantidad` int(50) NOT NULL,
  `TipoContenido` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`ID`, `NombreProducto`, `Precio`, `Cantidad`, `TipoContenido`) VALUES
(1, 'Doritos nachos', 11, 5, '67 g'),
(2, 'CocaCola', 30, 2, '3 L'),
(3, 'Cervilletas', 14, 5, '50 Pza/s'),
(4, 'Jugo de naranja', 10, 7, '300 ml'),
(10, 'Frijol', 20, 5, '200.0 g'),
(11, 'Pasta Colgate', 20, 10, '49.0 g');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarioadministrador`
--

CREATE TABLE `usuarioadministrador` (
  `ID` int(11) NOT NULL,
  `usuario` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `contrasenia` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `usuarioadministrador`
--

INSERT INTO `usuarioadministrador` (`ID`, `usuario`, `contrasenia`) VALUES
(1, 'Alexis', '1234');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `ID` int(11) NOT NULL,
  `usuario` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `contrasenia` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ID`, `usuario`, `contrasenia`) VALUES
(1, 'Alexis', '1'),
(2, 'Jose', '2222'),
(3, 'Carlos', '3333');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `usuarioadministrador`
--
ALTER TABLE `usuarioadministrador`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `ID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
