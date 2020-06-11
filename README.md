# Envibe
[![Build Status](https://travis-ci.org/Nvibe/Envibe.svg?branch=master)](https://travis-ci.org/Nvibe/Envibe)

## How To Contribute
The `master` branch is protected. This means that you cannot directly push to the `master` branch. Instead, use the box above to create a new branch (for example: `fix-registration-form`). Once you have submitted your code to the branch, and your feature/fix is complete, sumbit a PR. GitHub will show you if you need to change anything before you merge.

## Environment Info
*For minimal issues, try to get your dev environment as close as possible to this list*
- Ubuntu 18.04 Bionic (64-bit)
- OpenJDK Java 1.8.0 build 251
- Maven 3

## Environment Variables
*Project may crash without these defined*
- `JDBC_DATABASE_URL` Defines the PostgreSQL username, password, URI, and database to use.

## Basic Commands
- `mvnw spring-boot:run` Runs server locally.
- `mvnw clean package` Builds JAR file, rarely needed.
- `mvnw flyway:migrate` Updates the schema of your local PostgreSQL database (done automatically on bootup).
- `mvnw test` Runs unit test suite (Requires JUnit).

## How To Use H2
Instead of messing around with PostgreSQL, you can run an in-memory database for testing purposes.
1. Uncomment the commented section in `/pom.xml`.
2. Run `mvnw clean install` to install dependencies.
3. Within your IDE, set the environment variable `JDBC_DATABASE_URL` to `jdbc:h2:~/test;`.
4. Every time you start the webapp, it will create a temporary database in memory that your application will use. The database will be deleted every time you close the webapp.
5. Remember to re-comment the H2 dependency in `/pom.xml` before you commit your code through Git (working on a fix for this soon).

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

