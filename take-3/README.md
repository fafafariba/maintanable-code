# Hello / Add Application

Take 3

## Setup Instructions
   Run the following commands in the terminal 
  - `mvn package`
  - `wget http://repo2.maven.org/maven2/org/mortbay/jetty/jetty-runner/8.1.9.v20130131/jetty-runner-8.1.9.v20130131.jar -O jetty-runner.jar`
  - `java -jar jetty-runner.jar target/maintainable-code-1.3.0.war`
  
  In the browser, navigate to
  
  - [hello url](http://localhost:8080/hello?target=fariba)
  - [add url](http://localhost:8080/add?left=4&right=7)