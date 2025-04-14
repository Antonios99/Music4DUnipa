-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:4306
-- Creato il: Apr 14, 2025 alle 10:38
-- Versione del server: 10.4.32-MariaDB
-- Versione PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `emozioni_db`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `voti`
--

CREATE TABLE `voti` (
  `id` int(11) NOT NULL,
  `utente_id` varchar(255) NOT NULL,
  `genere` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  `tipo_strumento` varchar(255) NOT NULL,
  `energia` int(255) NOT NULL,
  `piacevolezza` int(255) NOT NULL,
  `data_voto` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `voti`
--

INSERT INTO `voti` (`id`, `utente_id`, `genere`, `age`, `tipo_strumento`, `energia`, `piacevolezza`, `data_voto`) VALUES
(146, '2023-05-11', 'femmina', 0, 'contrabbasso', -3, 3, '2025-04-09 17:47:18'),
(147, '2025-04-09', 'altro', 0, 'vibrafono', -3, 3, '2025-04-09 17:47:49'),
(148, '2001-10-05', 'femmina', 0, 'flauto', -1, 1, '2025-04-09 17:51:07'),
(149, '2001-10-05', 'femmina', 0, 'flauto', -1, 1, '2025-04-09 17:51:07'),
(150, '2001-10-05', 'femmina', 0, 'flauto', -1, 1, '2025-04-09 17:51:07'),
(151, '1925-04-10', 'maschio', 0, 'clarinetto', 1, 5, '2025-04-10 08:26:50'),
(152, '2025-02-26', 'femmina', 0, 'sassofono', -2, 3, '2025-04-10 08:41:12'),
(153, '7000-06-06', 'femmina', 0, 'viola', 5, -5, '2025-04-10 09:14:09'),
(154, '22', 'femmina', 13, 'fagotto', 4, -4, '2025-04-10 14:36:19'),
(155, '888', 'femmina', 127, 'fagotto', 4, -4, '2025-04-10 14:37:03'),
(156, '16', 'maschio', 23, 'arpa', 0, 0, '2025-04-10 14:40:14'),
(157, '44', 'femmina', 33, 'contrabbasso', -2, 1, '2025-04-10 18:56:58'),
(158, '44', 'femmina', 33, 'contrabbasso', -2, 1, '2025-04-10 18:57:31'),
(159, '5', 'femmina', 23, 'violino', 4, 2, '2025-04-10 19:02:08'),
(160, '36', 'maschio', 373, 'violoncello', -5, -5, '2025-04-10 19:03:05'),
(161, '446', 'femmina', 338, 'contrabbasso', -2, 1, '2025-04-10 19:04:50'),
(162, '456', 'maschio', 56786, 'violoncello', 0, 0, '2025-04-10 19:05:02'),
(163, '111', 'maschio', 11, 'violino', 0, 0, '2025-04-10 19:16:04');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `voti`
--
ALTER TABLE `voti`
  ADD PRIMARY KEY (`id`),
  ADD KEY `utente_id` (`utente_id`) USING BTREE;

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `voti`
--
ALTER TABLE `voti`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=164;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
