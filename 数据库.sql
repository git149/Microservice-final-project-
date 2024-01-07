/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 8.0.31 : Database - troop-warehouse-management-system
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`troop-warehouse-management-system` /*!40100 DEFAULT CHARACTER SET utf8mb3 COLLATE utf8mb3_bin */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `troop-warehouse-management-system`;

/*Table structure for table `apparatus` */

DROP TABLE IF EXISTS `apparatus`;

CREATE TABLE `apparatus` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `isDel` int DEFAULT '1' COMMENT '是否删除标识',
  `time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '相关时间',
  `text` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_bin COMMENT '明细',
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '名称',
  `identifier` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '编号',
  `num` bigint DEFAULT NULL COMMENT '数量',
  `type` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '类型',
  `maintenance` datetime DEFAULT NULL COMMENT '保养时间',
  `user` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '负责人',
  `usage` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '使用情况',
  `num1` text CHARACTER SET utf8mb3 COLLATE utf8mb3_bin,
  `num2` text CHARACTER SET utf8mb3 COLLATE utf8mb3_bin,
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

/*Data for the table `apparatus` */

insert  into `apparatus`(`id`,`isDel`,`time`,`text`,`name`,`identifier`,`num`,`type`,`maintenance`,`user`,`usage`,`num1`,`num2`) values 
(4,1,'2022-12-10 16:23:39','1，被美军选为新一代制式军用手枪、并在美军中重新命名为M9手枪。从此伯莱塔92F型手枪便\"一抢走红\"。该枪发射9毫米帕拉贝鲁姆手枪弹，射程50米。。，.，.。','1','98127938712',20,'手枪','2023-01-10 00:00:00','3',NULL,'901278398712','2897391827387612');

/*Table structure for table `food` */

DROP TABLE IF EXISTS `food`;

CREATE TABLE `food` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `isDel` int DEFAULT '1' COMMENT '是否删除标识',
  `time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '相关时间',
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '名称',
  `text` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_bin COMMENT '说明',
  `identifier` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '编号',
  `num` bigint DEFAULT NULL COMMENT '数量',
  `warranty` datetime DEFAULT NULL COMMENT '保质期',
  `user` bigint DEFAULT NULL COMMENT '负责人',
  `factory` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '生产地',
  UNIQUE KEY `identifier` (`identifier`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

/*Data for the table `food` */

insert  into `food`(`id`,`isDel`,`time`,`name`,`text`,`identifier`,`num`,`warranty`,`user`,`factory`) values 
(11,1,'2022-12-10 16:06:15','沐斯尼 手工绿豆饼板栗糕点整箱传统点心独立包装板栗酥风味零食甜点 绿豆饼+板栗饼','沐斯尼 手工绿豆饼板栗糕点整箱传统点心独立包装板栗酥风味零食甜点 绿豆饼+板栗饼','172638716238',48,'2023-12-10 15:51:51',3,'北京'),
(12,1,'2022-12-10 17:47:38','只松鼠黄金肉松饼1000g/箱 早餐办公室特色小吃休闲零食网红点心','只松鼠黄金肉松饼1000g/箱 早餐办公室特色小吃休闲零食网红点心','12315123',22,'2022-12-10 00:00:00',3,'北京');

/*Table structure for table `item` */

DROP TABLE IF EXISTS `item`;

CREATE TABLE `item` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `isDel` int DEFAULT '1' COMMENT '是否删除标识',
  `time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '相关时间',
  `doing` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '入库,待使用' COMMENT '操作类型',
  `type` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '物品类型',
  `goods` bigint DEFAULT NULL COMMENT '物品唯一识别',
  `num` bigint DEFAULT NULL COMMENT '操作数据量',
  `user` bigint DEFAULT NULL COMMENT '操作人',
  `touser` bigint DEFAULT NULL COMMENT '收益人',
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=486 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

/*Data for the table `item` */

insert  into `item`(`id`,`isDel`,`time`,`doing`,`type`,`goods`,`num`,`user`,`touser`) values 
(394,1,'2022-12-10 15:55:06','出库,已使用','Food',11,NULL,3,11),
(395,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(396,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(397,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(398,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(399,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(400,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(401,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(402,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(403,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(404,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(405,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(406,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(407,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(408,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(409,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(410,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(411,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(412,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(413,1,'2022-12-10 15:52:00','入库,待使用','Food',11,NULL,3,NULL),
(414,1,'2022-12-10 15:56:03','入库,待使用','Food',11,NULL,3,NULL),
(415,1,'2022-12-10 15:56:03','入库,待使用','Food',11,NULL,3,NULL),
(416,1,'2022-12-10 15:56:03','入库,待使用','Food',11,NULL,3,NULL),
(417,1,'2022-12-10 15:56:03','入库,待使用','Food',11,NULL,3,NULL),
(418,1,'2022-12-10 15:56:03','入库,待使用','Food',11,NULL,3,NULL),
(419,1,'2022-12-10 15:56:03','入库,待使用','Food',11,NULL,3,NULL),
(420,1,'2022-12-10 15:56:03','入库,待使用','Food',11,NULL,3,NULL),
(421,1,'2022-12-10 15:56:03','入库,待使用','Food',11,NULL,3,NULL),
(422,1,'2022-12-10 15:56:03','入库,待使用','Food',11,NULL,3,NULL),
(423,1,'2022-12-10 15:56:03','入库,待使用','Food',11,NULL,3,NULL),
(424,1,'2022-12-10 16:03:13','入库,待使用','Food',11,NULL,NULL,NULL),
(425,1,'2022-12-10 16:03:13','入库,待使用','Food',11,NULL,NULL,NULL),
(426,1,'2022-12-10 16:03:13','入库,待使用','Food',11,NULL,NULL,NULL),
(427,1,'2022-12-10 16:03:13','入库,待使用','Food',11,NULL,NULL,NULL),
(428,1,'2022-12-10 16:03:13','入库,待使用','Food',11,NULL,NULL,NULL),
(429,1,'2022-12-10 16:03:13','入库,待使用','Food',11,NULL,NULL,NULL),
(430,1,'2022-12-10 16:03:13','入库,待使用','Food',11,NULL,NULL,NULL),
(431,1,'2022-12-10 16:03:13','入库,待使用','Food',11,NULL,NULL,NULL),
(432,1,'2022-12-10 16:03:13','入库,待使用','Food',11,NULL,NULL,NULL),
(433,1,'2022-12-10 16:03:13','入库,待使用','Food',11,NULL,NULL,NULL),
(434,1,'2022-12-10 16:03:49','入库,待使用','Food',11,NULL,3,NULL),
(435,1,'2022-12-10 16:03:49','入库,待使用','Food',11,NULL,3,NULL),
(436,1,'2022-12-10 16:06:15','出库,已使用','Food',11,NULL,3,11),
(437,1,'2022-12-10 16:03:49','入库,待使用','Food',11,NULL,3,NULL),
(438,1,'2022-12-10 16:03:49','入库,待使用','Food',11,NULL,3,NULL),
(439,1,'2022-12-10 16:03:49','入库,待使用','Food',11,NULL,3,NULL),
(440,1,'2022-12-10 16:03:49','入库,待使用','Food',11,NULL,3,NULL),
(441,1,'2022-12-10 16:03:49','入库,待使用','Food',11,NULL,3,NULL),
(442,1,'2022-12-10 16:03:49','入库,待使用','Food',11,NULL,3,NULL),
(443,1,'2022-12-10 16:03:49','入库,待使用','Food',11,NULL,3,NULL),
(444,1,'2022-12-10 16:23:39','入库,待使用','Apparatus',4,NULL,3,NULL),
(445,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(446,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(447,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(448,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(449,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(450,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(451,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(452,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(453,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(454,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(455,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(456,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(457,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(458,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(459,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(460,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(461,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(462,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(463,1,'2022-12-10 16:08:44','入库,待使用','Apparatus',4,NULL,3,NULL),
(464,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(465,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(466,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(467,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(468,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(469,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(470,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(471,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(472,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(473,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(474,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(475,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(476,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(477,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(478,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(479,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(480,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(481,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(482,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(483,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(484,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL),
(485,1,'2022-12-10 17:47:38','入库,待使用','Food',12,NULL,3,NULL);

/*Table structure for table `loaded` */

DROP TABLE IF EXISTS `loaded`;

CREATE TABLE `loaded` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `isDel` int DEFAULT '1' COMMENT '是否删除标识',
  `time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '相关时间',
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '名称',
  `text` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_bin COMMENT '说明',
  `identifier` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '编号',
  `num` bigint DEFAULT NULL COMMENT '数量',
  `size` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '尺码',
  `user` bigint DEFAULT NULL COMMENT '负责人',
  `factory` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '生产地',
  `type` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '种类',
  UNIQUE KEY `identifier` (`identifier`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

/*Data for the table `loaded` */

/*Table structure for table `other` */

DROP TABLE IF EXISTS `other`;

CREATE TABLE `other` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `isDel` int DEFAULT '1' COMMENT '是否删除标识',
  `time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '相关时间',
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '名称',
  `text` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_bin COMMENT '说明',
  `identifier` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '编号',
  `num` bigint DEFAULT NULL COMMENT '数量',
  `size` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '尺码',
  `user` bigint DEFAULT NULL COMMENT '负责人',
  `factory` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '生产地',
  `type` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '种类',
  UNIQUE KEY `identifier` (`identifier`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

/*Data for the table `other` */

/*Table structure for table `reflection` */

DROP TABLE IF EXISTS `reflection`;

CREATE TABLE `reflection` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `isDel` int DEFAULT '1' COMMENT '是否删除标识',
  `time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '相关时间',
  `doing` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '出库' COMMENT '操作类型',
  `type` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '物品类型',
  `goods` bigint DEFAULT NULL COMMENT '物品唯一识别',
  `num` bigint DEFAULT NULL COMMENT '操作数据量',
  `user` bigint DEFAULT NULL COMMENT '操作人',
  `touser` bigint DEFAULT NULL COMMENT '收益人',
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

/*Data for the table `reflection` */

insert  into `reflection`(`id`,`isDel`,`time`,`doing`,`type`,`goods`,`num`,`user`,`touser`) values 
(43,1,'2022-12-10 15:52:00','入库','Food',11,20,3,NULL),
(44,1,'2022-12-10 15:55:06','出库','Food',11,-1,3,11),
(45,1,'2022-12-10 15:56:03','入库','Food',11,10,3,NULL),
(46,1,'2022-12-10 16:03:13','入库','Food',11,10,3,NULL),
(47,1,'2022-12-10 16:03:49','入库','Food',11,10,3,NULL),
(48,1,'2022-12-10 16:06:15','出库','Food',11,-1,3,11),
(49,1,'2022-12-10 16:08:44','入库','Apparatus',4,20,3,NULL),
(50,1,'2022-12-10 16:09:44','出库','Apparatus',4,-1,3,11),
(51,1,'2022-12-10 16:17:24','入库','Apparatus',4,1,11,NULL),
(52,1,'2022-12-10 16:22:57','出库','Apparatus',4,-1,3,11),
(53,1,'2022-12-10 16:23:39','入库','Apparatus',4,1,11,NULL),
(54,1,'2022-12-10 17:47:38','入库','Food',12,22,3,NULL);

/*Table structure for table `treat` */

DROP TABLE IF EXISTS `treat`;

CREATE TABLE `treat` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `isDel` int DEFAULT '1' COMMENT '是否删除标识',
  `time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '相关时间',
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '名称',
  `text` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_bin COMMENT '说明',
  `identifier` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '编号',
  `num` bigint DEFAULT NULL COMMENT '数量',
  `warranty` datetime DEFAULT NULL COMMENT '保质期',
  `user` bigint DEFAULT NULL COMMENT '负责人',
  `factory` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '生产地',
  UNIQUE KEY `identifier` (`identifier`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

/*Data for the table `treat` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `isDel` int DEFAULT '1' COMMENT '是否删除标识',
  `time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '相关时间',
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '用户名',
  `account` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '账号',
  `pw` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '密码',
  `sex` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '男' COMMENT '性别',
  `iphone` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '手机号',
  `lv` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '普通用户' COMMENT '账号权限',
  UNIQUE KEY `account` (`account`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

/*Data for the table `user` */

insert  into `user`(`id`,`isDel`,`time`,`name`,`account`,`pw`,`sex`,`iphone`,`lv`) values 
(3,1,'2022-12-07 18:57:48','张三','zhangsan@System.com','123456','男','110','管理员'),
(11,1,'2022-12-10 15:54:41','用户1','user1@System.com','123456','男','110','普通用户'),
(12,1,'2022-12-10 15:54:41','用户2','user2@System.com','123456','男','110','普通用户'),
(13,1,'2022-12-10 15:54:41','用户3','user3@System.com','123456','男','110','普通用户'),
(14,1,'2022-12-10 15:54:41','用户4','user4@System.com','123456','男','110','普通用户'),
(15,1,'2022-12-10 15:54:41','用户5','user5@System.com','123456','男','110','普通用户');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
