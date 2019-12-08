DROP TABLE IF EXISTS phones;

CREATE TABLE phones (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  number VARCHAR(250) NOT NULL,
  city_code VARCHAR(250) NOT NULL,
  country_code VARCHAR(250) NOT NULL,
  user_id INT,
  created TIMESTAMP,
  modified TIMESTAMP,
  is_active BOOLEAN
);

DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL,
  created TIMESTAMP,
  modified TIMESTAMP,
  last_login TIMESTAMP,
  token VARCHAR(255),
  is_active BOOLEAN
);

DROP INDEX IF EXISTS UNIQUE_USER_EMAIL;
CREATE UNIQUE INDEX UNIQUE_USER_EMAIL
ON users (email);