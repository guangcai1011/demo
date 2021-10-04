CREATE TABLE IF NOT EXISTS `first_tbl`(
    `first_id` INT UNSIGNED AUTO_INCREMENT,
    `first_title` VARCHAR(100) NOT NULL,
    `first_author` VARCHAR(40) NOT NULL,
    `submission_date` DATE,
    PRIMARY KEY ( `first_id` )
    )ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `user`(
      `id` INT UNSIGNED AUTO_INCREMENT,
      `user_id` varchar(20),
      PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `user`(user_id) VALUES ("user_id_001");