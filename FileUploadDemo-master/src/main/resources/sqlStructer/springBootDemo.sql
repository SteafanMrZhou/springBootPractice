/*
 Navicat Premium Data Transfer

 Source Server         : gd
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : springBootDemo

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 10/03/2020 08:35:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for imgUploadInfo
-- ----------------------------
DROP TABLE IF EXISTS `imgUploadInfo`;
CREATE TABLE `imgUploadInfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `imgPath` varchar(300) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of imgUploadInfo
-- ----------------------------
BEGIN;
INSERT INTO `imgUploadInfo` VALUES (1, '123test.cn');
INSERT INTO `imgUploadInfo` VALUES (2, '456779test.com');
INSERT INTO `imgUploadInfo` VALUES (3, 'http://127.0.0.1:8086/Downloads/imgUpload/test.jpeg');
COMMIT;

-- ----------------------------
-- Table structure for orderInfo
-- ----------------------------
DROP TABLE IF EXISTS `orderInfo`;
CREATE TABLE `orderInfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_number` int(30) DEFAULT NULL,
  `order_name` varchar(20) DEFAULT NULL,
  `order_total` int(20) DEFAULT NULL,
  `order_owner` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for shopInfo
-- ----------------------------
DROP TABLE IF EXISTS `shopInfo`;
CREATE TABLE `shopInfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `shop_name` varchar(20) DEFAULT NULL,
  `shop_intro` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for userInfo
-- ----------------------------
DROP TABLE IF EXISTS `userInfo`;
CREATE TABLE `userInfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `user_intro` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of userInfo
-- ----------------------------
BEGIN;
INSERT INTO `userInfo` VALUES (2, 'test,test', '123456,123456', NULL, NULL, NULL);
INSERT INTO `userInfo` VALUES (3, 'test,test,test', '123456,123456,123', NULL, NULL, NULL);
INSERT INTO `userInfo` VALUES (4, 'test,test,test,testing', '123456,123456,123,123456', NULL, NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
