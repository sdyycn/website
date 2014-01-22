-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- 主机: 127.0.0.1
-- 生成日期: 2014 年 01 月 22 日 06:51
-- 服务器版本: 5.5.32
-- PHP 版本: 5.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 数据库: `eclipse`
--
CREATE DATABASE IF NOT EXISTS `eclipse` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `eclipse`;

-- --------------------------------------------------------

--
-- 表的结构 `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` varchar(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL COMMENT '名称',
  `pwd` varchar(32) NOT NULL,
  `email` varchar(50) NOT NULL,
  `type` int(11) NOT NULL,
  `gid` int(11) NOT NULL COMMENT '用户组',
  `status` int(11) NOT NULL,
  `qq` varchar(15) DEFAULT NULL,
  `mobile` varchar(15) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `date_regist` date NOT NULL,
  `date_change` date NOT NULL,
  `description` varchar(1020) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uid` (`uid`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=11 ;

-- --------------------------------------------------------

--
-- 表的结构 `article`
--

CREATE TABLE IF NOT EXISTS `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(250) NOT NULL,
  `type` int(11) DEFAULT NULL COMMENT '所属菜单栏目',
  `author` varchar(32) DEFAULT NULL,
  `time_publish` date DEFAULT NULL,
  `time_update` date DEFAULT NULL,
  `content` blob,
  `summary` varchar(1024) DEFAULT NULL,
  `source` varchar(32) DEFAULT NULL COMMENT '来源:0-原创,1-转载,3-翻译',
  `k` varchar(50) DEFAULT NULL,
  `attachment` varchar(1024) DEFAULT NULL,
  `model` int(11) DEFAULT NULL COMMENT '所属模型,0-文章,1-图片,2-下载,3-广告',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- 表的结构 `dict`
--

CREATE TABLE IF NOT EXISTS `dict` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tid` varchar(10) NOT NULL COMMENT '表名',
  `key` varchar(25) NOT NULL,
  `value` varchar(100) DEFAULT NULL,
  `description` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

-- --------------------------------------------------------

--
-- 表的结构 `group`
--

CREATE TABLE IF NOT EXISTS `group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `description` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

-- --------------------------------------------------------

--
-- 表的结构 `menu`
--

CREATE TABLE IF NOT EXISTS `menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` varchar(25) NOT NULL COMMENT '栏目ID',
  `name` varchar(25) NOT NULL COMMENT '栏目名',
  `type` int(11) DEFAULT NULL,
  `no` int(11) DEFAULT NULL COMMENT '栏目序号',
  `privilege` int(11) DEFAULT NULL COMMENT '权重',
  `pid` int(11) DEFAULT NULL COMMENT '上级菜单',
  `status` int(11) DEFAULT NULL COMMENT '状态-是否显示',
  `directory` varchar(255) DEFAULT NULL,
  `key` int(11) NOT NULL COMMENT '自定义整型ID',
  `description` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `mid` (`mid`),
  UNIQUE KEY `mid_2` (`mid`),
  UNIQUE KEY `key` (`key`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

-- --------------------------------------------------------

--
-- 表的结构 `site`
--

CREATE TABLE IF NOT EXISTS `site` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `value` varchar(250) NOT NULL,
  `description` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=9 ;

-- --------------------------------------------------------

--
-- 表的结构 `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` varchar(20) NOT NULL,
  `name` varchar(32) DEFAULT NULL COMMENT '用户自定义名称',
  `pwd` varchar(32) NOT NULL,
  `sex` int(11) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `type` int(11) DEFAULT NULL COMMENT '用户类型',
  `status` int(11) DEFAULT NULL,
  `date_regist` date DEFAULT NULL,
  `date_change` date DEFAULT NULL,
  `ip_join` varchar(16) DEFAULT NULL,
  `date_login` date DEFAULT NULL,
  `ip_login` varchar(16) DEFAULT NULL,
  `qq` varchar(15) DEFAULT NULL,
  `mobile` varchar(15) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `school` varchar(30) DEFAULT NULL,
  `department` varchar(25) DEFAULT NULL,
  `login_times` int(11) DEFAULT '0',
  `fax` varchar(15) DEFAULT NULL,
  `company` varchar(50) DEFAULT NULL,
  `note` varchar(250) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uid` (`uid`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='普通用户表' AUTO_INCREMENT=10 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
