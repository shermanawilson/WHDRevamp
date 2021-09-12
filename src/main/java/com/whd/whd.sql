CREATE DATABASE IF NOT EXISTS whd_db;
DROP USER 'shy'@'localhost';
CREATE USER shy@localhost IDENTIFIED BY 'pass0324';

GRANT ALL ON whd_db.* TO shy@localhost;