# Struts Web Application 
This project is build to fulfill the requirements for CZ3002 Assignment 2. 
This application uses [Semantic-UI](https://semantic-ui.com/introduction/getting-started.html) as the underlying UI CSS framework for this application. 

## Getting Started 

### Requirements 
1. [Java](https://www.java.com/en/download/) (This repository has been set up to run under Java 8 and above)
2. [Maven](https://maven.apache.org/install.html) 
3. [MySQL](https://dev.mysql.com/downloads/)

Optional: IntelliJ IDEA(Auto setup maven and dependencies)

### Project dependencies 
1.  `struts2` Required to create the MVC Web App.
2.  `jetty-maven-plugin` Integration with Maven and Jetty web server.
3.  `log4j` For logging purposes.
4.  `junit` For testing purposes. 
5.  `mysql-connector-java` To bridge the connection between Java and MySQL.

### Setting up the application 
1.  Set the following environment variables for mysql connection:
    *   `DB_USERNAME`: This denotes your MySQL username. 
    *   `DB_PASSWORD`: This denotes your MySQL password.
    For example, in unix bash you can do the following:
    ```bash
    DB_USERNAME=hans
    DB_PASSWORD=password
    ```

2.  Run the commands under `src/main/resources/Database_Generator.sql` 
    to setup the MySQL database. There are several ways to do it, shown [here](https://stackoverflow.com/questions/8940230/how-to-run-sql-script-in-mysql)
    For example, in unix bash you can do the following:
    ```bash 
    mysql -u ${DB_USERNAME} --password=${DB_PASSWORD} < src/main/resources/Database_Generator.sql 
    ```

3.  Everything should be set up and now you can run the web server. 

### Running the application 

1.  Run the following command on the terminal: 
    ```bash
    mvn jetty:run -Ddb.username=${DB_USERNAME} -Ddb.password=${DB_PASSWORD}
    ```
    Note: `-Dvarname=value` is a way to set [system properties for java](https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html).
    You can see more examples about this [here](https://stackoverflow.com/questions/5189914/setting-system-property).

2.  Open the application on `http://localhost:8080/struts-webapp/`

### Packaging the application 

In order to package application, just run the following command: 
```bash
mvn package -Ddb.username=${DB_USERNAME} -Ddb.password=${DB_PASSWORD}
```
This will generate a `war` package that can be deployed to any server. More information about this [here](https://www.baeldung.com/tomcat-deploy-war).

### Testing the application 
This project is divided to two types of test, Unit Tests and Integration Tests. 
The Unit Tests can run directly without any external dependencies and be executed by running the following command: 
```bash
mvn test
```
The Integration Tests requires MySQL to be fully set up first, and then can be executed by running the following command: 
```bash
mvn integration-test -Ddb.username=${DB_USERNAME} -Ddb.password=${DB_PASSWORD}
```
Note: The Integration Tests will automatically run the Unit Tests beforehand. 

## Folder structure 

All source codes are under `src/main/java/cz3002/group43` and the unit tests are under `src/test/java/cz3002/group43`, where `cz3002.group43` is the group id for this java project. 
Following are further explanation of folder structure in the source code directory: 
*   `actions`  
    This folder contains java classes which are responsible to handle the Actions from the MVC struts. 
*   `models`  
    This folder contains java classes which are responsible to specify the models available in the MVC struts, as well as to communicate with the database. 
*   `utils`
    This folder contains java classes that is used to provide utility functions used within the project. 

The configuration files (log configuration, struts configuration, server configuration) are located under `src/main/resources`. 

The `.jsp` files are located under `/src/main/webapp`. 

## Contributors 
This is built by Assignment Group 43 of CZ3002, consisting of: 
1. [Hans Tananda](https://github.com/hanstananda)
2. [Farhan Khalifa Ibrahim](https://github.com/farhan-khalifa-ibrahim)
3. [Marcus Tan Kai Lun](https://github.com/marcustkl)
