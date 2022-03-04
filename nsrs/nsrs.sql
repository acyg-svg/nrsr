/*
 Navicat Premium Data Transfer

 Source Server         : 123
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3306
 Source Schema         : nsrs

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 05/03/2022 00:52:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for car
-- ----------------------------
DROP TABLE IF EXISTS `car`;
CREATE TABLE `car`  (
  `car_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `goods_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` double(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`car_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `goods_id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `goods_price` double(10, 2) NULL DEFAULT NULL,
  `goods_intro` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`goods_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for goodscategory
-- ----------------------------
DROP TABLE IF EXISTS `goodscategory`;
CREATE TABLE `goodscategory`  (
  `goods_category_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`goods_category_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for jdbc_test
-- ----------------------------
DROP TABLE IF EXISTS `jdbc_test`;
CREATE TABLE `jdbc_test`  (
  `type` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of jdbc_test
-- ----------------------------
INSERT INTO `jdbc_test` VALUES ('com.zaxxer.hikari.HikariDataSource', 'hikari数据源');
INSERT INTO `jdbc_test` VALUES ('org.apache.commons.dbcp2.BasicDataSource', 'dbcp2数据源');
INSERT INTO `jdbc_test` VALUES ('test', '测试类');
INSERT INTO `jdbc_test` VALUES ('test', '测试类');
INSERT INTO `jdbc_test` VALUES ('test', '测试类');
INSERT INTO `jdbc_test` VALUES ('test333', '测试222');
INSERT INTO `jdbc_test` VALUES ('test', '测试类');
INSERT INTO `jdbc_test` VALUES ('test', '测试类');

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice`  (
  `notice_id` int(11) NOT NULL AUTO_INCREMENT,
  `notice_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`notice_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `goods_number` int(20) NULL DEFAULT NULL,
  `username` int(11) NULL DEFAULT NULL,
  `time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_freshman
-- ----------------------------
DROP TABLE IF EXISTS `tb_freshman`;
CREATE TABLE `tb_freshman`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `major` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tele` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `room` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `statuses` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_freshman
-- ----------------------------
INSERT INTO `tb_freshman` VALUES (6, '66', '666', '男', '66', '66', '66', '66', '已注册');
INSERT INTO `tb_freshman` VALUES (7, '77', '77', '男', '77', '77', '77', '77', '已注册');
INSERT INTO `tb_freshman` VALUES (13, '陈江昂', '22', '男', '2818-8-28', '计算机科学与技术', '13543139985', 'M2214', '已注册');
INSERT INTO `tb_freshman` VALUES (14, '', '', '男', '', '', '', '', '已注册');
INSERT INTO `tb_freshman` VALUES (15, '1', '1', '男', '1', '1', '1', '1', '已注册');
INSERT INTO `tb_freshman` VALUES (16, '123', '123', '男', '1999-3-18', 'jsjxisjd', '41954494665', 'sdfsf', '已注册');

-- ----------------------------
-- Table structure for tb_role
-- ----------------------------
DROP TABLE IF EXISTS `tb_role`;
CREATE TABLE `tb_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `role_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `role_id`(`role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_role
-- ----------------------------
INSERT INTO `tb_role` VALUES (1, 'ROLE_freshman', 2);
INSERT INTO `tb_role` VALUES (2, 'ROLE_teacher', 1);
INSERT INTO `tb_role` VALUES (3, 'ROLE_admin', 0);

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(150) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `role_id` int(11) NOT NULL,
  `status` int(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `ur`(`role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, 'cyg', '$2a$10$lx5vmz1BVfVIRlZFdBtvM.T79wbc.eEFsJYR7hiObXhca4fT4R4pS', 2, 0);
INSERT INTO `tb_user` VALUES (2, 'wjlls', '$2a$10$lx5vmz1BVfVIRlZFdBtvM.T79wbc.eEFsJYR7hiObXhca4fT4R4pS', 1, 1);
INSERT INTO `tb_user` VALUES (3, 'gly', '$2a$10$lx5vmz1BVfVIRlZFdBtvM.T79wbc.eEFsJYR7hiObXhca4fT4R4pS', 0, 1);
INSERT INTO `tb_user` VALUES (4, '123', '$2a$10$lx5vmz1BVfVIRlZFdBtvM.T79wbc.eEFsJYR7hiObXhca4fT4R4pS', 2, 1);
INSERT INTO `tb_user` VALUES (9, '1840706138', '$2a$10$lx5vmz1BVfVIRlZFdBtvM.T79wbc.eEFsJYR7hiObXhca4fT4R4pS', 2, NULL);
INSERT INTO `tb_user` VALUES (10, '1840706109', '$2a$10$lx5vmz1BVfVIRlZFdBtvM.T79wbc.eEFsJYR7hiObXhca4fT4R4pS', 2, NULL);
INSERT INTO `tb_user` VALUES (11, 'dsyls', '$2a$10$lx5vmz1BVfVIRlZFdBtvM.T79wbc.eEFsJYR7hiObXhca4fT4R4pS', 1, 1);

SET FOREIGN_KEY_CHECKS = 1;
