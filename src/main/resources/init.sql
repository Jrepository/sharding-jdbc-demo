-- 数据库1
create
DATABASE order_db_1;
use
order_db_1;
-- 订单表1
DROP TABLE IF EXISTS `orders_1`;
CREATE TABLE `orders_1`
(
    `id`               bigint(20) NOT NULL AUTO_INCREMENT,
    `user_id`          int(11) DEFAULT NULL,
    `product_id`       int(11) DEFAULT NULL,
    `pay_amount`       decimal(10, 0) DEFAULT NULL,
    `add_time`         datetime       DEFAULT CURRENT_TIMESTAMP,
    `last_update_time` datetime       DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 订单表2
DROP TABLE IF EXISTS `orders_2`;
CREATE TABLE `orders_2`
(
    `id`               bigint(20) NOT NULL AUTO_INCREMENT,
    `user_id`          int(11) DEFAULT NULL,
    `product_id`       int(11) DEFAULT NULL,
    `pay_amount`       decimal(10, 0) DEFAULT NULL,
    `add_time`         datetime       DEFAULT CURRENT_TIMESTAMP,
    `last_update_time` datetime       DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 数据库2
create
DATABASE order_db_2;
use
order_db_2;
-- 订单表1
DROP TABLE IF EXISTS `orders_1`;
CREATE TABLE `orders_1`
(
    `id`               bigint(20) NOT NULL AUTO_INCREMENT,
    `user_id`          int(11) DEFAULT NULL,
    `product_id`       int(11) DEFAULT NULL,
    `pay_amount`       decimal(10, 0) DEFAULT NULL,
    `add_time`         datetime       DEFAULT CURRENT_TIMESTAMP,
    `last_update_time` datetime       DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 订单表2
DROP TABLE IF EXISTS `orders_2`;
CREATE TABLE `orders_2`
(
    `id`               bigint(20) NOT NULL AUTO_INCREMENT,
    `user_id`          int(11) DEFAULT NULL,
    `product_id`       int(11) DEFAULT NULL,
    `pay_amount`       decimal(10, 0) DEFAULT NULL,
    `add_time`         datetime       DEFAULT CURRENT_TIMESTAMP,
    `last_update_time` datetime       DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
