-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 13, 2015 at 12:30 
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `diagnosis`
--

-- --------------------------------------------------------

--
-- Table structure for table `symptoms_sub_sub`
--

CREATE TABLE IF NOT EXISTS `symptoms_sub_sub` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sub_id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `description` text NOT NULL,
  `stage` tinyint(4) NOT NULL DEFAULT '0',
  `status` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `symptoms_sub_sub`
--

INSERT INTO `symptoms_sub_sub` (`id`, `sub_id`, `name`, `description`, `stage`, `status`) VALUES
(1, 1, 'right upper', '', 0, 0),
(2, 1, 'lower upper', '', 0, 0),
(3, 1, 'right lower', '', 0, 0),
(4, 1, 'left lower', '', 0, 0),
(5, 2, 'sudden', '', 0, 0),
(6, 2, 'gradually', '', 0, 0),
(7, 3, 'choice1', '', 0, 0),
(8, 1, 'choice2', '', 0, 0),
(9, 3, 'choice2', '', 0, 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
