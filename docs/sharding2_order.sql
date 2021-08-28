/*
 Navicat Premium Data Transfer

 Source Server         : mysql_3.27
 Source Server Type    : MySQL
 Source Server Version : 50735
 Source Host           : 192.168.3.27:3306
 Source Schema         : sharding2_order

 Target Server Type    : MySQL
 Target Server Version : 50735
 File Encoding         : 65001

 Date: 28/08/2021 21:31:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_order_1
-- ----------------------------
DROP TABLE IF EXISTS `t_order_1`;
CREATE TABLE `t_order_1`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_amount` decimal(10, 2) NOT NULL,
  `order_status` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_order_2
-- ----------------------------
DROP TABLE IF EXISTS `t_order_2`;
CREATE TABLE `t_order_2`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_amount` decimal(10, 2) NOT NULL,
  `order_status` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
