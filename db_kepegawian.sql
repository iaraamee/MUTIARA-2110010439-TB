-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 08, 2024 at 05:16 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_kepegawian`
--

-- --------------------------------------------------------

--
-- Table structure for table `gaji`
--

CREATE TABLE `gaji` (
  `id_gaji` varchar(11) NOT NULL,
  `nm_pegawai` varchar(100) NOT NULL,
  `jabatan` varchar(50) NOT NULL,
  `gapok` varchar(15) NOT NULL,
  `uang_makan` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gaji`
--

INSERT INTO `gaji` (`id_gaji`, `nm_pegawai`, `jabatan`, `gapok`, `uang_makan`) VALUES
('GP01', 'Talita', 'Sekretaris ', 'Rp6.000.000', 'Rp100.000'),
('GP02', 'Excel', 'Bendahara ', 'Rp5.000.000', 'Rp100.000'),
('GP04', 'Tiara', 'Manejer', 'Rp8.000.000', 'Rp100.000'),
('GP05', 'Dania', 'Staff', 'Rp3.000.000', 'Rp100.000');

-- --------------------------------------------------------

--
-- Table structure for table `jabatan`
--

CREATE TABLE `jabatan` (
  `id_jabatan` varchar(11) NOT NULL,
  `nm_jabatan` varchar(100) NOT NULL,
  `gapok_jabatan` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jabatan`
--

INSERT INTO `jabatan` (`id_jabatan`, `nm_jabatan`, `gapok_jabatan`) VALUES
('JP01', 'Sekretaris ', 'Rp6.000.000'),
('JP02', 'Staff', 'Rp3.000.000'),
('JP04', 'Bendahara ', 'Rp6.000.000'),
('JP05', 'Manejer', 'Rp8.000.000');

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `id_pegawai` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `tgl_lahir` varchar(15) NOT NULL,
  `jns_kelamin` varchar(20) NOT NULL,
  `alamat` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`id_pegawai`, `nama`, `tgl_lahir`, `jns_kelamin`, `alamat`) VALUES
(1, 'Talita', '17-08-2002', 'Perempuan', 'Banjarmasin'),
(2, 'Excel', '18-06-2003', 'Laki-Laki', 'Banjarmasin'),
(3, 'Maulana', '14-09-2002', 'Laki-Laki', 'Barabai'),
(5, 'Tiara', '13-05-2002', 'Perempuan', 'Banjarmasin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gaji`
--
ALTER TABLE `gaji`
  ADD PRIMARY KEY (`id_gaji`);

--
-- Indexes for table `jabatan`
--
ALTER TABLE `jabatan`
  ADD PRIMARY KEY (`id_jabatan`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`id_pegawai`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
