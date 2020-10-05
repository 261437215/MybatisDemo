/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : study_mybatis

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 05/10/2020 15:20:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for combo
-- ----------------------------
DROP TABLE IF EXISTS `combo`;
CREATE TABLE `combo`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '运营商名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of combo
-- ----------------------------
INSERT INTO `combo` VALUES (1, '联通');
INSERT INTO `combo` VALUES (2, '电信');
INSERT INTO `combo` VALUES (3, '移动');
INSERT INTO `combo` VALUES (4, '苹果');
INSERT INTO `combo` VALUES (5, '安卓');

-- ----------------------------
-- Table structure for id_card
-- ----------------------------
DROP TABLE IF EXISTS `id_card`;
CREATE TABLE `id_card`  (
  `uid` int(10) NOT NULL COMMENT '用户编号',
  `cardid` bigint(18) NOT NULL COMMENT '身份证'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of id_card
-- ----------------------------
INSERT INTO `id_card` VALUES (1, 11111111111111);
INSERT INTO `id_card` VALUES (2, 222222222222);
INSERT INTO `id_card` VALUES (3, 3333333333);

-- ----------------------------
-- Table structure for phone
-- ----------------------------
DROP TABLE IF EXISTS `phone`;
CREATE TABLE `phone`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机名称',
  `number` bigint(11) NULL DEFAULT NULL COMMENT '手机号码',
  `uid` int(10) NOT NULL COMMENT '用户编号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of phone
-- ----------------------------
INSERT INTO `phone` VALUES (1, '尹儒果', 11, 1);
INSERT INTO `phone` VALUES (2, '尹儒果2', 22, 2);
INSERT INTO `phone` VALUES (3, '尹儒果', 111, 1);
INSERT INTO `phone` VALUES (4, '尹儒果', 1111, 1);
INSERT INTO `phone` VALUES (5, '尹儒果3', 33, 3);
INSERT INTO `phone` VALUES (6, '尹儒果2', 222, 2);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '尹儒果');
INSERT INTO `user` VALUES (2, '倒霉蛋');
INSERT INTO `user` VALUES (3, '皮皮虾');

-- ----------------------------
-- Table structure for user_combo
-- ----------------------------
DROP TABLE IF EXISTS `user_combo`;
CREATE TABLE `user_combo`  (
  `uid` int(10) NULL DEFAULT NULL COMMENT '用户编号',
  `cid` int(10) NULL DEFAULT NULL COMMENT '运营商编号',
  `price` int(10) NULL DEFAULT NULL COMMENT '价格'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_combo
-- ----------------------------
INSERT INTO `user_combo` VALUES (1, 1, 20);
INSERT INTO `user_combo` VALUES (1, 5, 30);
INSERT INTO `user_combo` VALUES (1, 4, 30);
INSERT INTO `user_combo` VALUES (2, 1, 40);
INSERT INTO `user_combo` VALUES (3, 2, 60);
INSERT INTO `user_combo` VALUES (3, 3, 60);
INSERT INTO `user_combo` VALUES (3, 4, 60);

SET FOREIGN_KEY_CHECKS = 1;
