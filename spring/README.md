### Spring boot API REST, and Image builder.

#### Dependencies

- **spring-boot-starter-web** : It is used for building web layer, including REST APIs, applications using Spring MVC. Uses Tomcat as the default embedded container.

- **spring-boot-starter-data-jpa** : It includes spring data, hibernate, HikariCP, JPA API, JPA Implementation (default is hibernate), JDBC and other required libraries.

- **h2** : Though we can add any database easily using datasource properties in application.properties file, we are using h2 database in reduce unnecessacery complexity.

- **spring-boot-starter-test** : It is used to test Spring Boot applications with libraries including JUnit, Hamcrest and Mockito.

- **spring-boot-starter-thymeleaf** : A Java template engine for processing and creating HTML, XML, JavaScript, CSS and text.

- **Junit4** : A test framework which uses annotations to identify methods that specify a test.

- **Swagger** : Set of rules, specifications and tools for developing and describing RESTful APIs. The Swagger framework allows developers to create interactive, machine and human-readable API documentation.

#### Install

- `mvn install`

- `mvn package`

#### Usage

- run gradle app `./gradlew bootRun`

- run Maven app `./mvnw spring-boot:run`

#### Docker Usage

- build dev docker image

#### operative system image info

Windows 11 Pro
