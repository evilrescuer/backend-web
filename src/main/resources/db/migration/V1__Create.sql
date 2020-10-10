CREATE DATABASE `supermarket`; /*!40100 DEFAULT CHARACTER SET utf8 */

use supermarket;

# 在supermarket中建表
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `price` double unsigned NOT NULL DEFAULT '0',
  `name` varchar(255) DEFAULT NULL,
  category_id int(11) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
    `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
    `name` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

alter table `item`
add constraint `category_id` foreign key (`category_id`)
references category(`id`);

INSERT INTO category
(`name`)
VALUES ("主食");

INSERT INTO category
(name)
VALUES ("小吃");

INSERT INTO category
(name)
VALUES ("饮料");

INSERT INTO item
(price, name, category_id)
VALUES (15, "蔬菜面", 1);

INSERT INTO item
(price, name, category_id)
VALUES (17, "牛肉面", 1);

INSERT INTO item
(price, name, category_id)
VALUES (19, "海鲜面", 1);

INSERT INTO item
(price, name, category_id)
VALUES (6, "烤扇贝", 2);

DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
    `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
    `name` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
DROP TABLE IF EXISTS `cart_item`;
CREATE TABLE `cart_item` (
    `cart_id` int(11) unsigned NOT NULL,
    `item_id` int(11) unsigned NOT NULL,
    PRIMARY KEY (`item_id`, `cart_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

insert into cart (name) values ('购物车1');
insert into cart_item (cart_id, item_id) values (1, 3);
insert into cart_item (cart_id, item_id) values (1, 4);


