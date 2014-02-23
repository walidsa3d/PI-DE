-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- GÃ©nÃ©rÃ© le: Dim 23 FÃ©vrier 2014 Ã  22:11
-- Version du serveur: 5.6.12-log
-- Version de PHP: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de donnÃ©es: `wedding`
--
CREATE DATABASE IF NOT EXISTS `wedding` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `wedding`;

-- --------------------------------------------------------

--
-- Structure de la table `administrateur`
--

CREATE TABLE IF NOT EXISTS `administrateur` (
  `Id_Admin` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(30) NOT NULL,
  `Prenom` varchar(30) NOT NULL,
  `Mail` varchar(50) NOT NULL,
  `Mot_De_Passe` varchar(50) NOT NULL,
  PRIMARY KEY (`Id_Admin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `Id_Client` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(20) NOT NULL,
  `Prenom` varchar(20) NOT NULL,
  `Mail` varchar(40) NOT NULL,
  `Adresse` varchar(40) NOT NULL,
  `Mot_De_Passe` varchar(40) NOT NULL,
  `Tel` int(11) NOT NULL,
  PRIMARY KEY (`Id_Client`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`Id_Client`, `Nom`, `Prenom`, `Mail`, `Adresse`, `Mot_De_Passe`, `Tel`) VALUES
(1, 'saif', 'sjil', 'sss', 'ss', 'ss', 123);

-- --------------------------------------------------------

--
-- Structure de la table `commentaire`
--

CREATE TABLE IF NOT EXISTS `commentaire` (
  `Id_Commentaire` int(11) NOT NULL AUTO_INCREMENT,
  `Id_Service` int(11) NOT NULL,
  `Contenu` varchar(50) NOT NULL,
  PRIMARY KEY (`Id_Commentaire`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `mesg_reponse`
--

CREATE TABLE IF NOT EXISTS `mesg_reponse` (
  `Id_Reponse` int(11) NOT NULL AUTO_INCREMENT,
  `Auteur` varchar(50) NOT NULL,
  `Message` varchar(50) NOT NULL,
  `Date_Reponse` datetime NOT NULL,
  `Correspondance_Sujet` int(11) NOT NULL,
  PRIMARY KEY (`Id_Reponse`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `mesg_sujet`
--

CREATE TABLE IF NOT EXISTS `mesg_sujet` (
  `Id_Sujet` int(11) NOT NULL AUTO_INCREMENT,
  `Ateur` varchar(50) NOT NULL,
  `Titre` varchar(50) NOT NULL,
  `Date_Derniere_Reponse` datetime NOT NULL,
  PRIMARY KEY (`Id_Sujet`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `prestataire`
--

CREATE TABLE IF NOT EXISTS `prestataire` (
  `Id_Prestataire` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(30) NOT NULL,
  `Prenom` varchar(30) NOT NULL,
  `Adresse` varchar(50) NOT NULL,
  `Mail` varchar(50) NOT NULL,
  `Mot_De_Passe` varchar(50) NOT NULL,
  `Tel` int(11) NOT NULL,
  PRIMARY KEY (`Id_Prestataire`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `reclamation`
--

CREATE TABLE IF NOT EXISTS `reclamation` (
  `Id_Reclamation` int(11) NOT NULL AUTO_INCREMENT,
  `Id_Service` int(11) NOT NULL,
  `Sujet` varchar(50) NOT NULL,
  `Contenu` varchar(100) NOT NULL,
  PRIMARY KEY (`Id_Reclamation`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `reclamation`
--

INSERT INTO `reclamation` (`Id_Reclamation`, `Id_Service`, `Sujet`, `Contenu`) VALUES
(1, 1, 'rec1', 'reclamation'),
(2, 2, 'rec2', 'reclamation');

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

CREATE TABLE IF NOT EXISTS `reservation` (
  `Id_Reservation` int(11) NOT NULL AUTO_INCREMENT,
  `Id_Service` int(11) NOT NULL,
  `Id_Client` int(11) NOT NULL,
  `Date_de_Reservation` datetime NOT NULL,
  PRIMARY KEY (`Id_Reservation`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `service`
--

CREATE TABLE IF NOT EXISTS `service` (
  `Id_Service` int(11) NOT NULL AUTO_INCREMENT,
  `Id_Prestataire` int(11) NOT NULL,
  `Nom` varchar(50) NOT NULL,
  `Prix` int(11) NOT NULL,
  `Categorie` varchar(50) NOT NULL,
  `Type` varchar(50) NOT NULL,
  `Tel` int(11) NOT NULL,
  `Adresse` varchar(50) NOT NULL,
  PRIMARY KEY (`Id_Service`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
