# Simple Contact CRUD

This project is a simple CRUD application developed for study purposes. The objective is to create, read, update, and delete (CRUD) contacts in a database using Spring Boot and PostgreSQL.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

### Prerequisites

- Java 17 or higher
- Maven
- PostgreSQL

### Database Setup

Make sure PostgreSQL is installed and running on your machine. Create a database named `study_spring` and configure the credentials in the `application.properties` file.

### `application.properties` File

```properties
# JPA and Hibernate configuration
spring.jpa.hibernate.ddl-auto=update

# DataSource configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/study_spring
spring.datasource.username=postgres
spring.datasource.password=yourpass
spring.datasource.driver-class-name=org.postgresql.Driver
