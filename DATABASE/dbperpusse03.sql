-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 26, 2019 at 07:20 AM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `dbperpusse03`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE IF NOT EXISTS `anggota` (
`idanggota` int(11) NOT NULL,
  `namaanggota` varchar(35) NOT NULL,
  `prodi` varchar(25) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`idanggota`, `namaanggota`, `prodi`) VALUES
(1, 'Dwiki', 'MI'),
(2, 'Raja Nabil', 'KA');

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE IF NOT EXISTS `buku` (
`idbuku` int(4) NOT NULL,
  `kodebuku` varchar(5) NOT NULL,
  `judul` varchar(100) NOT NULL,
  `pengarang` varchar(35) NOT NULL,
  `stok` int(11) NOT NULL,
  `idkat` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`idbuku`, `kodebuku`, `judul`, `pengarang`, `stok`, `idkat`) VALUES
(1, 'B001', 'Java Web', 'Nabil', 19, 2),
(3, 'B002', 'Delphi', 'Raja', 14, 1),
(4, 'B003', 'Myob', 'Raja Nabil', 22, 2);

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE IF NOT EXISTS `kategori` (
`idkat` int(11) NOT NULL,
  `namakat` varchar(35) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`idkat`, `namakat`) VALUES
(1, 'Akuntansi'),
(2, 'Pemrograman 2');

-- --------------------------------------------------------

--
-- Table structure for table `pinjam`
--

CREATE TABLE IF NOT EXISTS `pinjam` (
`idpinjam` int(4) NOT NULL,
  `nopinjam` varchar(15) NOT NULL,
  `tglpinjam` date NOT NULL,
  `tglkembali` date NOT NULL,
  `idanggota` int(4) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `pinjam`
--

INSERT INTO `pinjam` (`idpinjam`, `nopinjam`, `tglpinjam`, `tglkembali`, `idanggota`) VALUES
(8, 'P-20180110-1', '2018-01-10', '2018-01-12', 1),
(9, 'P-20180110-2', '2018-01-10', '2018-01-12', 1),
(10, 'P-20180110-3', '2018-01-10', '2018-01-12', 1),
(11, 'P-20180110-4', '2018-01-10', '2018-01-12', 2);

-- --------------------------------------------------------

--
-- Table structure for table `pinjamdetail`
--

CREATE TABLE IF NOT EXISTS `pinjamdetail` (
  `nopinjam` varchar(15) NOT NULL,
  `idbuku` int(12) NOT NULL,
  `jumlah` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pinjamdetail`
--

INSERT INTO `pinjamdetail` (`nopinjam`, `idbuku`, `jumlah`) VALUES
('P-20180110-1', 1, 1),
('P-20180110-1', 3, 2),
('P-20180110-2', 4, 1),
('P-20180110-3', 3, 1),
('P-20180110-4', 3, 1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id_user` varchar(6) NOT NULL,
  `nama_user` varchar(35) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `level` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `nama_user`, `username`, `password`, `level`) VALUES
('PR1001', 'Gen Xander', 'admin', 'd033e22ae348aeb5660fc2140aec35850c4da997', 'Administrator');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
 ADD PRIMARY KEY (`idanggota`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
 ADD PRIMARY KEY (`idbuku`);

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
 ADD PRIMARY KEY (`idkat`);

--
-- Indexes for table `pinjam`
--
ALTER TABLE `pinjam`
 ADD PRIMARY KEY (`idpinjam`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
 ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `anggota`
--
ALTER TABLE `anggota`
MODIFY `idanggota` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `buku`
--
ALTER TABLE `buku`
MODIFY `idbuku` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `kategori`
--
ALTER TABLE `kategori`
MODIFY `idkat` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `pinjam`
--
ALTER TABLE `pinjam`
MODIFY `idpinjam` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
