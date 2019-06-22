/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : mall

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 21/06/2019 17:07:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ad_content
-- ----------------------------
DROP TABLE IF EXISTS `ad_content`;
CREATE TABLE `ad_content`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '广告id',
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '广告标题',
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '广告链接',
  `pic` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '广告图片',
  `status` int(1) NOT NULL COMMENT '广告状态',
  `sort_id` int(10) NOT NULL COMMENT '广告排序',
  `type_id` int(10) NOT NULL COMMENT '广告分类id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ad_content
-- ----------------------------
INSERT INTO `ad_content` VALUES (8, '鞋柜1', '12', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT010GS6SANTWMAADRemvNQck311.jpg', 1, 1, 1);
INSERT INTO `ad_content` VALUES (9, '3', '3', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT010C9VKAb2SOAAINb2yms6A027.jpg', 1, 2, 1);
INSERT INTO `ad_content` VALUES (24, '汽车', '1', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT010C9WCARfvWAAIMm8l_K-w141.jpg', 1, 3, 1);
INSERT INTO `ad_content` VALUES (25, '衣服', '4', 'http://47.112.8.164:9999/group1/M00/00/00/rBLT01zw4OCALC-0AAEWQxP-3CI998.jpg', 1, 4, 1);
INSERT INTO `ad_content` VALUES (26, '鞋子', '1', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT01z6h36AWaCyAAL8Kf2ow9E697.jpg', 1, 5, 1);
INSERT INTO `ad_content` VALUES (28, '茶叶', '2', 'http://47.112.8.164:9999/group1/M00/00/00/rBLT01zxJrqALx3bAAEscA4Sm5I332.jpg', 1, 6, 1);

-- ----------------------------
-- Table structure for ad_type
-- ----------------------------
DROP TABLE IF EXISTS `ad_type`;
CREATE TABLE `ad_type`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '广告分类id',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '广告分类名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ad_type
-- ----------------------------
INSERT INTO `ad_type` VALUES (1, '轮播图');
INSERT INTO `ad_type` VALUES (2, '商品抢购');
INSERT INTO `ad_type` VALUES (3, '美丽人生');
INSERT INTO `ad_type` VALUES (4, '潮电酷玩');
INSERT INTO `ad_type` VALUES (5, '居家生活');
INSERT INTO `ad_type` VALUES (6, '打造爱巢');
INSERT INTO `ad_type` VALUES (7, '户外出行');
INSERT INTO `ad_type` VALUES (8, '猜你喜欢');

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address`  (
  `address_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '地址id',
  `province` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '省',
  `city` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '市',
  `
county` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '县',
  `detail` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '详细地址',
  `zip_code` int(10) NOT NULL COMMENT '邮编',
  PRIMARY KEY (`address_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES (1, '湖南省', '张家界市', '永定区', '吉首大学张家界校区', 427833);
INSERT INTO `address` VALUES (2, '湖南省', '娄底市', '新化县', '新化一中', 417600);

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `admin_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `admin_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员用户名',
  `admin_pass` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员密码',
  PRIMARY KEY (`admin_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'admin', '123456');

-- ----------------------------
-- Table structure for brand
-- ----------------------------
DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand`  (
  `brand_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '品牌id',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '品牌名称',
  `first_char` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '品牌首字母',
  PRIMARY KEY (`brand_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of brand
-- ----------------------------
INSERT INTO `brand` VALUES (1, '华为', 'H');
INSERT INTO `brand` VALUES (2, '三星', 'S');
INSERT INTO `brand` VALUES (3, '苹果', 'P');
INSERT INTO `brand` VALUES (4, '哇哈哈', 'W');
INSERT INTO `brand` VALUES (25, '洛基亚', 'L');
INSERT INTO `brand` VALUES (26, '格力', 'G');
INSERT INTO `brand` VALUES (27, '联想', 'L');
INSERT INTO `brand` VALUES (28, '索尼', 'S');
INSERT INTO `brand` VALUES (29, '阿里巴巴', 'A');

-- ----------------------------
-- Table structure for car
-- ----------------------------
DROP TABLE IF EXISTS `car`;
CREATE TABLE `car`  (
  `car_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '购物车id',
  `user_id` int(10) NOT NULL COMMENT '用户id',
  `goods_id` int(10) NOT NULL COMMENT '商品id',
  `amount` int(10) NOT NULL COMMENT '数量',
  `is_click` int(1) NOT NULL COMMENT '是否选中',
  PRIMARY KEY (`car_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of car
-- ----------------------------
INSERT INTO `car` VALUES (6, 144, 45, 1, -1);

-- ----------------------------
-- Table structure for collection
-- ----------------------------
DROP TABLE IF EXISTS `collection`;
CREATE TABLE `collection`  (
  `collection_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '收藏id',
  `user_id` int(10) NOT NULL COMMENT '用户id',
  `goods_id` int(10) NOT NULL COMMENT '商品id',
  `shop_id` int(10) NOT NULL COMMENT '店铺id',
  PRIMARY KEY (`collection_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of collection
-- ----------------------------
INSERT INTO `collection` VALUES (1, 1, 1, 1111);

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `comment_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `user_id` int(10) NULL DEFAULT NULL COMMENT '用户id',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `shop_id` int(10) NULL DEFAULT NULL COMMENT '商家id',
  `goods_id` int(10) NULL DEFAULT NULL COMMENT '商品id',
  `grade` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评价等级',
  `content` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评论内容',
  `time` datetime NULL DEFAULT NULL COMMENT '评论时间',
  PRIMARY KEY (`comment_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES (12, 144, 'admin', 2, 47, NULL, '真的很不错', '2019-06-19 21:22:29');
INSERT INTO `comment` VALUES (13, 144, 'admin', 2, 46, NULL, '这个很好吃啊', '2019-06-19 21:22:40');
INSERT INTO `comment` VALUES (14, 144, 'admin', 3, 48, NULL, '很好', '2019-06-19 21:22:53');
INSERT INTO `comment` VALUES (15, 144, 'admin', 2, 47, NULL, '2323', '2019-06-20 20:29:02');

-- ----------------------------
-- Table structure for foot
-- ----------------------------
DROP TABLE IF EXISTS `foot`;
CREATE TABLE `foot`  (
  `foot_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '足迹id',
  `user_id` int(10) NOT NULL COMMENT '用户id',
  `goods_id` int(10) NOT NULL COMMENT '商品id',
  `time` datetime NOT NULL COMMENT '浏览时间',
  PRIMARY KEY (`foot_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `goods_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品图片',
  `caption` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '副标题',
  `price_before` double(10, 2) NULL DEFAULT NULL COMMENT '商品打折前价格',
  `price_after` double(10, 2) NULL DEFAULT NULL COMMENT '商品打折后价格',
  `introduction` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品介绍',
  `activity` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '促销活动',
  `sale` int(10) NULL DEFAULT NULL COMMENT '销售量',
  `reserve` int(10) NULL DEFAULT NULL COMMENT '库存',
  `comment` int(10) NULL DEFAULT NULL COMMENT '评价数',
  `score` int(10) NULL DEFAULT NULL COMMENT '送积分',
  `sort1_id` int(10) NULL DEFAULT NULL COMMENT '一级分类id',
  `sort2_id` int(10) NULL DEFAULT NULL COMMENT '二级分类id',
  `sort3_id` int(10) NULL DEFAULT NULL COMMENT '三级分类id',
  `brand_id` int(10) NULL DEFAULT NULL COMMENT '品牌id',
  `shop_id` int(10) NULL DEFAULT NULL COMMENT '店铺id',
  `status` int(10) NULL DEFAULT NULL COMMENT '审核状态',
  `is_marketable` int(10) NULL DEFAULT NULL COMMENT '是否上架（1：上架，0：下架）',
  PRIMARY KEY (`goods_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 57 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (44, '黑干芝麻1111', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT01z3emiAMNJ1AALM3NAK1Yg923.jpg', '南方黑芝麻糊原味360g/袋营养早餐小包装小袋装包邮南方黑芝饼麻干', 11.00, 11.33, '好吃', '买一送一', 23, 999, 111, 234, NULL, NULL, NULL, 2, 1, 1, NULL);
INSERT INTO `goods` VALUES (45, '这是白板笔', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT01z0aEeAeVjDAAR23HUs-Hc733.jpg', '得力办公用品6893双头油性记号笔勾线笔马克笔一头粗一头细', 11.00, 10.00, '可以用很久', '满一送一', 44, 999, 222, 44, NULL, NULL, NULL, 3, 2, 1, NULL);
INSERT INTO `goods` VALUES (46, '饼', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT01z0aM-AL-yJAAep7Z0FzgI625.jpg', '康师傅3+2苏打夹心饼干375g代餐饼干零食品香草奶油夹心饼干', 11.00, 4.00, '美味', '1折', 33, 999, 222, 33, NULL, NULL, NULL, 4, 2, 1, NULL);
INSERT INTO `goods` VALUES (47, '海绵拖把222', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT01z0aQ-AHiy9AAN-c_UeJsU990.jpg', '宝家洁魔力速洁胶棉拖把头替换装绵头对折式海绵吸水拖把配件', 222.00, 2000.00, '好用', '11', 33, 888, 111, 11, 2, 18, NULL, 5, 2, 1, NULL);
INSERT INTO `goods` VALUES (48, 'Joyoung/九阳', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT01z3et-AJP2QAAHKIm3Waj8118.jpg', 'JYK-17C15电热水壶家用烧水壶器304不锈钢自动断电', 12.00, 8.00, '小麦制作', '满30减5', 22, 999, 22, 22, 8, 75, NULL, 6, 3, 1, NULL);
INSERT INTO `goods` VALUES (49, 'NEW BALANCE', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT01z3KUGAB1ETAAGhG81ZxXo601.jpg', '2018夏季新款男子运动休闲凉拖鞋M3068BK', 49.00, 40.00, '领卷满199-10', '打5折', 22, 88, 22, 111, 3, NULL, NULL, 7, 4, 1, NULL);
INSERT INTO `goods` VALUES (54, '智能电话手表', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT01z3eV2AFYaDAAOKfAfXr5Y699.jpg', '手机wifi多功能安卓插卡防水成人男孩女中小学生儿童上网初中生成年', 599.00, 499.00, '可以聊天，玩游戏', '满400减50', NULL, 999, NULL, NULL, 2, 25, NULL, 6, 5, 1, NULL);
INSERT INTO `goods` VALUES (55, '探路者T恤', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT01z3ey-AI-E3AAKTfQawicU510.jpg', '19春夏新款男式户外透气速干运动圆领短袖TAJH81927', 89.00, 88.00, '9', '9', NULL, 999, NULL, NULL, NULL, NULL, NULL, 5, 6, 1, NULL);
INSERT INTO `goods` VALUES (56, '李宁运动鞋', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT010CA0qAcVzUAAMKIMcTI-M635.jpg', '男板鞋休闲鞋2019春季防滑减震耐磨时尚运动生活跑步男', 499.00, 399.00, '防滑减震耐磨时尚运动生活跑步男', '打一折', NULL, 999, 8, 90, 1, 17, NULL, 2, 2, 0, NULL);

-- ----------------------------
-- Table structure for hot
-- ----------------------------
DROP TABLE IF EXISTS `hot`;
CREATE TABLE `hot`  (
  `hot_sell_id` int(10) NOT NULL COMMENT '热卖商品id',
  `goods_id` int(10) NOT NULL COMMENT '商品id',
  PRIMARY KEY (`hot_sell_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for like
-- ----------------------------
DROP TABLE IF EXISTS `like`;
CREATE TABLE `like`  (
  `like_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '猜你喜欢id',
  `user_id` int(10) NOT NULL COMMENT '用户id',
  `goods_id` int(10) NOT NULL COMMENT '商品id',
  PRIMARY KEY (`like_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of like
-- ----------------------------
INSERT INTO `like` VALUES (1, 1, 1);
INSERT INTO `like` VALUES (2, 1, 2);

-- ----------------------------
-- Table structure for myorder
-- ----------------------------
DROP TABLE IF EXISTS `myorder`;
CREATE TABLE `myorder`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `order_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单名称',
  `user_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名称',
  `order_num` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单号',
  `total_price` double(10, 2) NOT NULL COMMENT '订单金额',
  `total_amount` int(10) NOT NULL COMMENT '商品总数量',
  `introduction` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单介绍',
  `orders_ids` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单id数组',
  `state` int(1) NOT NULL COMMENT '订单状态（0：未支付，1：已支付，2：待发货，3：待收货，4：待评价）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 68 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of myorder
-- ----------------------------
INSERT INTO `myorder` VALUES (50, '白板笔饼', 'admin', '7539074186', 20.00, 2, '可以用很久', '10', 2);
INSERT INTO `myorder` VALUES (51, '海绵拖把', 'admin', '4565515418', 4000.00, 2, '好用', '11', 4);
INSERT INTO `myorder` VALUES (53, '白板笔饼', 'admin', '7130235435', 10.00, 1, '可以用很久', '14,18,19', 4);
INSERT INTO `myorder` VALUES (54, '饼', 'admin', '8692268750', 12.00, 2, '美味', '15, 16', 2);
INSERT INTO `myorder` VALUES (55, '白板笔饼', 'admin', '3393553920', 22.00, 3, '可以用很久', '17, 18, 19', 3);
INSERT INTO `myorder` VALUES (56, '智能电话手表', 'admin', '5145335082', 4990.00, 10, '可以聊天，玩游戏', '20', 3);
INSERT INTO `myorder` VALUES (57, 'Joyoung/九阳', 'admin', '5783012423', 10032.00, 9, '小麦制作', '21, 22', 2);
INSERT INTO `myorder` VALUES (58, '白板笔饼', 'test', '5632449615', 20.00, 2, '可以用很久', '23', 0);
INSERT INTO `myorder` VALUES (59, '白板笔饼', 'hhh', '4602610023', 50.00, 5, '可以用很久', '24', 0);
INSERT INTO `myorder` VALUES (60, '饼', 'hhh', '4549858317', 4.00, 1, '美味', '25', 4);
INSERT INTO `myorder` VALUES (64, '白板笔饼', 'admin', '5629008134', 20.00, 2, '可以用很久', '28', 0);
INSERT INTO `myorder` VALUES (65, '这是白板笔', 'admin', '8947039764', 10.00, 1, '可以用很久', '29', 2);
INSERT INTO `myorder` VALUES (66, '饼', 'admin', '9147147110', 12.00, 2, '美味', '30, 31', 2);
INSERT INTO `myorder` VALUES (67, '海绵拖把222', 'admin', '7439677456', 12000.00, 6, '好用', '32', 0);

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `order_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `user_id` int(10) NOT NULL COMMENT '用户id',
  `goods_id` int(10) NOT NULL COMMENT '商品id',
  `amount` int(10) NOT NULL COMMENT '数量',
  `state` int(1) NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (10, 144, 45, 2, 1);
INSERT INTO `orders` VALUES (11, 144, 47, 2, 1);
INSERT INTO `orders` VALUES (14, 144, 45, 1, 1);
INSERT INTO `orders` VALUES (15, 144, 46, 1, 1);
INSERT INTO `orders` VALUES (16, 144, 48, 1, 1);
INSERT INTO `orders` VALUES (17, 144, 45, 1, 1);
INSERT INTO `orders` VALUES (18, 144, 46, 1, 1);
INSERT INTO `orders` VALUES (19, 144, 48, 1, 1);
INSERT INTO `orders` VALUES (20, 144, 54, 10, 1);
INSERT INTO `orders` VALUES (21, 144, 48, 4, 1);
INSERT INTO `orders` VALUES (22, 144, 47, 5, 1);
INSERT INTO `orders` VALUES (23, 145, 45, 2, 1);
INSERT INTO `orders` VALUES (24, 146, 45, 5, 1);
INSERT INTO `orders` VALUES (25, 146, 46, 1, 1);
INSERT INTO `orders` VALUES (26, 146, 44, 2, 1);
INSERT INTO `orders` VALUES (27, 144, 45, 1, 1);
INSERT INTO `orders` VALUES (28, 144, 45, 2, 1);
INSERT INTO `orders` VALUES (29, 144, 45, 1, 1);
INSERT INTO `orders` VALUES (30, 144, 46, 1, 1);
INSERT INTO `orders` VALUES (31, 144, 48, 1, 1);
INSERT INTO `orders` VALUES (32, 144, 47, 6, 1);

-- ----------------------------
-- Table structure for reply
-- ----------------------------
DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply`  (
  `reply` int(10) NOT NULL COMMENT '回复消息id',
  `seller_id` int(10) NOT NULL COMMENT '商家id',
  `user_id` int(10) NOT NULL COMMENT '用户id',
  `content` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '回复内容',
  `time` datetime NOT NULL COMMENT '回复时间',
  PRIMARY KEY (`reply`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for seckill
-- ----------------------------
DROP TABLE IF EXISTS `seckill`;
CREATE TABLE `seckill`  (
  `seckill_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '秒杀商品id',
  `goods_id` int(10) NULL DEFAULT NULL COMMENT '商品id',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品图片',
  `caption` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '副标题',
  `price_before` double(10, 2) NULL DEFAULT NULL COMMENT '秒杀前价格',
  `price_after` double(10, 2) NULL DEFAULT NULL COMMENT '秒杀后价格',
  `introduction` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品介绍',
  `start_time` datetime NULL DEFAULT NULL COMMENT '开始时间',
  `end_time` datetime NULL DEFAULT NULL COMMENT '结束时间',
  `amount` int(10) NULL DEFAULT NULL COMMENT '秒杀商品数',
  `reserve` int(10) NULL DEFAULT NULL COMMENT '剩余库存数',
  `shop_id` int(10) NULL DEFAULT NULL COMMENT '店铺id',
  `status` int(1) NULL DEFAULT NULL COMMENT '审核状态',
  PRIMARY KEY (`seckill_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of seckill
-- ----------------------------
INSERT INTO `seckill` VALUES (1, 46, '手机1', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT01z0aQ-AHiy9AAN-c_UeJsU990.jpg', '南方黑芝麻糊原味360g/袋营养早餐小包装小袋装包邮南方黑芝饼麻干', 13.00, 15.00, NULL, '2019-06-14 09:28:39', '2019-06-27 20:32:44', 12, 33, NULL, 1);
INSERT INTO `seckill` VALUES (2, 48, '2电脑', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT01z3KUGAB1ETAAGhG81ZxXo601.jpg', '得力办公用品6893双头油性记号笔勾线笔马克笔一头粗一头细', 4999.00, 2344.00, NULL, '2019-06-08 09:29:17', '2019-06-25 15:29:21', 34, 7, NULL, 1);
INSERT INTO `seckill` VALUES (3, 49, '笔记本3', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT010CA0qAcVzUAAMKIMcTI-M635.jpg', '	JYK-17C15电热水壶家用烧水壶器304不锈钢自动断电1111111111111111', 12.00, 2.00, NULL, '2019-06-13 09:37:23', '2019-06-24 22:59:33', 22, 10, NULL, 1);
INSERT INTO `seckill` VALUES (4, 23, '矿泉水4', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT01z3emiAMNJ1AALM3NAK1Yg923.jpg', '2018夏季新款男子运动休闲凉拖鞋M3068BK', 222.00, 22.00, NULL, '2019-06-15 09:37:52', '2019-06-20 09:37:58', 33, 33, NULL, 0);
INSERT INTO `seckill` VALUES (5, NULL, '鼠标5', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT010CA0qAcVzUAAMKIMcTI-M635.jpg', '手机wifi多功能安卓插卡防水成人男孩女中小学生儿童上网初中生成年', 22.00, 3.00, NULL, '2019-06-12 09:38:16', '2019-06-17 09:38:20', 4, 2, NULL, 0);
INSERT INTO `seckill` VALUES (6, NULL, '键盘', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT010CA0qAcVzUAAMKIMcTI-M635.jpg', '得力办公用品6893双头油性记号笔勾线笔马克笔一头粗一头细', 100.00, 45.00, NULL, '2019-06-11 10:25:46', '2019-06-20 10:25:49', 10, 2, NULL, 0);
INSERT INTO `seckill` VALUES (7, NULL, '水杯', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT010CA0qAcVzUAAMKIMcTI-M635.jpg', '2018夏季新款男子运动休闲凉拖鞋M3068BK', 1111.00, 222.00, NULL, '2019-06-05 14:51:38', '2019-06-22 14:51:42', 111, 23, NULL, 0);
INSERT INTO `seckill` VALUES (8, NULL, '电视', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT01z3KUGAB1ETAAGhG81ZxXo601.jpg', '手机wifi多功能安卓插卡防水成人男孩女中小学生儿童上网初中生成年', 4999.00, 1999.00, NULL, '2019-06-15 14:52:20', '2019-06-30 14:52:23', 22, 1, NULL, 0);
INSERT INTO `seckill` VALUES (9, NULL, '眼镜', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT010CA0qAcVzUAAMKIMcTI-M635.jpg', '南方黑芝麻糊原味360g/袋营养早餐小包装小袋装包邮南方黑芝饼麻干', 444.00, 111.00, NULL, '2019-06-05 14:52:52', '2019-06-28 14:52:55', 44, 34, NULL, 0);

-- ----------------------------
-- Table structure for seller
-- ----------------------------
DROP TABLE IF EXISTS `seller`;
CREATE TABLE `seller`  (
  `seller_id` int(10) NOT NULL COMMENT '商家id',
  `seller_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商家名',
  `user_id` int(10) NOT NULL COMMENT '用户id',
  `income` double(10, 2) NOT NULL COMMENT '收入',
  `shop_ids` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理的店铺',
  PRIMARY KEY (`seller_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of seller
-- ----------------------------
INSERT INTO `seller` VALUES (1, 'Jack', 144, 6.00, '5');
INSERT INTO `seller` VALUES (2, 'Tom', 145, 3.00, '3');

-- ----------------------------
-- Table structure for shop
-- ----------------------------
DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop`  (
  `shop_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '店铺id',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '店铺名',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '店铺图标',
  `description` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '店铺描述',
  `amount` int(10) NOT NULL COMMENT '商品数量',
  `income` double(10, 2) NOT NULL COMMENT '店铺总营业额',
  PRIMARY KEY (`shop_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of shop
-- ----------------------------
INSERT INTO `shop` VALUES (2, '三只松鼠旗舰店', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT010CMpaAZ6fnAAThMAFVKuE729.jpg', '三只松鼠2', 12, 7800.00);
INSERT INTO `shop` VALUES (3, '华为旗舰店', 'https://img.alicdn.com/bao/uploaded//i1/619123122/O1CN011YvuzJWPCJpIVE2_!!619123122.png_50x50.jpg', '这是华为旗舰店', 6, 2879.67);
INSERT INTO `shop` VALUES (5, '良品铺子旗舰店', 'http://47.112.8.164:9999/group1/M00/00/01/rBLT010CMryAEuMdAAYP56lne_4309.png', '松果，面板，饼干', 10, 34.89);

-- ----------------------------
-- Table structure for sort
-- ----------------------------
DROP TABLE IF EXISTS `sort`;
CREATE TABLE `sort`  (
  `sort_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '分类id',
  `parent_id` int(10) NOT NULL COMMENT '父id',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '分类名称',
  PRIMARY KEY (`sort_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 182 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sort
-- ----------------------------
INSERT INTO `sort` VALUES (1, 0, '女装/内衣');
INSERT INTO `sort` VALUES (2, 0, '男装/户外运动');
INSERT INTO `sort` VALUES (3, 0, '女鞋/男鞋/箱包');
INSERT INTO `sort` VALUES (4, 0, '美妆/个人护理');
INSERT INTO `sort` VALUES (5, 0, '腕表/眼镜/珠宝饰品');
INSERT INTO `sort` VALUES (6, 0, '手机/数码/电脑办公');
INSERT INTO `sort` VALUES (7, 0, '母婴玩具');
INSERT INTO `sort` VALUES (8, 0, '零食/茶酒/进口食品');
INSERT INTO `sort` VALUES (9, 0, '生鲜水果');
INSERT INTO `sort` VALUES (10, 0, '大家电/生活电器');
INSERT INTO `sort` VALUES (11, 0, '家具建材');
INSERT INTO `sort` VALUES (12, 0, '汽车/配件/用品');
INSERT INTO `sort` VALUES (13, 0, '家纺/家饰/鲜花');
INSERT INTO `sort` VALUES (14, 0, '医药保健');
INSERT INTO `sort` VALUES (15, 0, '厨具/收纳/宠物');
INSERT INTO `sort` VALUES (16, 0, '图书音像');
INSERT INTO `sort` VALUES (17, 1, '当季流行');
INSERT INTO `sort` VALUES (18, 1, '精选上装');
INSERT INTO `sort` VALUES (19, 1, '浪漫裙装');
INSERT INTO `sort` VALUES (20, 1, '女士下装');
INSERT INTO `sort` VALUES (21, 1, '特色女装');
INSERT INTO `sort` VALUES (22, 1, '文胸塑身');
INSERT INTO `sort` VALUES (23, 1, '家居服');
INSERT INTO `sort` VALUES (24, 1, '内裤背心');
INSERT INTO `sort` VALUES (25, 2, '当季流行');
INSERT INTO `sort` VALUES (26, 2, '男士外套');
INSERT INTO `sort` VALUES (27, 2, '男士内搭');
INSERT INTO `sort` VALUES (28, 2, '男士裤装');
INSERT INTO `sort` VALUES (29, 2, '特色男装');
INSERT INTO `sort` VALUES (30, 2, '运动鞋');
INSERT INTO `sort` VALUES (31, 2, '运动服');
INSERT INTO `sort` VALUES (32, 2, '户外鞋服');
INSERT INTO `sort` VALUES (33, 3, '推荐女鞋');
INSERT INTO `sort` VALUES (34, 3, '潮流男鞋');
INSERT INTO `sort` VALUES (35, 3, '女单鞋');
INSERT INTO `sort` VALUES (36, 3, '特色鞋');
INSERT INTO `sort` VALUES (37, 3, '潮流女包');
INSERT INTO `sort` VALUES (38, 3, '精品男包');
INSERT INTO `sort` VALUES (39, 3, '功能箱包');
INSERT INTO `sort` VALUES (40, 4, '护肤品');
INSERT INTO `sort` VALUES (41, 4, '彩妆');
INSERT INTO `sort` VALUES (42, 4, '男士护肤');
INSERT INTO `sort` VALUES (43, 4, '肤质推选');
INSERT INTO `sort` VALUES (44, 4, '美发护发');
INSERT INTO `sort` VALUES (45, 4, '口腔护理');
INSERT INTO `sort` VALUES (46, 4, '身体女性');
INSERT INTO `sort` VALUES (47, 5, '黄金首饰');
INSERT INTO `sort` VALUES (48, 5, '钻石彩包');
INSERT INTO `sort` VALUES (49, 5, '珍珠翡翠');
INSERT INTO `sort` VALUES (50, 5, '潮流饰品');
INSERT INTO `sort` VALUES (51, 5, '腕表');
INSERT INTO `sort` VALUES (52, 5, '眼镜');
INSERT INTO `sort` VALUES (53, 5, '烟具');
INSERT INTO `sort` VALUES (54, 6, '热门手机');
INSERT INTO `sort` VALUES (55, 6, '特色手机');
INSERT INTO `sort` VALUES (56, 6, '手机特惠');
INSERT INTO `sort` VALUES (57, 6, '电脑整机');
INSERT INTO `sort` VALUES (58, 6, '智能数码');
INSERT INTO `sort` VALUES (59, 6, '游戏组装');
INSERT INTO `sort` VALUES (60, 6, '硬件存储');
INSERT INTO `sort` VALUES (61, 6, '摄影摄像');
INSERT INTO `sort` VALUES (62, 6, '影音娱乐');
INSERT INTO `sort` VALUES (63, 6, '办公文教');
INSERT INTO `sort` VALUES (64, 6, '数码配件');
INSERT INTO `sort` VALUES (65, 7, '童装');
INSERT INTO `sort` VALUES (66, 7, '婴儿服');
INSERT INTO `sort` VALUES (67, 7, '童鞋');
INSERT INTO `sort` VALUES (68, 7, '车床用品');
INSERT INTO `sort` VALUES (69, 7, '喂养');
INSERT INTO `sort` VALUES (70, 7, '洗护');
INSERT INTO `sort` VALUES (71, 7, '玩具');
INSERT INTO `sort` VALUES (72, 7, '天猫动漫');
INSERT INTO `sort` VALUES (73, 7, '奶粉');
INSERT INTO `sort` VALUES (74, 7, '纸尿裤');
INSERT INTO `sort` VALUES (75, 8, '进口食品');
INSERT INTO `sort` VALUES (76, 8, '休闲零食');
INSERT INTO `sort` VALUES (77, 8, '酒类');
INSERT INTO `sort` VALUES (78, 8, '茶叶');
INSERT INTO `sort` VALUES (79, 8, '乳品冲饮');
INSERT INTO `sort` VALUES (80, 8, '粮油速食');
INSERT INTO `sort` VALUES (81, 8, '生鲜水果');
INSERT INTO `sort` VALUES (82, 9, '新鲜蔬菜');
INSERT INTO `sort` VALUES (83, 9, '冰激凌');
INSERT INTO `sort` VALUES (84, 9, '蛋类');
INSERT INTO `sort` VALUES (85, 9, '肉类');
INSERT INTO `sort` VALUES (86, 9, '海鲜水产');
INSERT INTO `sort` VALUES (87, 9, '新鲜水果');
INSERT INTO `sort` VALUES (88, 9, '精选干货');
INSERT INTO `sort` VALUES (89, 10, '平板电视');
INSERT INTO `sort` VALUES (90, 10, '空调');
INSERT INTO `sort` VALUES (91, 10, '冰箱');
INSERT INTO `sort` VALUES (92, 10, '洗衣机');
INSERT INTO `sort` VALUES (93, 10, '厨房大电');
INSERT INTO `sort` VALUES (94, 10, '热水器');
INSERT INTO `sort` VALUES (95, 10, '中式厨房');
INSERT INTO `sort` VALUES (96, 10, '西式厨房');
INSERT INTO `sort` VALUES (97, 10, '生活电器');
INSERT INTO `sort` VALUES (98, 10, '个护健康');
INSERT INTO `sort` VALUES (99, 10, '精品推荐');
INSERT INTO `sort` VALUES (100, 11, '成套家具');
INSERT INTO `sort` VALUES (101, 11, '客厅餐厅');
INSERT INTO `sort` VALUES (102, 11, '卧室家具');
INSERT INTO `sort` VALUES (103, 11, '书房儿童');
INSERT INTO `sort` VALUES (104, 11, '家装主材');
INSERT INTO `sort` VALUES (105, 11, '厨房卫浴');
INSERT INTO `sort` VALUES (106, 11, '灯饰照明');
INSERT INTO `sort` VALUES (107, 11, '五金工具');
INSERT INTO `sort` VALUES (108, 11, '全屋定制');
INSERT INTO `sort` VALUES (109, 11, '装修设计');
INSERT INTO `sort` VALUES (110, 12, '整车');
INSERT INTO `sort` VALUES (111, 12, '床垫脚垫');
INSERT INTO `sort` VALUES (112, 12, '机油轮胎');
INSERT INTO `sort` VALUES (113, 12, '电子导航');
INSERT INTO `sort` VALUES (114, 12, '车载电器');
INSERT INTO `sort` VALUES (115, 12, '维修保养');
INSERT INTO `sort` VALUES (116, 12, '美容清洗');
INSERT INTO `sort` VALUES (117, 12, '汽车装饰');
INSERT INTO `sort` VALUES (118, 12, '安全自驾');
INSERT INTO `sort` VALUES (119, 12, '外饰改装');
INSERT INTO `sort` VALUES (120, 12, '汽车服务');
INSERT INTO `sort` VALUES (121, 13, '当季热卖');
INSERT INTO `sort` VALUES (122, 13, '床上用品');
INSERT INTO `sort` VALUES (123, 13, '居家布艺');
INSERT INTO `sort` VALUES (124, 13, '家居饰品');
INSERT INTO `sort` VALUES (125, 13, '鲜花绿植');
INSERT INTO `sort` VALUES (126, 14, '保健品');
INSERT INTO `sort` VALUES (127, 14, '滋补品');
INSERT INTO `sort` VALUES (128, 14, '医药');
INSERT INTO `sort` VALUES (129, 14, '医疗器械');
INSERT INTO `sort` VALUES (130, 14, '隐形眼镜');
INSERT INTO `sort` VALUES (131, 14, '医疗服务');
INSERT INTO `sort` VALUES (132, 15, '厨房烹饪');
INSERT INTO `sort` VALUES (133, 15, '餐饮具');
INSERT INTO `sort` VALUES (134, 15, '居家礼品');
INSERT INTO `sort` VALUES (135, 15, '收纳清洁');
INSERT INTO `sort` VALUES (136, 15, '纸品清洁');
INSERT INTO `sort` VALUES (137, 15, '宠物用品');
INSERT INTO `sort` VALUES (138, 16, '儿童读物');
INSERT INTO `sort` VALUES (139, 16, '畅销小说');
INSERT INTO `sort` VALUES (140, 16, '文学文艺');
INSERT INTO `sort` VALUES (141, 16, '社科生活');
INSERT INTO `sort` VALUES (142, 16, '育儿百科');
INSERT INTO `sort` VALUES (143, 16, '学习考试');
INSERT INTO `sort` VALUES (144, 16, '教材教辅');
INSERT INTO `sort` VALUES (145, 16, '经管励志');
INSERT INTO `sort` VALUES (146, 16, '期刊杂志');
INSERT INTO `sort` VALUES (147, 16, '进口原版');
INSERT INTO `sort` VALUES (148, 16, '大牌器具');
INSERT INTO `sort` VALUES (151, 17, '女装新品');
INSERT INTO `sort` VALUES (152, 17, '商场同款');
INSERT INTO `sort` VALUES (153, 17, '仙女连衣裙');
INSERT INTO `sort` VALUES (154, 18, '毛呢外套');
INSERT INTO `sort` VALUES (155, 18, '羽绒服');
INSERT INTO `sort` VALUES (156, 18, '棉服');
INSERT INTO `sort` VALUES (157, 19, '连衣裙');
INSERT INTO `sort` VALUES (158, 19, '半身裙');
INSERT INTO `sort` VALUES (159, 19, 'A字裙');
INSERT INTO `sort` VALUES (160, 20, '1');
INSERT INTO `sort` VALUES (161, 20, '2');
INSERT INTO `sort` VALUES (162, 20, '3');
INSERT INTO `sort` VALUES (164, 17, 'T恤');
INSERT INTO `sort` VALUES (165, 17, '衬衫');
INSERT INTO `sort` VALUES (166, 17, '时髦外套');
INSERT INTO `sort` VALUES (167, 17, '休闲裤');
INSERT INTO `sort` VALUES (171, 17, '牛仔裤');
INSERT INTO `sort` VALUES (172, 25, '当季流行');
INSERT INTO `sort` VALUES (173, 25, '商场同款');
INSERT INTO `sort` VALUES (174, 25, '印花T恤');
INSERT INTO `sort` VALUES (175, 25, '潮流卫衣');
INSERT INTO `sort` VALUES (176, 25, '牛仔衬衫');
INSERT INTO `sort` VALUES (177, 25, '修身夹克');
INSERT INTO `sort` VALUES (178, 25, '保暖棉服');
INSERT INTO `sort` VALUES (179, 18, '丝绒卫衣');
INSERT INTO `sort` VALUES (180, 19, '荷叶边裙');
INSERT INTO `sort` VALUES (181, 19, '大摆裙');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `user_pass` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户真实姓名',
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '电话号码',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `created` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `updated` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `year` int(10) NULL DEFAULT NULL COMMENT '年',
  `day` int(10) NULL DEFAULT NULL COMMENT '日',
  `month` int(10) NULL DEFAULT NULL COMMENT '月',
  `sex` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别（‘M’：男，‘F’：女）',
  `status` int(1) NULL DEFAULT NULL COMMENT '账户的状态（0：冻结，1解封）',
  `integral` int(10) NULL DEFAULT NULL COMMENT '积分',
  `image` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户头像',
  `is_phone_check` int(1) NULL DEFAULT NULL COMMENT '是否手机已经验证（0：未验证，1已验证）',
  `is_email_check` int(1) NULL DEFAULT NULL COMMENT '是否邮箱已经验证（0：未验证，1已验证）',
  `phone_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机短信验证码',
  `address_id` int(10) NULL DEFAULT NULL COMMENT '地址id',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 148 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (144, 'admin', 'admin', NULL, '17343698034', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '910725', NULL);
INSERT INTO `user` VALUES (145, 'user01', '123456', NULL, '17343698034', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '405135', NULL);
INSERT INTO `user` VALUES (146, 'user02', '123456', NULL, '17343698034', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (147, 'user03', '123456', NULL, '17343698034', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
