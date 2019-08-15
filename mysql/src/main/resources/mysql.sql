#查看当前mysql的版本号及当前时间
SELECT VERSION(), CURRENT_DATE;

#简单的计算
SELECT SIN(PI()/4), (4+1)*5;

#
SELECT NOW();

CREATE DATABASE mysqlxuexi;

USE mysqlxuexi;

CREATE TABLE pet
(
    name    VARCHAR(20),
    owner   VARCHAR(20),
    species VARCHAR(20),
    sex     CHAR(1),
    birth   DATE,
    death   DATE
);

#通过加载文件的方式将数据导入到表中 创建一个table_pet.txt的文件（注：每个字段中用tab键隔开，字段没有值得记录用\N代替）
load data local infile '/root/data/pet.txt' into table pet;

#以上报错
show variables like 'local_infile';
set global local_infile=ON;
#mysql --local-infile -uroot -p123456 登录然后执行以上语句(需要加参数--local-infile)#不好用啊？？

select *from pet;

CREATE TABLE shop
(
    article INT(4) UNSIGNED ZEROFILL DEFAULT '0000' NOT NULL,
    dealer  CHAR(20)                 DEFAULT ''     NOT NULL,
    price   DOUBLE(16, 2)            DEFAULT '0.00' NOT NULL,
    PRIMARY KEY (article, dealer)
);

INSERT INTO shop
VALUES (1, 'A', 3.45),
       (1, 'B', 3.99),
       (2, 'A', 10.99),
       (3, 'B', 1.45),
       (3, 'C', 1.69),
       (3, 'D', 1.25),
       (4, 'D', 19.95);

# 取最大值 自连接方式
SELECT s1.article, s1.dealer, s1.price,s2.*
FROM shop s1
         LEFT JOIN shop s2 ON s1.price < s2.price
WHERE s2.article IS NULL;

#获取当年的年
select YEAR(birth) AS YEARS from pet;
#获取当年的月
select month(birth) AS month from pet;
#获取当年的日
select day(birth) AS YEARS from pet;
#计算 TIMESTAMPDIFF()
SELECT name, birth, CURDATE(), TIMESTAMPDIFF(YEAR,birth,CURDATE()) AS age FROM pet;
#检查长度
select LENGTH(dealer) from shop;




