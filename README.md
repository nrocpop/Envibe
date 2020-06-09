# Envibe
[![Build Status](https://travis-ci.org/Nvibe/Envibe.svg?branch=master)](https://travis-ci.org/Nvibe/Envibe)

## Environment Info
*For minimal issues, try to get your dev environment as close as possible to this list*
- Ubuntu 18.04 Bionic (64-bit)
- PostgreSQL 12.2
- OpenJDK Java 1.8.0 build 251
- Maven 3

## Environment Variables
*Project may crash without these defined*
- `JDBC_DATABASE_URL` Defines the PostgreSQL username, password, URI, and database to use.

## Basic Commands
- `mvnw spring-boot:run` Runs server locally.
- `mvnw clean package` Builds JAR file, rarely needed.
- `mvnw flyway:migrate` Updates the schema of your local PostgreSQL database.
- `mvnw test` Runs unit test suite (Requires JUnit).

## How To Update Database
This project uses Flyway to manage database schemas. To change how the database is set up, create a migration.
1. Go to `/src/main/resources/db/migration`
2. Create a SQL file with the format `VX__Useful_Name_Here.sql`. Note that the filename MUST start with a capital `V`, followed by a number higher than any of the other files in the `/migration` folder(e.g. V1, V2, V3...). After `VX`, there should be TWO underscores(`__`).
3. Insert your SQL code into the file you just created.
4. Ensure that the environment variable `JDBC_DATABASE_URL` is defined and is a valid JDBC URI to a running instance of PostgreSQL.
5. From the project root, run `./mvnw flyway:migrate`. The database schema will be updated automatically.

## Project Links
- [Build logs](https://travis-ci.org/Nvibe/Envibe)
- [Live website](https://envibe.herokuapp.com/)

## Helpful Links
- [Getting Started With Spring Framework](https://spring.io/guides/gs/serving-web-content/)
- [Getting Started With Flyway Database Migrations](https://flywaydb.org/getstarted/firststeps/maven)
- [Setting up PostgreSQL (Windows 8+)](https://www.guru99.com/download-install-postgresql.html)
- [PostgreSQL Downloads](https://www.postgresql.org/download/windows/)

