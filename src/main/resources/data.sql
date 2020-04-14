DROP TABLE IF EXISTS student;

CREATE TABLE student (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  year VARCHAR(250) NOT NULL
);

INSERT INTO student (first_name, last_name, year) VALUES
  ('Aliko', 'Dangote', 'First'),
  ('Bill', 'Gates', 'Second'),
  ('Folrunsho', 'Alakija', 'Third')