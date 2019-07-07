# Pre-Interview Exercise for RHO


In this exercise I was asked to build 4 microservices that would work with **Zuul Proxy** and **Service Discovery**.

The microservices were the following: 
- Service Registry (Opted for Eureka)
- Zuul Proxy that would handle the requests and deal with the routing of each microservice
- A service that would give a list of anything
- Another service that would give another list


To resolve this exercise I created four directories, where each one contains one of the microservices. These microservice's skeleton were created with the help of [Spring Initialz](https://start.spring.io). Used some dependencies like *Spring Web Starter*, *Eureka Server* and *Eureka Discovery Client*, *Zuul* and *Thymeleaf*.


# Building the Project
To do the full build, do: `mvn clean install`

# Running a Spring Boot module
To run a Spring Boot module run the command: `mvn spring-boot:run` in the module directory
