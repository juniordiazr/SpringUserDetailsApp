# SpringUserDetailsApp

Spring Boot, MySQL, JPA, Hibernate Rest API Tutorial
Build Restful CRUD API for a simple User Application using Spring Boot, Mysql, JPA and Hibernate.

Requirements
Java - 1.8.x

Maven - 3.x.x

Mysql - 5.x.x

Steps to Setup
1. Clone the application

git clone https://github.com/juniordiazr/SpringUserDetailsApp.git
2. Create Mysql database

create database userdetails
3. Change mysql username and password as per your installation

open src/main/resources/application.properties

change spring.datasource.username and spring.datasource.password as per your mysql installation

4. Build and run the app using maven

mvn package
java -jar target/userdetails-1.0.0.jar
Alternatively, you can run the app without packaging it using -

mvn spring-boot:run
The app will start running at http://localhost:8080.

Explore Rest APIs
The app defines following CRUD APIs.

GET /api/users

POST /api/users

GET /api/users/{userId}

PUT /api/users/{usersId}

DELETE /api/users/{userId}

GET /api/users/email/{userId}


