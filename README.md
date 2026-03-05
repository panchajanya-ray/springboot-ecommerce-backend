# Spring Boot E-Commerce Backend

This repository contains the backend of an **E-Commerce application built using Spring Boot**.
The project is being developed step-by-step while learning backend development with Java and Spring Boot.

The goal of this project is to understand how real backend systems are built using **REST APIs, databases, and proper project architecture**.

---

## Tech Stack

* **Java 21**
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA**
* **MySQL**
* **Hibernate**
* **Maven**

---

## Current Features

* Spring Boot project setup
* REST API creation
* MySQL database connection
* JPA repository integration
* Basic **User API**

### Implemented APIs

| Method | Endpoint | Description       |
| ------ | -------- | ----------------- |
| GET    | `/users` | Get all users     |
| POST   | `/users` | Create a new user |

---

## Project Structure


src/main/java/com/panchajanya/ecommerce<br/>
|&emsp;&emsp;|── controller<br/>
|&emsp;&emsp;|&emsp;&emsp;|── UserController.java<br/>
|&emsp;&emsp;|&emsp;&emsp;|<br/>
|&emsp;&emsp;|── model<br/>
|&emsp;&emsp;|&emsp;&emsp;|── User.java<br/>
|&emsp;&emsp;|&emsp;&emsp;|<br/>
|&emsp;&emsp;|── repository<br/>
|&emsp;&emsp;|&emsp;&emsp;|── UserRepository.java<br/>
|&emsp;&emsp;|&emsp;&emsp;|<br/>
|&emsp;&emsp;|── service<br/>
|&emsp;&emsp;|&emsp;&emsp;|── UserService.java<br/>
|&emsp;&emsp;|&emsp;&emsp;|<br/>
|&emsp;&emsp;|── EcommerceBackendApplication.java

---

## How to Run the Project

1. Clone the repository

```
git clone https://github.com/YOUR_USERNAME/springboot-ecommerce-backend.git
```

2. Open the project in **Eclipse / IntelliJ / VS Code**

3. Configure database in `application.properties`

```
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

4. Run the application

```
EcommerceBackendApplication.java
```

Server will start on:

```
http://localhost:8080
```

---

## Example API Request

### Create User

POST `/users`

```
{
  "name": "Panchajanya",
  "email": "test@mail.com"
}
```

---

## Future Improvements

Planned features for the project:

* Service Layer implementation
* DTO pattern
* Input validation
* Exception handling
* Product module
* Category module
* Cart system
* Order management
* Authentication & Authorization (JWT)

---

## Learning Goals

This project is being built to learn:

* Backend development with Spring Boot
* REST API design
* Database integration
* Clean project architecture
* Building scalable backend systems

---

## Author

**Panchajanya Ray**

---
