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

# Service Discovery
When using Zuul Proxy I found that is usual to register the routes in the configuration files like *application.properties*, where it's possible to declare the routes like this: 
```
zuul.routes.book.url=http://localhost:8081/
```
In this case, this line would allow the zuul proxy to forward any /book request to localhost:8081

Yet, to any other service added would be necessary to declare the route and the port to where forward the request.
When using service discovery it's not necessary to register the routes in the zuul proxy configurations. 

The server(eureka) can be configured and deployed to be highly available `@EnableEurekaServer`, with each client registering in the server `@EnableEurekaClient` and providing meta-data, like the service name and port, about itself for the zuul proxy be able to correctly route the available services.

### Routes
<table>
  <thead>
    <th>Service</th>
    <th>Service Name</th>
    <th>Port</th>
  </thead>
  <tbody>
    <tr>
      <td>Eureka Registry</td>
      <td>eureka-service</td>
      <td>8080</td>
    </tr>
    <tr>
      <td>Zuul Proxy</td>
      <td>zuul-server</td>
      <td>8100</td>
    </tr>
    <tr>
      <td>Service 1</td>
      <td>book-service</td>
      <td>8200</td>
    </tr>
    <tr>
      <td>Service 2</td>
      <td>netflixseries-service</td>
      <td>8300</td>
    </tr>
  </tbody>
</table>

# Building the Project
To do the full build, do: `mvn clean install` in root dir of the project or do one build for each module directory

# Running a Spring Boot module
To run a Spring Boot module run the command: `mvn spring-boot:run` in the module directory

# Usage Example
After building the project, use the `run.sh`script to start the project and use the `kill.sh` to stop the project and kill all the PIDs

The zuul proxy can take a couple seconds to discover the routes for the services.

To test the endpoints: 
- localhost:8200/ - list in tabular format from book service
- localhost:8300/ - list in tabular format from tv show service
- localhost:8100/ - welcome message
- localhost:8100/book-service – list in tabular format from book service
- localhost:8100/netflixseries-service – list in tabular format from tv show service
 
