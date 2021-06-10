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
  `invest_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) NOT NULL DEFAULT 0,
  `invest_amount` int(11) NOT NULL DEFAULT 0,
  `attended_at` datetime NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`invest_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 내보낼 데이터가 선택되어 있지 않습니다.

-- 테이블 kpinvest.product 구조 내보내기
CREATE TABLE IF NOT EXISTS `product` (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `total_investing_amount` int(11) NOT NULL,
  `current_investing_amount` int(11) unsigned zerofill NOT NULL,
  `number_investors` int(11) unsigned zerofill NOT NULL,
  `status` int(11) unsigned zerofill NOT NULL COMMENT '0 - ready\r\n1 - investing\r\n2 - done',
  `started_at` datetime NOT NULL DEFAULT current_timestamp(),
  `finished_at` datetime NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='investment product';

-- 내보낼 데이터가 선택되어 있지 않습니다.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
