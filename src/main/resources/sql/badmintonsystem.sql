/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : badmintonsystem

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2020-06-07 13:23:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_place
-- ----------------------------
DROP TABLE IF EXISTS `t_place`;
CREATE TABLE `t_place` (
  `ID` varchar(32) NOT NULL,
  `PLACE_NAME` varchar(50) NOT NULL COMMENT '场地名称',
  `PRICE` int(50) DEFAULT NULL COMMENT '价位',
  `PRINCIPAL` varchar(50) DEFAULT NULL COMMENT '负责人',
  `CONSULTING_TELEPHONE` varchar(50) DEFAULT NULL COMMENT '咨询电话',
  `GALLERYFUL` varchar(50) DEFAULT NULL COMMENT '容纳人数',
  `CONTENT` varchar(255) DEFAULT NULL COMMENT '价绍',
  `ADD_TIME` datetime DEFAULT NULL COMMENT '发布时间',
  `PLACE_STATUS` varchar(50) DEFAULT NULL COMMENT '场地状态',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_place
-- ----------------------------
INSERT INTO `t_place` VALUES ('04c084fd2b90425e899635f5855f7692', '标准场地16', '48', '羊黛伊', '15706876511', '7', '标准场地16', '2020-06-05 14:46:51', 'free');
INSERT INTO `t_place` VALUES ('0624792da98e444e9ea62e3dc2b14829', '标准场地10', '18', '蔚炎岩', '15700306356', '2', '标准场地10', '2020-06-05 14:46:51', 'free');
INSERT INTO `t_place` VALUES ('165879d8bf4b482bac8aeac6d61edba1', '标准场地7', '3', '巢邦榕', '13604154010', '4', '标准场地7', '2020-06-05 14:46:50', 'free');
INSERT INTO `t_place` VALUES ('18091d59a1224a62bb44a72dbde72f0c', '标准场地3', '77', '寇昌', '15701572043', '3', '标准场地3', '2020-06-05 14:46:50', 'free');
INSERT INTO `t_place` VALUES ('201b0ef25b074cfeb9b5cc82aafa4a8d', '标准场地11', '49', '郑哲', '15701974356', '8', '标准场地11', '2020-06-05 14:46:51', 'free');
INSERT INTO `t_place` VALUES ('33a3a1cacd44423bb623d7c7125866bd', '标准场地2', '32', '葛薇筠', '13202410351', '4', '标准场地2', '2020-06-05 14:46:50', 'free');
INSERT INTO `t_place` VALUES ('3878b394aa8849deba9ab6cffdcab4d5', '标准场地4', '96', '马瑞菊', '15600218842', '2', '标准场地4', '2020-06-05 14:46:50', 'free');
INSERT INTO `t_place` VALUES ('3b5efea4b4a84fb68131e1d7c0e5e525', '标准场地18', '50', '费桂素', '13300901078', '2', '标准场地18', '2020-06-05 14:46:51', 'free');
INSERT INTO `t_place` VALUES ('4a5340dee66d4bf0ba75ea71b90a3cd5', '标准场地15', '3', '井永', '15207780292', '8', '标准场地15', '2020-06-05 14:46:51', 'free');
INSERT INTO `t_place` VALUES ('5175be6b701f4139a275f6a6805f2496', '标准场地19', '21', '融云秋', '15605956315', '9', '标准场地19', '2020-06-05 14:46:51', 'free');
INSERT INTO `t_place` VALUES ('576ade695d4943bd8a9f20543453a6ba', '标准场地17', '81', '简璧', '13404415498', '9', '标准场地17', '2020-06-05 14:46:51', 'free');
INSERT INTO `t_place` VALUES ('5fbb246ecf9c44139672cf8a06016ccc', '标准场地9', '37', '闻蓉秋', '13104240503', '4', '标准场地9', '2020-06-05 14:46:50', 'free');
INSERT INTO `t_place` VALUES ('7b8fc4fac2924e7cb0ab451deb411c92', '标准场地1', '92', '钱永贵', '15800356913', '9', '标准场地1', '2020-06-05 14:46:50', 'free');
INSERT INTO `t_place` VALUES ('a8886a57c4d74a6191eca1fab8a63ba2', '标准场地6', '47', '蓬雁纨', '13607447909', '2', '标准场地6', '2020-06-05 14:46:50', 'free');
INSERT INTO `t_place` VALUES ('aa47c81dcfd34353bf0d522de44bfe68', '标准场地5', '69', '简婵', '13305710923', '2', '标准场地5', '2020-06-05 14:46:50', 'free');
INSERT INTO `t_place` VALUES ('c03a1d40872c4f83a6961ef6c0c3e416', '标准场地0', '88', '佘彪', '13808693619', '3', '标准场地0', '2020-06-05 14:46:45', 'free');
INSERT INTO `t_place` VALUES ('c23b768198374518a747ab63568d80eb', '标准场地14', '69', '壤栋', '15202514952', '3', '标准场地14', '2020-06-05 14:46:51', 'free');
INSERT INTO `t_place` VALUES ('c4b409e88dfa45058b2ff8d3953c8005', '标准场地13', '54', '乐霄', '13807603476', '8', '标准场地13', '2020-06-05 14:46:51', 'free');
INSERT INTO `t_place` VALUES ('ecad8bf191c04238bf0c2115a020f4de', '标准场地12', '29', '申薇', '15805226186', '0', '标准场地12', '2020-06-05 14:46:51', 'free');
INSERT INTO `t_place` VALUES ('f3ddcdf0322d40a3b2b2fb100ec8becc', '标准场地8', '42', '隗彬', '15306888101', '0', '标准场地8', '2020-06-05 14:46:50', 'free');

-- ----------------------------
-- Table structure for t_reserve_message
-- ----------------------------
DROP TABLE IF EXISTS `t_reserve_message`;
CREATE TABLE `t_reserve_message` (
  `ID` varchar(32) NOT NULL,
  `PLAACE_ID` varchar(32) DEFAULT NULL COMMENT '场地编号',
  `PEOPLE_NUMBER` int(50) DEFAULT NULL COMMENT '人数',
  `APPOINTMENT_TIME` datetime DEFAULT NULL COMMENT '预约时间',
  `CONTACT_ADDRESS` varchar(255) DEFAULT NULL COMMENT '联系地址',
  `LINKMAN` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '联系人',
  `CONTACT_NUMBER` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '联系电话',
  `DURATION` int(10) DEFAULT NULL COMMENT '预约时长',
  `ADD_TIME` datetime DEFAULT NULL COMMENT '提交时间',
  `ORDER_NUMBER` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '订单编号',
  `MEMBER` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '预定会员',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_reserve_message
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `USER_ACCOUNT` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户账号',
  `PASSWORD` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `IDENTITY_CARD` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户身份证号',
  `USER_NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `USER_SEX` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户性别',
  `EMAIL` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户电子邮箱',
  `USER_TEL` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户电话号码',
  `ADDRESS` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户地址',
  `VIP_CARD` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户VIP卡',
  `USER_STATUS` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户状态',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
