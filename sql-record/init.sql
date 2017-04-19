/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : aoifecomm

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-04-11 16:12:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for country
-- ----------------------------
DROP TABLE IF EXISTS `country`;
CREATE TABLE `country` (
  `id` int(11) NOT NULL COMMENT '序号',
  `country_name` varchar(25) DEFAULT NULL COMMENT '国家名称',
  `country_code` varchar(11) DEFAULT NULL COMMENT '国家编码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='国家';

-- ----------------------------
-- Table structure for info_address
-- ----------------------------
DROP TABLE IF EXISTS `info_address`;
CREATE TABLE `info_address` (
  `id` int(12) NOT NULL,
  `address_code` varchar(80) DEFAULT NULL COMMENT '住址编码',
  `address_name` varchar(80) DEFAULT NULL COMMENT '住址名称',
  `address_status` varchar(12) DEFAULT NULL COMMENT '住址状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='住址表';

-- ----------------------------
-- Table structure for info_user
-- ----------------------------
DROP TABLE IF EXISTS `info_user`;
CREATE TABLE `info_user` (
  `id` int(15) NOT NULL COMMENT '序号',
  `user_code` varchar(15) NOT NULL COMMENT '用户编码，或者身份证号',
  `real_name` varchar(12) DEFAULT NULL COMMENT '用户真实姓名',
  `nick_name` varchar(12) DEFAULT NULL COMMENT '昵称',
  `user_password` varchar(15) DEFAULT NULL,
  `user_mobile` int(16) DEFAULT NULL,
  `user_email` varchar(16) DEFAULT NULL,
  `user_status` varchar(8) DEFAULT NULL,
  `create_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(12) DEFAULT NULL,
  `update_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_by` varchar(12) DEFAULT NULL COMMENT '更新者',
  PRIMARY KEY (`id`,`user_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- ----------------------------
-- Table structure for province
-- ----------------------------
DROP TABLE IF EXISTS `province`;
CREATE TABLE `province` (
  `id` int(11) NOT NULL COMMENT '序号',
  `province_name` varchar(11) DEFAULT NULL COMMENT '省名称',
  `province_code` varchar(11) DEFAULT NULL COMMENT '省编码',
  `country_code` varchar(11) DEFAULT 'CN' COMMENT '国家编码'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='省';

-- ----------------------------
-- Table structure for relation_user_address
-- ----------------------------
DROP TABLE IF EXISTS `relation_user_address`;
CREATE TABLE `relation_user_address` (
  `id` int(13) NOT NULL,
  `user_code` varchar(15) DEFAULT NULL COMMENT '用户编码',
  `address_code` varchar(15) DEFAULT NULL COMMENT '住址编码',
  `user_address_type_code` varchar(15) DEFAULT NULL COMMENT '用户住址类型',
  `status` varchar(8) DEFAULT NULL COMMENT '状态：using正在使用，deleted:已经删除,',
  `create_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(15) DEFAULT NULL,
  `update_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_by` varchar(15) DEFAULT NULL COMMENT '更新者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
