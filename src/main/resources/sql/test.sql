create table TEST_BOOLEAN
(
    id    INT auto_increment primary key,
    value BOOLEAN
) comment 'Test Boolean';


CREATE TABLE TEST_ENUM
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50)                      NOT NULL,
    gender   ENUM ('Male', 'Female', 'Other') NOT NULL
);

INSERT INTO TEST_ENUM (username, gender)
VALUES ('Alice', 'Female');
INSERT INTO TEST_ENUM (username, gender)
VALUES ('Bob', 'Male');
INSERT INTO TEST_ENUM (username, gender)
VALUES ('Charlie', 'Other');

select *
from TEST_ENUM
;


CREATE TABLE TEST_SET
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    hobbies  SET ('Reading', 'Sports', 'Music', 'Cooking')
);

INSERT INTO TEST_SET (username, hobbies) VALUES ('Alice', 'Reading,Sports');
INSERT INTO TEST_SET (username, hobbies) VALUES ('Bob', 'Music,Cooking');
INSERT INTO TEST_SET (username, hobbies) VALUES ('Charlie', 'Sports,Cooking');

select *
from TEST_SET;

