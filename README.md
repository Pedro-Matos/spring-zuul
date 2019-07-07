# Pre-Interview Exercise for RHO
<h3>Project developed under Java 8 and Spring Boot 2.1.6</h3>

In this exercise I was asked to build 4 microservices that would work with **Zuul Proxy** and **Service Discovery**.

The microservices were the following: 
- Service Registry (Opted for Eureka)
- Zuul Proxy that would handle the requests and deal with the routing of each microservice
- A service that would give a list of anything
- Another service that would give another list


To resolve this exercise I created four directories, where each one contains one of the microservices. These microservice's skeletons were created with the help of [Spring Initialz](https://start.spring.io). Used some dependencies like *Spring Web Starter*, *Eureka Server* and *Eureka Discovery Client*, *Zuul* and *Thymeleaf*.

Decided to use Eureka because it seemed to have a simpler implementation and bigger focus on service discovery as seen [here](https://medium.com/knerd/eureka-why-you-shouldnt-use-zookeeper-for-service-discovery-4932c5c7e764).

I also decided to add Thymeleaf to create templates to show the list of data in a tabular way, instead of showing just a json-esque document. In one of services I present a table with information about books and in the other I present information about netflix shows.

# Routes

# Building the Project
To do the full build, do: `mvn clean install` in root dir of the project or do one build for each module directory

# Running a Spring Boot module
To run a Spring Boot module run the command: `mvn spring-boot:run` in the module directory
