# Envibe
[![Build Status](https://travis-ci.org/Nvibe/Envibe.svg?branch=master)](https://travis-ci.org/Nvibe/Envibe)

## Environment Info
*For minimal issues, try to get your dev environment as close as possible to this list*
- Ubuntu 18.04 Bionic (64-bit)
- PostgreSQL 12.2
- Oracle Java 1.8.0 build 251
- Maven 3

## Environment Variables
*Project may crash without these defined*
- `JDBC_DATABASE_URL` Defines the PostgreSQL username, password, URI, and database to use.

## Basic Commands
- `mvnw spring-boot:run` Runs server locally.
- `mvnw clean package` Builds JAR file, rarely needed.
- `mvnw flyway:migrate` Updates the schema of your local PostgreSQL database.
- `mvnw test` Runs unit test suite (Requires JUnit).

## Project Links
- [Build logs](https://travis-ci.org/Nvibe/Envibe)
- [Live website](https://envibe.herokuapp.com/)

## Helpful Links
- [Getting Started With Spring Framework](https://spring.io/guides/gs/serving-web-content/)
- [Getting Started With Flyway Database Migrations](https://flywaydb.org/getstarted/firststeps/maven)
- [Setting up PostgreSQL (Windows 8+)](https://www.guru99.com/download-install-postgresql.html)
- [PostgreSQL Downloads](https://www.postgresql.org/download/windows/)

