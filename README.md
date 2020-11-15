# Struts Web Application 
This project is build to fulfill the requirements for CZ3002 Assignment 2. 
This application uses [Semantic-UI](https://semantic-ui.com/introduction/getting-started.html) as the underlying UI CSS framework for this application. It is using the CDN version of the  Semantic UI and therefore requires internet connection for it to properly load. 

## Getting Started 

### Requirements 
1. Java (This repository has been set up to run under Java 8 and above)
2. Maven 

Optional: IntelliJ IDEA(Auto setup maven and dependencies)

### Dependencies 
1.  `struts2` Required to create the MVC Web App.
2.  `jetty-maven-plugin` Integration with Maven and Jetty web server.
3.  `log4j` For logging purposes.
4.  `junit` For testing purposes. 

### Running the application 

1.  Run the following command on the terminal: 
    ```bash
    mvn jetty:run
    ```

2.  Open the application on `http://localhost:8080/struts-webapp/`

### Folder structure 

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

### Contributors 
This is built by Assignment Group 43 of CZ3002, consisting of: 
1. [Hans Tananda](https://github.com/hanstananda)
2. [Farhan Khalifa Ibrahim](https://github.com/farhan-khalifa-ibrahim)
3. [Marcus Tan Kai Lun](https://github.com/marcustkl)
