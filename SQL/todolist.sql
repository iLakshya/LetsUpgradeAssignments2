CREATE DATABASE TodoList;

USE TodoList;

CREATE TABLE Tasks (
  task_id INT PRIMARY KEY,
  task_name VARCHAR(255),
  description VARCHAR(255),
  is_completed BOOLEAN
);