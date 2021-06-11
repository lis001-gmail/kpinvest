-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        10.5.10-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- kpinvest 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `kpinvest` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `kpinvest`;

-- 테이블 kpinvest.invest 구조 내보내기
CREATE TABLE IF NOT EXISTS `invest` (
  `investId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL DEFAULT 0,
  `productId` int(11) NOT NULL DEFAULT 0,
  `investAmount` int(11) NOT NULL DEFAULT 0,
  `attendedAt` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`investId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- 테이블 데이터 kpinvest.invest:~0 rows (대략적) 내보내기
/*!40000 ALTER TABLE `invest` DISABLE KEYS */;
INSERT INTO `invest` (`investId`, `userId`, `productId`, `investAmount`, `attendedAt`) VALUES
	(1, 1, 1, 10000, '2021-06-12 04:45:43'),
	(2, 1, 1, 10000, '2021-06-12 04:47:18'),
	(3, 111, 1, 10000, '2021-06-12 04:48:27');
/*!40000 ALTER TABLE `invest` ENABLE KEYS */;

-- 테이블 kpinvest.product 구조 내보내기
CREATE TABLE IF NOT EXISTS `product` (
  `productId` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `totalInvestingAmount` int(11) NOT NULL,
  `currentInvestingAmount` int(11) unsigned zerofill NOT NULL,
  `numberInvestors` int(11) unsigned zerofill NOT NULL,
  `status` int(11) unsigned zerofill NOT NULL COMMENT '0 - ready\r\n1 - investing\r\n2 - done',
  `startedAt` timestamp NOT NULL DEFAULT current_timestamp(),
  `finishedAt` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`productId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COMMENT='investment product';

-- 테이블 데이터 kpinvest.product:~2 rows (대략적) 내보내기
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`productId`, `title`, `totalInvestingAmount`, `currentInvestingAmount`, `numberInvestors`, `status`, `startedAt`, `finishedAt`) VALUES
	(1, 'land', 50000000, 00000040000, 00000000004, 00000000000, '2021-06-10 00:00:00', '2021-06-20 00:00:00'),
	(2, 'fund', 10000000, 00000000000, 00000000000, 00000000000, '2021-06-11 00:00:00', '2021-06-18 00:00:00');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
