-- Script courtesy of https://www.roytuts.com/spring-boot-security-form-based-jdbc-authentication-using-userdetailsservice/

-- Creates a table to store all registered user with their hashed password.
CREATE TABLE user (
    user_name varchar(255) NOT NULL PRIMARY KEY,
    user_password varchar(255) NOT NULL,
    user_email varchar(255) NOT NULL
);

-- Creates a table of roles, describing the privileges of the authenticated user.
CREATE TABLE user_role (
    user_name varchar(255) NOT NULL,
    user_role varchar(15) NOT NULL,
    FOREIGN KEY (user_name) REFERENCES user (user_name)
);