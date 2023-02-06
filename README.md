# Employee-Management

In this application, we can add employee ,there task,semester &  See employee details.
- Add Employee & task,
- update and delete task
- see task and employee datails



# Functionalities
- Add Employee & task,
- update and delete task
- see task and employee data

## Backend Work
-  Proper Exception Handling, and Input Validation
-  Data Stored in the database(mySQL)

## Installation and Run
-   Before running the API server, we should update the database config inside the application.properties file.
-   Update the port number, username and password as per your local database config.
```
server.port=8888
spring.datasource.url=jdbc:mysql://localhost:3306/epmloyeedb
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=Tridip123@
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER
```

# Tech Stacks

-   Java Core
-   Spring Data JPA
-   Spring Boot
-   Hibernate
-   MySQL


