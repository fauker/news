DROP TABLE IF EXISTS news_user;
CREATE TABLE news_user
(
	id bigint NOT NULL,
	datecreated timestamp,
	dateupdated timestamp, 
	username varchar(255) NOT NULL,
	password varchar(100) NOT NULL,
	role varchar(15) NOT NULL,
	enable boolean NOT NULL,
	CONSTRAINT user_pkey PRIMARY KEY (id)
);


DROP TABLE IF EXISTS news;
CREATE TABLE news 
(
	id bigint NOT NULL AUTO_INCREMENT,
	datecreated timestamp,
	dateupdated timestamp,
	title varchar(255) NOT NULL,
	description varchar(1000) NOT NULL,
	author varchar(100) NOT NULL,
	CONSTRAINT news_pkey PRIMARY KEY (id)
);

DROP TABLE IF EXISTS comment;
CREATE TABLE comment 
(
	id bigint NOT NULL AUTO_INCREMENT,
	datecreated timestamp,
	dateupdated timestamp,	
	content varchar(255) NOT NULL,
	news_id bigint, 
	CONSTRAINT comment_pkey PRIMARY KEY (id),
	CONSTRAINT comment_news_fk FOREIGN KEY (news_id) REFERENCES news (id)
);

INSERT INTO news_user (id, datecreated, dateupdated, username, password, role, enable) VALUES
(1, '2015-02-24', null, 'admin', '123456', 'ROLE_USER', true);