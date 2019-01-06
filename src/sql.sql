
USE ssm;
CREATE TABLE flower(
id int(10) PRIMARY KEY auto_increment COMMENT '编号',
name VARCHAR(30) NOT NULL COMMENT '花名',
price FLOAT not NULL COMMENT '价格',
production VARCHAR(30) NOT NULL COMMENT '原产地'
);

INSERT INTO flower VALUES(DEFAULT,'矮牵牛',2.5,'南美阿根廷');
INSERT INTO flower VALUES(DEFAULT,'百日草',5.0,'墨西哥');
INSERT INTO flower VALUES(DEFAULT,'半支莲',4.3,'巴西');